public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("buyer 1");
        Human human2 = new Human("buyer 2");
        Human human3 = new Human("buyer 3");
        Human human4 = new Human("buyer 4");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.acceptToMarket(human4);
        //market.update();
        while (!market.checkActorInMarket()) {
            market.update();
        }
    }
}
