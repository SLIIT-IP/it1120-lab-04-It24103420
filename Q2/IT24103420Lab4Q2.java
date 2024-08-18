import java.util.Scanner;
public class IT24103420Lab4Q2
{
	public static void main(String[] args)
	 {
	   Scanner scanner=new Scanner (System.in);
	   
	   double examMarks, labMarks, examPercentage, labPercentage,finalMarks;
	   
	   System.out.print("Please enter exam marks (out of100):");
	   examMarks=scanner.nextDouble();
	   if (examMarks < 0 || examMarks > 100) {
	       System.out.println("Invalid input for exam marks.Terminating program.");
		   return;
	   }
	   
	   System.out.print("Please enter lab marks (out of  100 ):");
	   labMarks=scanner.nextDouble();
	   if (labMarks < 0 || labMarks >100){
		   System.out.println("Invalid input for lab marks.Terminating program.");
		   return;
	   }  
	   
	   System.out.print("Please enter the percentage given for the exam:");
	   examPercentage=scanner.nextDouble();
	   if (examPercentage < 0 || examPercentage > 100) {
	       System.out.println("Invalid input for the percentage given for the exam.Terminating program.");
		   return;
	   }
	   
	   System.out.print("Please enter the percentage given for the lab:");
	   labPercentage=scanner.nextDouble();
	   if (labPercentage < 0 || labPercentage > 100){
	       System.out.println("Invaild input for the percentage given for the lab submission.Terminating program.");
		   return;
	   }
	   
	   if (examPercentage+labPercentage !=100) {
	       System.out.println("The percentage must add up to 100.Terminating program.");
		   return;
	   }
	   
	   finalMarks = (examMarks * examPercentage / 100)+(labMarks * labPercentage / 100);
	   
	   System.out.println("Final exam mark is: " + finalMarks);
	   }
}
	   