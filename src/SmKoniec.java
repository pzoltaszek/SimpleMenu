public class SmKoniec implements Runnable {
	Thread t;
	public void zakonczenie(){
		System.out.println("Dziêkuje");
	}
	
	public void newThread(){
		t = new Thread ();
		t.start();
	}
	public void run(){
		System.out.println("Dziêkujê");
		try {
			for (int i=3; i>0; i--) {
				System.out.println("Koniec nast¹pi za: " + i);
				Thread.sleep(1000);
			} // for
			} catch (InterruptedException ie) {
				System.out.println("Upss, coœ posz³o nie tak.");
			}
		System.out.println("Mo¿na teraz bezpiecznie wy³¹czyæ komputer");
		}
	}