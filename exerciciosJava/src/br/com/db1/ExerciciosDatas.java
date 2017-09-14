package br.com.db1;

public class ExerciciosDatas {

	public String resultado;

	public String exibirResultado() {
		return resultado;
	}

	public Boolean anoBisexto(Integer ano) {
		if (ano % 400 == 0) {
			return true;
		} else if ((ano % 4 == 0) & (ano % 100 != 0)) {
			return true;
		} else {
			return false;
		}
	}

}
