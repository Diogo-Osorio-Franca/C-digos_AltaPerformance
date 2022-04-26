package filaSequencialInt;
import java.util.Scanner;
public class main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilaSequencialString fila = new FilaSequencialString();
		
		Scanner entrada = new Scanner(System.in);
		
		int input;
		do {
			System.out.println("1 - insere paciente na fila: ");
			System.out.println("2 - chama paciente para atendimento: ");
			System.out.println("3 - encerra o atendimento: ");
			input = entrada.nextInt();
			
			if (input == 1) {
				System.out.println("Digite o nome do paciente: ");
				String paciente = entrada.next();
				fila.enqueue(paciente);
			}
			if (input == 2) {
				System.out.println("Paciente atendido: " + fila.dequeue());
			}
			
		} while(input!=3);
	}

}
