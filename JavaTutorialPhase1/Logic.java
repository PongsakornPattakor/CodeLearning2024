public class Logic {
    public static void main(String[] args) {
        /*
            && คือ และ (And)
            || คือ หรือ (Or)
            ! คือ ไม่ (Not)
         */
        int a = 20 , b = 30;
        boolean c = (a==b); //false
        boolean d = (a<b); //true
        System.out.println("a=b และ a<b จริงหรือไม่? : " + (c||d));

    }
}
