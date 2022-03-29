package main;

import filaSequencialInt.FilaSequencialInt;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilaSequencialInt fila = new FilaSequencialInt();
		fila.init();
		fila.enqueue(23);
		fila.enqueue(17);
		fila.enqueue(66);
		if (!fila.IsEmpty())
		System.out.println(fila.dequeue());
		if (!fila.IsEmpty())
		System.out.println(fila.dequeue());
		if (!fila.IsEmpty())
		System.out.println(fila.dequeue());
	}

}
