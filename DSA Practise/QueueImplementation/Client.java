package QueueImplementation;

public class Client {
    public static void main(String[] args) throws Exception{
        DynamicQueue q = new DynamicQueue();
        // Queue q = new Queue();
        
        // q.pop();
        for(int i = 1; i <= 1000; i++){
            q.push(i*10);
        }
        while(!q.isEmpty()){
            System.out.println(q.pop());
        }
        // System.out.println();
    }
}
