class caller implements Runnable { //La clase caller impelmenta Runnable
	String msg;
	Callme target;
    	
    public caller(Callme t, String s) {
    	target = t;
    	msg = s;
    	new Thread(this).start();
    }
    	
    public void run() {
    	synchronized(target) {
    		target.call(msg);
    	}
    }
}
