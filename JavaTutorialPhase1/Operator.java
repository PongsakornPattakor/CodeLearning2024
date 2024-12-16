import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("กำหนดค่าของ a = ");
        int a = sc.nextInt();
        
        System.out.print("กำหนดค่าของ b = ");
        int b = sc.nextInt();

        int d = a+b; 
        /*
         Operator = ตัวดำเนินการทางคณิต เช่น เครื่องหมายทางคณิต
         Operand = ตัวถูกดำเนินการ เช่น ตัวแปร
         */
        System.out.println("ผลบวกของ a+b คือ " + d);
    }
}
