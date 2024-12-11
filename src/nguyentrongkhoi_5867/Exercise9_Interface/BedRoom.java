
package nguyentrongkhoi_5867.Exercise9_Interface;

public class BedRoom extends Room implements IRoom {
    private int numberOfBeds;

    public BedRoom(int numberOfBeds, String id, String name, double baseCost) {
        super(id, name, baseCost);
        this.numberOfBeds = numberOfBeds;
    }
    
    public BedRoom(){}

    public BedRoom(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }
    
    @Override
    public double calculateCost(){
        double cost = baseCost;
        if(numberOfBeds > 3){
            cost += baseCost*0.1;
        }
        return cost;
    }
    
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Number of Bed: " + numberOfBeds);
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }
    
    @Override
    public String toString() {
        return "Room [ID=" + id + ", Name=" + name + ", BaseCost=" + baseCost + "]";
    }

    
}
