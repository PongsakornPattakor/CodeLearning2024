import java.util.Scanner;
public class NextstepIf {
    public static void main(String[] args) {
        System.out.print("อายุ = ");
        Scanner kb = new Scanner(System.in);
        int age = kb.nextInt();

        // if ข้างใน จะทำงานเมื่อ if นอกเป็นจริง

        if(age<=15&&age>12){
            if(age==13){
                System.out.println("ม.1");
            }
            if(age==14){ 
                System.out.println("ม.2");
            }
            if(age==15){
                System.out.println("ม.3");
            }
        }
        else if(age>15&&age<=18){
            if(age==16){
                System.out.println("ม.4");
            }
            if(age==17){
                System.out.println("ม.5");
            }
            if(age==18){
                System.out.println("ม.6");
            }
            
        }
    }
}
