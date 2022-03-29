package javas.study.inflearn.not.inflearn.udemy.stepnine.adventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdventureMain {
    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small bridge"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) break;

            loc = sc.nextInt();
            sc.nextLine();

            if (!locations.containsKey(loc)) {
                System.out.println("You cannot go in that direction");
            }
        }
    }
}
