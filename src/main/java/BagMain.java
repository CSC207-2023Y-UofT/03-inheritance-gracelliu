

class BagMain {
    /** Enhance each of the bags in bags. If double_enhance_handbags is
     * True, then enhance any HandBags a second time.
     *
     * This method works for all Bags and their subclasses.
     * double_enhance_handbags works for all HandBags and its subclasses.
     */
    public static void enhanceBags(Bag[] bags, boolean double_enhance_handbags) {
        for (Bag bag : bags) {
            bag.enhance();
            if (double_enhance_handbags && bag instanceof HandBag) {
                bag.enhance();
            }
        }
    }

    /** Return the total number of straps in CrossbodyBags in bags.
     * Any bag that is not a CrossbodyBag should not be included
     * in the count!
     *
     * @param bags An array of Bags
     * @return The total number of straps of CrossbodyBags.
     */
    public static int countCrossbodyStraps(Bag[] bags) {
        int count = 0;
        for (Bag bag : bags) {
            if (bag instanceof CrossbodyBag) {
                count += ((CrossbodyBag) bag).getNumberOfStraps();
            }
        }
        return count;
    }
}
