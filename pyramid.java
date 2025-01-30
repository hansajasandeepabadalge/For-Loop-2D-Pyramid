import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		while (true) {
			Scanner input = new Scanner(System.in);
			int a = input.nextInt();
		
			for (int i=1; i<=a; i++) {
				System.out.println(" ".repeat(a-i) + "*".repeat(2*i-1));
			}
		}
	}
}
