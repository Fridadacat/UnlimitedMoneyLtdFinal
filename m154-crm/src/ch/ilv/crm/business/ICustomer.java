/**
 * The interface ICustomer provides methods to perform CRUD operations
 */

package ch.ilv.crm.business;

//Interface declaration
public interface ICustomer {
	
	// Getter methods
	/**
	 * @return the name of the customer
	 */
	public String getName();

	/**
	 * @return the forename of the customer
	 */
	public String getForename();

	
	// Setter methods
	/**
	 * Set the name of the customer
	 */
	public void setName(String name);
	
	/**
	 * Set the forename of the customer
	 */
	public void setForename(String forename);
}
