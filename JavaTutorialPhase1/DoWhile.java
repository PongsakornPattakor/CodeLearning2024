public class DoWhile {
    public static void main(String[] args) {
        /*
            do{คำสั่งเมื่อเงื่อนไขเป็นจริง}while(เงื่อนไข);
            โปรแกรมจะทำตามคำสั่งอย่างน้อย 1 รอบ เมื่อทำงานเสร็จจะมาตรวจสอบเงื่อนไขที่ while ถ้าเงื่อนไขเป็นจริงจะวนกลับไปทำงานอีกครั้ง
        */
        int count = 0;
        do{
            System.out.println(count); //count = 0
            count++; //count = 1
        }while(count < 5); // เงื่อนไขเป็นจริง เลยวนกลับไปทำ do ใหม่
    
    }
}
