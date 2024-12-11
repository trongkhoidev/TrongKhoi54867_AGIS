/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyentrongkhoi_5867.Exercise9_Interface;

/**
 *
 * @author Admin
 */
public class MeetingRoom extends Room implements IRoom {
    private int capacity;

    public MeetingRoom(int capacity, String id, String name, double baseCost) {
        super(id, name, baseCost);
        this.capacity = capacity;
    }
    
    public MeetingRoom(){}

    public MeetingRoom(int capacity) {
        this.capacity = capacity;
    }
    
    @Override
    public double calculateCost(){
        double cost = baseCost;
        if(capacity > 50){
            cost += baseCost*0.2;
        }
        return cost;
    }
    
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Capacity: " + capacity);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "Room [ID=" + id + ", Name=" + name + ", BaseCost=" + baseCost + "]";
    }

    
}
