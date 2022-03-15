package binario;
import tipoPilha.TipoPilhaInt;


import java.util.Scanner;

public class binario {
	public static void main(String[] args) {
	TipoPilhaInt pilha = new TipoPilhaInt();
	Scanner entrada = new Scanner(System.in);
	int num = 0;
    System.out.println("Digite o número: " );
    num = entrada.nextInt();
	while (!pilha.isFull() && num!=0) {
		pilha.push(num % 2);
		num = num / 2;
	}
	System.out.print("valor em binário: ");
	pilha.empty();
			
	
	
}}
