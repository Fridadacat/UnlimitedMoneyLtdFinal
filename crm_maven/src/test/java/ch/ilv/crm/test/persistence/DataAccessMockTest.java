/**
 * The class DataAccessMockTest implements tests 
 * for implementations of the interface ICustomerDAO.
 */

package ch.ilv.crm.test.persistence;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ch.ilv.crm.persistence.CustomerDAOFactory;
import ch.ilv.crm.persistence.ICustomerDAO;

public class DataAccessMockTest {

	// The DAO factory
	private CustomerDAOFactory theDAOFactory = null;
	
	// The DAO of the customer
	private ICustomerDAO theICustomerDAO = null;
	
	// Test fixture for tesing
	private final static String EXPECTED_NAME = "Kunde";
	private final static String EXPECTED_FORENAME = "Eins";
	
	protected final String[] customerNames = {"Kunde", "Kunde", "Kunde", "Kunde"};
	protected final String[] customerForenames = {"Eins", "Zwei", "Drei", "Vier"};
	
	// Make this before calling the testmethod
	@Before
	public void setUp() throws Exception {
		theDAOFactory = CustomerDAOFactory.getInstance();
		theICustomerDAO = theDAOFactory.createCustomerDAO();
	}

	@After
	public void tearDown() throws Exception {
	}

	// Testmethod
	@Test
	public void testInsertAndSelectCustomer() {
		
		// Save the customer data
		for (int i = 0; i < customerNames.length; i++) {
			String[] customerData = new String[2];
			customerData[0] = customerNames[i];
			customerData[1] = customerForenames[i];			
			
			theICustomerDAO.insertCustomer(customerData);
		}	
		
		// Get the selectet customer an put it in a array
		String[] selectedCustomer = theICustomerDAO.selectCustomer(0);
		
		// Testing the functions
		assertEquals("Wrong Name!", EXPECTED_NAME, selectedCustomer[0]);	
		assertEquals("Wrong Forename!", EXPECTED_FORENAME, selectedCustomer[1]);	
	}
}
