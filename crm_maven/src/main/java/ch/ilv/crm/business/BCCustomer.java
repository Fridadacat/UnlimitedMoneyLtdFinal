/**
 * The class BCCustomer can overwrites a method with a class (at the moment not needed)
 */

package ch.ilv.crm.business;

public class BCCustomer extends AbstractCustomer {
	
	/**
	 * Special constructor of the BCCustomer
	 * 
	 * @param name The name of the Customer
	 * @param forename The forename of the Customer
	 */
	public BCCustomer(String name, String forename) {
		super(name, forename);
	}
}
