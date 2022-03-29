package filaSequencialInt;

public class FilaSequencialInt {

	public final int N = 3;
	int[] dados = new int[N];
	int ini, cont, fim ;

	
	public void init() {
		ini = fim = cont = 0;
	}
	
	public boolean IsEmpty(){
		if (cont==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean IsFull() {
		if (cont == N) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void enqueue(int elem) {
		if (IsFull()==true) {
			System.out.println("fila cheia");
		}
		else {
			dados[fim] = elem;
			fim = (fim+1) % N;
			cont++;
		}
	}
	public int dequeue() {
		int e = dados[ini];
		ini = (ini+1) % N;
		cont--;
		return(e);
			
		
	}
	public int first() {
		return dados[ini]
	}
}
