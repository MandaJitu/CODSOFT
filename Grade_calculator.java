import java.util.Scanner;
public class Grade_calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int sub = sc.nextInt();
        float Total_marks = 0;

        for(int i=1; i<=sub; i++){
            System.out.print("Enter subject "+ i + " marks: ");
            float marks = sc.nextFloat();
            Total_marks = Total_marks + marks;
        }

        System.out.println("Total marks obtained: "+ Total_marks);

        float avg_percentage = Total_marks/sub;
        System.out.println("Average percentage obtained: "+ avg_percentage);

        if(avg_percentage<=100.0 && avg_percentage>=90.0){
            System.out.println("Grade: A");
        }
        else if(avg_percentage<=89.0 && avg_percentage>=80.0){
            System.out.println("Grade: B");
        }
        else if(avg_percentage<=79.0 && avg_percentage>=70.0){
            System.out.println("Grade: C");
        }
        else if(avg_percentage<=69.0 && avg_percentage>=60.0){
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Grade: F");
        }

        
        sc.close();
    }
}