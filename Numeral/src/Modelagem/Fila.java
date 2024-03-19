package Modelagem;

import javax.swing.JOptionPane;

public class Fila {
	int inicio;
	int fim;
	int tamanho;
	int quantidadePessoas;
	int F [];
	
	public Fila() {
		inicio=fim=-1;
		tamanho=3;
		F=new int [tamanho];
		quantidadePessoas=0;
		
	}
	public boolean estaVazia() {
		if(quantidadePessoas==0) {
			return true;
		}else {
			return false;
		}
	}public boolean estaCheia(){
		if(quantidadePessoas==tamanho-1) {
			return true;
		}else {
			return false;
		}
	}
	public void incluirNaFila(int e) {
		if(!estaCheia()) {
			if(inicio==-1) {
				inicio=0;
			}
			fim++;
			F[fim]=e;
			quantidadePessoas--;
		}
	}
	public void mostrarFila() {
		String Pessoas = "";
		for (int i=inicio; i<=fim; i++) {
			Pessoas += F[i]+"\n";
		JOptionPane.showMessageDialog(null, Pessoas);}
		}
}
