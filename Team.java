import java.util.Scanner;
public class Team {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
     if(in.hasNextInt()){
        int num=0 ,n=in.nextInt();
        in.nextLine();
    for(int i=0;i<n;i++){
        int m=0;
        for(int p=0;p<3;p++){
            int answer=in.nextInt();
          m+=answer;
        }
        if(m>=2){
            num++;
        }  
    }
      System.out.println(num);
    }
    in.close();
}
}