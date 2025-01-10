public class recursion9 {

    public static boolean sortedIncreseaing(int arr[], int idx){
        if(idx==arr.length-1){
            return true;
        }

        if(arr[idx]<arr[idx+1]){
            return sortedIncreseaing(arr , idx+1);
        }else{
            return false;
        }

    }

    public static void main(String arg[]){
          int arr[]={4,6,0,9};
          System.out.println(sortedIncreseaing(arr,0));
    }
    
}
