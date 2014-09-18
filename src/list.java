import java.io.IOException;


public class list {
	public void list()
		throws IOException{
		char choice, ignore;		
		System.out.println("Виберіть будь ласка що вас турбує: ");
		System.out.println();
		for(;;){
		do{			
	System.out.println("1. Біль у вухах, у горлі, нежить. ");
	System.out.println("2. Нежить, кашель, температура, біль у горлі.");
	System.out.println("3. Біль суглобів, хребта, переломи. ");
	System.out.println("4. Висип на шкірі, алергія. ");
	System.out.println("Вийти - q");
	
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
