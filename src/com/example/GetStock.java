package com.example;

/**
 * Created by bsheen on 4/19/17.
 */
public class GetStock implements Runnable {
    private TraderService traderService;

    public GetStock(TraderService traderService) {
        this.traderService = traderService;
    }

    @Override
    public void run() {
        while(true){
            Stock stock = traderService.getStock("ABC");
            System.out.println(stock);
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                //do nothing
            }
        }
    }
}
