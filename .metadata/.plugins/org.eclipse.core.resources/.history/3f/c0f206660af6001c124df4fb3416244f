/**
 * The class DataAccessMock is a mock implementation of the interface Customer
 * and using an array as in-memory data storage (like a database).
 */

package ch.ilv.crm.persistence;

public class CustomerDataAccessMock implements ICustomerDAO {
	
	/**
	 * The in-memory data storage.
	 */	
	private String[][] customerList = null;
	private int insertCount = 0;	
	
	/**
	 * The default constructor 
	 */
	public CustomerDataAccessMock() {		
		customerList = new String[10][];
		insertCount = 0;		
	}

	/**
	 * @param customer The customer is the Data of an customer, saved in a String-Array
	 */
	@Override
	public void insertCustomer(String[] customer) {
		if(insertCount < 10){
			customerList[insertCount] = customer;
			insertCount++;			
		}
	}

	/**
	 * @param customerId The customerId ist the ID of the wanted Customer
	 */
	@Override
	public String[] selectCustomer(int customerId) {
		if(customerId < insertCount){
			return customerList[customerId];	
		}	
		return null;
	}
}
