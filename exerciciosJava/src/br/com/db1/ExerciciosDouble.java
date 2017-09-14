package br.com.db1;

public class ExerciciosDouble {

	public Double resultado;

	
	public Double exibirResultado(){
		return resultado;
	}
	
	public void menor (Double valor1, Double valor2){
		if (valor1 < valor2) {
			resultado = valor1;
		} else {
			resultado = valor2;
		}
	}
	
	public void menorTri (Double valor1, Double valor2, Double valor3){
		if (valor1 < valor2 && valor1 < valor3) {
			resultado = valor1;
		} else {
		if (valor2 < valor1 && valor2 < valor3) {
			resultado = valor2;
		} else {
			resultado = valor3;
		}
		}
	}
	
	public void media (Double valor1, Double valor2, Double valor3){
		resultado = (valor1 + valor2 + valor3)/3;
	}
	
	public void areaTriangulo (Double base, Double altura){
		resultado = (base * altura)/2;
	}
	
	}
