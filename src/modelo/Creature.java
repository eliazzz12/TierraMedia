package modelo;

public abstract class Creature {
  private String name;
  private int health;
  private int strength;
  private int defense;
  private Weapon weapon;
  private Armour armour;


  public String getName() {
		return nombre;
	}
		
	public void setName(String name) {
		this.name = name;
	}


  public int getHealth() {
		return nombre;
	}
		
	public void setHealth(int health) {
		this.health = health;
	}

  public int getStrength() {
		return strength;
	}
		
	public void setStrength(int strength) {
		this.strength = strength;
	}

  public int getDefense() {
		return nombre;
	}
		
	public void setDefense(int defense) {
		this.defense = defense;
	}

  
  public abstract void speak();
  public void attack(Creature enemy){
    // Los métodos getters y setters están por crear
    enemy.setHealth(enemy.getHealth()-(strength*(weapon.getDamage/10));
  }

}
