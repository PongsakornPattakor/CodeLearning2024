package Company;
class Programmer extends Employee { //class ลูกสามารถเรียกใช้คุณสมบัติใน class แม่ได้

    public Programmer (String name, double salary){ //constructor
        super(name,salary); // super(parameter) จะเรียกใช้ constructor ของ class แม่ โดยต้องถูกเรียกก่อนคำสั่งอื่น
        System.out.println("I'm programmer");
        System.out.println("");
    }
    public void uniform(){
        System.out.println("ใส่ free style");
    }
}
