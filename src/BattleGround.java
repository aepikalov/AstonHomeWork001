public class BattleGround {
    public static void main(String[] args) {
        Hero mage = new Mage("Маг", 100, 20);
        Enemy zombie = new Zombie("Зомби", 100, 10);
        mage.attackEnemy(zombie);
        System.out.println(zombie.isAlive());
    }
}
