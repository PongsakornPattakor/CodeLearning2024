import java.util.Scanner;
public class Multiply {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อนแม่สูตรคูณเริ่มต้น = ");
        int start = kb.nextInt();
        System.out.print("ป้อนแม่สูตรคูณสุดท้าย = ");
        int stop = kb.nextInt();

        for(int a=start ; a<=stop ; a++){
            System.out.println("แม่ที่ " + a);
            for(int b=1 ; b<=12 ; b++){
                System.out.println(a + " x " + b + " = " +(a*b));
            }
        }
        
    }
}    
