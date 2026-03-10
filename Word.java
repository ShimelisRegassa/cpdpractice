import java.util.Scanner;
public class Word {
public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
if(in.hasNext()){
    String word=in.nextLine();
    int small=0;
    for(int i=0;i<word.length();i++){
        char test=word.charAt(i);
        if(Character.isLowerCase(test)){
           small++;
        }
     
    }
    if(small>=(word.length()/2.0)){
        word=word.toLowerCase();
        System.out.println(word);
    }
    else{
        word=word.toUpperCase();
        System.out.println(word);
    }

}in.close();;
}
    
}
