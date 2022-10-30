//Task3**********************Task3*******************
package Assignment2;



import java.util.Arrays;
import java.util.Scanner;

public class Student {

	String name;
	String emailId;
	int number;

	Student(String name, String emailId, int number) {
		this.name = name;
		this.emailId = emailId;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", emailId=" + emailId + ", number=" + number + "]";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number of students ");
		int size = scanner.nextInt();
		Student[] ar = new Student[size];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = addStudent(i);
		}
		System.out.println("enter which student details you wanna check  and Enter this ID");
		int id = scanner.nextInt();
		if (id <= ar.length) {
			System.out.println(ar[id - 1]);
		} else {
			System.out.println("student is not present you can add " + (ar.length + 1) + " student");
			ar = Arrays.copyOf(ar, ar.length + 1);
			System.out.println(ar.length);
			ar[ar.length - 1] = addStudent(ar.length);
		}
		System.out.println(Arrays.toString(ar));
	}

	public static Student addStudent(int length) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter " + (length) + " Student Details");
		System.out.println("Name");
		String name = scanner.next();
		System.out.println("Email");
		String email = scanner.next();
		System.out.println("number");
		int number = scanner.nextInt();
		return new Student(name, email, number);
	}
}
