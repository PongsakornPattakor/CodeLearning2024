public class Method5 {
    public static void main(String[] args) {
        /*
        method ที่รับค่า Array
        modifier void ชื่อเมธอด (type [] arr){
            //คำสั่งต่างๆ
            }
        */
        int [] numA = {10,20,30,40,50};
        int [] numB = {-50,-20,30,100};

        displayNum(numA); //แสดงผลตาม method ที่ 1
        display2Num(numB); //แสดงผลตาม method ที่ 2

    }
          
    static void displayNum (int [] arr){//แสดงผลสมาชิกใน array ที่ส่งเข้ามา
        for(int i=0 ; i<arr.length ; i++){
            System.out.println("ลำดับที่ = "+ i +" คือ " + arr[i]);
        }
        System.out.println("*****จบการทำงาน*****");//สิ้นสุดกระบวนการ loop ข้อมูลสมาชิก
    }
    
    static void display2Num (int [] arr){//แสดงผลสมาชิกใน array ที่ส่งเข้ามา
        System.out.print("{");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){//ถ้า i น้อยกว่า (จำนวนสมาชิก-1) จะแสดงผล
                System.out.print(",");
            }
        }
        System.out.println("}");
        System.out.println("*****จบการทำงาน*****");//สิ้นสุดกระบวนการ loop ข้อมูลสมาชิก
    }


}
