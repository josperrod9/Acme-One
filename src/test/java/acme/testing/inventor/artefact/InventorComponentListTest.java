package acme.testing.inventor.artefact;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import acme.testing.TestHarness;

public class InventorComponentListTest extends TestHarness{
	
	// Lifecycle management ---------------------------------------------------

    // Test cases -------------------------------------------------------------
	@ParameterizedTest
	@CsvFileSource(resources = "/inventor/artefact/list-component.csv", encoding = "utf-8", numLinesToSkip = 1)
	@Order(10)
	public void positiveTest(final int recordIndex, final String type, final String name, final String code, final String retailPrice,
		final String technology, final String description, final String info) {

		super.signIn("inventor1","inventor1");
		
		super.clickOnMenu("Inventor", "Component list");
		super.checkListingExists();
		super.sortListing(0, "asc");

		super.checkColumnHasValue(recordIndex, 0, name);
		super.checkColumnHasValue(recordIndex, 1, code);
		super.checkColumnHasValue(recordIndex, 2, retailPrice);
		super.checkColumnHasValue(recordIndex, 3, type);
		super.clickOnListingRecord(recordIndex);
		super.checkFormExists();
		super.checkInputBoxHasValue("name", name);
		super.checkInputBoxHasValue("code", code);
		super.checkInputBoxHasValue("type", type);
		super.checkInputBoxHasValue("technology", technology);
		super.checkInputBoxHasValue("description", description);
		super.checkInputBoxHasValue("retailPrice", retailPrice);
		super.checkInputBoxHasValue("info", info);

	}
}
