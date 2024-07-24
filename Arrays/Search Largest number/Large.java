/**
 * Large
 */
public class Large {
public static void main(String[] args) {
    int A[] = {1,2,3,4,5,6,7,8,9};
    int max,i;
    max = A[0];
    for(i=0;i<A.length;i++){
        if(A[i]>max){
            max = A[i];
           
        }
    }
    System.out.println("Largest number in the array is  "+max);
}
    
}
