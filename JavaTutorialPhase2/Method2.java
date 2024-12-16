public class Method2 {
    public static void main(String[] args) {
        /*  รูปแบบของ method
            2. method ที่มีการรับค่าเข้ามาทำงาน
                modifier void ชื่อเมธอด (parameter1, parameter2,...){
                    กลุ่มคำสั่งต่างๆ
                }
                void คือ ไม่มีการส่งค่าออกมา
                argument คือ ตัวแปรหรือค่าที่ต้องการส่งมาให้กับเมธอด (ตัวแปรส่ง)
                parameter คือ ตัวแปรที่เมธอดสร้างไว้สำหรับรับค่าที่จะส่งเข้ามาให้กับเมธอด (ตัวแปรรับ)
                *การเรียกใช้*
                ชื่อเมธอด (parameter1,parameter2);
        */
        display("Pongsakorn"); //"Pongsakorn" คือ argument
        display("Hello World");
        fullName("พงศกร", "พัฒกอ");
        fullName("Nawaphat", "Theppui"); //ถ้าส่ง argument ไปค่าเดียว จะทำงานไม่ได้ เนื่องจากกำหนด parameter ไว้ 2 ค่า
        plus(-50, 100);
    }

    static void display(String message){ //message คือ parameter 
        System.out.println(message);
    }

    static void fullName(String firstname, String lastname){
        System.out.println("ชื่อจริงคือ " + firstname + " นามสกุล " + lastname);
    }

    static void plus(int a, int b){
        int c = a+b;
        System.out.println("อายุรวมคือ "+ (c));

    }
}
