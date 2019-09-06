/**
 * 
 */
package exercice3;

/**
 * @author Thomas LINTANF
 *
 */
public class NegativeOperandeException extends Exception {
	
	public NegativeOperandeException(double value) {
		super( "Negative value provided to square root :" + value );
	}
}
