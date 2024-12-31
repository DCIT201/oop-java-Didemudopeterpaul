package com.otabil;

public class Main{
    public static void main(String[] args){

        System.out.println("Hello, this is a new java project. Guess what? It is an assignment. Hahaha let's go");

        Car car = new Car("Range Rover", "G-Wagon", 50, true);
        Motorcycle motorcycle = new Motorcycle("Royal", "Apsonic", 30, 5);
        Truck truck = new Truck("Volvo", "Hyundai Mighty", 70, 15);

        // instance or object of rental agency and customer
        RentalAgency agency = new RentalAgency();
        Customer customer = new Customer("Mr. Didemudo Peter-Paul");

        // I am adding vehicles to agency
        agency.addVehicle(car);
        agency.addVehicle(motorcycle);
        agency.addVehicle(truck);

        // Rent a car
        agency.rentVehicle("Range Rover", customer, 5);

        // Return the car
        agency.returnVehicle("Range Rover");



    }
}