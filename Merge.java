import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Merge {
    public static void main(String[] args) {
        List<Integer>newarray=new ArrayList<>();
        Scanner in= new Scanner(System.in);
        int m,n;
        m=in.nextInt();
        n=in.nextInt();
        int[]array1= new int[m];
        int[]array2= new int[n];
        int a=0,b=0;
        for(int i=0;i<m;i++){
            array1[i]=in.nextInt();
        }
          for(int i=0;i<n;i++){
            array2[i]=in.nextInt();
        }
        while(a<m-1&&b<n-1){
            if(array1[a]<array2[b]){
                newarray.add(array1[a]);
                a+=1;
            }
            else{
            newarray.add(array2[b]);
                b+=1;
            }}
 while(a<m){
            newarray.add(array1[a]);
             a+=1;
        }
  while(b<n){
            newarray.add(array2[b]);
             b+=1;
        }
for(int i=0;i<newarray.size();i++){
    System.out.println(newarray.get(i));
}

in.close();
    }
    
}
