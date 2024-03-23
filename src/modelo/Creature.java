package modelo;

public abstract class Creature {
  private String name;
  private int health;
  private int strength;
  private int defense;
  private Weapon weapon;
  private Armour armour;

  public abstract void speak();
  public void attack(Creature enemy){
    // Los métodos getters y setters están por crear
    enemy.setHealth(enemy.getHealth()-(strength*(weapon.getDamage/10));
  }

}
