
//////Ejemplo 1 - CountThreadTest.java Inicio  - Versi�n Runnable/////////////
public class Act3Runnable implements Runnable {
	int from; //
	int to; //
	public Act3Runnable(int from, int to) { //Constructor con 2 parametros integer from y to
		this.from = from;
		this.to = to;
	}
	//Debemos sobreescribir el m�todo run
	@Override
	public void run() {
		for (int i = from; i < to; i++) {
			System.out.println(toString() + " i : " + i);
			/* El m�todo to string nos convierte el resultado de la devolucion del objeto a String

*/
	}
	

	}
}
