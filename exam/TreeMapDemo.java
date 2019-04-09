import java.util.*;

public class TreeMapDemo {
   public static void main(String[] args) {
      // creating tree map 
      NavigableMap<Integer, String> treemap = new TreeMap<Integer, String>();
      
      // populating tree map
      treemap.put(2, "two");
      treemap.put(1, "one");
      treemap.put(3, "three");
      treemap.put(6, "six");
      treemap.put(5, "five");
      System.out.println(treemap);
      System.out.println("Ceiling entry for 4: "+ treemap.ceilingEntry(4));
      System.out.println("Ceiling entry for 5: "+ treemap.ceilingEntry(5));
   }
}