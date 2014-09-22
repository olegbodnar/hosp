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
			System.out.println("Пройдіть у реєстратуру а потім підніміться на 1 поверх у каб. 101(ЛОР). ");
			break;
		case '2':
			System.out.println("Пройдіть у реєстратуру а потім підніміться на 2 поверх у каб. 201(ТЕРАПЕВТ). ");
			break;
		case '3':
			System.out.println("Пройдіть у реєстратуру а потім підніміться на 3 поверх у каб. 301(ТРАВМАТОЛОГ). ");
			break;
		case '4':
			System.out.println("Ви ввели неправильно");
			break;
			default:
				System.out.print("Не правильний варіант!(Виберіть ще- раз)");
				System.out.println("\n");
	
}
}
}
}
