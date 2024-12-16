import java.util.Scanner;
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        /* 
        Exception = การที่โปรแกรมทำงานแต่เกิดข้อผิดพลาด แล้วจัดการกับข้อผิดพลาดนั้นไม่ได้ จะทำให้เกิด Exception แล้วโปรแกรมจะหยุดทำงานทันที
            ประเภท Exceoption
            1. ArrayIndexOutOfBoundsException
            2. ArithmeticException
            3. InputMismatchException
            4. IOException
            5. FileNotFoundException
        */
        int a = 100;
        int b = 5;
        int result = a/b; //ถ้าหารด้วยจะเกิด Exception แบบ ArithmeticException
        System.out.println(result);

        int [] item = {10,20,30,40};
        System.out.println(item[3]); //ถ้าสั่งปริ้นค่า ที่เกินขอบเขต Array จะเกิด Exception แบบ ArrayIndexOutOfBoundsException

        System.out.print("ป้อนตัวเลข = ");
        int num = kb.nextInt(); // ถ้าป้อนข้อมูลประเภทอื่นที่ไม่ใช่ int จะเกิด Exception แบบ InputMismatchException
        System.out.println(num);
    }
}
