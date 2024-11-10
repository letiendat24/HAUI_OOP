package chap1;
import java.util.Scanner;

public class Input_output {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap so nguyen:");
		int numberInt = sc.nextInt();
		
		System.out.println("Nhap so thuc:");
		float numberFloat = sc.nextFloat();
		
		System.out.println("Nhap 1 ki tu");
		char character = sc.next().charAt(0);
		sc.nextLine();
		System.out.println("Nhap 1 chuoi ki tu:");
		String str = sc.nextLine();
		
		System.out.println(numberInt);
		System.out.println(numberFloat);
		System.out.println(character);
		System.out.println(str);
	}
}