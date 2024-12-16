package Marvel;
public abstract class Superhero { // คลาสแม่แท้ๆ
    
    private String name;
    private String age;
    private String job;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(String age){
        this.age = age;
    }

    public void setJob(String job){
        this.job = job;
    }

    public abstract void power(String power); //ส่งต่อไปให้คลาสลูก ไว้ให้ระบุรายละเอียดทีหลัง

    public void display(){
        System.out.println("Name = "+this.name);
        System.out.println("Age = "+this.age);
        System.out.println("Job = "+this.job);
    }
}
