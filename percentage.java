package codewithharry;

import java.util.Scanner;

public class percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter marks of 1st subject");
		Scanner sc = new Scanner(System.in);
		int eng = sc.nextInt();
		System.out.println("enter marks of 2nd subject");
		Scanner sc1 = new Scanner(System.in);
		int hin = sc.nextInt();
		System.out.println("enter marks of 3rd subject");
		Scanner sc2 = new Scanner(System.in);
		int math = sc.nextInt();
		System.out.println("enter marks of 4th subject");
		Scanner sc3 = new Scanner(System.in);
		int sci = sc.nextInt();
		System.out.println("enter marks of 5th subject");
		Scanner sc4 = new Scanner(System.in);
		int opt = sc.nextInt();
		System.out.println("sum of your marks is");
		int sum= eng + hin + math + sci + opt;
		System.out.println(sum);
		
		System.out.println("you %age is");
		int per = sum/5;
		int fin = per*100;
		System.out.println(per);

	}

}
