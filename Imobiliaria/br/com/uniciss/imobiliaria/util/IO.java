package br.com.uniciss.imobiliaria.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

		InputStream is;
		try {
			is = new FileInputStream(nomeDoArquivo);

			Scanner entrada = new Scanner(is);

			while (entrada.hasNextLine())
				conteudo.append(entrada.nextLine());

			entrada.close();
			is.close();

			return conteudo.toString();

		} catch (FileNotFoundException e) {
			File file = new File(nomeDoArquivo);
			file.createNewFile();
			setConteudoDoArquivo(nomeDoArquivo, "{}");
			return "{}";
		}
	}

	public static void setConteudoDoArquivo(String nomeDoArquivo,
			String conteudo) throws IOException {
		Writer writer;
		try {
			writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(nomeDoArquivo)));
		} catch (FileNotFoundException e) {
			File file = new File(nomeDoArquivo);
			file.createNewFile();
			setConteudoDoArquivo(nomeDoArquivo, conteudo);
			return;
		}

		writer.write(conteudo);
		writer.close();
	}

}
