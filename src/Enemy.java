public abstract class Enemy implements Mortal{
    private final String name;
    private int health;
    private final int damage;

    public Enemy(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Enemy takeDamage(int damage){
        health -= damage;
        if (health <= 0) System.out.println(this + " погиб!");
        return this;
    }

    public abstract void attackHero(Hero hero);


    @Override
    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}
