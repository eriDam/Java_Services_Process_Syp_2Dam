
public class Hilo extends Thread{
	
	//Colocamos el constructor
	public Hilo(String msg) {
		super(msg);//esta estructura obligatoria es por que se heredan propiedades de la clase thread
		
	}
	
	//Este método es el que se va a ejecutar en el momento de iniciar nuetro proceso
	public void run(){
		//coloco dentro de este método run todo lo que se va a ejecutar simultaneamete
		//Hare un ciclo en el cual se despliega 20 veces un mensaje con el nombre del hilo
		for (int i=0;i<=20;i++){
			System.out.println("Está ejecutando el "+this.getName());//getName es el metodo que me permite mostrar el nombre del proceso
			
		}
		
	}
	
	
}
