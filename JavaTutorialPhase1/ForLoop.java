import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        /* 
            For(ค่าเริ่มต้นของตัวแปร;เงื่อนไข;เปลี่ยนแปลงค่าตัวแปร){คำสั่งเมื่อเป็นจริง}
        */
        for(int count = 6 ; count <= 6 ; count-=2){ //ถ้าประกาศตัวแปรใน for จะใช้แค่ใน for (Local variable)
            System.out.println(count);
            // จะเอา count ไปเช็คเงื่อนไข ถ้าจริง => ทำคำสั่ง แล้วเพิ่มค่า แล้ววนกลับไปเช็คเงื่อนไข
            if(count==0)break; //break จะหยุดการทำงานของคำสั่งใน loop นี้
        }
    }
}
