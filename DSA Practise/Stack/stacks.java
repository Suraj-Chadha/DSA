package Stack;

public class stacks{
    // data members
    private int[] arr;
    private int arrSize = 0;
    private int stackSize = 0;
    private int tos = -1;

    // constructor
    public stacks(){
        initialize(5);
    }
    public stacks(int size){
        initialize(size);
    }
    public void initialize(int size){
        this.arr = new int[size];
        this.arrSize = size;
        this.stackSize = 0;
        this.tos = -1;
    }

    // Exceptions
    private void StackIsFullException()throws Exception{
        if(this.stackSize == this.arrSize){
            throw new Exception("Stack size is full");
        }
    }
    private void StackIsEmptyException() throws Exception{
        if(this.stackSize == 0){
            throw new Exception("Stack is Empty Exception");
        }
    }
    // data functions

    public void push(int val) throws Exception{
        StackIsFullException();
        this.tos++;
        this.arr[tos] = val;
        this.stackSize++;
    }
    public boolean isEmpty(){
        return stackSize == 0;
    }
    public int pop() throws Exception{
        StackIsEmptyException();
        int val = this.top();
        this.arr[this.tos] = 0;
        this.tos--;
        this.stackSize--;
        return val;
    }
    public int size(){
        return this.stackSize;
    }
    public int top() throws Exception{
        StackIsEmptyException();
        return this.arr[this.tos];
    }

}