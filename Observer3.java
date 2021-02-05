import java.lang.reflect.Field;

/**
 *this class observer .
 * hold on site3 fields
 *  update for site1 and site2
 *  otherwise do not updated
 */
public class Observer3 implements Observer {
    /**
     * subject class reference
     */
    private Subject websites;
    /**
     * subject class reference
     */
    private superSubject netflix;
    /**
     * item of subject class (websites)
     */
    private int site3;

    /**
     * item for subject class (netflix)
     */
    private int Vikings;
    /**
     *
     * @param w is Subject class reference
     *          this reference register this class
     * @param netflix is subject class reference this reference register this class
     */
    public Observer3(Subject w,superSubject netflix){

        this.websites = w;
        w.registerObserver(this);
        this.netflix = netflix;
        netflix.registerObserver(this);
    }
    /**
     * show last knowledge for observer
     */
    @Override
    public void display() {
        System.out.println("                     " +this.getClass().getName()
                + "\nsite1 of number of product : "
                + "\nsite2 of number of product : "
                + "\nsite3 of number of product : " + this.site3
                + "\nPeakyBlinders of number of product : "
                + "\nHouseOfCards of number of product : "
                +  "\nVikings of number of product : " + this.Vikings);
    }
    /**
     *
     * @param site1 is item in WebSites class
     *    this method makes the last change for site1
     */
    @Override
    public void updateSite1(int site1) {
        // have not site1 field
    }
    /**
     *
     * @param site2 is item in WebSites class
     *    this method makes the last change for site2
     */
    @Override
    public void updatesite2(int site2) {
        // have not site2 field
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
        Field[] fields = Observer3.class.getDeclaredFields();
        return fields;
    }


    @Override
    public void updatePeakyBlinders(int pk) {

    }
    public void updateHouseOfCards(int hc){

    }
    public void updateVikings(int v){
        this.Vikings=v;
    }
}
