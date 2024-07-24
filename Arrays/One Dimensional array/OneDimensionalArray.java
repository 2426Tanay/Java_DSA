/**
 * One Dimensional Array
 */
class OneDimensionalArray {
    public static void main(String[] args) {

        // Methods to create an array
        int A[]=new int[10];
        int B[]= {1,2,3,4,5};
        int C[];
        C = new int[10];

        System.out.println(A.length);
        System.out.println(B.length);
        System.out.println(C.length);

        // way to print element of an array with help of there indecies
        System.out.println(A[2]);

        // Way to print all element of an array
        // For loop
        for(int i=0;i<=A.length;i++){
            System.out.println(A[i]);
        }
        for(int i=0;i<=B.length;i++){
            System.out.println(B[i]);
        }
        
        // For each loop
        for(int x:B)
        {
        System.out.println(x);

        }

        // For reverse order
        int D[] = {1,2,3,4,5};
        for(int i = D.length-1;i>=0;i--){
            System.out.println(D[i]);
        }
        for(int x:D){
            System.out.println(x);
        }

    }
    
}