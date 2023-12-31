public class Hero {
    private String career;
    private int HP;
    private int mana;
    private int level = 1;
    private double runSpeed;
    private double maxRunSpeed;
    public Equipment equipment;
    private void create(String career){ //instant method เอาไว้สร้าง charactor ค่าเริ่มต้นต่างๆ ขึ้นมามีให้เลือกเป็นอาชีพ 3 อาชีพ
        if(career.equalsIgnoreCase("tank")){
            HP = 30;
            mana = 30;
            runSpeed = 10;
        }else if(career.equalsIgnoreCase("support")){
            HP = 20;
            mana = 40;
            runSpeed = 10;
        }else if(career.equalsIgnoreCase("mage")){
            HP = 40;
            mana = 20;
            runSpeed = 10;
        }else{
            System.out.println("Career was not found");
        }
        maxRunSpeed = runSpeed*10;
    }
    public Hero(String career){ //constructor
        this.career = career;
        create(career);
    }
    public void setEquip(String equip){ //instant method player เรียกใช้อาวุธ runspeed ของตัว hero ก็จะลดลงตามที่กำหนดไว้
        if(equip.equalsIgnoreCase("sword")){
            runSpeed*=(0.1+0.04*level);
            equipment = new Equipment("sword"); // อาวุธต่างๆ ประกาศแบบ object
        }else if(equip.equalsIgnoreCase("shield")){
            runSpeed*=(0.1+0.08*level);
            equipment = new Equipment("shield");
        }else{
            System.out.println("Equipment was not found");
        }
        maxRunSpeed = runSpeed*10;
        printAll();
    }
    public void levelUp(){ //level up เป็นแบบ manual เมื่อ level up แล้ว HP กับ mana จะสูงขึ้นเป็น 2 เท่าจากเดิม
        level++;
        HP*=2;
        mana*=2;
    }
    public void printAll(){ //instant method
        System.out.println(career);
        System.out.println("level = " + level);
        System.out.println("HP = " + HP);
        System.out.println("mana = " + mana);
        System.out.println("runSpeed = " + runSpeed);
        System.out.println("Max run speed = " + maxRunSpeed);
        equipment.chooseEquip();
        System.out.println("----------------------------------");
    }
}
