import java.util.Scanner;
public class Domino {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int fir=in.nextInt();
        int sec=in.nextInt();
        int num=(fir*sec)/2;
        System.out.println(num);
        in.close();
    }
    
}
