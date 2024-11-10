package chap1;

import java.util.Scanner;

public class RankScores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap so diem: ");
		int score = sc.nextInt();
		char result = ' ';
		if (score < 50) {
			result = 'F';
		} else if (score >= 50 && score < 70) {
			result = 'D';
		} else if (score >= 70 && score < 80) {
			result = 'C';
		} else if (score >= 80 && score < 90) {
			result = 'B';
		} else if (score >= 90 && score <= 100) {
			result = 'A';
		} else {
			System.out.println("so diem ko hop le");
		}
		System.out.println(result);
	}
}
