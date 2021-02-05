import java.lang.reflect.Field;

/**
 *this class observer .
 * hold on site1 and site2 fields
 *  update for site1 and site2
 *  otherwise do not updated
 */
public class Observer1 implements Observer {

    /**
     * subject class reference
     */
    private superSubject websites;
    /**
     * subject class reference for netflix
     */
    private superSubject Netflix;
    /**
     * item of subject class (websites)
     */
    private int site1;
    /**
     * item of subject class (websites)
     */
    private int site2;
    /**
     * is item (Series)
     */
    private int PeakyBlinders;

    /**
     *
     * @param w is Subject class reference
     *          this reference register this class
     * @param netflix is subject class reference this reference register this class
     */
    public Observer1(superSubject w,superSubject netflix){

        this.websites = w;
        this.Netflix=netflix;
        w.registerObserver(this);
        netflix.registerObserver(this);
    }

    /**
     * show last knowledge for observer
     */
    @Override
    public void display() {
        System.out.println("                            "+this.getClass().getName() +
                "\nsite1 of number of product : " + this.site1 +
                "\nsite2 of number of product :" + this.site2 +
                "\nsite3 of number of product :  " +
                "\nPeakyBlinders of number of product " +this.PeakyBlinders +
                "\nHouseOfCards of number of product :  " +
                "\nVikings of number of product :  " );
    }

    /**
     *
     * @param site1 is item in WebSites class
     *    this method makes the last change for site1
     */
    @Override
    public void updateSite1(int site1) {
        this.site1 = site1;
    }
    /**
     *
     * @param site2 is item in WebSites class
     *    this method makes the last change for site2
     */
    @Override
    public void updatesite2(int site2) {
        this.site2 = site2;
    }
    /**
     *
     * @param site3 is item in WebSites class
     *    this method makes the last change for site3
     */
    @Override
    public void updateSite3(int site3) {
        // have not site3 field
    }
    /**
     * for reflection class method
     * get all declared field and return
     * @return declared field
     */
    @Override
    public Field[] getFields() {
        Field[] fields = Observer1.class.getDeclaredFields();
        return fields;
    }

    @Override
    public void updatePeakyBlinders(int pk) {
        this.PeakyBlinders = pk;
    }
    public void updateHouseOfCards(int hc){

    }
    public void updateVikings(int v){

    }
}
