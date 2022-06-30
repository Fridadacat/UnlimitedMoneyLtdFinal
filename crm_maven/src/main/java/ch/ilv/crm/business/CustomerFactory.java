/**
 * The class CustomerFactory is a factory for Customer implementations.
 */

package ch.ilv.crm.business;

import ch.ilv.crm.persistence.CustomerDAOFactory;
import ch.ilv.crm.persistence.ICustomerDAO;

public class CustomerFactory {
	/**
	 * The singleton instance of the DataAccessFactory
	 */
	private static CustomerFactory theInstance = null;
	
	
	/**
	 * The DAO instance of the customer 
	 */
	private ICustomerDAO theICustomerDAO = null;
	
	
	/**
	 * The default constructor oft the CustomerFactory
	 */
	private CustomerFactory() {
		theICustomerDAO = CustomerDAOFactory.getInstance().createCustomerDAO();
	}
	
	/**
	 * @return The Singleton of the DataAccessFatory
	 */
	public static CustomerFactory getInstance(){
		if(theInstance == null){
			theInstance = new CustomerFactory();
		}
		return theInstance;
	}
	
	/**
	 * Creates a new customer object with name and forename set
	 * @param name The name of the customer
	 * @param forename the forename of the custoemr
	 * @return ICustomer
	 */	
	public ICustomer createCustomer(String name, String forename){
		return new BCCustomer(name, forename);
	}
	
	/**
	 * Saves a customer object
	 * @param customer
	 */
	public void saveCustomer(ICustomer customer){	
		theICustomerDAO.insertCustomer(new String[] { customer.getName(), customer.getForename() });
	}
	
	/**
	 * Finds a media object.
	 * @param customerId
	 * @return ICustomer object or null if there is no customer object with the given customerId 
	 */
	public ICustomer findCustomer(int customerId){
		String[] customerData = theICustomerDAO.selectCustomer(customerId);
		
		if(customerData == null){
			return null;
		}
		
		return arrayToICustomer(customerData);
	}
	
	/**
	 * Converts Array to Customer.
	 * @param customerData
	 * @return Array containing data of given customer
	 */
	private ICustomer arrayToICustomer(String[] customerData){		
		ICustomer customer = createCustomer(customerData[0], customerData[1]);
		return customer;
	}	
}
