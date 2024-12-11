/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyentrongkhoi_5867.Exercise9_Interface;

/**
 *
 * @author Admin
 */
public abstract class Room implements IRoom {
    String id;
    String name;
    double baseCost;

    public Room(String id, String name, double baseCost) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
    }
    public Room(){}
    
    public abstract double calculateCost();
    
    public void displayDetails(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Base cost: " + baseCost);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }
    
    @Override
    public String toString() {
        return "Room [ID=" + id + ", Name=" + name + ", BaseCost=" + baseCost + "]";
    }

}
