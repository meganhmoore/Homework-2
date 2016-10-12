package ds_arrays_assignment;

import ds_arrays.*;

public interface PlayWithArraysIF <E extends Comparable<E>> {

    /**
     * Determines the size of an array.
     * @param a  the array whose size is determined
     * @return  the size of a
     */
    public int findSize(MyArrayIF<E> a);
    
    /**
     * Determines the largest value stored in an array.
     * @param a  the array whose max is determined
     * @return  the max value stored in a
     */
    public E findLargestValue(MyArrayIF<E> a);
    
    /**
     * Determines the second largest value stored in an array.
     * @param a  the array whose second largest value is determined
     * @return  the second largest value stored in a
     */
    public E findSecondLargestValue(MyArrayIF<E> a);
        
    /**
     * Finds all the values that are common to three different arrays.
     * HINT: you are allowed to modify a1 so that it ends up storing common
     * values only.
     * @param a1  the first array to intersect
     * @param a2  the second array to intersect
     * @param a3  the third array to intersect
     * @return  the intersection of a1, a2, and a3
     */
    public MyArrayIF<E> intersect(MyArrayIF<E> a1, MyArrayIF<E> a2, MyArrayIF<E> a3);
        
}
