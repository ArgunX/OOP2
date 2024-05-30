import java.util.ArrayList;
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

    private List<Actor> actors = new ArrayList<Actor>();

    @Override
    public void acceptToMarket(Actor actor) {
        actors.add(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        actors.remove(0);
    }

    @Override
    public void update(int x) {
        
        // добавить аргумент
        // создать список прордуктов
        // либо удалять либо 
        
    }

    @Override
    public void giveOrders() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void releaseFromQueue() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void takeInQueue(Actor actor) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void takeOrders() {
        // берём первый заказ из списка и удалить его
        
    }

    



}