import java.io.IOException;


public class list {
	public void list()
		throws IOException{
		char choice, ignore;		
		System.out.println("Choose the appropriate variant: ");
		System.out.println();
		for(;;){
		do{			
	System.out.println("1. sore throat ");
	System.out.println("2. temperature, cough ");
	System.out.println("3. back pain, factures ");
	System.out.println("4. allergy ");
	System.out.println("quit - q");
	
	choice = (char) System.in.read();
	do{
	ignore = (char) System.in.read();
		} while(ignore != '\n');
		} while(choice < '1' | choice > '9' & choice != 'q');
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
			System.out.println("�� ����� �����������");
			break;
			default:
				System.out.print("�� ���������� ������!(������� ��- ���)");
				System.out.println("\n");
	
}
}
}
}
