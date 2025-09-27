package org.example;

public class Main {
    public static void main(String[] args) {
        AsiaCar car = new SimpleAsiaCar();
        Navigator navigator = new Navigator();
        EuroCar euroCar = new CarAdapter(car);
        navigator.navigate(euroCar);


    }
}