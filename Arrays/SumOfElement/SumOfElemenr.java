public class SumOfElemenr {
    public static void main(String[] args) {
        int A[]={5,5,5};
        
        int sum =0;
        // for(int i=0;i<A.length;i++){
        //     sum = sum + A[i];
        // }
        
        for(int x:A){
            sum=sum+x;
        }
        System.out.println("Total addition of an array is  "+sum); 
    }
}
