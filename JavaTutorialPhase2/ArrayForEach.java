public class ArrayForEach {
    public static void main(String[] args) {
        /*  ForEach
            String[]pets = {"แมว","กระต่าย"}
        
            for(String name : pets){
            System.out.println(name);
            }
        */

        String [] mammals = {"วาฬ","หมา","แมว"};
        int size = mammals.length;
        
        for(String data : mammals){ //ทำการดึงข้อมูลมาทีละตัวจนถึงสมาชิกตัวสุดท้าย
            System.out.println(data);
        }
        
        int sum=0;
        int i=0;
        int [] height = {150,153,156,160,165,170};
        for(int data2 : height){
                if(i<height.length){
                    System.out.println("ส่วนสูงนักเรียนคนที่ "+ i +" = "+data2);
                    i++;
                }
                sum += data2;
        }
        System.out.println("ผลรวมส่วนสูงนักเรียนแต่ละคน = " + sum + "cm");
        int avg =sum/height.length;
        System.out.println("ค่าเฉลี่ยส่วนสูงของนักเรียน = " + avg + " cm");
    }
}
