import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }

    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));
        myMap.addBuilding(new House()); 
        myMap.addBuilding(new Cafe());
        myMap.addBuilding(new Library());
        myMap.addBuilding(new House("Ziskind", "1 Henshaw Ave, Northampton, MA 01063", 3, true, true));
        myMap.addBuilding(new House("Gillet House", "Elm Street, Northampton, MA 01063", 2, true, true));
        myMap.addBuilding(new House("Chase house", "10 Elm St, Northampton, MA 01063", 3, true, true));
        myMap.addBuilding(new Cafe("Compass cafe", "7 Neilson Drive, Northampton, MA 01063", 100,100, 100,100,100));
        myMap.addBuilding(new Cafe("Campus Cafe", "Smith College Campus Center, 100 Elm St, Northampton, MA 01063", 20, 100, 50, 60, 80));
        myMap.addBuilding(new Library("Neilson Library", "7 Neilson Drive, Northampton, MA 01063", 4));
        myMap.addBuilding(new Library("Hillyer Library", "20 Elm St, Northampton, MA 01063", 3));
        myMap.addBuilding(new Building("Seelye Hall", "5 Chapin Way, Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Schacht Center", "21 Belmont Ave, Northampton, MA 01060", 2));
        myMap.addBuilding(new Building("College hall", "Smith College Northampton, MA 01063",2 ));
        System.out.println(myMap);

    }
    
}
