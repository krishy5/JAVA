
public class Variables {

    // 4 Types of Variable
        /**
        * 1. Static Variable : Declared Inside class but outside method declared with static
        * 2. Local Variable : Declared inside method constructor or block can be only accessed within the block
        * 3. Instance Variable : Declared inside class but outside method
        * 4. final Variable : Declared with final Keyword its value cant be changed after declaring
        */
    static String ab = "Hellow"; // Static

    int n = 4; // instance

    final String fullName = "Krish Tiwari"; // Final (Cant be changed)

        void ab(){
            System.out.println(n);
            System.out.println(fullName);
    }

    public static void main(String[] args) {
    int m = 4; // Local
    
    System.out.println(ab);
    //System.out.println(n); // cant be accessed here
    System.out.println(m);
    //System.out.println(fullName); // cant be access here
    
    Variables va = new Variables();
    va.ab();
    }
}
