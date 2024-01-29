package com.DSAJava;

public class Array {
    private int[] items;
    private int count;

    public Array(int length){
        items = new int[length];
    }
    public void insert(int item){
        resizeIfRequired();
        // add new element at end
        items[count++]=item;

    }

    public void insertAtIndex(int item,int index){

        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
        resizeIfRequired();

        for (int i=count-1;i>=index;i--)
            items[i+1]=items[i];


        items[index]=item;
        count++;
    }

    public void resizeIfRequired(){
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

    }

    public Array intersect(Array other) {
        var intersection = new Array(count);

        for (int item : items)
            if (other.indexOf(item) >= 0)
                intersection.insert(item);

        return intersection;
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

    public int max(){
//        int max_value=items[0];
//        for (int i=1;i<count;i++){
//            if (items[i] > max_value )
//                max_value=items[i];
//        }
        int max_value=0;
        for (int item : items){
            if (item > max_value)
                max_value=item;
        }
        return max_value;
    }

    public void reverse(){
        int end=count-1;
        for (int i=0 ; i<end;i++,end--) {
            int temp=items[i];
            items[i]=items[end];
            items[end]=temp;

        }
        print();
    }


}
