public abstract class Actor implements ActorBehavior {
    protected final String name;
    public Actor(String name) {
        this.name = name;
    }
    public abstract String getName();

    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

}
