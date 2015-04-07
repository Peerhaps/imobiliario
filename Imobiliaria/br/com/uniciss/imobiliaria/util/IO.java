package br.com.uniciss.imobiliaria.util;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class IO {

	public static String getConteudoDoArquivo(String nomeDoArquivo)
			throws IOException {
		StringBuilder conteudo = new StringBuilder();

		InputStream is = new FileInputStream(nomeDoArquivo);

		Scanner entrada = new Scanner(is);

		while (entrada.hasNextLine())
			conteudo.append(entrada.nextLine());

		entrada.close();
		is.close();

		return conteudo.toString();
	}

	public static void setConteudoDoArquivo(String nomeDoArquivo,
			String conteudo) throws IOException {
		Writer writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(nomeDoArquivo)));

		writer.write(conteudo);
		writer.close();
	}

}
