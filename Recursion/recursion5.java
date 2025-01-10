public class recursion5 {

    public static int calPower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        int powerNm1= calPower(x, n-1);
        int powerN= x*powerNm1;

        return powerN;
    }
    public static void main(String arg[]){
        int x=2; 
        int n=6;

        int ans=calPower(x,n);
        System.out.print(ans);

    }
    
}
