<?php

/**
 * Tests the domain implementation.
 */

require("../domain.php");
require("../../databases.php");

function get_all_domain_joins() {
	$direct_joins = array();
	/*
    // Undergraduate
    $direct_joins["model_1236407970c_1d"] = array("model_1236407970c_19" => "JOIN Student ON
						Student.generated_primary_key 
						= Undergraduate.Student_generated_primary_key", );
	*/
	$direct_joins["1kg992k6t4"] = array();
	return $direct_joins;
}

class DomainSchema_News extends DomainSchema {
	
	private function __construct() {
		$this->attributes = array(
			"id" => DomainAttribute_News_Id::getInstance($this),
			"title" => DomainAttribute_News_Title::getInstance($this),
		);
		$this->table_name = "News";
		$this->source_id = '1kg992k6t4';
	}

	// the current instance
	static $instance = null;
	public static function getInstance() {
		if (self::$instance == null) {
			self::$instance = new DomainSchema_News();
		}
		return self::$instance;
	}
	
}

class DomainAttribute_News_Id extends DomainAttribute {
	private function __construct($schema) {
		$this->schema = $schema;
		$this->isPrimaryKey = true;
		$this->type = 'iamlInteger';
	}
	
	// the current instance
	static $instance = null;
	public static function getInstance($schema) {
		if (self::$instance == null) {
			self::$instance = new DomainAttribute_News_Id($schema);
		}
		return self::$instance;
	}
	
}

class DomainAttribute_News_Title extends DomainAttribute {
	private function __construct($schema) {
		$this->schema = $schema;
		$this->isPrimaryKey = false;
		$this->type = 'iamlString';
	}
	
	// the current instance
	static $instance = null;
	public static function getInstance($schema) {
		if (self::$instance == null) {
			self::$instance = new DomainAttribute_News_Title($schema);
		}
		return self::$instance;
	}
}

class DomainSource_NewsDB extends DomainSource {
	
	private function __construct() {
		$this->schema = DomainSchema_News::getInstance();
		$this->type = 'RELATIONAL_DB';
		$this->file = '1kg992k6t4.db';
	}

	// the current instance
	static $instance = null;
	public static function getInstance() {
		if (self::$instance == null) {
			self::$instance = new DomainSource_NewsDB();
		}
		return self::$instance;
	}

}

class DomainIterator_News_5i92kg92 extends DomainIterator {

	private function __construct() {
		$this->schema = DomainSchema_News::getInstance();
		$this->source = DomainSource_NewsDB::getInstance();
		$this->order_by = "";
		$this->order_ascending = true;
		$this->query = "id = :id";
		$this->autosave = true;
	}
	
	// the current instance
	static $instance = null;
	public static function getInstance() {
		if (self::$instance == null) {
			self::$instance = new DomainIterator_News_5i92kg92();
		}
		return self::$instance;
	}
	
	public function constructArgs() {
		return array(
			"id" => "3",
		);
	}
	
	public function getOffset() {
		return $_SESSION["offset"];
	}
	
	public function setOffset($value) {
		$_SESSION["offset"] = $value;
	}
	
}

// this one doesn't autosave
class DomainIterator_News_bdb2t211 extends DomainIterator {

	private function __construct() {
		$this->schema = DomainSchema_News::getInstance();
		$this->source = DomainSource_NewsDB::getInstance();
		$this->order_by = "";
		$this->order_ascending = true;
		$this->query = "id = :id";
		$this->autosave = false;
	}
	
	// the current instance
	static $instance = null;
	public static function getInstance() {
		if (self::$instance == null) {
			self::$instance = new DomainIterator_News_bdb2t211();
		}
		return self::$instance;
	}
	
	public function constructArgs() {
		return array(
			"id" => "4",
		);
	}
	
	public function getOffset() {
		if (!isset($_SESSION["offset2"])) {
			$this->setOffset(0);
		}
		return $_SESSION["offset2"];
	}
	
	public function setOffset($value) {
		$_SESSION["offset2"] = $value;
	}
	
}

// this one doesn't autosave, and it has multiple results
class DomainIterator_News_ergqa3bdfbd extends DomainIterator {

	private function __construct() {
		$this->schema = DomainSchema_News::getInstance();
		$this->source = DomainSource_NewsDB::getInstance();
		$this->order_by = "";
		$this->order_ascending = true;
		$this->query = "1";
		$this->autosave = false;
	}
	
	// the current instance
	static $instance = null;
	public static function getInstance() {
		if (self::$instance == null) {
			self::$instance = new DomainIterator_News_ergqa3bdfbd();
		}
		return self::$instance;
	}
	
	public function constructArgs() {
		return array(
			// no args
		);
	}
	
	public function getOffset() {
		if (!isset($_SESSION["offset3"])) {
			$this->setOffset(0);
		}
		return $_SESSION["offset3"];
	}
	
	public function setOffset($value) {
		$_SESSION["offset3"] = $value;
	}
	
}

