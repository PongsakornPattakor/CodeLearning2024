import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args) {
        //แปลง พ.ศ. เป็น ค.ศ.
        Scanner kb = new Scanner(System.in);
        System.out.print("ปี (พ.ศ.) = ");
        int year = kb.nextInt();
        year-=543;
        System.out.println("ปี ค.ศ. = "+ year);
    }
}
