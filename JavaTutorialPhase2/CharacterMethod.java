public class CharacterMethod {
    public static void main(String[] args) {
        /*เจาะลึก Character
            1. สร้าง Object Character ด้วย Class
            2. เช็ครูปแบบตัวอักษรด้วย isLetter, isDigit
            3. isUpperCase , isLowerCase
            4. toUpperCase , toLowerCase
        */

        Character alphabet = new Character('1');//สร้าง Object Character ด้วย Class (ทำไมสร้างไม่ได้??)
        char c = 'c';
        char d = '1';
        char e = 'A';
        char f = 'b';
        
        char [] groupAlphabet = {'A','B','C','D'};

        System.out.println(groupAlphabet[2]);
        System.out.println(Character.isLetter(c)); //Character.isLetter => เช็คว่า ตัวแปร นั้นเป็นตัวอักษรมั้ย จะแสดงผลเป็น true/false
        System.out.println(Character.isDigit(d)); //Character.isDigit=> เช็คว่า ตัวแปร นั้นเป็นตัวเลขมั้ย จะแสดงผลเป็น true/false
        
        if(Character.isUpperCase(e)){//Character.isUpperCase => เช็คว่า ตัวแปร นั้นเป็นอักษรพิมพ์ใหญ่มั้ย จะแสดงผลเป็น true/false
            System.out.println(e+ " เป็นพิมพ์ใหญ่ ก่อนแปลงค่า"); //ถ้า true จะทำคำสั่งนี้
        }
        
        if(Character.isLowerCase(f)){//Character.isLowerCase => เช็คว่า ตัวแปร นั้นเป็นอักษรพิมพ์เล็กมั้ย จะแสดงผลเป็น true/false
            System.out.println(f+ " เป็นพิมพ์เล็ก ก่อนแปลงค่า"); //ถ้า true จะทำคำสั่งนี้
        }

        System.out.println(f +" หลังจากแปลงค่าแล้ว กลายเป็น " + Character.toUpperCase(f)); //Character.toUpperCase = method แปลงค่าอักษร เล็ก => ใหญ่
        System.out.println(e +" หลังจากแปลงค่าแล้ว กลายเป็น " + Character.toLowerCase(e)); //Character.toUpperCase = method แปลงค่าอักษร เล็ก => ใหญ่
    }
}
