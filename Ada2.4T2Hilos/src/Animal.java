
public class Animal  extends Thread{
	
	//Atributos de animal
	private String nombre;
	
	//Constructor
	public Animal( String nombre){
		
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + "]";
	}

	//Implemento el método run que será lo que se realice cuando se ejecute con 
	//strart() en la clase principal.
		public void run(){
			
			for (int i=0;i<1;i++){
			 
				System.out.println("Yo soy el hilo: "+nombre+" y tengo la prioridad "+getPriority());
			
				 
			} 
				 
					
			} 
		}
	

