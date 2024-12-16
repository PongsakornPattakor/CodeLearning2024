public class StringMethod2 {
    public static void main(String[] args) {
        /* เจาะลึก String 2
        1. แทนที่ข้อความ (replace, replaceFirst)
        2. การหั่น String (split)
        3. หาข้อความย่อย (subString)
        4. แปลง String เป็น Character
        5. แปลง Character เป็น String
        6. การตัดช่องว่างใน String
        7. แปลงตัวพิมพ์เล็ก - พิมพ์ใหญ๋
        8. แปลงตัวเลขเป็น String(valueOf)
        */
        String message = "Heppy New Year 2024 | Happy Birthday 2024";
        //.replace("ต้นทาง","ปลายทาง") จะเปลี่ยนค่าทั้งหมด
        //.replaceFirst จะเปลี่ยนเฉพาะตัวแรก
        System.out.println("ปีนี้ = " +message); //ก่อนเปลี่ยนค่า 
        message = message.replaceFirst("2024", "2025"); 
        System.out.println("ปีหน้า = "+message); //หลังเปลี่ยนค่า

        String data = "มะม่วง:ทุเรียน:เงาะ";
        // .split(ตัวช่วยหั่น); เป็นการหั่นข้อมูลออก โดยใช้ตัวช่วยในการหั่น
        String [] fruits = data.split(":");
        System.out.println("หลังจากหั่น String แล้วจะได้ "+fruits[2]);

        String name = "Pongsakorn";
        // .substring(index เริ่มต้น , index สุดท้ายที่ต้องการ + 1);
        String phrase = name.substring(4, 10); //จะได้อักษร 4-9
        System.out.println("หาคำใน String ได้ = "+phrase);

        String city = "NakhonNayok";
        // .toCharArray();          แปลง String => Array character
        char [] alphabet = city.toCharArray();
        System.out.println(alphabet[2]);
        System.out.println(alphabet[3]);
        System.out.println(alphabet[4]);

        char [] lastBoss = {'F','a','t','a','l','i','s'};
        // .copyValueOf(ชื่อarray);   แปลง Array character => String
        String.copyValueOf(lastBoss);
        System.out.println(lastBoss);

        String game = "   Monster Hunter  ";
        // .trim(); ใช้ลบช่องว่างใน String แต่จะไม่ลบช่องว่างระหว่างข้อความ
        System.out.println(game);
        System.out.println("ความยาว String ก่อนตัดช่องว่างคือ " +game.length());
        game = game.trim(); //ลบช่องว่างใน String
        System.out.println(game);
        System.out.println("ความยาว String หลังตัดช่องว่างคือ " +game.length());

        int num = 100;
        // .valueOf(ตัวแแปร int) ใช้แปลง String => int
        String result = String.valueOf(num);
        System.out.println(result);
    }
}
