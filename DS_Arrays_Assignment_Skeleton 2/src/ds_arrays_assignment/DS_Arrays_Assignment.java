package ds_arrays_assignment;

import java.util.Random;
import ds_arrays.*;
//import ds_arrays.MyArrayIF;
//import ds_arrays.MyUnorderedArray;

/**
 *
 * @author ogm2
 */
public class DS_Arrays_Assignment {

    public static final int SIZE = 18;

    public DS_Arrays_Assignment() {
    }
    
    public void run() {
        Random rd = new Random();
        MyArrayIF<Integer> myArray = this.generateNewArray(SIZE);
        myArray.display();
        System.out.println("");
        PlayWithArraysIF pwa = new PlayWithArraysImpl();
        System.out.println("Size of array is " + pwa.findSize(myArray));
        System.out.println("Max value is " + pwa.findLargestValue(myArray));
        System.out.println("2nd largest val is " + pwa.findSecondLargestValue(myArray));
        System.out.println("\nIntersection with");
        MyArrayIF<Integer> myArray2 = this.generateNewArray(SIZE % 10);
        myArray2.display();
        MyArrayIF<Integer> myArray3 = this.generateNewArray(SIZE * 2);
        myArray3.display();
        myArray = pwa.intersect(myArray, myArray2, myArray3);
        myArray.display();
        
       
    }
    
    public MyArrayIF<Integer> generateNewArray(int size) {
        Integer[] arr = new Integer[size];
        for(int i = 0; i  < size; i++)
            arr[i] = 0;
        MyArrayIF<Integer> myArray = new MyUnorderedArray<>(arr);
        Random rd = new Random();
        for(int i = 0; i < size; i++)
            myArray.insert(rd.nextInt(101));
        return myArray;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new DS_Arrays_Assignment().run();
    }
    
}
