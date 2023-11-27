public class Equipment {
    private static int equipLevel = 1;
    private double damage = 1;
    private String equip;
    public Equipment(String equip){
        this.equip = equip;
    }
    public void chooseEquip(){ //instant method เมื่อเลือกอาวุธแล้ว damage ของอาวุธจะแตกต่างกันไป
        if(equip.equalsIgnoreCase("sword")){
            damage*=(1+0.1*equipLevel);
        }else if(equip.equalsIgnoreCase("shield")){
            damage*=(1+0.05*equipLevel);
        }
        System.out.println("equip damage = " + damage);
    }
    public static void levelUp(){ //class method level ของอาวุธเพิ่มขึ้น
        equipLevel++;
    }

}
