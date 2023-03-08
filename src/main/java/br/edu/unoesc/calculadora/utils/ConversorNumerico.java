package br.edu.unoesc.calculadora.utils;

public class ConversorNumerico {
	public static boolean ehNumerico(String strNumero) {
		if (strNumero == null) {
			return false;
		}
		
		String numero = strNumero.replaceAll(",", ".");
		
		try {
			Double.parseDouble(numero);
			return true; 
		} catch (NumberFormatException e) {
			return false;
		}
		
	}
	
	public static Double converterParaDouble(String strNumero) {
		if (strNumero == null) {
			return 0d;
		}
		
		String numero = strNumero.replaceAll(",", ".");
		if (ehNumerico(numero)) {
			return Double.parseDouble(numero);
		}
		
		return 0d;
	}
}
