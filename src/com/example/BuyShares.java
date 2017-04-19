package com.example;

/**
 * Created by bsheen on 4/19/17.
 */
public class BuyShares implements Runnable {

    private TraderService traderService;

    public BuyShares(TraderService traderService) {
        this.traderService = traderService;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Trade trade = traderService.buyShares("Brian", "ABC", 8, 27);
                System.out.println(trade);
            } catch (SharesException e) {
                System.out.println(e);
            }
            try {
                Thread.sleep(800L);
            } catch (InterruptedException e) {
                //do nothing
            }
        }
    }
}
