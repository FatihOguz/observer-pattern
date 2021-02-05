import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * this class like websites class is subject class
 */
public class Netfilix extends superSubject{
    /**
     * holds observers classes
     */
    private ArrayList<Observer> observers;
    /**
     * viking is item (series)
     */
    private int Vikings;
    /**
     * peaky blinders is item (series )
     */
    private int PeakyBlinders;
    /**
     * house of cards is item (series)
     */
    private int houseOfCards;

    /**
     * create observers list
     */
    public Netfilix(){
        observers = new ArrayList();
    }


    /**
     *
     * @param o observer
     */
    public void notifyObservers(Object o) {
        Field[] field =  ((Observer)o).getFields();


        for(int i = 0;i< field.length;i++){


            Field[] thisField = Netfilix.class.getDeclaredFields();
            for(int j=0;j<Netfilix.class.getDeclaredFields().length;j++){
                if(field[i].getName().equals(thisField[j].getName())){


                    if(field[i].getName().equals("houseOfCards")){
                        ((Observer)o).updateHouseOfCards(houseOfCards);

                    }
                    else if(field[i].getName().equals("PeakyBlinders")){
                        ((Observer)o).updatePeakyBlinders(PeakyBlinders);

                    }
                    else if(field[i].getName().equals("Vikings")){
                        ((Observer)o).updateVikings(Vikings);

                    }
                }
            }
        }
    }




    /**
     * if change houseofcards ,set houseofcards
     * and call changed()
     */
    public void setHouseOfCards(){
       // System.out.println("added new thing for house of cards ");
        this.houseOfCards=this.houseOfCards + 1;
        changed();
    }
    /**
     * if change peakyblinders ,set peakyblinders
     * and call changed()
     */
    public void setPeakyBlinders(){

        this.PeakyBlinders=this.PeakyBlinders + 1;
        //System.out.println("added new thing for PeakyBlinders  " + PeakyBlinders);
        changed();
    }
    /**
     * if change vikings ,set vikings
     * and call changed()
     */
    public void setVikings(){
        //System.out.println("added new thing for vikings ");
        this.Vikings=this.Vikings + 1;
        changed();
    }

}
