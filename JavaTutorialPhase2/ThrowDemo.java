import java.util.Scanner;
public class ThrowDemo {
    public static void main(String[] args) {
        /* 
        Throw = การโยนผิดปกติออกจากโปรแกรม
            throw new ArithmeticException("ข้อความ");
        */

        /* โปรแกรมถอนเงิน
            1. บัญชีเงินฝาก

        */
        try {
            Scanner kb = new Scanner(System.in);
            System.out.print("ป้อนจำนวนเงินที่ต้องการถอน = ");
            int withdraw = kb.nextInt();
            int balance = 15000;
            balance-=withdraw;
            
            if(withdraw<=0){
                throw new Exception("ป้อนจำนวนเงินมากกว่า 0"); // ลำดับ 1
            }

            if(withdraw>balance){
                throw new Exception("จำนวนเงินในบัญชีไม่เพียงพอ"); // ลำดับ 2
            }
            System.out.println("ยอดคงเหลือในบัญชี =  " + balance);
        } 
        //การโยนข้อผิดพลาด จะโยนตามลำดับการทำงานใน try
        catch (Exception e) { 
            e.printStackTrace(); //แสดงผล เวลาเกิดข้อผิดพลาด
        }
    }
    
}
