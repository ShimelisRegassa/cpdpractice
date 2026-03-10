import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
public class Third{
public static void main(String[] args) {
    Set<Character>charset=new HashSet<>();
    Scanner out= new Scanner(System.in);
    if(out.hasNext()){
        String name=out.nextLine();
        for(char adds:name.toCharArray()){
            charset.add(adds);
        }
    if(charset.size()%2==0){
        System.out.println("CHAT WITH HER!");
    }
    else{
        System.out.println("IGNORE HIM!");
    }

    }
  out.close();
}
}