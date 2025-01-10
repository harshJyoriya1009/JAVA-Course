public class quicksort {
   //PIVOT AND PARTITION..

    public static int partition(int arr[], int low, int high){
        
        int i=low-1;

        for(int j= low; j<high; j++){
            if(arr[j]<arr[high]){
                i++;
                
                //SWAP
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }


    public static void quickShot(int arr[], int low, int high){

        if(low < high){
            int pidx=partition(arr,low,high);   //pidx==> pivot index..

            quickShot(arr, low, pidx-1);
            quickShot(arr, pidx+1, high);
        }
    }

    public static void main(String arg[]){
        int arr[]={2,3,4,5,2,7,9};
        int n=arr.length;
        
        quickShot(arr,0,n-1);
        
        //PRINT
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    
}
