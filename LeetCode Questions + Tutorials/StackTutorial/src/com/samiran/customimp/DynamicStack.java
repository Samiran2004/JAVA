package com.samiran.customimp;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int data){
        if (this.isFull()){
            //Double the size of the stack...
            int[] temp = new int[this.data.length * 2];
            //Copy all previous data in new data...
            for (int i = 0; i < this.data.length; i++){
                temp[i] = this.data[i];
            }
            this.data = temp;
        }

        return super.push(data);

    }
}
