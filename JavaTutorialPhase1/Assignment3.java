import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        //เขียนโปรแกรมหาเลขคู่
        Scanner kb = new Scanner(System.in);
        System.out.print("ตัวเลขจำนวนเต็ม = ");
        int num1 = kb.nextInt();

        /*
            ใช้เครื่องหมาย % (modulus) สำหรับการเช็คว่าหาร 2 ลงตัวมั้ย
            % number % 2 ลงตัว = คู่
            % number % 2 ไม่ลงตัว = คี่
        */ 

        String result = "";
        if(num1%2==0){
            result = num1 + " =  เลขคู่";
        }
        else if (num1%2!=0){
            result = num1 + " =  เลขคี่";
        }
        System.out.println(result);
    }
}
