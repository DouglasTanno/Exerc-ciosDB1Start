package br.com.db1;

public class ExerciciosString {

	public String resposta;

	public String exibirResposta() {
		return resposta;
	}

	public String maiusculo(String palavra) {
		return palavra.toUpperCase();
	}

	public String minusculo(String palavra) {
		return palavra.toLowerCase();
	}

	public Integer contagem(String palavra) {
		return palavra.length();
	}

	public Integer cont1(String palavra) {
		palavra = palavra.trim();
		return palavra.trim().length();
	}

	public String nome(String palavra) {
		return palavra.substring(0, 4);
	}

	public String nome1(String palavra) {
		return palavra.substring(3, 19);
	}

	public String nome2(String palavra) {
		return palavra.substring(15, 19);
	}

	public String trocarNome(String palavra) {
		return palavra.replace("DOUGLAS", "ALUNO");
	}

	public String frutas(String palavra) {
		palavra = palavra.replace(", ", " ");
		return palavra;
	}

	public Integer contarVogais(String palavra) {
		int contarVogais = 0;
		palavra = palavra.toLowerCase();
		for (Integer i = 0; i < palavra.length(); i++) {
			char c = palavra.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				contarVogais++;
		}
		return contarVogais;
	}

	public String reverso(String palavra) {
		String fraseInvertida = new StringBuilder(palavra).reverse().toString();
		return fraseInvertida;
	}
}
