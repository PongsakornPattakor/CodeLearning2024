public class GlobalAndLocal {
    public static void main(String[] args) {
        int a = 250, b = 300; //global variable
        System.out.println(a);
        System.out.println(b);
            
        { int d = 700;
            System.out.println(d); //local variable
         }
        
    }
}
