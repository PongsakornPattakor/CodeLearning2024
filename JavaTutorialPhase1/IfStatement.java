import java.util.Scanner;
public class IfStatement {
    public static void main(String[] args) {
        /*
        if(เงื่อนไข){แสดงผลเมื่อเงื่อนไขเป็นจริง}

        if(เงื่อนไข){แสดงผลเมื่อเงื่อนไขเป็นจริง}else(เงื่อนไข){แสดงผลเมื่อเงื่อนไขเป็นเท็จ}
         
         */
        Scanner kb = new Scanner(System.in);
        System.out.print("อายุ (ปี) = ");
        int age = kb.nextInt();
        
        if(age<18){
            // ถ้าเงื่อนไขเป็นจริง จะให้ทำอะไรต่อ
            System.out.println("คุณยังเด็กเกินไป");
        }
        else if(age>=18&&age<=30){
            System.out.println("คุณควรออกกำลังกาย");
        }
        else if(age>30&&age<=45){
            System.out.println("คุณควรออกกำลังกาย"); 
        }
        else if(age>45){
            System.out.println("คุณควรเลิกดื่มเหล้า");
        }
        

    }
}
