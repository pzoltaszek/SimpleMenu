import java.util.regex.*;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;


class SimpleMenu {
public static void main (String args[]){
SmTablice dd = new SmTablice();
dd.tablice1();
System.out.println("Witaj, co chcesz zrobiæ:?");	
	SmMenu me = new SmMenu();
me.menu();
}
}