import java.util.Scanner;
public class SummationLoop {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int sum=0 , count=0 , avg=0; //ค่าเริ่มต้นที่จะเอาไปใช้ใน loop
        while(true){
            System.out.print("ป้อนตัวเลข = ");
            int number = kb.nextInt();
            if(number==0)break; //ป้อนค่า 0 เมื่อไหร่ จะกระโดดออกจาก loop
            count++;
            sum+=number;
            avg = sum/count;
        }
        System.out.println("ผลรวม = " + sum);
        System.out.println("จำนวนที่ป้อน = " + count);
        System.out.println("ค่าเฉลี่ย = " + avg);
    }
}
