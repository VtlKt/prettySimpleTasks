package pl.vitalikot.prettySimpleTasks.sortingNumbers;

import java.util.ArrayList;

public class CustomerReq {

    private ArrayList<Integer> numbers;
    private Order order;

    public CustomerReq() {
    }

    public CustomerReq(ArrayList<Integer> numbers, Order order) {
        this.numbers = numbers;
        this.order = order;
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "CustomerReq{" +
                "numbers=" + numbers +
                ", order=" + order +
                '}';
    }
}
