public class SmKoniec implements Runnable {
	Thread t;
	public void zakonczenie(){
		System.out.println("Dzi�kuje");
	}
	
	public void newThread(){
		t = new Thread ();
		t.start();
	}
	public void run(){
		System.out.println("Dzi�kuj�");
		try {
			for (int i=3; i>0; i--) {
				System.out.println("Koniec nast�pi za: " + i);
				Thread.sleep(1000);
			} // for
			} catch (InterruptedException ie) {
				System.out.println("Upss, co� posz�o nie tak.");
			}
		System.out.println("Mo�na teraz bezpiecznie wy��czy� komputer");
		}
	}