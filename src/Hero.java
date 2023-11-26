public class Hero {
    private String career;
    private int HP;
    private int mana;
    private int level = 1;
    private double runSpeed;
    private double maxRunSpeed;
    public Equipment equipment;
    private void create(String career){ //instant method
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
    public void setEquip(String equip){ //instant method
        if(equip.equalsIgnoreCase("sword")){
            runSpeed*=(0.1+0.04*level);
            equipment = new Equipment("sword");
        }else if(equip.equalsIgnoreCase("shield")){
            runSpeed*=(0.1+0.08*level);
            equipment = new Equipment("shield");
        }else{
            System.out.println("Equipment was not found");
        }
        maxRunSpeed = runSpeed*10;
        printAll();
    }
    public void levelUp(){
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
