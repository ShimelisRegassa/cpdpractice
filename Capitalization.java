import java.util.Scanner;
public class Capitalization {
public static void main(String[] args) {
    Scanner out= new Scanner(System.in);
   if(out.hasNext()){
    String name;
    name= out.next();
    String capital =name.substring(0,1).toUpperCase() + name.substring(1);
    System.out.println(capital );
}
out.close();
}
}