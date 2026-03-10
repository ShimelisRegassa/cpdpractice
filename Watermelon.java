import java.util.Scanner;
public class Watermelon{
    public static void main(String[] args) {
        int weight;
       Scanner out = new Scanner(System.in);
     System.out.println("Inter the weight of watermelon:");
     weight= out.nextInt();
     if(weight<=0){
        System.out.println("Invalid input ");
     }
     else{
       
        if(weight %2==0 && weight>2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO!");
        }
        
        out.close();

     }
    }
}