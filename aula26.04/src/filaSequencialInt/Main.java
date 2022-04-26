package filaSequencialInt;
import javax.swing.JOptionPane.*;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		   FilaSequencialInt fila = new FilaSequencialInt();
		   int input = 0;
		   Scanner entrada = new Scanner(System.in);
		   while (input >=0 ) {   
			   System.out.println("digite um número positivo: ");
			   input = entrada.nextInt();
			   fila.enqueue(input);}

		   while (fila.isEmpty() == false) {
			   System.out.println(fila.dequeue());
		   }
	}

   
   
}
