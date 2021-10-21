package com.createcosmos.action.resource;

import java.util.concurrent.ThreadLocalRandom;


public class App {


    public void run() {
        int min = 1;
        int max = 1000;
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

        System.out.println("Running app: " + randomNum);
    }
}
