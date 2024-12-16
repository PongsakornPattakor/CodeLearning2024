public class StringTutorial {
    public static void main(String[] args) {
        String sentence = "First is becoming a developer";
        System.out.println(sentence);
        System.out.println("มีจำนวนตัวอักษรทั้งหมด = " + sentence.length()); // .length() จะเป็นการบอกจำนวนอักษร
        System.out.println("ตำแหน่งของ developer อยู่ในตำแหน่งที่ = " + sentence.indexOf("developer")); // .indexOf() จำบอกตำแหน่งของค่าในวงเล็บ
    }
}
