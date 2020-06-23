package org.dimitri.ds.list;


public class ArrayList<E> implements List<E> {
    private int size=10, length =0;
    private E[] array;

    public ArrayList(){
        this(DEFAULT_SIZE);
    }

    public ArrayList(int size){
        this.size= size;
        this.array = (E[])new Object[size];
    }

    @Override
    public void add(E item) {
        if(this.size == this.length)
            this.resize();

        this.array[this.length++]= item;
    }

    @Override
    public void add(int index, E item) throws ArrayIndexOutOfBoundsException {
        if(index < 0 || index > this.length)
            throw  new ArrayIndexOutOfBoundsException(String.format("Unable to add element at index %d", index));

        if(this.size == this.length)
            this.resize();

        for(int i= this.length; i > index; i-- )
            this.array[i+1]= this.array[i];

        this.array[index]=item;
        this.length++;
    }

    @Override
    public boolean contains(E item) {

        for(int i =0; i < this.array.length; i++)
            if(this.array[i] == item) return true;

        return false;
    }

    @Override
    public E get(int index) throws ArrayIndexOutOfBoundsException {
        if(index < 0 || index > this.length)
            throw  new ArrayIndexOutOfBoundsException(String.format("Unable to retrieve element at index %d", index));

        return this.array[index];
    }

    @Override
    public int length() {
        return this.length;
    }

    @Override
    public boolean remove(E item) {
        int index= 0;
        while(index < this.array.length){
            if(this.array[index] == item)
                break;
            index++;
        }
        if(index <= this.length){
            for(int i = index; i < this.array.length-1; i++)
                this.array[i]=this.array[i+1];
            this.array[this.length--]= null;
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(int index) throws ArrayIndexOutOfBoundsException {
        if(index < 0 || index > this.length)
            throw  new ArrayIndexOutOfBoundsException(String.format("Unable to remove element at index %d", index));

        for(int i = index; i < this.array.length-1; i++)
            this.array[i]=this.array[i+1];
        this.array[this.length--]= null;
        return true;
    }

    @Override
    public void set(int index, E item) throws ArrayIndexOutOfBoundsException {
        if(index < 0 || index > this.length)
            throw  new ArrayIndexOutOfBoundsException(String.format("Unable to update element at index %d", index));
        this.array[index]= item;
    }


    private void resize(){
        this.size *=2;
        E[] temp = (E[])new Object[this.size];

        for(int i =0; i < this.array.length; i++)
            temp[i]= this.array[i];

        this.array= temp;

    }


}
