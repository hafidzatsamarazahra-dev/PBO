package pertemuan6.id.ac.polinema.inheritance.tugas3;

public class Wizard extends Character {
    protected int spell;

    public Wizard(String name, int level, int health, int spell) {
        super(name, level, health);
        this.spell = spell;
    }

    public void magic(Character target) {
        target.health -= 50;
        this.spell--;
    }
}