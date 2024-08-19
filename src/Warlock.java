public class Warlock extends Enemy{

    public Warlock(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public Enemy takeDamage(int damage) {
        super.takeDamage(damage);
        if ((super.getHealth() <= 20) && (super.getHealth() > 0)) {
            System.out.println("Чернокнижник восстанавливает свое здоровье!");
            super.setHealth(30);
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
