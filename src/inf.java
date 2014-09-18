import java.util.Formatter;
import java.util.Scanner;

public class inf {
	public void inf(){
		try{
			Formatter x = new Formatter();
			Scanner scn = new Scanner(System.in);
			System.out.println("Ваш вік: ");
			int a = (int)Double.parseDouble(scn.next());
			System.out.println("Ваше ім'я: ");
			String b = scn.next();
			System.out.println("Місце проживання: ");
			String c = scn.next();
			x.format(" %s вік-  %d місце проживання-  %s", b, a, c);
			x.close();
				}catch(Exception e){};
	}
}
