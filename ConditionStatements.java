
import java.util.*;

class ConditionStatements{
    public static void main(String[] args) {
        
        int a = 1;
        int b = 2;

        // 1. if
        if(a>b){
            System.out.println(true);
        }

        //2. if-else
        if(a<b){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        // 3. nested if else
        
            if(a<b){
                System.out.println("a<b");
            }else{
            if(a>b){
                System.out.println("a>b");
            }else{
                if(a==b){
                    System.out.println("a==b");
                }
            }
            }

            // 4. Switch case

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number from 1,2,3:");
            int x = sc.nextInt();
            System.out.println("you entered :");
            switch (x) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;    
                
                default:
                    throw new AssertionError("You Entered Wrong number");
            }
    }
}