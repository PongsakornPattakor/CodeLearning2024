public class Method6 {
    public static void main(String[] args) {
        /*
        method ที่รับค่า Array และ คืนค่า
        modifier type ชื่อเมธอด (type [] arr){
            //คำสั่งต่างๆ
            }
        */
        int [] numA = {10,20,30,40,50};
        int [] numB = {-30,-10,40,-55};
        int [] numC = {100,15,-37,80};

        System.out.println("ค่าสูงสุดของ A คือ " + findMaxNum(numA));
        System.out.println("ค่าต่ำสุดของ A คือ " + findMinNum(numA));
        System.out.println("ตำแหน่งที่มากที่สุดของ A คือ " + findMaxIndex(numA));
        System.out.println("ตำแหน่งที่น้อยที่สุดของ B คือ " + findMinIndex(numB));

    }
    
    static int findMaxNum (int [] arr){
        //ค้นหาค่าที่มากที่สุดโดยการเปรียเทียบสมาชิกแต่ละตัว
        int maxValue = arr[0]; //เก็บค่าเริ่มต้นเอาไว้เป็นค่าสูงสุด
        for(int i=0; i<arr.length ; i++){
            if(arr[i]>maxValue){ //ถ้าสมาชิกที่ i มากกว่าค่า maxValue
                maxValue = arr[i];// กำหนดให้สมาชิกที่ i กลายเป็นค่า maxValue เลย
            }
        }
        return maxValue;
    }
    static int findMinNum (int [] arr){
        //ค้นหาค่าที่น้อยที่สุดโดยการเปรียเทียบสมาชิกแต่ละตัว
        int minValue = arr[0]; //เก็บค่าเริ่มต้นเอาไว้เป็นค่าน้อยสุด
        for(int i=0; i<arr.length ; i++){
            if(arr[i]<minValue){ //ถ้าสมาชิกที่ i มากกว่าค่า minValue
                minValue = arr[i];// กำหนดให้สมาชิกที่ i กลายเป็นค่า minValue เลย
            }
        }
        return minValue;
    }

    static int findMaxIndex (int [] arr){
        int maxIndex = 0; //เก็บตำแหน่งสมาชิกที่มีค่าตัวเลขมากที่สุด
        for(int i=0; i<arr.length ; i++){
            if(arr[i]>arr[maxIndex]){
                arr[maxIndex] = i;
            }
        }
        return arr[maxIndex];
    }
    
    static int findMinIndex (int [] arr){
        int index = 0;
        int minIndex = 0 ; //เก็บตำแหน่งสมาชิกที่มีค่าตัวเลขน้อยที่สุด
        for(int i=0; i<arr.length ; i++){
            if(arr[i]<arr[minIndex]){
                index = i;
            }
        }
        return index;
    }

}
