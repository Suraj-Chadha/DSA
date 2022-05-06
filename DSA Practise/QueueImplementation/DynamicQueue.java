package QueueImplementation;

public class DynamicQueue extends Queue{
    //contructor of Dynamic Queue inhertied from self made Queue class
    public DynamicQueue(int size){
        super(size);
    }
    public DynamicQueue(){
        super();
    }

    //functions override push
    @Override
    public void push(int val) throws Exception{
        if(super.size() == super.sizeArr()){
            int temp[] = new int[super.size()];
            int idx = 0;
            while(super.size()!=0){
                temp[idx++] = super.pop();
            }
            super.initialize(super.sizeArr()*2);
            for(int i = 0; i < temp.length; i++){
                super.push(temp[i]);
            }
        }
        super.push(val);
    }

}
