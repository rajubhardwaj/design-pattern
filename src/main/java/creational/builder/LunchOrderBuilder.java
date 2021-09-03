package creational.builder;

public class LunchOrderBuilder {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrderBuilder withBread(String bread){
        this.bread = bread;
        return  this;
    }

    public LunchOrderBuilder withCondiments(String condiments){
        this.condiments = condiments;
        return  this;
    }

    public LunchOrderBuilder withDressing(String dressing){
        this.dressing = dressing;
        return  this;
    }

    public LunchOrderBuilder withMeat(String meat){
        this.meat = meat;
        return  this;
    }

    public LunchOrder1 build(){
        return  new LunchOrder1(this.bread, this.condiments,this.dressing,this.meat);
    }
}