ob_start();
// set up the test: create the database
{
	if (file_exists("1kg992k6t4.db")) {
		unlink("1kg992k6t4.db");
	}
	
	$query = new DatabaseQuery("sqlite:1kg992k6t4.db");
	$query->execute("CREATE TABLE News ( id integer primary key autoincrement, title varchar(255) not null )");
	$query->execute("INSERT INTO News (id, title) VALUES (?, ?)", array(1, 'hello'));
	$query->execute("INSERT INTO News (id, title) VALUES (?, ?)", array(2, 'world'));
	$query->execute("INSERT INTO News (id, title) VALUES (?, ?)", array(3, 'alligator'));
	$query->execute("INSERT INTO News (id, title) VALUES (?, ?)", array(4, 'kitten'));

	// init the offset
	$_SESSION["offset"] = 0;
	
}

{
	// get the current instance
	$instance = DomainIterator_News_5i92kg92::getInstance();
	// then the attribute
	$title = $instance->getAttribute('title')->getValue(); 
	
	// set the attribute
	$instance->getAttribute('title')->setValue('new title');
}

// get an iterator of instances
{
	function printit($instance) {
		echo "id: " . $instance["id"]->getValue() . "\n";
		echo "title: " . $instance["title"]->getValue() . "\n";
	}

	$iterator = DomainIterator_News_5i92kg92::getInstance();
	$iterator->reset();

	$instance = $iterator->fetchInstance();
	printit($instance);
	
	// iterate over all others
	while ($iterator->hasNext()) {
		$instance = $iterator->next();
		
		printit($instance);
	}
	
	// print out the result count
	echo "results = " . $iterator->count();
}
$result = ob_get_contents();
ob_end_clean();

// check the results are as expected
$expected = file_get_contents("expected.txt");

// clean out newlines etc
$result = clean_newlines($result);
$expected = clean_newlines($expected);

if ($expected !== $result) {
	echo "ERROR: Results did not match expected:\n\n[expected]\n$expected\n\n[output]\n$result\n";
} else {
	echo "PASS\n";
}

// --- next test
ob_start();
{
	// get the current instance
	$instance = DomainIterator_News_bdb2t211::getInstance();
	// then the attribute
	$title = $instance->getAttribute('title')->getValue();
	echo "1: $title\n"; 
	
	// set the attribute
	$instance->getAttribute('title')->setValue('new title');
	
	// get it back
	$title = $instance->getAttribute('title')->getValue();
	echo "2: $title\n";
	
	// reload it
	$instance->reload();
	$title = $instance->getAttribute('title')->getValue();
	echo "3: $title\n";
	
	// set it again
	$instance->getAttribute('title')->setValue('another title');
	// save it now
	$instance->save();
	
	$title = $instance->getAttribute('title')->getValue();
	echo "4: $title\n";
	
	// reload it
	$instance->reload();
	$title = $instance->getAttribute('title')->getValue();
	echo "5: $title\n";
}

$result = ob_get_contents();
ob_end_clean();

// check the results are as expected
$expected = file_get_contents("expected2.txt");

// clean out newlines etc
$result = clean_newlines($result);
$expected = clean_newlines($expected);

if ($expected !== $result) {
	echo "ERROR: Results did not match expected:\n\n[expected]\n$expected\n\n[output]\n$result\n";
} else {
	echo "PASS\n";
}

// --- next test
ob_start();
{
	$iterator = DomainIterator_News_ergqa3bdfbd::getInstance();
	$iterator->reset();

	$instance = $iterator->fetchInstance();
	printit($instance);
	
	// iterate over all others
	while ($iterator->hasNext()) {
		$instance = $iterator->next();
		
		printit($instance);
	}
	
	// print out the result count
	echo "results = " . $iterator->count();
}

$result = ob_get_contents();
ob_end_clean();

// check the results are as expected
$expected = file_get_contents("expected3.txt");

// clean out newlines etc
$result = clean_newlines($result);
$expected = clean_newlines($expected);

if ($expected !== $result) {
	echo "ERROR: Results did not match expected:\n\n[expected]\n$expected\n\n[output]\n$result\n";
} else {
	echo "PASS\n";
}

function clean_newlines($s) {
	$s = str_replace("\r\n", "\n", $s);
	$s = str_replace("\r", "\n", $s);

	// trim
	return trim($s);
}

// ---
// various mock methods 

function log_message($message) {
	// echo "[log] $message\n";
}

/**
 * Similar to a Java's RuntimeException.
 * We can also pass along additional information.
 */
class IamlRuntimeException extends Exception {
	var $more_info;

	public function __construct($message = "", $more_info = "") {
		parent::__construct($message);
		$this->more_info = $more_info;
	}
}

/**
 * For some reason, we can't have '$x = $a or throw new Ex()'
 * so we need to wrap it in a function.
 */
function throw_new_IamlRuntimeException($message) {
	/* throw an exception */
	throw new IamlRuntimeException($message);
}

