package com.example;


/**
 * Created by bsheen on 4/19/17.
 */
public class AddShares implements Runnable {

    private TraderService traderService;

    public AddShares(TraderService traderService) {
        this.traderService = traderService;
    }

    @Override
    public void run() {
        while(true){
            traderService.addShares("ABC",10,30);
            System.out.println("after add " + traderService);
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                //do nothing
            }
        }
    }
}
