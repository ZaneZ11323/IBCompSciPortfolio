package Project5;

public class SnapShopConfiguration {
    /**
     * Method to configure the SnapShop.  Call methods like addFilter
     * and setDefaultFilename here.
     * @param theShop A pointer to the application
     */
    public static void configure(SnapShop theShop) {
        //replace the following path in the following line by the directory path you want your
        //file loader to open
        theShop.setDefaultFilename("billg.jpg");

        theShop.addFilter(new FlipHorizontalFilter(), "Flip Horizontal");
        theShop.addFilter(new DeMosaicFilter(),"Demoasic");
    }

    /** Main method */
    public static void main(String args[]) {
        SnapShop theShop = new SnapShop();
    }
}
