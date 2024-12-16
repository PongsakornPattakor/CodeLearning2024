public class MethodReturn {
    public static void main(String[] args) {
        connetServer(120);
    }

    public static void connetServer(int ping){
        System.out.println("แสดงค่า Ping = "+ping);
        if(ping>100){
            return; //พอเงื่อนไขเป็นจริง ก็จะ return กระโดดออกจาก method เลย โดยที่ไม่ทำคำสั่งขั้นถัดไป
        }
        System.out.println("เชื่อมต่อกับ Server");
    }

}   
