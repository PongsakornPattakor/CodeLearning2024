public class SequenceOperator {
    public static void main(String[] args) {
        /*
            ลำดับที่               เครื่องหมาย                ลำดับการทำงาน
            1                       ()                      
            2                    ++ , --                    ซ้ายไปขวา
            3                   * , / , %                   ซ้ายไปขวา
            4                      + , -                    ซ้ายไปขวา
            5                 < , <= , > , >=               ซ้ายไปขวา
            6                     == , !=                   ซ้ายไปขวา
            7                       &&                      
            8                       ||                      
            9            = , += , -= , *= , /= ,           *ขวาไปซ้าย
            *                      %=
         */
    float x = 5+8*9;
    float y = (5+8)*9;
    System.out.println(x);
    System.out.println(y);

    float a = 5*2-40/5; //(5*2)-(40/5)
    System.out.println(a);
    }
}
