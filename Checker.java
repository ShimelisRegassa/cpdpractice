import java.util.Scanner;
public class Checker {
   static  void  checker(int num){
    if(num<=1)
        System.out.println("It is not prime number !");
  else if (num>1){ 
     boolean found =true; 
   for(int i=2;i*i<=num;i++){
      if(num%i==0){
        System.out.println("It is not prime number!");
        found=false;
      }
      
    }
    if(found){
    System.out.println("It is prime number!");}
}
}
public static void main(String[] args) {
    int num;
    Scanner out=new Scanner(System.in);
    System.out.println("Inter the number you want to check if its prime factors : ");
    num=out.nextInt();
    checker(num);
    out.close();
}
}
