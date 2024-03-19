package Negocio;

import javax.swing.JOptionPane;

import Modelagem.Fila;

public class FilaAplicacao {
	public static void main(String[] args) {
	Fila filaDePessoas = new Fila();
	String input = JOptionPane.showInputDialog("Digite o nome da primeira pessoa");
	int numero1 = Integer.parseInt(input);
	filaDePessoas.incluirNaFila(numero1);
	
	input = JOptionPane.showInputDialog("Digite o nome da segunda pessoa");
	int numero2= Integer.parseInt(input);
	filaDePessoas.incluirNaFila(numero2);
	
	input = JOptionPane.showInputDialog("Digite o nome da terceira pessoa");
	int numero3= Integer.parseInt(input);
	filaDePessoas.incluirNaFila(numero3);
	filaDePessoas.mostrarFila();
	}
}
