import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args) {
        /*
            การเขียนลดรูป if else
            ตัวแปร = (เงื่อนไข) ? คำสั่งเมื่อเงื่อนไขจริง : คำสั่งเมื่อเงื่อนไขเท็จ
        */
        System.out.print("ตัวเลข = ");
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        
        String result = "";
        result = num%2==0 ? num + " = เลขคู่"  : num + " = เลขคี่";
        System.out.println(result);
    }
}
