// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Hero a = new Hero("tank");
        a.setEquip("sword");
        //level up เป็นแบบ manual
        a.levelUp();
        Equipment.levelUp();
        a.setEquip("sword"); // player กดใช้อาวุธ
        a.setEquip("shield");
    }
}