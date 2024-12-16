import java.util.Scanner;
public class NestedLoop {
    public static void main(String[] args) {
        System.out.println("ประเภท Loop ที่ต้องป้อน \n1.for \n2.while");
        System.out.print("ประเภท Loop = ");
        Scanner kb = new Scanner(System.in);
        String type = kb.nextLine();

        switch(type){
            case "for" :
            System.out.println("ตัวอย่าง For ซ้อน For");
            for(int i=1 ; i<=3 ; i++){
                System.out.println("วงนอก for " + i);
                for(int j=1 ; j<=2 ; j++){
                    System.out.println("วงใน for " + j);
                }
            }
            break;

            case "while" :
            System.out.println("ตัวอย่าง While ซ้อน While");
            int a=1 , b=1;
            while (a<=4) {
                System.out.println("วงนอก while " + a);
                while (b<=5) {
                    System.out.println("วงใน while " + b);
                    b++; /*  b = 6 ไปแล้วจากการเพิ่มค่าใน loop วงนอกแรก ทำให้ Loop วงนอก 2 นี้ไม่ทำงาน
                    ถ้าอยากให้ b reset ค่า ต้องประกาศ b ก่อน loop วงใน*/
                }
                a++;
            }
            break;
        }
    }
}
