class Method1 {
    public static void main(String[] args) { //method main เป็น static method
        /* 
            Method => ชุดคำสั่งที่นำมาเขียนรวมกันเป็นกลุ่ม เพื่อให้เรียกใช้งานตามวัตถุประสงค์ และลดความซ้ำซ้อนของคำสั่งที่ใช้งานบ่อยๆ รวมถึงใช้ความรู้ OOP มาประยุกต์ใช้

            type name(parameter1,parameter2,...){ //parameter = ค่าที่ส่งเข้าไปทำงานใน method
                statements // statements = กลุ่มคำสั่งที่ทำงานใน method
            }
            
            ให้มองว่า method คือ กลุ่มคำสั่ง เช่น ในโปรแกรมเล่นวีดีโอ จะประกอบด้วย method เพิ่มเสียง , method หยุดเล่น , method เลือกไฟล์ เป็นต้น
        */
            
        /*  รูปแบบของ method
            1. method ที่ไม่มีการรับและส่งค่า
                modifier void ชื่อเมธอด(){
                    คำสั่งต่างๆ
                }
                void คือ ไม่มีการส่งค่าออกมา
                *การเรียกใช้*
                ชื่อเมธอด ();
        */
        display();//ถ้าเรียกใช้งานใน method main ก็จะทำการรันหา method display
        display();
        plus();//เป็นการเรียกใช้ method plus
        plus();
        openVDO();
        playVDO();
        pauseVDO();
        volUpVDO();
        closeVDO();
    }
    
    static void display(){ //method ที่เพิ่งสร้างมาใหม่ ถ้าอยากให้ method นี้ถูกเรียกใน main ก็ต้องระบุ static ด้วย
        //กลุ่มคำสั่งที่อยากให้ทำงาน
        System.out.println("Hello World");
    }

    static void plus(){//method plus
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);
    }

    static void openVDO(){//method เปิด vdo
        System.out.println("เปิดไฟล์ VDO");
    }
    
    static void playVDO(){//method เล่น vdo
        System.out.println("เล่น VDO");
    }
    
    static void pauseVDO(){//method พัก vdo
        System.out.println("พักการเล่น VDO");
    }
    
    static void volUpVDO(){//method เพิ่มระดับเสียง
        System.out.println("เพิ่มเสียง");
    }

    static void closeVDO(){//method ปิดโปรแกรมเล่น vdo
        System.out.println("Clear memmory");
        System.out.println("ปิดโปรแกรม");
    }

}
