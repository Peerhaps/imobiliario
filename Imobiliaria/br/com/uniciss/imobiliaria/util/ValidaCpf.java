package br.com.uniciss.imobiliaria.util;
public class ValidaCpf {

	private static final int[] valoresPrimeiroDigitoVerificador = { 10, 9, 8,
			7, 6, 5, 4, 3, 2 };
	private static final int[] valoresSegundoDigitoVerificador = { 11, 10, 9,
			8, 7, 6, 5, 4, 3, 2 };

	private static int[] numeros;

	public static boolean valido(String cpf) {

		numeros = extrairNumeros(cpf);

		if (numeros == null)
			return false;

		int primeiroDigitoVerificador = calcularPrimeiroDigitoVerificador();

		int segundoDigitoVerificador = calcularSegundoDigitoVerificador(primeiroDigitoVerificador);

		String verificadores = String.valueOf(primeiroDigitoVerificador)
				+ String.valueOf(segundoDigitoVerificador);

		return cpf.endsWith(verificadores);
	}

	private static int[] extrairNumeros(String cpf) {
		char[] cpfArray = cpf.toCharArray();

		if (cpf.toCharArray().length == 11)
			return extrairNumerosDeCpfSemFormatacao(cpfArray);
		else if (cpf.toCharArray().length == 14)
			return extrairNumerosDeCpfComFormatacao(cpfArray);
		else
			return null;
	}

	private static int[] extrairNumerosDeCpfSemFormatacao(char[] cpfArray) {
		int[] numeros = new int[9];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Character.getNumericValue(cpfArray[i]);

			if (numeros[i] < 0)
				return null;
		}

		return numeros;
	}

	private static int[] extrairNumerosDeCpfComFormatacao(char[] cpfArray) {
		int[] numeros = new int[9];

		int j = 0;
		for (int i = 0; i < 11; i++) {
			if (i == 3 || i == 7)
				continue;

			numeros[j] = Character.getNumericValue(cpfArray[i]);

			if (numeros[j] < 0)
				return null;

			j++;
		}

		return numeros;
	}

	private static int calcularPrimeiroDigitoVerificador() {
		int somatoria = 0;

		for (int i = 0; i < valoresPrimeiroDigitoVerificador.length; i++)
			somatoria += numeros[i] * valoresPrimeiroDigitoVerificador[i];

		int primeiroDigitoVerificador = somatoria % 11;

		return primeiroDigitoVerificador < 2 ? 0
				: 11 - primeiroDigitoVerificador;
	}

	private static int calcularSegundoDigitoVerificador(
			int primeiroDigitoVerificador) {
		int somatoria = 0;

		for (int i = 0; i < valoresSegundoDigitoVerificador.length - 1; i++)
			somatoria += numeros[i] * valoresSegundoDigitoVerificador[i];

		somatoria += primeiroDigitoVerificador
				* valoresSegundoDigitoVerificador[valoresSegundoDigitoVerificador.length - 1];

		int segundoDigitoVerificador = somatoria % 11;

		return segundoDigitoVerificador < 2 ? 0 : 11 - segundoDigitoVerificador;
	}
}
