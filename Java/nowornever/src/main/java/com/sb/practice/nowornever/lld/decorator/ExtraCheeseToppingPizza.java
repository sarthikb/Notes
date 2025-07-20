package com.sb.practice.nowornever.lld.decorator;

public class ExtraCheeseToppingPizza extends PizzaDecorator  {

    public ExtraCheeseToppingPizza(IPizza pizza) {
        super(pizza);
    }

    @Override
    public void description() {
        pizza.description();
        System.out.println( " :: with extra cheese");
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 50;
    }
}
