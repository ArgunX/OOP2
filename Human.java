public class Human extends Actor {

    public Human(String name) {
        super(name);
    }

    @Override
    public void setMakeOrder(boolean fag) {
        this.isMakeOrder = fag;
    }

    @Override
    public void setTakeOrder(boolean fag) {
        this.isTakeOrder = fag;
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

}
