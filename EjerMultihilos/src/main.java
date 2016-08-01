
import java.io.IOException;

public class main {

	public static void main(String[] args) throws Exception {
		
		 tiempo file1 = new tiempo("Hilo 1");
		 tiempo file2 = new tiempo("Hilo 2");
		 file1.thrd.setPriority(Thread.NORM_PRIORITY);
		 file2.thrd.setPriority(Thread.NORM_PRIORITY);
		 file1.thrd.start();
		 file2.thrd.start();
		 try {
		 file1.thrd.join();
		 file2.thrd.join();
		 }
		 catch(InterruptedException exc) {
		 System.out.println("Main thread interrupted.");
		 }
		 System.out.println("\nPrioridad alta con: " +
		 file1.count);
		 System.out.println("Prioridad baja con: " +
		 file2.count);
		 System.out.println(); 
		hilos hilo = new hilos(); 
		hilo.start();
		xml_hilo hilo2 = new xml_hilo(); 
		System.out.println(); 
		hilo2.start();
		
		
		

	}

}