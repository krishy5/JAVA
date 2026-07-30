package JAVA;
public class Arrays {
    public static void main(String[] args) {
        
        // There are two types of array


        //1. Primitive array

        int[] arr = {1,2,3,4,5};
        //          { arr[0], arr[1], arr[2], arr[3], arr[4]}
        arr[2] = 54; // modify array element
        for (Object elm : arr) { // how to access array // traverse array
            System.out.print(elm+" ");
        }
        System.out.println();


        //2. Non Primitive Array
        String[] arr1 = {"We","are","Venom"};
        for (Object x : arr1) {  // how to access array // traverse array
            System.out.print(x+" ");
        }

        System.out.println();
        System.out.println("size of arr1 is "+ arr1.length); // length of array

        
    }
}
