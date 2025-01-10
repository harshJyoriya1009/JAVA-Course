class bubblesort{

    public static int arraysorting(int arr[]){
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
        return 0;
    }
    public static void main(String arg[]){
        
        int arr[]= {5,9,8,7,2};
         
        //Bubble sort
        for(int i=0 ; i<arr.length-1 ; i++ ){ 
            for(int j=0 ; j<arr.length-i-1 ; j++){
                 //Swap
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp; 
                }
            }
        }
        arraysorting(arr);
    }
}


