package com.sb.practice.nowornever.lld.decorator;

public class BasePizza implements IPizza  {
    @Override
    public void description() {
        System.out.println("Base Pizza");
    }

    @Override
    public int getCost() {
        System.out.println("Cost of Base Pizza");
        return 100;
    }
}
