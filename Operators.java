

public class Operators {
    public static void main(String[] args) {
       
        // There are 7 Types of Operators

        // 1. Arithmetic Operators
        int a = 1;
        int b = 2;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a%b);
        System.out.println(a/b);
        
        //2. Relational Operators

        System.out.println(a<b); // 1 < 2 => true
        System.out.println(a>b); // 1 > 2 => false
        System.out.println(a==b);// 1 == 2 => false
        System.out.println(a!=b);// 1 != 2 => true
        System.out.println(a<=b);// 1 <= 2 => true
        System.out.println(a>=b);// 1 >= 2 => false

        //3. Logical Operators
        System.out.println(a>b && a<b); // false
        System.out.println(a>b || a<b); // true
        
        //4. Assignment Operators

        int x = 0;

        for (int i = 0; i < 10; i++) //+,++,-- (5. Urinary Opertors)
        {
            x += i; // +=, -=, *=, /=, %=
        }
        System.out.println(x);

        //Ternary Operators

        System.out.println(a>b ? "true" : "false"); //(condition ? value if true : value if false)
    
        
    }
    
}
