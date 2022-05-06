package Stack;

public class DynamicStack extends stacks{
    //constructors

    public DynamicStack(int size){
        super(size);
    }
    public DynamicStack(){
        super();
    }

    //push override
    @Override
    public void push(int val) throws Exception{
        if(super.size() == super.arrSize()){
            int[] temp = new int[super.size()];
            int i = temp.length-1;
            while(super.size()!=0) temp[i--] = super.pop();
            // for(int j: temp){
            //     System.out.println(j);
            // }
                // System.out.println(super.arrSize());
            super.initialize(super.arrSize()*2);
            // System.out.println(temp.length);
            for(int j = 0; j < temp.length; j++) 
            super.push(temp[j]);
        }
        super.push(val);
    }
    // @Override
    // public void push(int val) throws Exception {
    //     if (super.arrSize() == super.size()) {
    //         int[] temp = new int[super.size()];
    //         int idx = super.size() - 1;
    //         while (super.size() != 0)
    //             temp[idx--] = super.pop();

    //         super.initialize(super.arrSize() * 2);

    //         for (int i = 0; i < temp.length; i++)
    //             super.push(temp[i]);
    //     }

    //     super.push(val);
    // }
}