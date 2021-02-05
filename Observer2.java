import java.lang.reflect.Field;

/**
 *this class observer .
 * hold on site1,site2 and site3 fields
 *  update for site1 and site2
 *  otherwise do not updated
 */

public class Observer2 implements Observer {
    /**
     * subject class reference
     */
    private Subject websites;

    /**
     * subject class reference
     */
    private superSubject netflix;
    /**
     * item of subject class (netflix)
     */
    private int houseOfCards;
    /**
     * item of subject class (websites)
     */
    private int site1 ;

    /**
     * item of subject class (websites)
     */
    private int site2;
    /**
     * item of subject class (websites)
     */
    private int site3;

    /**
     *
     * @param w is Subject class reference
     *          this reference register this class
     * @param netfilix is subject class reference this reference register this class
     */
    public Observer2(Subject w,superSubject netfilix){

        this.netflix =netfilix;
        netfilix.registerObserver(this);
        this.websites = w;
        w.registerObserver(this);
    }
    /**
     * show last knowledge for observer
     */
    @Override
    public void display() {
        System.out.println("                "+this.getClass().getName()
                + "\nsite1 of number of product : " + this.site1 +
                "\nsite2 of number of product :" + this.site2 +
                "\nsite3 of number of product : " + this.site3+
                "\nPeakyBlinders of number of product : " +
                "\nHouseOfCards of number of product : "+this.houseOfCards+
                "\nVikings of product : " );
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
        this.site3 = site3;
    }
    /**
     * for reflection class method
     * get all declared field and return
     * @return declared field
     */
    @Override
    public Field[] getFields() {
        Field[] fields = Observer2.class.getDeclaredFields();
        return fields;
    }


    @Override
    public void updatePeakyBlinders(int pk) {

    }
    public void updateHouseOfCards(int hc){
        this.houseOfCards=hc;
    }
    public void updateVikings(int v){

    }
}
