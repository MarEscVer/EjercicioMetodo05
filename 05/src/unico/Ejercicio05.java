package unico;

public class Ejercicio05 {

	public static void main(String[] args) {

/* Implementar un método que, mediante un booleano, indique si el
 * carácter que se pasa como parámetro de entrada corresponde con una vocal.
 */
		final String VOCAL = "Es una vocal";
		final String FVOCAL = "No es una vocal";
		String letra;
		String mensaje;
		boolean resultado;
		
		letra = Util.leerString("Introduzca una letra: ");
		resultado = esVocal(letra);
		
		mensaje = resultado ? VOCAL : FVOCAL;
		Util.escribir(mensaje);
		
	}
	
	public static boolean esVocal(String l) {
		boolean tipo = false;
		
		switch (l) {
			case "a", "e", "i", "o", "u": tipo = true; break;
			default: tipo = false;
		}
		return tipo;
	}
	
}
