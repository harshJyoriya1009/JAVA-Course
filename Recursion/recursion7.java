public class recursion7 {

    public static void printRev(String str, int idx){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }

    public static void main(String arg[]){
        String str= "HARSH";
        printRev(str, str.length()-1);


    }
    
}
