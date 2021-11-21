package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	Telecomando telecomando = new Telecomando(1,0);
    boolean sT = telecomando.getOnOff();
    if(sT) {
        System.out.println("La tv è accesa");
    }
    else {
        System.out.println("La tv è spenta");
        sT = true;
        telecomando.setOnOff(sT);
        System.out.println("La tv è accesa");
    }
    int c = telecomando.getCanale();
    System.out.println("La tv è sul canale: "+c);
    Random rnd = new Random();
    c = rnd.nextInt(500);
    telecomando.setCanale(c);
    c = telecomando.getCanale();
    System.out.println("La tv è sul canale: "+c);
    int v = telecomando.getVolume();
    System.out.println("Volume: "+v);
    v = rnd.nextInt(101);
    telecomando.setVolume(v);
    v = telecomando.getVolume();
    System.out.println("Volume: "+v);
    sT = telecomando.getOnOff();
    if(sT)
    {
        sT = false;
        telecomando.setOnOff(sT);
        System.out.println("La tv è spenta");
    }
    }
}
