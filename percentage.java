import java.util.Scanner;

public class percentage {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter percentage marks");
		double percentage = scan.nextDouble();

		if(percentage >= 70){
			System.out.println(" congratulations you got Distinction");
		}else if(percentage < 70 && percentage >= 60){
			System.out.println("congratulation you got First Class");
		}else if(percentage < 60 && percentage >= 40){
			System.out.println("congratulations you got second class");

		}else {
			System.out.println("Failed!");
		}
	}

}