import java.util.*;

class demo{
	public static void main(String args[])
		throws java.io.IOException {
			char choice;
			System.out.println("��� ��� ������� ������ �.�����-����������!");
			System.out.println("������� ���� ����� �� ��� �����: ");
					
		System.out.println("1. ���� � �����, � ����, ������. ");
		System.out.println("2. ������, ������, �����������, ��� � ����.");
		System.out.println("3. ���� �������, ������, ��������. ");
		System.out.println("4. ����� �� ���, ������. ");
		
		choice = (char) System.in.read();		
		
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
			}
			
		}


