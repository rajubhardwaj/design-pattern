package creational.builder;

public class BuilderLunchOrderDemo {

    public static void main(String[] args) {
        LunchOrder lunchOrder = new LunchOrder.Builder().bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey").build();
        System.out.println(lunchOrder);

        LunchOrder1 lunchOrder1 = new LunchOrderBuilder().withBread("Wheat").withCondiments("Lettuce").withDressing("Mayo").withMeat("Turkey").build();
        System.out.println(lunchOrder1);
    }

}
