public class PrePost {
    public static void main(String[] args) {
        /*
             Prefix
                ++a = เพิ่มค่าให้ a ก่อน 1 หน่วย แล้วค่อยเอาไปใช้
                --b = ลดค่าให้ b ก่อน 1 หน่วย แล้วค่อยเอาไปใช้
            Post fix
                a++ = นำค่าปัจจุบันใน a ไปใช้ก่อน แล้วค่อยเพิ่มค่า
                b-- = นำค่าปัจจุบันใน b ไปใช้ก่อน แล้วค่อยลดค่า
         */
        int a = 5;
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);

        int b = 10;
        System.out.println(b);
        System.out.println(--b);
        System.out.println(b);
        
    }
}
