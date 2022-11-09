package edu.parinya.softarchdesign.structural;
// Please DO NOT MODIFY THIS FILE


public class Surgeon extends HealthcareWorker {
    public Surgeon(String name, double price) {
        super(name, price);
    }

    @Override
    public void service() {
        System.out.println(this.getName() + " performs a surgery.");
    }
}