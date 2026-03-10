import java.util.Scanner;
public class Matrix {
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int movement=0;
    for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
        if(scanner.nextInt()==1){
        movement=Math.abs(i-3) +Math.abs(j-3);
        break;
        }
        }
    }
    System.out.println(movement);
    scanner.close();
}
    
}
