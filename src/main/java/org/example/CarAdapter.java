package org.example;

public class CarAdapter implements EuroCar {
    AsiaCar asiaCar;
    public CarAdapter(AsiaCar asiaCar) {
        this.asiaCar = asiaCar;
    }
    @Override
    public void getPower() {
        asiaCar.getPower();
    }
}
