import java.util.Scanner;

public class IT26102230Lab7Q1A{
	
	public static void main(String[] args){
		
		int mark1, mark2, mark3, mark4;
		double avg;
		String grade;
		
		Scanner lookfor = new Scanner(System.in);
		
		System.out.println("Enter marks for four subjects:");
		
		System.out.print("Enter Subject Mark 1: ");
		mark1 = lookfor.nextInt();
		
		System.out.print("Enter Subject Mark 2: ");
		mark2 = lookfor.nextInt();
		
		System.out.print("Enter Subject Mark 3: ");
		mark3 = lookfor.nextInt();
		
		System.out.print("Enter Subject Mark 4: ");
		mark4 = lookfor.nextInt();
		
		avg = (mark1 + mark2 + mark3 + mark4)/4.0;
		
		if(avg <= 100 && avg >= 75){
			grade = "Distinction";
		}
		else if(avg < 75 && avg >= 50){
			grade = "Credit";
		}
		else{
			grade = "Fail";
		}
		
		System.out.println("\nAverage is : " + avg);
		System.out.println("Overall Grade is : " + grade);
	}
}