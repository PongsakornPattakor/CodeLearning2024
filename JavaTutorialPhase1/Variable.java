public class Variable {
    public static void main(String[] args) {
        System.out.print("Max value of Integer is "); //ค่าสูงสุดของ Data type ประเภท Integer
        System.out.println(Integer.MAX_VALUE); 
        System.out.print("Min value of Integer is "); //ค่าต่ำสุดของ Data type ประเภท Integer
        System.out.println(Integer.MIN_VALUE); 

        System.out.print("Max value of Float is "); //ค่าสูงสุดของ Data type ประเภท Float
        System.out.println(Float.MAX_VALUE); 
        System.out.print("Min value of Float is "); //ค่าสูงสุดของ Data type ประเภท Float
        System.out.println(Float.MIN_VALUE);

        int numInt = 200;
        double numDouble = numInt; //แปลง int เป็น double (แปลงขนาด bit จากเล็ก => ใหญ๋)
        System.out.println(numInt);
        System.out.println(numDouble);

        double numDouble2 = 32.95;
        int numInt2 = (int)numDouble2; //แปลง double เป็น int (แปลงขนาด bit จากใหญ๋ => เล็ก)
        System.out.println(numDouble2);
        System.out.println(numInt2);

        final double PIEVALUE = 3.14; //ตัวแปรค่าคงที่ ต้องมี final นำหน้า และชื่อตัวแปรต้องเป็นตัวใหญ่ทั้งหมด
        System.out.println(PIEVALUE);

    }
}
