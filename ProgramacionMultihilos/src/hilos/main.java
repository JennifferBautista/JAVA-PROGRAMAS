package hilos;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Priority mt1 = new Priority("Alta prioridad");
	    Priority mt2 = new Priority("Baja prioridad");
	    Priority mt3 = new Priority("Normal prioridad");
	    // set the priorities
	    mt1.thrd.setPriority(Thread.MAX_PRIORITY);
	    mt2.thrd.setPriority(Thread.MIN_PRIORITY);
	    mt3.thrd.setPriority(Thread.NORM_PRIORITY);
	    // start the threads
	    mt1.thrd.start();
	    mt2.thrd.start();
	    mt3.thrd.start();
	    try {
	      mt1.thrd.join();
	      mt2.thrd.join();
	      mt3.thrd.join();
	    }
	    catch(InterruptedException exc) {
	      System.out.println("Hilo interrumpido");
	    }
	    System.out.println("\n1)Subproceso de prioridad alta contó hasta " +mt1.count);
	    System.out.println("2)Subproceso de prioridad baja contó hasta " +mt2.count);
	    System.out.println("3)Subproceso de prioridad normal contó hasta " +mt3.count);



	}

}
