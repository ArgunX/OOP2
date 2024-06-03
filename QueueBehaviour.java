package oop.OOP2;


public interface QueueBehaviour {

    void takeInQueue(Actor actor);// встал в очередь

    void takeOrders(Actor actor);// сделал заказ

    void giveOrders(Actor actor);// забрал заказ

    void releaseFromQueue();// вышел из очереди
    

    
}