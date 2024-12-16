import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        // เขียนโปรแกรม bmi
        Scanner sc = new Scanner(System.in);
        
        System.out.print("น้ำหนักตัว (kg) = ");
        float weight = sc.nextFloat();
        
        System.out.print("ส่วนสูง (cm) = ");
        float height = sc.nextFloat();
        height /= 100;

        float bmi = weight/(height*height);
        System.out.println("ดัชนีมวลกาย (BMI) = " + bmi);

        /*  เกณฑ์ทำนาย
            น้อยกว่า 18 = ต่ำกว่าเกณฑ์
            18.5-22.9 = สมส่วน
            23.0-24.0 = น้ำหนักเกิน
            25.0-29.9 = โรคอ้วน
            มากกกวา่า 30 = โรคอ้วนระดับอันตราย
         */
        String trend = "";
        if(bmi<18){
            trend = "ต่ำกว่าเกณฑ์";
        }
        else if (bmi>=18.5&&bmi<=22.9){
            trend = "สมส่วน";
        }
        else if (bmi>=23.0&&bmi<=24.0){
            trend = "น้ำหนักเกิน";
        }
        else if (bmi>=25.0&&bmi<=29.9){
            trend = "โรคอ้วน";
        }
        else if (bmi>30.0){
            trend = "โรคอ้วนระดับอันตราย";
        }
        System.out.print(trend);
    }
}
