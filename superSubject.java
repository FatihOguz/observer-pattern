import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * bundled the same functions for subject classes
 * notifyObservers(Object o) act different every subject class so this method is abstract.
 */
public abstract class superSubject implements Subject{
    /**
     *  holds on observer classes
     */
    private ArrayList<Observer> observers;

    /**
     * create observers list
     */
    public superSubject(){
        observers = new ArrayList();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * remove object type in list
     * @param o is object of observer class
     */
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            System.out.println(observers.get(i).getClass().getName() + " deleted");
            observers.remove(i);

        }
    }

    /**
     * show knoledge of objects that registered to subject
     *
     */
    public void display(){
        for(int i=0;i< observers.size();i++){
            Observer observer = (Observer)observers.get(i);
            observer.display();
        }
    }

    /**
     * notifies  necessary updates to objects
     * necessary updates conditions are that object have which items.
     * for pull method (notify all observer)
     * traver objects and call notifyObservers(observer)
     */

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            notifyObservers(observer);

        }
    }

    @Override
    abstract public void notifyObservers(Object o);

    /**
     * if changed items call notifyObservers()
     */
    public void changed(){
        notifyObservers();
    }

}
