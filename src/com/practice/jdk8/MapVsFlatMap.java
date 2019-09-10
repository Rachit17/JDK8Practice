package com.practice.jdk8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author rackakka
 * Map vs flat Map Comparison
 * -------- Without flatMap() -------------------------------
     collect() returns: [[Laptop, Phone], [Mouse, Keyboard]]

-------- With flatMap() ----------------------------------
     collect() returns: [Laptop, Phone, Mouse, Keyboard]
 *
 */
public class MapVsFlatMap {
  String name;
  List<String> items;

  public MapVsFlatMap(String name, String... items) {
    this.name = name;
    this.items = Arrays.asList(items);
  }

  public List<String> getItems() {
    return items;
  }

  public static void main(String[] args) {
    MapVsFlatMap amazon = new MapVsFlatMap("amazon", "Laptop", "Phone");
    MapVsFlatMap ebay = new MapVsFlatMap("ebay", "Mouse", "Keyboard");
    List<MapVsFlatMap> parcels = Arrays.asList(amazon, ebay);

    System.out.println("-------- Without flatMap() ---------------------------");
    List<List<String>> mapReturn = parcels.stream()
      .map(MapVsFlatMap::getItems)
      .collect(Collectors.toList());
    System.out.println("\t collect() returns: " + mapReturn);

    System.out.println("\n-------- With flatMap() ------------------------------");
    List<String> flatMapReturn = parcels.stream()
      .map(MapVsFlatMap::getItems)
      .flatMap(Collection::stream)
      .collect(Collectors.toList());
    System.out.println("\t collect() returns: " + flatMapReturn);
  }
}