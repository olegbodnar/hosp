import java.util.Formatter;
import java.util.Scanner;

public class inf {
	public void inf(){
		try{
			Formatter x = new Formatter();
			Scanner scn = new Scanner(System.in);
			System.out.println("��� ��: ");
			int a = (int)Double.parseDouble(scn.next());
			System.out.println("���� ��'�: ");
			String b = scn.next();
			System.out.println("̳��� ����������: ");
			String c = scn.next();
			x.format(" %s ��-  %d ���� ����������-  %s", b, a, c);
			x.close();
				}catch(Exception e){};
	}
}
