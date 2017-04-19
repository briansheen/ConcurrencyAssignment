package com.example;

public class Main {

    public static void main(String[] args) {
        TraderService traderService = new TraderServiceImpl();
        AddShares addShares = new AddShares(traderService);
        GetStock getStock = new GetStock(traderService);

        new Thread(addShares).start();
        new Thread(getStock).start();

    }


}
