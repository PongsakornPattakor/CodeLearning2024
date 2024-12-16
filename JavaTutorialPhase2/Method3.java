import java.util.Scanner;
public class Method3 {
    public static void main(String[] args) {
        //โปรแกรมหลัก
        /*  รูปแบบของ method
            3. method ที่มีการส่งค่าออกมา
                modifier type ชื่อเมธอด (){
                    return ค่าที่จะส่งออกไป(type)
                }
        */
        // method คือ โปรแกรมย่อย ถ้าเรียกใช้งานแล้ว จะทำงานใครงานมัน
        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อนเงินเดือน = ");
        int salary = kb.nextInt();
        System.out.println("เงินเดือนของคุณคือ "+ salary);
        double bonus = getBonus(); //รับค่าที่ return มา โดย type จะต้องตรงกันกับใน method ซึ่งจะถูกนำไปใช้งานต่อใน main
        salary+=bonus;
        System.out.println("เงินเดือน+โบนัส คือ "+salary);
        String city = getMycity();
        System.out.println("จังหวัดที่อยู่ คือ " + city);
    }

    static String getIP(){ //ระบุชนิดข้อมูลที่จะส่งออกไปทำงานที่โปรแกรมหลัก
        return "127.0.0.1"; //ต้องมี keyword คือ return ในการส่งออกค่า
    }

    static Double getBonus(){
        return 5000.0;
    }

    static String getMycity(){
        return "Phuket";
    }

}
