public class Method7 {
    public static void main(String[] args) {
        /*
        method ที่ใช้เปรียบเทียบสมาชิกใน array
        */
        int [] numA = {1,3,5,8,9};
        int [] numB = {1,3,5,7,9};
        System.out.println("ผลการเปรียบเทียบ Arr คือ " +compareArr(numA, numB));
    }

    static boolean compareArr (int [] a, int [] b){
        for(int i=0 ; i<a.length ; i++){
            if(a[i]!=b[i]){ //ถ้า a[0] เท่ากับ b[0] จะไม่ทำคำสั่งขั้นถัดไป แต่จะ loop ใหม่แล้วเพิ่มค่า i++
                return false; // ถ้า a[0] ไม่เท่ากับ b[0] แล้วเป็นจริงจึงจะทำคำสั่งนี้ (ง่ายๆคือ เช็คไปเรื่อยๆจนกว่าเงื่อนไขนี้จะจริง แล้วจึงทำ)
            }
        }
        return true; //ถ้าเช็ค i ทั้งหมดแล้ว เงื่อนไขไม่ตรงกับ if เลยก็จะเด้งข้ามมาทำคำสั่งนี้
    
    }
}
