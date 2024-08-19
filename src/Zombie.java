public class Zombie extends Enemy{

    public Zombie(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public Enemy takeDamage(int damage) {
        super.takeDamage(damage);
        if (super.getHealth() <= 0) {
            System.out.println("Зомби воскрешается!");
            super.setHealth(20);
        }
        return this;
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println(super.getName() + " атакует " + hero +
                " и наносит ему урон ");
        System.out.println(hero.takeDamage(super.getDamage()));
    }
}
