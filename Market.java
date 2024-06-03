package oop.OOP2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Реализовать класс Market и
// все методы, которые он
// обязан реализовывать.
// Методы из интерфейса
// QueueBehaviour, имитируют
// работу очереди,
// MarketBehaviour – помещает и
// удаляет человека из очереди,
// метод update – обновляет
// состояние магазина
// (принимает и отдает заказы)

public class Market implements MarketBehaviour, QueueBehaviour{

    private List<Actor> actors = new ArrayList<>();
    private HashMap<Actor,Integer> visitors = new HashMap<>();
    

    

    @Override
    public void acceptToMarket(Actor vivsitor) {
        if(visitors.get(vivsitor)!= null){
            visitors.put(vivsitor,visitors.get(vivsitor)+1);}
        else{
        visitors.put(vivsitor, 1);
       }
    
    }

    @Override
    public void releaseFromMarket(Actor visitor) {
        visitor.setMakeOrder(false);
        visitor.setTakeOrder(false);
        visitors.put(visitor, visitors.get(visitor)-1);
        if (visitors.get(visitor)<=0){
            visitors.remove(visitor);
        }
    }





    @Override
    public void update (Actor actor) {
        String str = String.format("%s сделал заказ = %b, забрал заказ = %b",actor, actor.isMakeOrder, actor.isTakeOrder);
        System.out.println(str);
    
        
    }


    @Override
    public void takeInQueue(Actor actor) {
        actor.setMakeOrder(false);
        actor.setTakeOrder(false);
        if (visitors.containsKey(actor))
        {
            releaseFromMarket(actor);
            actors.add(actor);
    }
        else{
            System.out.println(actor+" Вы не зашли в магазин, чтобы встать в очередь, продолжайте наслаждаться вывеской");
        }

        
        
    }

    @Override
    public void takeOrders(Actor actor) {
        if (actors.isEmpty()){
            System.out.println("Нет посетителей в магазине");
        
        } 
        if (actors.get(0)==actor ){
            actor.setMakeOrder(true);
            return;
            

        }
        else{
            System.out.println(actor + " Вы лезете без очереди");
        }


        }

    @Override
    public void giveOrders(Actor actor) {
       if (actors.get(0) == actor && actor.isMakeOrder == true){
            actor.setTakeOrder(true);
            acceptToMarket(actor);
            releaseFromQueue();
       }else
       {
        System.out.println(actor + " Займите очередь и сделайте заказ");}
    }

    @Override
    public void releaseFromQueue() {
        actors.remove(0);
    
    }

    

    @Override
    public void show() {
        System.out.println("Наша очередь: " + actors);
        System.out.println("Наши посетители: " + visitors);
    }
        
    }

    



