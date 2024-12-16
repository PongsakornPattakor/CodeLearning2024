package Marvel;
interface SkillHero { //คลาสแม่บุญธรรม แบบ interface คือบังคับส่งต่อ method ให้คลาสลูก
    
    //ถ้าเป็น interface จะมอง method ทั้งหมดเป็น abstract method ทั้งหมดเลย เลยไม่ต้องระบุ abstract นำหน้าก็ได้
    public void moving(String moving);
    public void weapon(String weapon);
    public void jumping(String jumpString);
}