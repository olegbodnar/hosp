import java.io.IOException;
import java.util.*;
class demo{	
	static Formatter x;
	static Scanner scn;
	
	public static void main(String args []) throws IOException{	
		System.out.println("Вас вітає обласна лікарня м.Івано-ФРанківська!");
		System.out.println("Вкажіть наступну інформацію:  ");
		System.out.println();
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
		} while(choice < '1' | choice > '4' & choice != 'q');			
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
			System.out.println("Пройдіть у реєстратуру а потім підніміться на 4 поверх у каб 401(ШкірВЕН). ");
			break;
			default:
				System.out.print("Не правильний варіант!(Виберіть ще- раз)");
		}
		System.out.println();
			}
			
	}
}


	