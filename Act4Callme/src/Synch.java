class Synch { //Se define la clase Synch y se incluye el main (método principal para arrancar la app)
   	public static void main(String args[]) {
		Callme target = new Callme();
		new caller(target, "Hola");
		new caller(target, "Mundo");
		new caller(target, "Sincronizado");
}
}