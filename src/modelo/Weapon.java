package modelo;

public class Weapon {
  private String type;
  private int damage;
  private int strength;
  private boolean wear;

  public String getType(){
    return type;
  }
  public void setType(String type){
    this.type=type;
  }
  public int getDamage(){
    return damage;
  }
  public void setDamage(int damage){
    this.damage=damage;
  }
}
