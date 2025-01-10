//Queue Data Structure using Array..

public class byArray{
    
    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
    
        Queue(int n){              //Constructor
            arr =new int[n];
            this.size=n;
        }
    
        public static boolean isEmpty(){
            return rear==-1;
        }
    
        //enqueue------------------------------------------
         public static void add(int data){
            if(rear==size-1){
                System.out.println("Full queue");
                return;
            }
            rear++;
            arr[rear]=data;
    
        }
        
        //Dequeue------------------------------------------
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            int front= arr[0];
            for(int i=0; i<rear; i++){
                arr[i]=arr[i+1];
        
            }
            rear--;
            return front;
        }
        
        //Peek-------------------------------------------------
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return arr[0];
            }
        }
    
    public static void main(String arg[]){
        Queue q= new Queue(5);
    
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
                           
        while(!q.isEmpty()){
        System.out.println(q.peek());
         q.remove();

        }
        
    }   

}