public class Archer extends Hero {

    public Archer(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(super.getName() + " атакует " + enemy +
                " и наносит ему урон " + super.getDamage());
        System.out.println(enemy.takeDamage(super.getDamage()));
    }

    @Override
    public Hero takeDamage(int damage) {
        super.takeDamage(damage);
        if ((super.getHealth() <= 20) && (super.getHealth() > 0)) {
            System.out.println("Лучник притворяется мертвым!");
        }
        return this;
    }
}
