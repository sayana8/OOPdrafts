
package laba2;

import java.util.HashSet;

public class BuildingTest {
    public static void main(String[] args) {
        HashSet<Building> buildingSet = new HashSet<>();

        OfficeBuilding one = new OfficeBuilding(5, 250, 50);
        OfficeBuilding two = new OfficeBuilding(9, 1020, 145);
        OfficeBuilding three = new OfficeBuilding(6, 600, 245);

        buildingSet.add(one);
        buildingSet.add(two);
        buildingSet.add(three);

        for (Building b : buildingSet) {
            System.out.println(b.toString());
        }
    }
}