class Callme {
	synchronized void call (String msg) { //Para hacer 1 metodo sincronizado se utiliza synchronized keyword
// sentencias que se sincronizan

		System.out.print("[" + msg); 
		try {		
			Thread.sleep(1000); 
		}
		catch (Exception e) {};
		System.out.println("]");
    }
}

