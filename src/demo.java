import java.io.IOException;
import java.util.*;
class demo{	
	static Formatter x;
	static Scanner scn;
	
	public static void main(String args []) throws IOException{	
		System.out.println("��� ��� ������� ������ �.�����-����������!");
		System.out.println("������ �������� ����������:  ");
		System.out.println();
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
			char choice, ignore;
			
			System.out.println("������� ���� ����� �� ��� �����: ");
			System.out.println();
			for(;;){
			do{			
		System.out.println("1. ���� � �����, � ����, ������. ");
		System.out.println("2. ������, ������, �����������, ��� � ����.");
		System.out.println("3. ���� �������, ������, ��������. ");
		System.out.println("4. ����� �� ���, ������. ");
		System.out.println("����� - q");
		
		choice = (char) System.in.read();	
		
		do{			
		ignore = (char) System.in.read();
		} while(ignore != '\n');		
		} while(choice < '1' | choice > '4' & choice != 'q');			
		if(choice == 'q') break;			
		System.out.println("\n");					
		switch(choice) {
		case '1':
			System.out.println("������� � ���������� � ���� �������� �� 1 ������ � ���. 101(���). ");
			break;
		case '2':
			System.out.println("������� � ���������� � ���� �������� �� 2 ������ � ���. 201(��������). ");
			break;
		case '3':
			System.out.println("������� � ���������� � ���� �������� �� 3 ������ � ���. 301(�����������). ");
			break;
		case '4':
			System.out.println("������� � ���������� � ���� �������� �� 4 ������ � ��� 401(������). ");
			break;
			default:
				System.out.print("�� ���������� ������!(������� ��- ���)");
		}
		System.out.println();
			}
			
	}
}


	