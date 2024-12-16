import java.util.Scanner;
public class ModLoop {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        while (true) {
            System.out.print("ป้อนตัวเลข = ");
            int num = kb.nextInt();
            if(num<0)break;

            if(num%2==0){
                System.out.println(num + " เป็นเลขคู่");
            }
            else{
                System.out.println(num + " เป็นเลขคี่");
            }
        }

    }
}
