import java.util.Scanner;

public class Done {
    public static void main(String[] args) {
    float mark;
    Scanner in= new Scanner(System.in);
    System.out.println("Inter your mark out of 100 :");
    mark=in.nextFloat();
    int good= (int)mark;
    if(mark>100 || mark<0){
        System.out.println("Invalid input, Try again !!");
    }
    else{
        int range= good/5;
        switch (range) {
            case 20,19,18:
                System.out.println("Your grade is : A+");
                break;
            case 17:
                System.out.println("Your grade is : A");
                break;
            case 16:
                System.out.println("Your grade is : A-");
                break;
            case 15:
                System.out.println("Your grade is : B+");
                break;
            case 14:
                System.out.println("Your grade is : B");
                break;
            case 13:
                System.out.println("Your grade is : B-");
                break;
            case 12:
                System.out.println("Your grade is : C+");
                break;
            case 11:
                System.out.println("Your grade is : C");
                break;
             case 10:
                System.out.println("Your grade is : C-");
                break;
             case 9,8:
                System.out.println("Your grade is : D");
                break;
             default:
                System.out.println("Your grade is : F");
                break;
        }
        in.close();
    }
  
}
}
