package ArrayListImplementation;
import java.util.*;
public class AList {
    public static class myArrayList{
        int size;
        int[] data;
        static final int DEFAULT_VALUE = 5;
        myArrayList(){
            this(DEFAULT_VALUE);
        }
        myArrayList(int cap){
            this.size = 0;
            this.data = new int[cap];
        }

        int get(int idx){

            if(idx < 0 || idx >= this.size){
                System.out.println("Invalid Arguments");
                return -1;
            }
            return this.data[idx];
        }

        void set(int idx,int val){

            if(idx < 0 || idx >= this.size){
                System.out.println("Invalid Arguments");
                return;
            }
            this.data[idx] = val;
        }

        int size(){
            return this.size;
        }
        
        void display(){
            for(int i = 0; i < size(); i++){
                System.out.print(this.data[i] + " ");
            }
            for(int i = this.size; i < data.length; i++){
                System.out.print(".");
            }
            System.out.println();
        }

        void add(int idx, int val){
            if(idx < 0 || idx > this.size){
                System.out.println("Invalid Argument");
                return;
            }
            // resize
            if(this.size == this.data.length){
                System.out.println("Resising Up");
                int[] nData = new int[this.data.length*2];
                for(int i = 0; i < this.size; i++){
                    nData[i] = this.data[i];
                }
                this.data = nData;
            }
            // insert
            for(int i = this.size; i > idx; i--){
                this.data[i] = this.data[i-1];
            }
            this.data[idx] = val;
            this.size++;
        }
        void remove(int idx){
            if(idx < 0 || idx >= this.size){
                System.out.println("Invalid Arguments");
                return;
            }
            // deletion
            for(int i = idx; i < this.size -1; i++){
                this.data[i] = this.data[i+1];
            }
            this.data[this.size-1] = 0;
            this.size--;

            // resizing
            if(this.size == this.data.length/4){
                System.out.println("Resizing Down");
                int[] nData = new int[this.data.length/2];
                for(int i = 0; i < this.size; i++){
                    nData[i] = this.data[i];
                }
                this.data = nData;
            }
        }
    }

    public static void main(String[] args){

        myArrayList l1 = new myArrayList(4);
        l1.add(0,10);
        l1.display();
        l1.add(1,20);
        l1.display();
        l1.add(2,30);
        l1.display();
        l1.add(3,40);
        l1.display();
        l1.add(4,50);
        l1.display();
        l1.set(4,200);
        l1.display();
        l1.remove(4);
        l1.display();
        l1.remove(3);
        l1.display();
        l1.remove(1);
        l1.display();
        l1.remove(0);
        l1.display();

    }
}
