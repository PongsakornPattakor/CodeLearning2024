import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        /* Switch case ใช้กับตรวจสอบ String
            switch(เงื่่อนไขที่ต้องการตรวจสอบ){
                case ค่าที่ 1 : คำสั่งที่ 1;
                        break;
                case ค่าที่ 2 : คำสั่งที่ 2;
                        break;
                        ....
                case ค่าที่ N : คำสั่งที่ N;
                        break;   

                        ***คำสั่ง break จะทำให้โปรแกรมกระโดดออกไปทำงานนอกคำสั่ง switch
                        ถ้าไม่มีคำสั่ง break โปรแกรมจะทำคำสั่งไปเรื่อยๆจนจบการทำงาน

                        default: คำสั่งเมื่อไม่มีค่าที่ตรงกับกับที่ระบุใน case
            }
        */
        Scanner kb = new Scanner(System.in);
        System.out.print("อาการของโรค = ");
        String sympt = kb.nextLine();
        String name ;
        
        switch (sympt) {
            case "ปวดหัว":
                name = "ไมเกรน";
                break;
            case "ท้องเสีย":
                name = "กระเพาะ";
                break;
            case "นอนไม่หลับ" :
                name = "เครียด";
                break;
            default: //กรณีไม่ตรงกับเคสไหนเลย
                name = "โรคหายาก";
                break;
        }
        System.out.println(name);
    }
}
