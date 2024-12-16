public class ArrayLength {
    public static void main(String[] args) {
        int [] number = {10,20,30,40,50,60};
        int size = number.length; //เก็บขนาด element ไว้ มีค่า = 6
        //System.out.println(size);

        boolean [] status = {true,false,true};
        int size2 = status.length;
        //System.out.println(size2);

        for(int i=0 ; i<size ; i++){ //เรียกหา element
            System.out.println("ตำแหน่งที่ " +  i + " มีค่าเท่ากับ " + number[i]);
        }
    }
}
