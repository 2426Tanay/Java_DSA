/**
 * Search
 */
import java.util.*;
public class Search {
public static void main(String[] args) {
    int A[] = {1,2,3,4,5,6,7,8,9};
    int key,i;
    Scanner sc=new Scanner(System.in);
    for(int x=0;x<A.length;x++){
        System.out.print(x);
    }
    System.out.print("\nEnter index number from 1 to 9:  ");
    key =sc.nextInt();
    for(i=0;i<A.length;i++){
        if(key==A[i]){
            System.out.println("Number was found "+key+" at index "+i);
            System.exit(0);
        }
    }
    System.out.println("Not found at "+key);
}
    
}