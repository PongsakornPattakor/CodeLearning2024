import java.util.Scanner;
public class Assignment5 {
    public static void main(String[] args) {
        /* 
            เขียนโปรแกรมแลกธนบัตร
            ประกอบด้วย => 1000, 500, 100, 50, 20
        */ 
    System.out.print("เงินที่ต้องการแลก = ");
    Scanner exchange = new Scanner(System.in);
    int cash = exchange.nextInt();
    
    if(cash>=1000)
        System.out.println("แบงค์ 1000 จำนวน = " + cash/1000);
        cash%=1000; 
    
    if(cash>=500){
        System.out.println("แบงค์ 500 จำนวน = " + cash/500);
        cash%=500;
    }    
    if(cash>=100){
        System.out.println("แบงค์ 100 จำนวน = " + cash/100);
        cash%=100;
    }
    if(cash>=50){
        System.out.println("แบงค์ 50 จำนวน = " + cash/50);
        cash%=50;
    }
    if(cash>=20){
        System.out.println("แบงค์ 20 จำนวน = " + cash/20);
        cash%=20;
    }
    if(cash>=10){
        System.out.println("เหรียญ 10 จำนวน = " + cash/10);
        cash%=10;
    }
    
    }

}
