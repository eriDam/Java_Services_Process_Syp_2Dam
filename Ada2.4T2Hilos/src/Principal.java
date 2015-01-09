
public class Principal {

	public static void main(String[] args) {
		try{
			// Creamos los threads de la clase animal
		
		System.out.println("Creando los hilos/animales");
		Animal tortuga = new Animal("Tortuga");
		Animal liebre  = new Animal("Liebre");
		Animal guepardo = new Animal("Guepardo");
		System.out.println("Creados ok");
		System.out.println("*****************************************************************************");
		//Asignando prioridades
		System.out.println("Asignando prioridades");
		System.out.println("*****************************************************************************");
		tortuga.setPriority(1);
		liebre.setPriority(5);
		guepardo.setPriority(10);
		
		//Averiguamos la prioridad de cada animal
		System.out.println("Averiguamos la prioridad de cada animal");
		System.out.println("Tortuga tiene prioridad = "+tortuga.getPriority()+"\nLiebre tiene prioridad "
				+ "= "+liebre.getPriority()+"\nGuepardo tiene prioridad = "+guepardo.getPriority());
		System.out.println("*****************************************************************************");
		
		
		
		//Iniciamos los hilos
		System.out.println("Comienza la carrera");
		tortuga.start();
		liebre.start();
		guepardo.start();
		
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
