/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deletionofelement;

/**
 *
 * @author 2415t
 */
public class DeletionOfElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A[] = new int[10];
        A[0]=1;
        A[1]=11;
        A[2]=121;
        A[3]=131;
        A[4]=141;
        A[5]=151;
        int temp = A[2];
        int n=10;
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+",");
        }
    }
    
}
