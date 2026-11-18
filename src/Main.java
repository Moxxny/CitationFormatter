import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Citation Formatter");
		
		System.out.print("Enter author's name: ");
		String author = input.nextLine();
		
		System.out.print("Enter the title: ");
		String title = input.nextLine();
		
		System.out.print("Enter the publisher: ");
		String publisher = input.nextLine();
		
		System.out.print("Enter the publication year: ");
		String year = input.nextLine();
		
		System.out.println("\nYour Citation:");
		
		System.out.println(author + ". " + title + ". " + publisher + ", " + year + ".");
		
		input.close();
	}
}