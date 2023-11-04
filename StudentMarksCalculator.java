package projectCodsoft;
import java.util.*;

public class StudentMarksCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number Of Subject:\n");
		int subject=sc.nextInt();
		
		int[] marks=new int[subject];
		int totalmarks=0;
		
		for (int i = 0; i < subject; i++)
        {
            System.out.print("Enter marks obtained in each Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
             totalmarks += marks[i];
        }
            
            double averagepercentage= (double)totalmarks/(subject*100)*100;
            
            
            System.out.println("Your Result is Ready....");
            System.out.println("Total Marks Is :"+totalmarks);
            System.out.println("Your Perncentage is:"+averagepercentage+"%");
            sc.close();
            
            
            if(averagepercentage>=90) {
            	System.out.println("Your Grade is A++");
            	
            }
            else if(averagepercentage>=80) {
            	System.out.println("Your Grade is A+");
            }
            else if(averagepercentage>=70) {
            	System.out.println("Your Grade is A");
            }
            else if(averagepercentage>=60) {
            	System.out.println("Your Grade is B++");
            }
            else if(averagepercentage>=50) {
            	System.out.println("Your Grade is B");
            }
            else if(averagepercentage>=45) {
            	System.out.println("Your Grade is C");
            }
            else if(averagepercentage>=30) {
            	System.out.println("Your Grade is D");
            }
            else {
            	System.out.println("You Are Fail...");
            }
       

	}

}
