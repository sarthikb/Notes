package com.sb.practice.nowornever.lld.decorator;

public abstract class PizzaDecorator implements IPizza{

    protected IPizza pizza;

    public PizzaDecorator(IPizza pizza) {
        this.pizza = pizza;
    }
     // Decorators can add new functionality to the pizza
    @Override
    public void description() {
        pizza.description();
    }

    @Override
    public int getCost() {
        return pizza.getCost();
    }
}
