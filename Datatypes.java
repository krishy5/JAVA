public class Datatypes{
    public static void main(String[] args) {
        

        //TYPES OF COMMENTS IN JAVA
        
        // 1. Single-Line Comments 
        /* 2. Multi-Line comments */
        /** 
         * 3. Documentation Comments 
         * adds points
         */

        // Data Types in java

        // 1. Primitive Data Types - Total 8 Primitive types

        byte a = 100 ; // 1 byte
        int b = 30000; // 4 byte
        char c = 'A';  // 2 byte 
        float d = 4.23242f; // 4 byte
        long e = 32019578230957327L ; // 8 byte
        double f = 32.2379586239532 ; // 8 byte
        boolean g = true ; // 1 bit
        short h = 30000 ; // 2 byte

        System.out.println(
            "byte : "+ a +"\n"+
            "int : "+ b +"\n"+
            "char : "+ c +"\n"+
            "float : "+ d +"\n"+
            "long : "+ e +"\n"+
            "double : "+ f +"\n"+
            "boolean : "+ g +"\n"+
            "short : "+ h +"\n"
        );

        // Non Primitive Data Types : Can be many
        
        //1. String
        String name = "Krish Tiwari";
        System.out.println(name);

        //2. Array
        int[] arr = {1,2,3,4,5};
        for (int x =0; x < arr.length; x++){
            System.out.print(arr[x]+" ");
        }
        //3. Wrapper Class
        Integer WrapperInt = Integer.valueOf(30);
        System.out.println(WrapperInt);

        //4. Class Object
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb);

        //var keyword
        var x= 3;
        System.out.println(x);
        // var value cant be changed
        
    }
}
