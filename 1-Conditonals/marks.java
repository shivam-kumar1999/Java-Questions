import java.util.Scanner;

public class conditonal {
    public static void main(String[] args) {

        System.out.println("Enter your Marks");
        Scanner sc= new Scanner(System.in);
        int marks= sc.nextInt();

        //code
        if (marks>90 ){
            System.out.println("Excellent");
        }else if (marks>80){
            System.out.println("Great");
        }else if (marks>70){
            System.out.println("Good");
        }else if (marks>60){
            System.out.println("Average");
        } else if (marks>50) {
            System.out.println("Very Bad");
        }else {
            System.out.println("You Need Help");
        }
    }
}
