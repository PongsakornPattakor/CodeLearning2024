package Marvel;
public class Thor extends Superhero implements SkillHero {
    
    private String power;
    
    public void power(String power){
        this.power = power;
    }
    public void moving(String moving){
        System.out.println("เคลื่อนที่ได้ = "+moving);
    }
    public void weapon(String weapon){
        System.out.println("อาวุธธอร์คือ = "+weapon);
    }
    public void jumping(String jump){
        System.out.println("กระโดดสูง = "+jump);
    }
}
