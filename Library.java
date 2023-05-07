import java.util.Hashtable;

/* This is a stub for the Library class */ 
public class Library extends Building {
  private Hashtable<String, Boolean> collection;
    /**
    * constuctor
    * @param title - name of the library 
    * @param address - address of the library 
    * @param nFloors - the amounts of the floors in library
    */


      public Library(String title, String address, int nFloors) {
        super(title, address, nFloors);
        this.collection = new Hashtable<String, Boolean>();

      }
      /**
       * overloading method to get default library and its details
       */

      public Library() {
        super("Neilson", "7 Neilson Drive, Northampton", 4);
        this.collection = new Hashtable<String, Boolean>();
  
      }

      /**
       * a method that adds the title of the books into hastable
       * @param title- title of the book
       */

      public void addTitle(String title) {
        if (this.collection.containsKey(title)){
          throw new RuntimeException("Library already has this book");
        }else{
        this.collection.put(title, true);
        }
        
      }

        /**
         * overloading method to get a default book to be added 
         */

      public void addTitle() {
        if (this.collection.containsKey("Art of War")) {
          throw new RuntimeException("Library already has this book");
        }else{
        this.collection.put("Art of War", true); 
        }    
  
      }


      /**
       * a method that removes the title of the books from the hashtable
       * @param title- title of the book
       * @return title - title of the book
       */

      public String removeTitle(String title) {
        if (this.collection.containsKey(title)) {
          this.collection.remove(title);
          return title;
        }else{
          throw new RuntimeException("No identifiable book to remove.");
        }
       
      }
      /**
        * a method to checkout books present in the collection of books in the library
        *@param title- title of the book
        */

      public void checkOut(String title) {
        if (this.collection.containsKey(title)) {
        this.collection.replace(title, false);
        }else{
          throw new RuntimeException("No identifiable book to remove.");
        }
      }
      /**
       * a method to return books present in the collection of books in the library 
       * @param title- title of the book
       */

      public void returnBook(String title) {
        if (this.collection.containsKey(title)){
        this.collection.replace(title, true);
        }else{
          throw new RuntimeException("No identifiable book to remove.");
        }

      }

      public boolean containsTitle(String title) { //return true if the title appears as a key in the Library's collection, false otherwise
        return this.collection.containsKey(title);

      }
      /**
       * a method to check the status of a book
       * @param title- title of the book
       * @return boolean- true or false depending whether the book is checked out or not 
       */

      public boolean isAvailable(String title) { // returns true if the title is currently available, false otherwise
        return this.collection.containsValue(true);
  
      }
      /**
       * a method to print out to books in the collection and their status 
       */

      public void printCollection() { // prints out the entire collection in an easy-to-read way (including checkout status)
        for (String title: this.collection.keySet()) {
          System.out.print(title);
        if (this.collection.get(title)){
          System.out.println(": Available");
        }
        else{
          System.out.println(": checked out");
        }
        }
          
      } 

     public void showOptions() {
      super.showOptions();
      System.out.println("Available options at " + this.name + ": \n checkOut() \n + addTitle() \n + removeTitle()");
      }

  
    public static void main(String[] args) {
      Library Neilson = new Library("Neilson", "smith college", 5);
      Neilson.addTitle("cookie");
      Neilson.printCollection();
      Neilson.removeTitle("cookie");
      Neilson.printCollection();
      Neilson.addTitle("cake");
      Neilson.addTitle("candy");
      Neilson.addTitle("Ice cream");
      Neilson.checkOut("cake");
      Neilson.printCollection();
      System.out.print(Neilson.containsTitle("candy"));


     }

  
  }