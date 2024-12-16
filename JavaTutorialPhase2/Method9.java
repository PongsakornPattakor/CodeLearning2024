public class Method9 {
    public static void main(String[] args) {
        /*
        method ที่ใช้รับค่า Array และคืนค่า Array
        modifeier type [] ชื่อเมธอด (type [] arr){
            return[];
        }
        */
        int [] numA = {10,20,40,80,160};
        int [] numB = copyArr(numA);
        displayArr(numA);
        displayArr(numB);
    }

    static int []  copyArr (int [] a){
        int [] newArr =  new int[a.length];//จองพื้นที่ array ให้มีขนาดเท่ากับความยาว numA
        for(int i=0 ; i<a.length ; i++){ // loop กำหนดสมาชิกแต่ละตัว ใน array ใหม่
            newArr[i] = a[i];
        }
        return newArr;
    }

    static void displayArr (int [] a){
        System.out.print("{");
        for(int i=0 ; i<a.length ; i++){
            System.out.print(a[i]);
            if(i<a.length-1){
                System.out.print(",");
            }
        }
        System.out.println("}");
    }
}
