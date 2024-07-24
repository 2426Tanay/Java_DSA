/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertionofelement;

/**
 *
 * @author 2415t
 */
public class InsertionOfElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A[] = new int[10];
        A[0]=10;
        A[1]=10;
        A[2]=10;
        A[3]=10;
        A[4]=10;
        for(int z=0;z<A.length;z++){
            System.out.print(" "+A[z]);
        }
        int n=10;
        int v= 40;
        int index=2;
        for(int x=n;x>index;x--){
            A[index]=v;
        }
        System.out.println("");
        for(int x=0;x<A.length;x++){
            
            System.out.print(" "+A[x]);
        }
        
    }
    
}
