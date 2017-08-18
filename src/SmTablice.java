
import java.util.ArrayList;
import java.util.List;

public  class SmTablice {
	String name;
	Integer height;
	Integer dl;
	static List <String> listName = new ArrayList<>();
	static List <Integer> listHeight = new ArrayList<Integer>();
	
	public static void tablice1(){
		listName.add("Jan Kowalski");
		listName.add("Piotr Nowak");
		listName.add("John Smith");
		listHeight.add(183);
		listHeight.add(165);
		listHeight.add(25);	
		
	}
	
	public String getName(Integer x){    // pobiera element listy imoin
		return listName.get(x);	
	}
	
	public Integer getHeight(Integer x){   // pobiera element listy wzrostu
		return listHeight.get(x);	
	}
	
	
	public void dodajName(String y){  // dodaje do listy imion
		listName.add(y);
	}
public void dodajHeight(Integer z){  // dodaje do listy wzrostu
	listHeight.add(z);
	}

public Integer getSize(){    // pobiera dlugoœæ listy imion
	return listName.size();	
}

public void calaLista(){
	for (int i=0; i<listName.size();i++) {
		System.out.println(i+1 +": " +listName.get(i));}
}
}