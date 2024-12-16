import java.util.Scanner;
public class Assignment6 {
    public static void main(String[] args) {
        //เขียนโปรแกรมคำนวณ แปลงอุณหภูมิ
        Scanner thermo = new Scanner(System.in);
        System.out.print("อุณหภูมิ (Celcius) = ");
        float cel = thermo.nextFloat();

        float fahren = (cel*9/5)+32;
        System.out.println("แปลงเป็น " + fahren + " (Fahrenheit)");
    }
}
