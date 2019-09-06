/**
 * 
 */
package exercice3;

/**
 * @author Thomas LINTANF
 *
 */
public class UtiliseRacine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Racine extracteur = new Racine(0.01);
		
		double operande = 0;
		
		try {
			operande = (Double.valueOf(args[0])).doubleValue();
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println( "Pas d'argument en entrée, Exception : " + e );
			System.exit(1);
		}
		
		double valeurRacine;
		
		try {
			valeurRacine=extracteur.racine(operande);
			System.out.println(valeurRacine);
			System.out.println( "precision " + extracteur.getPrecision() +  " , erreur =" + ( valeurRacine - Math.sqrt(operande)));
			extracteur.setPrecision(0.00001);     
			valeurRacine=extracteur.racine(operande);   
			System.out.println(valeurRacine);    
			System.out.println( "precision " + extracteur.getPrecision() +  " , erreur =" + (valeurRacine - Math.sqrt(operande)));
		}
		catch (NegativeOperandeException e) {
			System.err.println(e.getMessage());
		}
	}

}
