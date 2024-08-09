package Javaproject;
import java.util.Scanner;

public class StudentGradeCalculator {
	public static class GradeGenrator{
		  public  char calculateGrade(double averagePercentage) {
			 
		        if (averagePercentage >= 90) {
		            return 'A';
		            
		        } else if (averagePercentage >= 80) {
		            return 'B';
		            
		        } else if (averagePercentage >= 70) {
		            return 'C';
		            
		        } else if (averagePercentage >= 60) {
		            return 'D';
		            
		        } else if(averagePercentage>=50) {
		            return 'E';
		            
		        }else {
		        	
		        	return 'F';
		        }
		    }
	}


	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter the number of subjects: ");
		        
				int SubjectsNumber =sc.nextInt();

		        int[] marks = new int[SubjectsNumber];
		        
		        int totalMarks = 0;

		        // Input marks for each subject
		        for (int i = 0; i < SubjectsNumber; i++) {
		        	
		            System.out.print("Enter marks obtained in subject (out of 100) " + (i+1) + ": ");
		            marks[i] = sc.nextInt();
		            
		            totalMarks += marks[i];
		        }

		        // Calculate average percentage
		        
		        
	        double averagePercentage=  (double)totalMarks/(SubjectsNumber*100);
		        averagePercentage=averagePercentage*100;

		        
		       
               
		       
		        System.out.println("\n------ Results ------");
		        
		        System.out.println("Total Marks: " + totalMarks);
		        
		        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
		       
		        GradeGenrator ob= new GradeGenrator();
		        
			      char grade=  ob.calculateGrade(averagePercentage);
			      
			      System.out.println("Grade: " + grade);

		        
		    }


	
	}

		    
		

	


