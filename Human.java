package oop.OOP2;

public class Human extends Actor {

    public Human(String name) {
        super(name);
    }

    @Override
    public void setMakeOrder(boolean flag) {
        this.isMakeOrder = flag;
    }

    @Override
    public void setTakeOrder(boolean flag) {
        this.isTakeOrder = flag;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        
        return this.getName();
    }

}
