public class Loops {
    public static void main(String[] args) {

        //1 . for
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+" ");
        }

        System.out.println();

        //2 . While
        int i = 10;
        int j = 1;
        while(j <= i){
            System.out.print(j +" ");
            j++;
        }
        System.out.println();

        //3 . While
        do{
            System.out.print(j +" ");
            j++;
        } while(j <= i);

        //4 . for
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) // (int i : numbers) it will go from index 0 to final
        //  (int num = 0; num < numbers.length; num++)
        // 
            {
            System.out.println("num = " + num);
            }

            for(int num = 0; num < numbers.length; num++){
                System.out.print(numbers[num]+" ");
            }
    }
}
