package com.company;

public class Main {

    public static void main(String[] args) {
	Velocita v = new Velocita();
    v.setVelocitaM(10);
    double vel = v.getVelocita();
    System.out.println("Velocità in m/s: "+vel);
    v.setVelocitaKm(vel);
    vel = v.getVelocita();
    System.out.println("Velocità in Km/h: "+vel);
    }
}
