/**
 * 
 */
package exercice3;

/**
 * @author Thomas LINTANF
 *
 */
public class Racine {
	private double precision;
	
	/**
	 * Construit une instance de classe Racine1
	 * @param precision valeur de la précision des racines caluler par cette instance
	 */
	Racine(double precision) {
		this.precision=precision;
	}  
	
	/**
	 * Calcul la racine carré d'un nombre
	 * @param operande valeur d'entréeS
	 * @return la racine carré d'operande
	 * @throws NegativeOperandeException si operande est negatif
	 */
	double racine(double operande)
			throws NegativeOperandeException
	{
		if(operande < 0) throw new NegativeOperandeException(operande);
		
		double solution, carre, a, b;
		a=0;
		b=operande;
		solution=(a+b)/2;
		while(b-a>precision){
			carre=solution*solution;
			if (carre>operande) 
				b=solution;  
			else a=solution;  
			solution=(a+b)/2;    
		}     return solution;
	}
	
	/**
	 * 
	 * @return la précision de calcul des racines
	 */
	double getPrecision(){
		return precision;
	}
	
	/**
	 * Permet de définir la précision avec laquelle est calculée la racine
	 * @param precision
	 */
	void setPrecision(double precision) {
		this.precision = precision; 
	}
}
