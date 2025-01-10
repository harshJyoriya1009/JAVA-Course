public class recursion3 {

    public static int calFactorial(int n){
        if(n==1 || n==0){
            return 1;
        }

        int fact_Nm1=calFactorial(n-1);
        int fact_Nm=n*fact_Nm1;
        return fact_Nm;
    }

    public static void main(String arg[]){
        int n=7;

        int ans= calFactorial(n);
        System.out.print(ans);
    }
    
}
