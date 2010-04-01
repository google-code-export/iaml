<?php
/**
 * Wrapper to access .properties files.
 */
 
function load_properties($db_name) {
	// properties file doesn't exist
	if (!file_exists($db_name)) {
		// log_message("properties file $db_name doesn't exist.");
		return array();	
	}

	// load the properties file
	$f = file($db_name);
	$properties = array();
	for ($i = 0; $i < count($f); $i++) {
		// strip comments
		if (strpos($f[$i], "#") !== false) {
			$f[$i] = substr($f[$i], 0, strpos($f[$i], "#"));
		}
	
		// skip blank lines
		if (trim($f[$i]) == "")
			continue; 
		
		// split the property line
		$split = explode("=", $f[$i], 2);
		if (count($split) != 2) {
			throw new IamlRuntimeException("Malformed properties line: " . $f[$i]);
		}
		
		$key = trim($split[0]);
		$value = trim($split[1]);
		if (substr(trim($split[1]), -1) == ",") {
			// continues on the next couple of lines
			while ($i < count($f)) {
				$i++;
				// strip comments
				if (strpos($f[$i], "#") !== false) {
					$f[$i] = substr($f[$i], 0, strpos($f[$i], "#"));
				}
				
				// skip blank lines
				if (trim($f[$i]) != "") {
					$value .= "\n" . trim($f[$i]);
				}
				
				// break out of continuation
				if (substr(trim($f[$i]), -1) != ",") {
					break;
				}
			}
		}
		
		// save to properties array
		$properties[$key] = $value;
	}
	
	return $properties;
}

function get_property($properties, $row_name, $default = false) {
	return isset($properties[$row_name]) ? $properties[$row_name] : $default;
}

/**
 * Set a property.
 * TODO this probably mangles up properties files when a value with a 
 * newline is specified: issue 166.
 */
function set_property($db_name, $properties, $key, $value) {
	$properties[$key] = $value;
	
	// write new properties file
	$s = array();
	foreach ($properties as $key => $value) {
		$s[] = "$key=$value";
	}
	file_put_contents($db_name, implode("\n", $s));

	// return new properties
	return $properties;
}