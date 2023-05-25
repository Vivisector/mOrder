package ru.dz;

public class Program {

    /**
     * TODO: Домашняя работа (программа 1),
     * оптимизировать приложение в соответствии с принципом SOLID - SRP
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Укажите заказ:");

        OrderInputHandler inputHandler = new OrderInputHandler();
        Order order = inputHandler.getOrderFromConsole();

        OrderJsonSerializer jsonSerializer = new OrderJsonSerializer();
        jsonSerializer.saveOrderToJson(order);
    }
}

