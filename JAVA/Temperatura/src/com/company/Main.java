package com.company;

public class Main {

    public static void main(String[] args) {
	Temperatura temp = new Temperatura(20, 0);
    System.out.println("Prima misurazione");
    double celsius = temp.getGradiC();
    System.out.println("Gradi Celsius: "+celsius);
    temp.setGradiC(celsius);
    temp.setGradiF(celsius);
    double fahrenheit = temp.getGradiF();
    System.out.println("Gradi Fahrenheit: "+fahrenheit);
    }
}
