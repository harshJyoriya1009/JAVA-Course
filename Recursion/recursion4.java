public class recursion4 {
    public static void printFib(int a, int b,int n){
        if(n==0){
            return;
        }

        int c=a+b;
        System.out.println(c);
        printFib(b,c,n-1);
    }

    public static void main(String arg[]){
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int n=8;

        printFib(a,b,n-2);
    }
    
}
