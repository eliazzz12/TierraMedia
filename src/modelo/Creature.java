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
  
  }
  
}
