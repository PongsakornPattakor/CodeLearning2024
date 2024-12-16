public class BreakContinue {
    public static void main(String[] args) {
        for(int i=1 ; i<= 10; i++){
            if(i%2==0)continue; 
            /* 
                continue จะกระโดดข้ามที่ i หาร 2 ลงตัว
                break จะยกเลิก loop ทันที แล้วข้ามไปจบโปรแกรม
            */
            System.out.println(i);
        }
        System.out.println("จบ Loop");
    }
}
