public class insertionsort {

    public static int arraysorting(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
        return 0;
    }

    public static void main(String arg[]){
        int arr[]={5,7,9,2,4};

        for(int i=1; i<arr.length; i++){ 
            int current =arr[i];

            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        arraysorting(arr);
    }
    
}
