public class Method4 {
    public static void main(String[] args) {
        /*  รูปแบบของ method
            4. method ที่มีการรับค่าเข้ามาและส่งค่าออกไป (เป็นการประยุกต์ method 2 + method 3)
                modifier type ชื่อเมธอด (parameter1, parameter2,...){
                    return ค่าที่จะส่งออกไป
                }
        */
        int resultMax = maxNum(120, 20);
        int resultMin = minNum(50, 20);
        int sumValue = sum(25, 30);
        System.out.println("ค่าที่มากที่สุดคือ "+resultMax);
        System.out.println("ค่าที่มากที่สุดคือ "+resultMin);
        System.out.println("ผลรวมคือ  "+sumValue);

    }

    static int maxNum (int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    static int minNum (int a, int b){
        if(a>b){
            return b;
        }
        else{
            return a;
        }
    }

    static int sum (int x, int y){
        return x+y;
    }
}
