/**
 * declare methods for subject class
 */

public interface Subject {
    /**
     * register objects of observer classes
     * @param o is object of observer class
     */
    public void registerObserver(Observer o);

    /**
     * remove o observer
     * @param o is object of observer class
     */
    public void removeObserver(Observer o);

    /**
     * notify changes  all observers
     */
    public void notifyObservers();

    /**
     * notify changes required objects
     * this object is @param o
     * use reflection declared variables methods
     * @param o is object of observer class
     */
    public void notifyObservers(Object o);

    /**
     * if change items of subject classes , this mehod call notify method
     */
    public void changed();
}
