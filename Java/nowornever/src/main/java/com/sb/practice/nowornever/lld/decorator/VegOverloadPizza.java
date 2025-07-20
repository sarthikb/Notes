package com.sb.practice.nowornever.lld.decorator;

public class VegOverloadPizza extends PizzaDecorator{
    public VegOverloadPizza(IPizza pizza) {
        super(pizza);
    }

    @Override
    public void description() {
        pizza.description();
        System.out.println( " :: with Veg overload");
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 55;
    }
}
