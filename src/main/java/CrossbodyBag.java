
public class CrossbodyBag extends Bag {

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
        return this.getColor() + " Crossbody Bag with " +
                this.numberOfStraps + " straps (" + this.getNumberOfContents() + " / " +
                this.getCapacity() + ")";
    }

}


