import java.util.Scanner;
public class FinallyDemo {
    public static void main(String[] args) {
        /*
        Finally = เมื่อเกิดข้อผิดพลาดหรือไม่เกิด ก็จะทำงานคำสั่งส่วนนี้ทุกครั้ง มักเป็นคำสั่งที่ทำงานส่วนสำคัญของโปรแกรม เช่น ปิดไฟล์ หรือ disconect server
        try{
            ลองทำคำสั่งนี้
        }
        catch(Exception e){
            ถ้าเกิดข้อผิดพลาดจะทำคำสั่งนี้
        }
        finally{
            คำสั่งอื่นๆที่ไม่เกี่ยวข้องแล้วอยากให้ทำงาน
        }
        */
                    
        try{
            Scanner kb = new Scanner(System.in);
            System.out.print("ป้อนตัวเลข = ");
            int num = kb.nextInt();
            System.out.println(num);
        }catch(Exception e){
            System.out.println("ป้อนได้เฉพาะตัวเลขเท่านั้น!!!");
        }finally{
            System.out.println("ทำงานอย่างอื่นไป...");
        }

        
    }
}
