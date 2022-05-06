package QueueImplementation;

public class Queue {
    // data variables
    private int[] arr;
    private int arrSize = 0;
    private int queueSize = 0;
    private int front = 0;
    private int back = 0;

    // constructor
    public Queue(){
        this.initialize(5);
    }
    public Queue(int size){
        this.initialize(size);
    }

    public void initialize(int size){
        this.arr = new int[size];
        this.arrSize = size;
        this.queueSize = 0;
        this.front = 0;
        this.back = 0;
    }
    protected int sizeArr(){
        return arrSize;
    }

    // member function
    public boolean isEmpty(){
        return this.queueSize == 0;
    }
    public int size(){
        return this.queueSize;
    }
    public void push(int x) throws Exception{
        queueIsFullException();
        this.arr[this.back] = x;
        this.back = (this.back+1) % this.arrSize;
        this.queueSize++;
    }
    public int pop() throws Exception{
        queueIsEmptyException();
        int val = this.front();
        this.arr[this.front] = 0;
        this.front = (this.front+1)%this.arrSize;
        this.queueSize--;
        return val;
    }
    public int front() throws Exception{
        queueIsEmptyException();
        return this.arr[this.front];
    }
    public void Display(){
        for(int i = 0; i < size(); i++){
            int idx = (i+this.front)%this.arrSize;
            System.out.print(this.arr[idx]+" ");
        }
        System.out.println();
    }
    private void queueIsFullException() throws Exception{
        if(queueSize == arrSize){
            throw new Exception("Queue is full");
        }
    }
    private void queueIsEmptyException() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
    }
}
