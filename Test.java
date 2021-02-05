import java.util.Scanner;

/**
 * creates a menu for register or remove observer object to subjects class(websites and netflix)
 * user gives commands via number (0-9)
 * commands are register observers 1,2,3(subscribe)
 *              remove   observers 1,2,3(unsubscribe)
 *              add new item (update)
 *              exit from menu
 */
public class Test {
    /**
     *  create menu and ask to user ( " give me order ")
     * @param args is empty command arguman
     */
    public static void main(String args[]){

        WebSites webSites = new WebSites();
        Netfilix netfilix = new Netfilix();
        Observer1 observer1 = new Observer1(webSites,netfilix);
        Observer2 observer2 = new Observer2(webSites,netfilix);
        Observer3 observer3 = new Observer3(webSites,netfilix);


        webSites.display();


        Scanner scanner = new Scanner(System.in);
        int command = 10;

        while(command != 0){
            System.out.println("**************************************");
            System.out.println("* exit                      -->0     *");
            System.out.println("**************************************");
            System.out.println("* add new item for site1    --> 1    *");
            System.out.println("* add new item for site2    --> 2    *");
            System.out.println("* add new item for site3    --> 3    *");
            System.out.println("* add new item for PeakyBlinders-->10*");
            System.out.println("* add new item for HouseOfCards-->11 *");
            System.out.println("* add new item for Vikings    --> 12 *");
            System.out.println("**************************************");
            System.out.println("* unsubscribe for observer1 --> 4    *");
            System.out.println("* unsubscribe for observer2 --> 5    *");
            System.out.println("* unsubscribe for observer3 --> 6    *");
            System.out.println("**************************************");
            System.out.println("* subscribe for observer1   --> 7    *");
            System.out.println("* subscribe for observer2   --> 8    *");
            System.out.println("* subscribe for observer3   --> 9    *");
            System.out.println("**************************************");
            webSites.display();
            System.out.println("\n          GIVE ME ORDER    (0-12)  \n");
            command = scanner.nextInt();

            if(command == 0){
                System.out.println("GOOD BY!!");
            }
            else if(command == 1){
                webSites.setSites1();
            }
            else if(command == 2){
                webSites.setSites2();
            }
            else if(command == 3){
                webSites.setSites3();
            }
            else if(command == 4){
                webSites.removeObserver(observer1);
            }
            else if(command == 5){
                webSites.removeObserver(observer2);
            }
            else if(command == 6){
                webSites.removeObserver(observer3);
            }
            else if(command == 7){
                webSites.registerObserver(observer1);
            }
            else if(command == 8){
                webSites.registerObserver(observer2);
            }
            else if(command == 9){
                webSites.registerObserver(observer3);
            }
            else if(command == 10){
                netfilix.setPeakyBlinders();
            }
            else if(command == 11){
                netfilix.setHouseOfCards();
            }
            else if(command == 12){
                netfilix.setVikings();
            }

        }


    }


}
