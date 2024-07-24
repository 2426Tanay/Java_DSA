/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secondlargestnumber;

/**
 *
 * @author 2415t
 */
public class SecondLargestNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int A[] = {56,57,59,58,100,200};
       int max1,max2,i;
       max1=max2=A[0];
       for(i=0;i<A.length;i++){
           if(A[i]>max1){
               max2=max1;
               max1=A[i];
           }
           else if(A[i]>max2){
               max2=A[i];
           }
       }
        System.out.println("Second largest number in the array is "+max2);
       
    }
    
}
