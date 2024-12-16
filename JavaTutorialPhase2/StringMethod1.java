public class StringMethod1 {
    public static void main(String[] args) {
        /* เจาะลึก String
        1. สร้าง Object ด้วย Class
        2. Concatenation
        3. หาความยาว String
        4. หาตำแหน่งตัวอักษร (charAt)
        5. เปรียบเทียบ String (equals & equalsIgnorecase)
        6. หาข้อความที่อยู่หน้าสุด (startsWith)
        7. หาข้อความที่อยู่ท้ายสุด (endsWith)
        8. หาตำแหน่งคำในข้อความ (IndexOf)
        */
         //นิยามค่า
        String name1 = "Pongsakorn ";
        String name2 = "PongsaKorn "; 
        String city = new String("Phuket");

        // Concatenation => การต่อ String
        String result = name1+city;
        System.out.println("Concat คือ = "+result.concat(".com"));

        int count = name1.length(); //เก็บใน int เผื่อนำไปใช้คำนวณต่อ
        // .length(); ใช้หาความยาว String
        System.out.println("ความยาวคือ = "+name1.length());//ความยาวของอักษร รวมทั้งพื้นที่ว่าง
        // .charAt จะใช้หาตำแหน่ง โดยตัว P จะเป็นช่องที 0
        System.out.println("ตำแหน่งที่ 3 คือ "+name1.charAt(3)); 

        //เปรียบเทียบ String ว่าเหมือนกันมั้ย
        boolean result2 = name1.equals(name2); //ถ้าคำเหมือนกัน แต่ขนาดตัวพิมพ์อักษรไม่เหมือนกัน จะถือว่า ไม่เหมือนกัน
        boolean result3 = name1.equalsIgnoreCase(name2) ;// คำสั่งที่ทำให้ไม่คิดขนาดตัวพิมพ์อักษร
        
        if (result2) {
            System.out.println("ถ้าใช้ .equals คือ เหมือนกัน");
        }else{
            System.out.println("ถ้าใช้ .equals คือ ไม่เหมือนกัน");
        }
        
        if (result3) {
            System.out.println("ถ้าใช้ .equalsIgnoreCase คือ เหมือนกัน");
        }else{
            System.out.println("ถ้าใช้ .equalsIgnorecase คือ ไม่เหมือนกัน");
        }

        String fullname = "นายพงศกร พัฒกอ";
        // .startsWith(คำที่ขึ้นต้น); เช็คว่าขึ้นต้นด้วยคำนั้นรึป่าว
        String code = "239871TH";

        boolean result4 = fullname.startsWith("นาย"); 
        System.out.println(result4);
        if(result4){
            System.out.println(fullname +" ชาย");
        }else{
            System.out.println(fullname +" หญิง");

        }

        // .entdsWith(คำที่ลงท้าย); เช็คว่าลงท้ายด้วยคำนั้นรึป่าว
        if(code.endsWith("TH")){
            System.out.println("พัสดุจากประเทศไทย");
        }else{
            System.out.println("พัสดุจากต่างประเทศ");
        }

        // .indexOf(คำที่จะค้นหาตำแหน่ง);
        int index = fullname.indexOf("พัฒ"); //ต้องเจอคำว่า กร ตำแหน่งที่ 9
        System.out.println(index);



    }
}
