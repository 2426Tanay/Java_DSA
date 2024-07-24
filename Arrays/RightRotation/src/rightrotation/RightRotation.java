/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rightrotation;

/**
 *
 * @author 2415t
 */
public class RightRotation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5,6,7,8,9,10};
        int temp,i;
        temp=A[A.length-1];
        A[0]=temp;
        for(i=0;i<A.length-1;i++){
            System.out.print(A[i]);
        }
    }
    
}
