import java.util.Scanner;
public class MinMaxLoop {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int maxNum=0, minNum=Integer.MAX_VALUE;
        while(true){
            System.out.print("ป้อนตัวเลข = ");
            int number = kb.nextInt();
            if(number<0)break;
            if(number>maxNum){
                maxNum=number; //ถ้าเงื่อนไขจริงจะเก็บค่าที่ป้อนลงใน maxNum เช่น จาก 0 เก็บเป็น 5 เวลาป้อนใหม่ จะเช็คที่ maxNum = 5
            }
            if(number<minNum){
                minNum=number;
            }
        }
        System.out.println("ค่ามากสุดคือ" + maxNum);
        System.out.println("ค่าน้อยสุดคือ" + minNum);
    }
}
