import java.util.*;

class demo{
	public static void main(String args[])
		throws java.io.IOException {
			char choice;
			System.out.println("Вас вітає обласна лікарня м.Івано-ФРанківська!");
			System.out.println("Виберіть будь ласка що вас турбує: ");
					
		System.out.println("1. Біль у вухах, у горлі, нежить. ");
		System.out.println("2. Нежить, кашель, температура, біль у горлі.");
		System.out.println("3. Біль суглобів, хребта, переломи. ");
		System.out.println("4. Висип на шкірі, алергія. ");
		
		choice = (char) System.in.read();		
		
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
			}
			
		}


