<?php

// this one doesn't autosave
class DomainIterator_News_bdb2t211 extends DefaultDomainIterator {

	private function __construct() {
		$this->schema = DomainType_News::getInstance();
		$this->source = DomainSource_NewsDB::getInstance();
		$this->order_by = null;
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

	public function getNewInstanceID($key) {
		throw new IamlDomainException("Cannot get the new instance ID for a non-new object: " . get_class($this));
	}

	public function setNewInstanceID($key, $id) {
		throw new IamlDomainException("Cannot set the new instance ID for a non-new object: " . get_class($this));
	}

}

echo "[test 2] ";
ob_start();
{
	// get the current instance
	$instance = DomainIterator_News_bdb2t211::getInstance();
	// then the attribute
	$title = $instance->getAttributeInstance(DomainAttribute_News_Title::getInstance())->getValue();
	echo "1: $title\n";

	// set the attribute
	$instance->getAttributeInstance(DomainAttribute_News_Title::getInstance())->setValue('new title');

	// get it back
	$title = $instance->getAttributeInstance(DomainAttribute_News_Title::getInstance())->getValue();
	echo "2: $title\n";

	// reload it
	$instance->reload();
	$title = $instance->getAttributeInstance(DomainAttribute_News_Title::getInstance())->getValue();
	echo "3: $title\n";

	// set it again
	$instance->getAttributeInstance(DomainAttribute_News_Title::getInstance())->setValue('another title');
	// save it now
	$instance->save();

	$title = $instance->getAttributeInstance(DomainAttribute_News_Title::getInstance())->getValue();
	echo "4: $title\n";

	// reload it
	$instance->reload();
	$title = $instance->getAttributeInstance(DomainAttribute_News_Title::getInstance())->getValue();
	echo "5: $title\n";
}

$result = ob_get_contents();
ob_end_clean();

// check the results are as expected
compareTestResults($result, "expected2.txt");
