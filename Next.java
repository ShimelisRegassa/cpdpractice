import java.util.Scanner;
public class Next{
    public static void main(String[] args) {
      Scanner in= new Scanner(System.in); 
      if(in.hasNextInt()) {
        int num,pass,next=0;
       num=in.nextInt();
       pass=in.nextInt();
      int[]score= new int[num];
      for(int i=0;i<num;i++){
        score[i]=in.nextInt();
      }
      int point=score[pass-1];
      for(int i=0;i<num;i++){
        if(score[i]>=point &score[i]>0){
            next++;
        }
      }

       System.out.println(next);
      }
      in.close();
    }
    
}
