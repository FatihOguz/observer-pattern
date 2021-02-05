import java.lang.reflect.Field;

/**
 * declare methods for observer classes
 */
public interface Observer {
    /**
     *
     * @param site1 is item in WebSites class
     *    this method makes the last change for site1
     */
    public void updateSite1(int site1);

    /**
     *
     * @param site2 is item in WebSites class
     *    this method makes the last change for site2
     */
    public void updatesite2(int site2);

    /**
     *
     * @param site3 is item in WebSites class
     *    this method makes the last change for site3
     */
    public void updateSite3(int site3);

    /**
     * show last knowledge for observer
     */
    public void display();

    /**
     * for reflection class method
     * get all declared field and return
     * @return declared field
     */
    public Field[] getFields();

    /**
     * update episode
     * @param pk is last episode peakyblinders
     */
    public void updatePeakyBlinders(int pk);

    /**
     * update episode
     * @param hc is last episode house of cards
     */
    public void updateHouseOfCards(int hc);

    /**
     * update episode
     * @param v is last episode
     */
    public void updateVikings(int v);


}
