import java.util.regex.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.lang.*;
import java.text.*;
import java.io.*;

public class SmMenu2 {

	SmTablice tab2 = new SmTablice();
	String regex1m2 = "1";
	String userInputm2;
	String userInputm21;
	Integer one;
	Integer two;
	boolean warMen2 = false;
	boolean warMen3 = false;
	String reM21 = "[0-9]{1,3}";
	
public void menu2 () {
	
	Scanner inputMenu2;
	Scanner inputMenu21;
	Pattern pattern1m2; 
	Matcher matcher1m2;
	
	Scanner inputM21;
	Pattern patM21;
	Matcher matM21;
	System.out.print("Poni¿ej lista osób.");
	System.out.println(" (Osób na liœcie: "+tab2.getSize()+")");
	tab2.calaLista();
	/*
	do { 
		inputMenu2 = new Scanner(System.in);
		userInputm2 = inputMenu2.nextLine();
		
		pattern1m2 = Pattern.compile(regex1m2); 
		matcher1m2 = pattern1m2.matcher(userInputm2);
		
		if (matcher1m2.matches() == true){
		tab2.calaLista();
		warMen2 = true;
	
		}
	else System.out.println("Aby zobacyzæ listê nacisnij \"1\"");
		
	} while (warMen2 == false);
	*/
	 
    do {
    	System.out.println("Aby wyœwietliæ wzrost osoby z listy, wybierz odpowiadaj¹cy tej osobie numer.");
	inputM21 = new Scanner(System.in);
	userInputm21 = inputM21.nextLine();
	
	patM21 = Pattern.compile(reM21); 
	matM21 = patM21.matcher(userInputm21);
	
	
	if (matM21.matches() == true){
		one = Integer.parseInt(userInputm21);	 
		two = tab2.getSize();
		
				try {
					System.out.println("*** wzrost w centymetrach dla: " + tab2.getName(one-1)+ ", to: " + tab2.getHeight(one-1)+" ***");
          
					} catch (Exception e) {
						System.out.println("Niepoprawny parametr, rozmiar tablicy to: "+tab2.getSize());
         
					} //catch
		if (one<= two){
		warMen3 = true;
	}
	} // if pierwsze
	
	else System.out.println("Z³y format.");
} while (warMen3 == false);
	
	
	System.out.println("teraz przejdziesz do menu g³ownego");
	SmMenu mex2 = new SmMenu();
	mex2.menu();
}
}