package p1;

import Books.Book;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.print("Використати готову базу данних?(введіть 0 для підтвердження) ");
		int chekansver = scan.nextInt();
		Book[] Books;
		if(chekansver == 0) {
			num = 5;
			Books = CreateArrayOfBooksE();
		}else {
			num = scan.nextInt();
			Books = CreateArrayOfBooks(num, scan);
		}
		PrintArrayOfBooks(Books, num);
		int inp;
		loop :while(true){
			System.out.print("\nЗнайти книжки по \n1 - автору \n2 - видавництву \n3 - року\n");
			inp = scan.nextInt();
			switch(inp) {
			case 1:
				AuthorF(Books, num, scan);
				break;
			case 2:
				PublishingHouseF(Books, num, scan);
				break;
			case 3:
				YearF(Books, num, scan);
				break;
			default:
					break loop;
			}
		}
		System.out.print("\nкінець");
		scan.close();
	}
	
	private static Book[] CreateArrayOfBooks(int num, Scanner scan) {
	    Book[] BK = new Book[num];
	    Book dop = new Book();
	    for(int i = 0; i < num; i++) {
	    	System.out.print("Введіть ID: ");
	    	int dopi = scan.nextInt();
	    	dop.setID(dopi);
	    	System.out.print("Введіть Назву: ");
	    	String dops = scan.next();
	    	dop.setName(dops);
	    	System.out.print("Введіть Автора: ");
	    	dops = scan.next();
	    	dop.setAuthor(dops);
			System.out.print("Введіть Видавництво: ");
			dops = scan.next();
			dop.setPublishingHouse(dops);
			System.out.print("Введіть Рік видання: ");
			dopi = scan.nextInt();
			dop.setYear(dopi);
			System.out.print("Введіть Кількість сторінок: ");
			dopi = scan.nextInt();
			dop.setPages(dopi);
			System.out.print("Введіть Ціну: ");
			double dopd = scan.nextDouble();
			dop.setPrice(dopd);
			BK[i] = dop;
	    }
	    return BK;
	}
	
	private static Book[] CreateArrayOfBooksE() {
		Book[] BK = new Book[5];
		
		BK[0] = new Book(76142, "Limbo", "Tom" , "SmartBooks" , 1999, 213 , 299.9);
		BK[1] = new Book(19723, "Killer in the dark", "Steve" , "ScaryHouse" , 2009, 183 , 350);
		BK[2] = new Book(99812, "Brain dance", "Jerry" , "SmartBooks" , 1995, 497 , 599.9);
		BK[3] = new Book(62414, "Rain", "Tom" , "SmartBooks" , 2008, 198 , 99.9);
		BK[4] = new Book(11664, "My enemy inside", "Peter" , "Literature of goods" , 2016, 388 , 285.3);
		return BK;
	}
	
	private static void PrintArrayOfBooks(Book[] BK, int num) {
		for(int i = 0; i < num; i++) {
			System.out.print(BK[i].toString() + ";\n");
		}
	}
	
	private static void AuthorF(Book[] BK, int num, Scanner scan) {
		System.out.print("\nВведіть Автора: ");
		String au;
		au = scan.next();
		for(int i = 0; i < num; i++) {
			if(au.equals(BK[i].getAuthor()))
				System.out.print(BK[i].toString() + ";\n");
		}
		
	}
	
	private static void PublishingHouseF(Book[] BK, int num, Scanner scan) {
		System.out.print("\nВведіть Видавництво: ");
		String au;
		au = scan.next();
		for(int i = 0; i < num; i++) {
			if(au.equals(BK[i].getPublishingHouse()))
				System.out.print(BK[i].toString() + ";\n");
		}
		
	}
	
	private static void YearF(Book[] BK, int num, Scanner scan) {
		System.out.print("\nВведіть Рік: ");
		int au;
		au = scan.nextInt();
		for(int i = 0; i < num; i++) {
			if(au < BK[i].getYear())
				System.out.print(BK[i].toString() + ";\n");
		}
		
	}

}
