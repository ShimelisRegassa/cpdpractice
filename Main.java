import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
  if(in.hasNextInt()){
    int n=in.nextInt();
    in.nextLine();
    for(int i=0;i<n;i++){
        String word=in.nextLine();
        if(word.length()>10){
            int m=word.length()-2;
            char fir=word.charAt(0),las=word.charAt(word.length()-1);
            System.out.println(fir+""+m+""+las);

        }
        else{
            System.out.println(word);
        }
    }
  }
  in.close();
    }
    
}
