/**
 * 
 */
package exercice3;

/**
 * @author Thomas LINTANF, Gabriel RIBIER
 *
 */
public class Racine {
	private double precision;
	
	/**
	 * Construit une instance de classe Racine1
	 * @param precision valeur de la pr�cision des racines caluler par cette instance
	 */
	Racine(double precision) {
		this.precision=precision;
	}  
	
	/**
	 * Calcul la racine carr� d'un nombre
	 * @param operande valeur d'entr�eS
	 * @return la racine carr� d'operande
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
	 * @return la pr�cision de calcul des racines
	 */
	double getPrecision(){
		return precision;
	}
	
	/**
	 * Permet de d�finir la pr�cision avec laquelle est calcul�e la racine
	 * @param precision
	 */
	void setPrecision(double precision) {
		this.precision = precision; 
	}
}
