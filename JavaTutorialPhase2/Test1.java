import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        while(true){
            System.out.print("ป้อนเลข = ");
            int count = kb.nextInt();

            for(int i=1 ; i<=count ; i++){ // count=5
                
                for (int j=1 ; j<=count+i ; j++){
                    System.out.print(" ");
                }
                
                for (int k=i ; k<=count ; k++){
                    System.out.print(count + " ");
                }    
                System.out.println("");
            }
        }
        }
    }

