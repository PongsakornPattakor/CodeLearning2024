public class Convert {
    public static void main(String[] args) {

        // แปลง String ให้กลายเป็น Integer
        String a = "100", b = "200";
        int c; int d;
        c=Integer.parseInt(a);
        d=Integer.parseInt(b);
        c=c/50;
        d=d/20;
        System.out.println(c);
        System.out.println(d);

        // แปลง Integer เป็น String
        int num1 = 30;
        String age = String.valueOf(num1);
        System.out.println("Abigail's age is "+age);
        System.out.println(age+num1);
        
    }
}
