public abstract class Hero {
    private final String name;
    private int health;
    private final int damage;

    public Hero(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public abstract void attackEnemy(Enemy enemy);

    public Hero takeDamage(int damage){
        health -= damage;
        if (health <= 0) System.out.println(this + " погиб!");
        return this;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}
