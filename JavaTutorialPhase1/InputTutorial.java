import java.util.Scanner;
public class InputTutorial {
    public static void main(String[] args) {
    
    // รับค่าข้อมูล
    // ข้อมูลแบบไหน integer, float, long
    // ข้อความทำอะไร
    // ข้อความแบบตัวเลข => คำนวณได้ / คำนวณไม่ได้
    // ประกาศใช้งาน Class | new

    Scanner sc = new Scanner(System.in);
    System.out.print("Type name = ");
    String name = sc.nextLine(); //รับค่า String จากแป้นพิมพ์
    System.out.println("First love " + name);

    }
}