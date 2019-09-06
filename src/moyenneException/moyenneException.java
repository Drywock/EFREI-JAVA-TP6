/**
 * 
 */
package moyenneException;

/**
 * @author Thomas LINTANF, Gabriel RIBIER
 *
 */
public class moyenneException {
	
	public static void main(String[] argv) {
		if (argv.length <= 0) {
			System.out.println("Il n'y a pas d'arguments");
			System.exit(1);
		}
		
		try {
			System.out.println("La moyenne est " + moyenne(argv));
		}
		
		catch (NumberFormatException e) {
			System.out.println("Nombre invalide : ");
			System.out.println(e.getMessage());
		}
		
		catch (ArithmeticException e) {
			System.out.println("Division par 0 : ");
			System.out.println(e.getMessage());
		}
	}
	
	public static int moyenne(String[] argv) {
		int somme = 0;
		int cpt = 0;
		for (int i = 0; i < argv.length; i++) {
			somme += Integer.parseInt(argv[i]);
			cpt++;
			}
		return somme / cpt;  
	}

}
