public class recursion10 {

    public static void transferX(String str, int count, int idx, String newString){

        if(idx==str.length()){
            for(int i=0; i<count ; i++){
                newString+='x';
            }System.out.println(newString);
            return;
        }

        char current=str.charAt(idx);
        if(current=='x'){
            count++;
            transferX(str, count, idx+1, newString);
        }else{
            newString +=current;
            transferX(str, count, idx+1, newString);
        }
    }

    public static void main(String arg[]){
        String str="axkvxxok";
        transferX(str, 0, 0, "");

    }
    
}
