/**
 * The class CustomerFactoryTest implements tests for implementations of the interface ICustomer.
 */

package ch.ilv.crm.test.business;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ch.ilv.crm.business.CustomerFactory;
import ch.ilv.crm.business.ICustomer;

public class CustomerFactoryTest {
	
	// The customer factory
	private CustomerFactory theCustomerFactory = null;
	
	// Test fixture name and forename for testing
	private final static String EXPECTED_NAME = "Kunde";
	private final static String EXPECTED_FORENAME = "Drei";
	
	// Make this before calling the testmethod
	@Before
	public void setUp() throws Exception {
		theCustomerFactory = CustomerFactory.getInstance();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	// Testmethod
	@Test
	public void testInsertAndSelectCustomer() {
		
		// Create a lot of customer (4 cutomers)
		ICustomer customer_1 = theCustomerFactory.createCustomer("Kunde", "Eins");
		ICustomer customer_2 = theCustomerFactory.createCustomer("Kunde", "Zwei");
		ICustomer customer_3 = theCustomerFactory.createCustomer("Kunde", "Drei");
		ICustomer customer_4 = theCustomerFactory.createCustomer("Kunde", "Vier");
		
		// Save the created customers and give message if saved
		theCustomerFactory.saveCustomer(customer_1);
		System.out.println("-Kunde: " + customer_1.getName() + " wurde erfolgreich gespeichert");
		
		theCustomerFactory.saveCustomer(customer_2);
		System.out.println("-Kunde: " + customer_2.getName() + " wurde erfolgreich gespeichert");
		
		theCustomerFactory.saveCustomer(customer_3);
		System.out.println("-Kunde: " + customer_3.getName() + " wurde erfolgreich gespeichert");
		
		theCustomerFactory.saveCustomer(customer_4);
		System.out.println("-Kunde: " + customer_4.getName() + " wurde erfolgreich gespeichert");
		
		
		// Select the customer
		ICustomer selectedCustomer = theCustomerFactory.findCustomer(2);
		
		// Testing the functions
		assertEquals("Wrong Name!", EXPECTED_NAME, selectedCustomer.getName());	
		assertEquals("Wrong Forename!", EXPECTED_FORENAME, selectedCustomer.getForename());
		
		// Give a message in the console that the user ist found
		System.out.println("\nDer Kunde: " + selectedCustomer.getName() + " " 
							+ selectedCustomer.getForename() + " wurde erfolgreich gefunden.");
	}

}
