package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Employee first = new Employee(101, "Aman");
        Employee sameId = new Employee(101, "Aman Sharma");
        Employee second = new Employee(102, "Priya");

        System.out.println("Same object (==): " + (first == sameId));
        System.out.println("Equal employees: " + first.equals(sameId));
        System.out.println("Same hash code: "
                + (first.hashCode() == sameId.hashCode()));

        // Key = employee, value = department.
        Map<Employee, String> departments = new HashMap<>();
        departments.put(first, "Engineering");
        departments.put(second, "Finance");

        // A separate object with the same ID can find the existing entry.
        System.out.println("Lookup with same ID: " + departments.get(sameId));

        // An equal key replaces the value rather than adding another entry.
        String previous = departments.put(sameId, "Platform");
        System.out.println("Previous department: " + previous);
        System.out.println("Map size: " + departments.size());
        System.out.println("Updated department: " + departments.get(first));

        System.out.println("\nAll entries (order is not guaranteed):");
        for (Map.Entry<Employee, String> entry : departments.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
