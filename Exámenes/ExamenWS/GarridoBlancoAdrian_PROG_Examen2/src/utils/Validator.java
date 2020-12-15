package utils;

/**
 * Clase destinada a comprobar si un String se puede parsear
 * a alg�n tipo primitivo como Int.
 * 
 * @author AdriGB
 */
public class Validator {
	
	/**
	 * M�todo que comprueba si un String puede parsearse a Int.
	 * @param strInt
	 * @returns false Si no se puede parsear.
	 * @returns true Si se puede parsear.
	 */
	public static boolean isInt(String strInt) {
		boolean isInt = false;		
		try {
			Integer.parseInt(strInt);
			isInt = true;
		} catch(Exception e) {
			isInt = false;
		}		
		return isInt;
	}
	
	/**
	 * M�todo que comprueba si un String puede parsearse a Double.
	 * @param strDouble
	 * @returns false Si no se puede parsear.
	 * @returns true Si se puede parsear.
	 */
	public static boolean isDouble(String strDouble) {
		try {
			Double.parseDouble(strDouble);
			return true;
		} catch(Exception e) {
			return false;
		}
	}
}
