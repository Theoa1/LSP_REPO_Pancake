package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * IntegerSet class to represent a set of integers without duplicates.
 */
public class IntegerSet {
	// List to store the set elements
    private List<Integer> set = new ArrayList<>();

    /**
     * Default constructor that initializes an empty set.
     */
    public IntegerSet() {
    }

    /**
     * Constructor that initializes the set with a predefined list of integers.
     * @param set an ArrayList of integers to initialize the set.
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = new ArrayList<>(set);
    }

    /**
     * Clears all elements from the set.
     * Postcondition: The set will be empty.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the number of elements in the set.
     * @return the size of the set.
     */
    public int length() {
        return set.size();
    }

    /**
     * Checks if two sets are equal.
     * Two sets are considered equal if they contain the same elements, irrespective of order.
     * Overrides the equals method from Object class.
     * @param o the other set to compare with.
     * @return true if the sets are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof IntegerSet) {
            IntegerSet otherSet = (IntegerSet) o;
            return set.containsAll(otherSet.set) && otherSet.set.containsAll(set);
        }
        return false;
    }

    /**
     * Checks if the set contains the specified value.
     * @param value the integer value to check for.
     * @return true if the value is present, false otherwise.
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Finds the largest element in the set.
     * @return the largest integer in the set.
     * @throws IllegalStateException if the set is empty.
     */
    public int largest() {
        if (set.isEmpty()) {
            throw new IllegalStateException("Set is empty, cannot find largest element.");
        }
        return Collections.max(set);
    }

    /**
     * Finds the smallest element in the set.
     * @return the smallest integer in the set.
     * @throws IllegalStateException if the set is empty.
     */
    public int smallest() {
        if (set.isEmpty()) {
            throw new IllegalStateException("Set is empty, cannot find smallest element.");
        }
        return Collections.min(set);
    }

    /**
     * Adds an item to the set.
     * If the item is already present, the set remains unchanged.
     * @param item the integer to be added to the set.
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes an item from the set.
     * If the item is not present, the set remains unchanged.
     * @param item the integer to be removed from the set.
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    /**
     * Performs a union with another set.
     * The union is the combination of elements from both sets, without duplicates.
     * @param intSetb the other set to perform the union with.
     */
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            if (!set.contains(item)) {
                set.add(item);
            }
        }
    }

    /**
     * Performs an intersection with another set.
     * The intersection is the set of elements common to both sets.
     * @param intSetb the other set to perform the intersection with.
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    /**
     * Performs a difference operation with another set.
     * The difference is the set of elements that are in this set but not in the other set.
     * @param intSetb the other set to perform the difference with.
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * Performs a complement operation with another set.
     * The complement adds elements from the other set that are not in this set.
     * @param intSetb the other set to perform the complement with.
     */
    public void complement(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            if (!set.contains(item)) {
                set.add(item);
            }
        }
    }

    /**
     * Checks if the set is empty.
     * @return true if the set is empty, false otherwise.
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns a string representation of the set.
     * Overrides the toString method from Object class.
     * @return a string representing the set.
     */
    @Override
    public String toString() {
        return set.toString();
    }

}
