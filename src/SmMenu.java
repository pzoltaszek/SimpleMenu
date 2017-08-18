import java.util.regex.*;
import java.util.Scanner;

public class SmMenu {
SmMenu1 men1 = new SmMenu1();
SmMenu2 men2 = new SmMenu2();
SmKoniec kon = new SmKoniec();
SmTablice tabs = new SmTablice();
	String regex1 = "1";
	String regex2 = "2";
	String regex3 = "x";
	String userInput;
	int x = 1;
	boolean warMen1 = false;
	
	public void menu() {
		
	Scanner inputMenu;
	
	Pattern pattern1, pattern2, pattern3; 
	Matcher matcher1, matcher2, matcher3;
	
		
	System.out.println("Wybierz \"1\" aby dodaæ dane");	
	System.out.println("Wybierz \"2\" aby odczytaæ dane");	
	System.out.println("Wybierz \"x\" aby wyjœæ");	
	
	do { 
	
		inputMenu = new Scanner(System.in);
		userInput = inputMenu.nextLine();
		
		pattern1 = Pattern.compile(regex1); 
		matcher1 = pattern1.matcher(userInput);
		
		pattern2 = Pattern.compile(regex2); 
		matcher2 = pattern2.matcher(userInput);
		
		pattern3 = Pattern.compile(regex3); 
		matcher3 = pattern3.matcher(userInput);	
		
		if (matcher1.matches() == true){
		men1.menu1();
		break;}
		
		if (matcher2.matches() == true){ 
		men2.menu2();
		break;}
		
		if (matcher3.matches() == true){
		kon.run();
		break;}
	
			System.out.println("z³y input, jeszzce raz. 1 = dodaj dane, 2 = zapisz dane, x = wyjœcie");
	} //do
	while (warMen1 == false);
		
	}
}