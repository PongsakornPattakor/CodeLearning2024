import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        /* 
            While (เงื่อนไข){ทำอะไร}
                กลุ่มคำสั่งที่ใช้วนรอบ (Loop) โปรแกรมจะทำงานเรื่อยๆจนกว่าเงื่อนไขจะกลายเป็นเท็จ
                While loop นี้จะเอาไปใช้กับงานที่ไม่รู้จำนวนรอบที่ชัดเจน
        */
        int count = 1 ;
        while(count<=50){
            System.out.println(count);
            count++; //เพิ่มค่าให้ count จาก 1 เป็น 2 แล้วกลับไปทำคำสั่งนี้ใหม่ จนกว่าจะถึง 10
            if(count>25)break;
        }
    }
}