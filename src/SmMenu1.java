import java.util.regex.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.lang.*;
import java.text.*;

public class SmMenu1 {
	SmTablice tab = new SmTablice();
static String m1regex1 = "([A-z]{1,30}) {1}([A-z]{1,30})"; // nie uwzglêdnia nazwisk 2-cz³onowych
static String m1regex2 = "[0-9]{1,3}";	//poprawnie max wzrostu 1 -999
static String inputName;
static String inputHeight;
static Scanner scInputName;
static Scanner scInputHeight;
static Integer heightFromString;
static boolean heightOk = false;

static Pattern patternInputName; 
static Matcher matcherInputName;

static Pattern patternInputHeight; 
static Matcher matcherInputHeight;

static List <String> listName = new ArrayList<>();
static List <Integer> listHeight = new ArrayList<Integer>();

public void  menu1() {
	
	System.out.println("Jesteœ w menu dodawania danych. Dodaj imie i nazwiko oraz wzrost osoby");
	System.out.println("Podaj imie i nazwisko w formacie \"Imie Nazwisko\"");

	// ************************* add name ******************
	
	do {
	scInputName = new Scanner(System.in);
	inputName = scInputName.nextLine();
	
	patternInputName = Pattern.compile(m1regex1);
	matcherInputName = patternInputName.matcher(inputName);
	
	if (matcherInputName.matches()==true) {
		tab.dodajName(inputName);
		break;
	}
	else System.out.println("Z³y format nazwy. Podaj imie i nazwisko w formacie \"Imie Nazwisko\"");
} while (tab.name == null);
	
	// ************************ add height *********************
	
	System.out.println("Podaj wzrost w centymetrach (1-999)");
	
	do {
	scInputHeight = new Scanner(System.in);
	inputHeight = scInputHeight.nextLine();
	
	if(inputHeight.equals("0")){
		System.out.println("Naprawdê? Jeszcze raz");
		continue;
	}
	
	patternInputHeight = Pattern.compile(m1regex2);
	matcherInputHeight = patternInputHeight.matcher(inputHeight);
	
	if (matcherInputHeight.matches()==true) {
		heightFromString = Integer.valueOf(inputHeight);
		tab.dodajHeight(heightFromString);
		System.out.println("ok. Dane zosta³y dodane");
		heightOk = true; 
		break;
		
	}
	else System.out.println("Z³y format. Podaj wzrost z zakresu (1-999)");
} while (heightOk == false);
	heightOk = false;
	System.out.println("teraz przejdziesz do menu g³ownego");
	SmMenu mex = new SmMenu();
	mex.menu();
	
	} //metoda

} //class