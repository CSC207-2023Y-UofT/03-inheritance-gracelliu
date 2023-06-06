/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

public abstract class Bag {

    // === Instance Variables ===
    private String color;
    private int numberOfContents;
    private int capacity;
    private String[] contents;


    /** Constructs a bag with specified color and capacity.
    * numberOfContents is set to 0.
    * contents is set to an array of Strings of size <capacity>.
     *
    * @param color color of the Bag
    * @param capacity the maximum number of items the Bag can hold.
     */
    public Bag(String color, int capacity) {
        this.color = color;
        this.numberOfContents = 0;
        this.capacity = capacity;
        this.contents = new String[capacity];
    }

    /** Returns the color of this Bag
     *
     * @return the color of this Bag
     */
    public String getColor() {
        return color;
    }

    /** Returns the numberOfContents of this Bag
     *
     * @return the numberOfContents of this Bag
     */
    public int getNumberOfContents() {
        return numberOfContents;
    }

    /** Returns the capacity of this Bag
     *
     * @return the capacity of this Bag
     */
    public int getCapacity() {
        return capacity;
    }


    /** Sets the color of this bag to the given color.
     *
     *  @param given_color the color of the bag to be set to
     */
    public void setColor(String given_color) {
        color = given_color;
    }


    /** Adds an item in the Bag if the number of items in the Bag has not reached the Bag's capacity.
     *  This method also modifies numberOfContents accordingly.
     *
     *  @param item the item to be added to the Bag if there is more capacity
     *  @return true if item is added successfully and false otherwise
     */
    public boolean addItem(String item) {
        if (this.numberOfContents < this.capacity) {
            this.contents[numberOfContents] = item;
            this.numberOfContents += 1;
            return true;
        } else {
            return false;
        }
    }


    /** Returns the last item added to Bag and removes the last item from this Bag.
     * This method also modified numberOfContents accordingly.
     * @return String item if item was removed and null if the Bag is empty.
     */
    public String popItem() {
        if (numberOfContents == 0) {
            return null;
        } else {
            String last_item = this.contents[numberOfContents - 1];
            this.contents[numberOfContents - 1] = null;
            numberOfContents -= 1;
            return last_item;
        }
    }


    /**
     * Increase this bag's capacity by <n>.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {

        int old_capacity = this.capacity;

        this.capacity += n;
        String[] new_contents = new String[this.capacity];

        for (int i = 0; i < old_capacity; i++) {
            new_contents[i] = contents[i];
        }

        this.contents = new_contents;
    }


    /** Returns the string representation of this Bag.
     *
     * @return the string representation of this Bag
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}