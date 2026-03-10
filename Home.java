import java.util.Scanner;
public class Home {
    public static void main(String[] args) { 
    int num1,num2;
  String choice;
  System.out.println("Inter A for addition\nInter B for subtraction");
  System.out.println("Inter your choice :");
  Scanner obj= new Scanner(System.in);
  choice=obj.nextLine();
  if(choice.equals("A")){
    int sum;
    System.out.println("Inter the first number : ");
    num1=obj.nextInt();
    obj.nextLine();
    System.out.priaantln("Inter the second number :");
    num2=obj.nextInt();
    sum= num1+num2;
    System.out.println("Summation is "+sum);
  }
  else if (choice.equals("B")) {
    System.out.println("Inter the first number : ");
    num1=obj.nextInt();
     obj.nextLine();
    System.out.println("Inter the second number :");
    num2=obj.nextInt();
   int sum= num1-num2;
    System.out.println("Subtraction is "+sum);
    
  } 
    obj.close();
  

  }
      
    }

