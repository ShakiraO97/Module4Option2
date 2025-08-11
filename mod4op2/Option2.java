
import java.util.Scanner;

public class Option2 {
	public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			float total = 0;
			float max = Float.MIN_VALUE;
			float min = Float.MAX_VALUE;

			for (int i = 1; i <= 10; i++) {
			    System.out.print("Enter grade #" + i + ": ");
			    while (!scanner.hasNextFloat()) {
			        System.out.println("Invalid input. Please enter a numeric grade.");
			        scanner.next(); // discard invalid input
			        System.out.print("Enter grade #" + i + ": ");
			    }
			    float grade = scanner.nextFloat();
			    total += grade;

			    if (grade > max) {
			        max = grade;
			    }
			    if (grade < min) {
			        min = grade;
			    }
			}

			float average = total / 10;
			System.out.printf("Average grade: %.2f\n", average);
			System.out.printf("Maximum grade: %.2f\n", max);
			System.out.printf("Minimum grade: %.2f\n", min);
		}
    }
}
