public class VariableArg {
    public static void main(String[] args) {
        /*
        modifier type ชื่อเมธอด (type...arr){
            คำสั่งต่างๆ
        }
        */
        summation(50,30,50,80);//สามารถเพิ่ม argument ได้เรื่อยๆ
    }

    public static void summation (int a , int b){ // method นี้ก็จะบวกค่าจาก parameter ได้แค่ 2 ค่า
        int sum = a+b;
        System.out.println("ผลรวมตัวเลข มีค่าเท่ากับ "+sum);
    }
    
    public static void summation (int a , int b, int c){ // method นี้ก็จะบวกค่าจาก parameter ได้แค่ 3 ค่า
        int sum = a+b+c;
        System.out.println("ผลรวมตัวเลข มีค่าเท่ากับ "+sum);
    }

    //ถ้าเป็น method เหมือนกัน แต่เพิ่ม parameter จะใช้ชื่อเมธอดเดียวกันได้
    public static void summation (int...number){// method ที่นำ parameter แต่ละตัวมารวมกัน
        int sum = 0;
        for(int i=0 ; i<number.length ;  i++){
            sum += number[i];
        }
        System.out.println(sum);
    }

    
}
