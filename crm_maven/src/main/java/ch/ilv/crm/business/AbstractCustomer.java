/**
 * The abstract class AbstractCustomer implement the ICustomer interface.
 */


package ch.ilv.crm.business;

// Class declaration
public abstract class AbstractCustomer implements ICustomer {
		
	// Attributes
	/**
	 * The name of the customer.
	 */
	private String name;
	
	/**
	 * The forename of the customer.
	 */
	private String forename;

	/**
	 * The Special constructor of an abstract ICustomer
	 * 
	 * @param name The name of the Customer
	 * @param forename The forename of the Customer
	 */
	public AbstractCustomer(String name, String forename) {
		setName(name);
		setForename(forename);
	}	
	
	// Getter methods
	/**
	 * @return the name of the customer
	 */
	public final String getName() {
		return name;
	}
	/**
	 * @return the forename of the customer
	 */
	public final String getForename() {
		return forename;
	}
		
	// Setter methods
	/**
	 * @param name The name of the customer
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @param forename The forename of the customer
	 */
	public void setForename(String forename) {
		this.forename = forename;
	}
}
