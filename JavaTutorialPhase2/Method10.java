public class Method10 {
    public static void main(String[] args) {
        /*
        method ที่ใช้ค้นหาสมาชิกใน array
        */
        int [] numA = {10,20,30,50,100};
        String [] fruits = {"ขนุน","ลำไย","ลิ้นจี่"};
        displayArr(numA);
        System.out.println("ตำแหน่งตัวเลขที่ต้องการค้นหา = " + searchEle(numA, 50));
        System.out.println("ตำแหน่งตัวเลขที่ต้องการค้นหา = " + searchFruit(fruits, "ลิ้นจี่"));

    }

    static void displayArr (int [] a){
        System.out.print("สมาชิกประกอบด้วย = {");
        for(int i=0 ; i<a.length ; i++){
            System.out.print(a[i]);
            if(i<a.length-1){
                System.out.print(",");
            }
        }
        System.out.println("}");
    }

    static int searchEle (int [] arr, int number){
        for(int i=0; i<arr.length ;i++){
            if(arr[i]==number){
                return i;
            }
        }
        return -1;
    }
    
    static int searchFruit (String [] arr, String fruit){
        for(int i=0; i<arr.length ;i++){
            if(arr[i].equals(fruit)){// การเปรียบเทียบ String จะใช้ method ของ String นั่นคือ .equals(parameter)
                return i;
            }
        }
        return -1 ;
    }
}
