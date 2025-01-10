public class recursion2 {

    public static void printSum(int i, int n, int sum){
        if(i==n){
            sum = sum+i;
           System.out.print(sum);
           return;
        }
           sum=sum+i;
        printSum(i+1, n, sum);
       
    }
    public static void main(String arg[]){
        printSum(1,6,0);
    }
    
}
