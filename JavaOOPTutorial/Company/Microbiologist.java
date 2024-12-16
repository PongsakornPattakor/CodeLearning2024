package Company;
public class Microbiologist extends Employee{
    public Microbiologist(String name, double salary){
        super(name, salary);
        System.out.println("I'm Microbiologist");
    }
    // Overloading method
    public void skills(){ //ชื่อ method เหมือนกัน ต่างที่ parameter
        System.out.println("ไม่มี technique ");
    }
    public void skills(String technique){ //ชื่อ method เหมือนกัน ต่างที่ parameter
        System.out.println("สามารถเขียนภาษา "+technique);
    }
    public void skills(String...technique){ //ชื่อ method เหมือนกัน ต่างที่ parameter
        for(int i=0 ; i<technique.length ; i++){
            System.out.println("Skills = " + technique[i]);
        }
    }
    // Overriding method
    public void bonus(){
        System.out.println("Bonus = 20%"); //bonus class แม่ = 10% แต่ bonus class ลูก = 20% 
    }
    
    public void uniform(){
        System.out.println("ใส่ lab coat");
    }
}
