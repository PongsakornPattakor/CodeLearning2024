package Marvel;
public class Ironman extends Superhero implements SkillHero{ //รับคุณสมบัติจาก คลาสแม่ 2 คลาส
    
    private String power;
    
    public void power(String power){
        this.power = power;
    }
    public void moving(String moving){
        System.out.println("เคลื่อนที่ได้ = "+moving);
    }
    public void weapon(String weapon){
        System.out.println("อาวุธไอรอนแมนคือ = "+weapon);
    }
    public void jumping(String jump){
        System.out.println("กระโดดสูง = "+jump);
    }

}
