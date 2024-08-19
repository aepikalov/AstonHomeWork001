public class TrainingGround {
    public static void main(String[] args) {
        Hero archer = new Archer("Лучник", 40, 30);
        Hero mage = new Mage("Маг", 35, 25);
        Hero warrior = new Warrior("Воин", 100, 65);
        Enemy zombie = new Zombie("Зомби", 20, 20);
        Enemy warlock = new Warlock("Чернокнижник", 40, 30);
        archer.attackEnemy(zombie);
        mage.attackEnemy(warlock);
        warrior.attackEnemy(warlock);
        zombie.attackHero(archer);
        zombie.attackHero(mage);
    }
}
