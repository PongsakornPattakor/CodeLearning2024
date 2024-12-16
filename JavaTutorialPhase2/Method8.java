public class Method8 {
    public static void main(String[] args) {
        /*
        method ที่ใช้สลับค่าสมาชิกใน array
        */
        int [] a = {10,20,30,50,100,200,80};

        System.out.print("ค่าก่อนสลับ = ");
        displayArr(a);
        swabEle(a, 4, 1);
        System.out.print("ค่าหลังสลับ = ");
        displayArr(a);
    }
    
    // method สำหรับการสลับค่าใน array
    static void swabEle(int [] a ,  int x , int y){ // x กับ y คือตัวแปร กำหนดแทนตัวเลข index
        // x = ตำแหน่งเริ่ม
        // y = ตำแหน่งปลายทาง
        int temp = a[x]; // เช่น a[0] = 10 ถูกเก็บใน temp
        // temp คือตัวแปรเก็บข้อมูลชั่วคราว
        a[x] = a[y]; // 
        a[y] = temp;
    }

    static void displayArr (int [] a){
        System.out.print("{");
        for(int i=0 ; i<a.length ; i++){
            System.out.print(a[i]);
            if(i<a.length-1){
                System.out.print(",");
            }
        }
        System.out.println("}");
    }
}
