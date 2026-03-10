import java.util.Scanner;
public class Elephant {
    public static void main(String[] args) {
        System.out.println("Position");
        Scanner out= new Scanner(System.in);
        if(out.hasNextInt()){
            int x=out.nextInt();
            if(x<=0){
                System.out.println("Invalid");
            }
            else{
                if(x<5){
                System.out.println(1);
                }
                else if(x%5==0){
                    System.out.println(x/5);}
                else{
                    System.out.println((x/5)+1);
                }   
            }
        }
out.close();
    }

    
}
