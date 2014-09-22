
import java.util.Formatter;
import java.util.Scanner;

public class inf {
	public void inf(){
		Formatter x;
		Scanner scn;
	
		try{
			
			x = new Formatter("pat//1.txt");
			scn = new Scanner(System.in);
			System.out.println("Your age: ");
			int a = (int)Double.parseDouble(scn.next());
			System.out.println("Your name: ");
			String b = scn.next();
			System.out.println("Residence: ");
			String c = scn.next();
			x.format(" Name %s the age %d home %s", b, a, c);
			x.close();
				}catch(Exception e){};
	}
}

