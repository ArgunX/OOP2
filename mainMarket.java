package oop.OOP2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mainMarket {
    
    public static void main(String[] args) {
        // String[] list = {"патроны","расческа", "зубная паста","газировка","веник","жевачка","книга"};
        // ArrayList<String> products = new ArrayList<>(Arrays.asList(list));
        Human petr = new Human("Petr");
        Human pavel = new Human("Pavel");
        Human oleg = new Human("Oleg");
        Human marfa = new Human("Marfa");
        Human ira = new Human("Ira");
        Human sobaka = new Human("Sobaka");
        Market hozMarket = new Market();
        /**
     *Зашли в магазин
     */
        hozMarket.acceptToMarket(petr);
        hozMarket.acceptToMarket(pavel);
        hozMarket.acceptToMarket(marfa);
        hozMarket.acceptToMarket(oleg);
        hozMarket.acceptToMarket(sobaka);
        hozMarket.acceptToMarket(oleg);
        hozMarket.acceptToMarket(pavel);
        hozMarket.acceptToMarket(ira);
        hozMarket.show();
        
          /**
     *Кто то встал в очередь
     */

        hozMarket.takeInQueue(petr);
        hozMarket.takeInQueue(oleg);
        hozMarket.takeInQueue(oleg);
        hozMarket.takeInQueue(pavel);
        hozMarket.takeInQueue(ira);
        

        hozMarket.show();

           /**
     *Делаем заказ обновляем статус
     */
        hozMarket.takeOrders(petr);
        hozMarket.update(petr);
        hozMarket.takeOrders(oleg);
        hozMarket.update(oleg);
             /**
     *Забираем заказ обновляем статус
     */
        hozMarket.giveOrders(petr);
        hozMarket.update(petr);
        hozMarket.show();

               /**
     *Выходим из магазина обновляем статус
     */
    hozMarket.releaseFromMarket(petr);
    hozMarket.show();
    hozMarket.update(petr);
    hozMarket.releaseFromMarket(sobaka);
    hozMarket.update(sobaka);





        



        
     
       

        
        
        



        



        
    }
    
}
