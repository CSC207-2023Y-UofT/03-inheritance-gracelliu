
public class CrossbodyBag extends Bag {

    // === Instance Variables ===
    private String color;
    private int numberOfContents;
    private int capacity;
    private String[] contents;
    private int numberOfStraps;

    public CrossbodyBag(String color, int capacity, int numberOfStraps) {
        super(color, capacity);
        this.numberOfStraps = numberOfStraps;
    }

    public int getNumberOfStraps() {
        return numberOfStraps;
    }

    @Override
    public void enhance() {
        super.increaseCapacity(2);
    }

    @Override
    public String toString() {
        return this.color + " Crossbody Bag with " + this.numberOfStraps +" straps (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

} // For class Bag

