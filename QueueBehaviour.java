public interface QueueBehaviour {

    void takeInQueue(Actor actor);

    void takeOrders();// сделать заказ

    void giveOrders();// забрать заказы

    void releaseFromQueue();// выйти из очереди
    

    
}