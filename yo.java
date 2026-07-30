// obj array

class Students{ // this is object
    public int rollno;
    public String Name;

    public Students(int rollno, String Name) {
        this.rollno = rollno;
        this.Name = Name;
    }
}
public class yo{ // only onw public class should be there
    public static void main(String[] args) { // it should always be inside public class
        
        //make a array
        Students[] arr;

        // //Define size of array
        arr = new Students[5];
        // Students[] arr = new Students[5]; // can be also declared in one line

        // inserting data in array
        arr[0] = new Students(1, "Krish");
        arr[1] = new Students(2, "Iruma");
        arr[2] = new Students(3, "Rimuru");
        arr[3] = new Students(4, "Askelad");
        arr[4] = new Students(5, "Thorfin");

        //Printing the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(
                arr[i].rollno + " " + arr[i].Name
            );
        }
    }
}