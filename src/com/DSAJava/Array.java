package com.DSAJava;

public class Array {
    private int[] items;
    private int count;

    public Array(int length){
        items = new int[length];
    }
    public void insert(int item){
        // if array is full, resize it
        if (items.length == count){
            // create new array with double the count
            int[] newarray=new int[count * 2];
            // copy all element in items to newarray
            for(int i=0;i<count;i++)
                newarray[i]=items[i];
            //now declare newarray to items
            items=newarray;
        }

        // add new element at end
        items[count++]=item;

    }
    public void removeAt(int index){
        // validate index
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        // shift item to fill the blank
        // 10,20,30,40
        // index : 1
        //1 <- 2
        //2 <- 3
        for (int i=index;i<count;i++)
            items[i]=items[i+1];

        // pop the last
        count--;
    }
    public void print(){
        for(int i=0;i< count;i++){
            System.out.println(items[i]);
        }
    }

    public int indexOf(int item){
       //validate the index
        for(int i=0;i<count;i++){
            if (items[i] == item)
                return i;
        }
        return -1;
    }
    


}
