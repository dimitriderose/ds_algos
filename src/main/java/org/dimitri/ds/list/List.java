package org.dimitri.ds.list;

public interface List<E> {
    int size = 10, length=0;

    /**
     * Add item to the end of list object
     * @param item item to be added to end of list
     */
    void add(E item);

    /**
     * Add item to the at the specified index and shifting all values after that by one index
     * @param index specified index to place object in list
     * @param item item to be added to end of list
     * @throws ArrayIndexOutOfBoundsException when index is outside the allocated list
     */
    void add(int index, E item) throws ArrayIndexOutOfBoundsException;

    /**
     * checks to see if list contains specified item
     * @param item item to be checked in the list
     * @return true if item is in the list, otherwise returns false
     */
    boolean contains(E item);

    /**
     * retrieve item from specified index
     * @param index specific index of which to retrieve item
     * @return item located at the specified index
     * @throws ArrayIndexOutOfBoundsException when index is outside the allocated list
     */
    E get( int index) throws  ArrayIndexOutOfBoundsException;

    /**
     * number of elements in the list
     * @return length of the list
     */
    int length();

    /**
     * remove first occurrence of item from list
     * @param item item to be removed from list
     * @return true if item is found in the list and removed otherwise returns false
     */
    boolean remove(E item);

    /**
     * removed the item from specified index
     * @param index specific index of which the item is to be removed
     * @return true if item is found in the list and removed otherwise returns false
     * @throws ArrayIndexOutOfBoundsException when index is outside the allocated list
     */
    boolean remove(int index) throws ArrayIndexOutOfBoundsException;

    /**
     * update the item at the specified index with new item
     * @param index specified index to update the item
     * @param item new item to replace the old item
     * @throws ArrayIndexOutOfBoundsException when index is outside the allocated list
     */
    void set(int index, E item) throws ArrayIndexOutOfBoundsException;





}

