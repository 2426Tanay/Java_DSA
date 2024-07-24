/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leftrotation;

/**
 *
 * @author 2415t
 */
public class LeftRotation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6,7,8,9,10};
        int i,temp;
        temp=A[0];
        A[A.length-1]=temp;
        for(i=1;i<A.length;i++){
            System.out.print(""+A[i]);
        }
    }
    
}
