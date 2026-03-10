import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        if(in.hasNextInt()){
            int x=0, num=in.nextInt();
            in.nextLine();
            for(int i=0;i<num;i++){
             String state=in.nextLine();
             if(state.equals("++X")||state.equals("X++")){
                x++;
             }
             else{
                x--;
             }
            }
            System.out.println(x);
        }
        in.close();
    }
}
