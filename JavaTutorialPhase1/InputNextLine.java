import java.util.Scanner;
public class InputNextLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ชื่อของคุณ = ");
        String name = sc.nextLine(); //รับค่า String ทั้งบรรทัด แม้จะเว้นวรรค
        System.out.println("ชื่อไทย " + name);

        System.out.print("Name = ");
        String name2 = sc.next(); //รับค่า String ก่อนเว้นวรรค
        System.out.println("English name " + name2);
    }
}
