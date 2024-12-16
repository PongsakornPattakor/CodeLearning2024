import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        //เขียนโปรแกรมเปรียเทียบตัวเลข
        Scanner kb = new Scanner(System.in);
        System.out.print("ตัวเลขที่ 1 = ");
        float num1 = kb.nextFloat();
        System.out.print("ตัวเลขที่ 2 = ");
        float num2 = kb.nextFloat();

        if(num1>num2){
            System.out.println(num1 + " มากกว่า " + num2);
        }
        else if(num1==num2){
            System.out.println(num1 + " เท่ากับ " + num2);
        }
        else if(num1<num2){
            System.out.println(num1 + " น้อยกว่า " + num2);
        }


    }
}
