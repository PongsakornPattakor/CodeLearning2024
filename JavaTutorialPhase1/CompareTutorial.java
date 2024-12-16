public class CompareTutorial {
    public static void main(String[] args) {
        // การเปรียบเทียบจะส่งคำตอบเป็น true/false
        /*
            Operator เปรียเทียบ ประกอบด้วย 
            == คือ เท่ากับ
            != คือ ไม่เท่ากับ
            >= คือ มากกว่าหรือเท่ากับ
            <= คือ น้อยกว่าหรือเท่ากับ
         */

        int a = 10, b = 20;
        System.out.println(("a = "+ a) + ("\tb = "+ b));;
        System.out.println("a เท่ากับ b หรือไม่ : " + (a==b));

        boolean d = (a!=b);
        System.out.println("a ไม่เท่ากับ b หรือไม่ : " + d);

    } 
}
