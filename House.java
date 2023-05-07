import java.util.ArrayList;

/* This is a stub for the House class */
/**class that creates houses available for residents */
public class House extends Building {

  private ArrayList<String> residents;
  private boolean hasDiningRoom; 
  private boolean hasElavator;
  /**
   * constructor
   * @param name- name of the house
   * @param address- address of the house
   * @param nFloors- amount of floors of the house
   * @param hasElavator- whether it has a elavator 
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom, boolean hasElavator) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    this.hasElavator = hasElavator;
  
  }

  /**
   * Overloaded to create a default when making a house
   */

  public House() {
    super("Ziskind", "1 Henshaw Ave, Northampton, MA 01063");
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = true;
    this.hasElavator = true; 
  }


  /** Accessor for hasDiningRoom 
   * @return boolean on whether it has dining room
  */
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;

  }

  /**
   * Accessor for hasElavator
   * @return boolean on whether it has a elavator
   */

  public boolean hasElavator() {
    return this.hasElavator;
  }

  /** Accessor for number of residents 
   * @returns amount of residents 
  */
  public int nResidents() {
    return this.residents.size();
  }
  /**
   * a method that moves in residents
   * @param name- name of the residents
   */
  public void moveIn(String name) {
    // check if this.residents contains name
    if (this.residents.contains(name)) {
      //   if so: throw and exception
      throw new RuntimeException(name + " is already a resident of " + this.getName());
    }
    // if we're good to go, add to roster
    this.residents.add(name);
    System.out.println(name + " has just moved into " + this.getName() + "! Go say hello :-)");
  }
  /**
   * Overloaded method that creates a default person to move or not
   */

  public void moveIn() {
    // check if this.residents contains name
    if (this.residents.contains("Hau")) {
      //   if so: throw and exception
      throw new RuntimeException("Hau"+ " is already a resident of " + this.getName());
    }
    // if we're good to go, add to roster
    this.residents.add("Hau");
    System.out.println("Hau"+ " has just moved into " + this.getName() + "! Go say hello :-)");
  }

  /**
   * method that removes a person from the house 
   * @param name- name of the person 
   * @return 
   * @return return the name of the person 
   */

  public String moveOut() {
    //return the name of the person who moved out
    if (this.residents.contains(name)) {
      throw new RuntimeException(name+ "is not resident of" + this.getName());
    }
    this.residents.remove(name);
    System.out.println(name + "has just moved out of"+this.getName());
    return name;

  }

  public void showOptions() {
    super.showOptions();
    System.out.println("Available options at " + this.name + ": \n moveIn() \n + moveOut() \n + goToFloor(n)");
  }

  public void goToFloor(int floorNum) {
    if (this.hasElavator == true) {
      super.goToFloor(floorNum);
    }else{
      throw new RuntimeException("This house does not have a elevator, please use goUp() and goDown()");
    }

  }

  /**
   * a method that offers the description regarding the house 
   */
  public String toString() {
    String description = super.toString();
    description += " There are currently " + this.nResidents() + " people living in this house.";
    description += " This house ";
    if (this.hasDiningRoom) {
      description += "has";
    } else {
      description += "does not have";
    }
    description += " an active dining room.";
    return description;
  }


  //public static void main(String[] args) {
   //House morrow = new House("Morrow", "The Quad", 4, false);
    //System.out.println(morrow);
    // morrow.moveIn("Jordan");
    // morrow.moveIn("Jordan");
    // System.out.println(morrow);
    // House king = new House("King", "The Quad", 3, true);
    // System.out.println(king);
}

