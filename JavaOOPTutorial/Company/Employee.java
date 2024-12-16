package Company;
public abstract  class Employee{
    // ออกแบบ
    // Attribute
    // set เป็นการกำหนดข้อมูล
    // get เป็นการดึงข้อมูลออกไป
    private String id;
    private String name;
    private double salary;

    // Static Attribute 
    public static int minSalary = 12000; //ถ้ามี static นำหน้า คือเปิดให้เข้าถึงข้อมูลโดยไม่ต้องสร้าง attribute

    // Method
    public void setID(String id){ //กำหนด ID
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void displayEmployee(){
        System.out.println("ID = " + this.id);
        System.out.println("ชื่อ = " + this.name);
        System.out.println("เงินเดือน = " + this.salary);
        
    }
    public String getName (){ //ดึงข้อมูลบางส่วน โดยไม่ได้ดึงทั้งหมดเหมือน .displayEmployee()
        return this.name;
    }
    public double getSalary (){
        return this.salary;
    }

    // Default Constructor ทำงานอัตโนมัติตอนที่มีการประกาศตัวแปรใหม่
    public Employee(){ // เช่น กรณีไม่รู้ข้อมูลอะไรเลย จะทำตาม Constructor นี้
        System.out.println("I am employee in this company");
    }

    // Constructor
    public Employee(String name){ // เช่น กรณีรู้ข้อมูลแค่ ชื่อ จะทำตาม Constructor นี้
        this.name = name;
    }
    // Constructor
    public Employee(String name, double salary){ // เช่น กรณีรู้ id ชื่อ เงินเดือน จะทำตาม Constructor นี้
        this.name = name;
        this.salary = salary;
        displayEmployee();
    }

    public void bonus(){
        System.out.println("Bonus = 10%");
    }

    // overriding แบบบังคับว่า คลาส ลูก จะต้องถูกสร้าง method นี้ด้วย
    public abstract void uniform();// class ลูกจะต้องสร้าง abstract method ตาม class แม่ โดยอาจไม่ต้องระบุรายละเอียดใน class ของแม่ก่อน
     
}