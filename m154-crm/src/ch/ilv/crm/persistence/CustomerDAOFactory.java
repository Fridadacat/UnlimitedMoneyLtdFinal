/**
 * The class CustomerDAOFactory is a factory for DAO implementations.
 */

package ch.ilv.crm.persistence;

public class CustomerDAOFactory {
	/**
	 * The singleton instance of the CustomerDAOFactory
	 */
	private static CustomerDAOFactory theInstance = null;
	
	
	/**
	 * The default constructor oft the CustomerDAOFactory
	 */
	private CustomerDAOFactory() {
	}
	
	/**
	 * @return The Singleton of the CustomerDAOFatory
	 */
	public static CustomerDAOFactory getInstance(){
		if(theInstance == null){
			theInstance = new CustomerDAOFactory();
		}
		return theInstance;
	}
	
	/**
	 * Creates a concrete ICustomerDAO (interface)
	 * @return The ICustomerDAO
	 */
	public ICustomerDAO createCustomerDAO(){
		return new CustomerDataAccessMock();
	}
}
