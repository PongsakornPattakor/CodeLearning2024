public class Compound {
    public static void main(String[] args) {
        /*
            += คือการเขียนแบบย่อ จาก x=x+y เป็น x+=y
            -= คือการเขียนแบบย่อ จาก x=x-y เป็น x-=y
            *= คือการเขียนแบบย่อ จาก x=x*y เป็น x*=y
            /= คือการเขียนแบบย่อ จาก x=x*y เป็น x/=y
         */
    int x = 10 , y = 15;
    x+=y; // x=x+y คือ x = 10+15
    System.out.println(x+=y); // x=x+y คือ x =  25(x ตัวแปรใหม่) + 15
    System.out.println(x); // x = 40 (ตัวแปรล่าสุด)
    }
}
