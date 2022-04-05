package mainProcessos;

import static javax.swing.JOptionPane.*;

import filaSequencialInt.FilaSequencialInt;

public class mainProcessos {
	static int menu = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pid = new int[10];
		int i = 0;
		FilaSequencialInt fila = new FilaSequencialInt();

		Menu();
		if (menu == 1) {
			pid[i] = Integer.parseInt(showInputDialog("Digite o número do processo: "));
			fila.enqueue(pid[i]);
			i++;
			Menu();
		}

		if (menu == 2) {
			pid[i-1] = fila.dequeue();
			System.out.println("Processo a ser realizado: " + pid);
			int botao = showConfirmDialog(null, "O pid funcionou?");
			if (botao == 0) {
				System.out.println("o pid funcionou");
				Menu();
			} else {
				System.out.println("Não funcionou");
				fila.enqueue(pid[i-1]);
				Menu();
			}
			if ((menu == 3) && (fila.IsEmpty() == true)) {
				menu = 4;
			}
			else {
				Menu();
			}
		}

	}

	private static void Menu() {
		// TODO Auto-generated method stub
		menu = Integer.parseInt(showInputDialog("Digite 1 para enviar processo, 2 para processar e 3 para encerrar: "));
	}

}
