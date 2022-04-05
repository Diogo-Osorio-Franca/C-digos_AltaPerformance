package main;
import static javax.swing.JOptionPane.*;

import filaSequencialInt.FilaSequencialInt;

public class Main {
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int[] aluno = new int[3];
		FilaSequencialInt fila = new FilaSequencialInt();
		fila.init();
		while(i<3){
		aluno[i] = Integer.parseInt(showInputDialog("Digite o número do aluno: "));
		fila.enqueue(aluno[i]);
		i++;}
		while (fila.IsEmpty() == false) {
		showMessageDialog(null, "Aluno atendido: " + fila.dequeue());	
		}
		
	}

}
