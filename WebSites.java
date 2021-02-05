import java.lang.reflect.*;

import java.util.ArrayList;

/**
 * this class is subject
 * implemet Subject interface
 * have 3 items(site1 site2 site3)
 * holds on reference of objects.
 * so can increment objects types or can decrement objects type
 * notifies  necessary updates to objects
 * necessary updates conditions are that object have which items.
 */
public class WebSites extends superSubject{

    /**
     * holds different object types
     */
    private ArrayList observers;
    /**
     * item for subject
     */
    private int site1;
    /**
     * item for subject
     */
    private int site2;
    /**
     * item for subject
     */
    private int site3;

    /**
     * no parameter constructor
     * create observers array list
     * this observers holds different object types
     * so register different object types
     */
    public WebSites(){
        observers = new ArrayList();
    }



    /**
     *  for push method (notify necessary objects )
     *  if items of o are updated , notify o
     * @param o is object of observer class
     */
    @Override
    public void notifyObservers(Object o) {
        Field[] field =  ((Observer)o).getFields();


        for(int i = 0;i< field.length;i++){


            Field[] thisField = WebSites.class.getDeclaredFields();
            for(int j=0;j<WebSites.class.getDeclaredFields().length;j++){
                if(field[i].getName().equals(thisField[j].getName())){


                    if(field[i].getName().equals("site1")){
                        ((Observer)o).updateSite1(site1);

                    }
                    else if(field[i].getName().equals("site2")){
                        ((Observer)o).updatesite2(site2);

                    }
                    else if(field[i].getName().equals("site3")){
                        ((Observer)o).updateSite3(site3);

                    }
                }
            }
        }
    }




    /**
     * if change site1 ,set site1
     * and call changed()
     */
    public void setSites1(){
        System.out.println("added new thing for site1 ");
        this.site1=this.site1 + 1;
        changed();
    }
    /**
     * if change site2 ,set site2
     * and call changed()
     */
    public void setSites2(){
        System.out.println("added new thing for site2 ");
        this.site2=this.site2 + 1;
        changed();
    }
    /**
     * if change site3 ,set site3
     * and call changed()
     */
    public void setSites3(){
        System.out.println("added new thing for site3 ");
        this.site3=this.site3 + 1;
        changed();
    }
}
