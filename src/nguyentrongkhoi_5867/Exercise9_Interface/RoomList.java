/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyentrongkhoi_5867.Exercise9_Interface;

import java.util.ArrayList;
import java.util.Scanner;

public class RoomList {
    ArrayList<Room> roomList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public void addRoom(Room room){
        if(room instanceof MeetingRoom){
            System.out.println("Enter ID: ");
            String id = sc.nextLine();
            room.setId(id);
            System.out.println("Enter Name: ");
            String name = sc.nextLine();
            room.setName(name);
            System.out.println("Enter base Cost: ");
            double baseCost = sc.nextDouble();
            room.setBaseCost(baseCost);
            System.out.println("Enter capacity: ");
            int capacity = sc.nextInt();
            ((MeetingRoom) room).setCapacity(capacity);
            roomList.add(room);
        } else if(room instanceof BedRoom){
            sc.nextLine();
            System.out.println("Enter ID: ");
            String id = sc.nextLine();
            room.setId(id);
            System.out.println("Enter Name: ");
            String name = sc.nextLine();
            room.setName(name);
            System.out.println("Enter base Cost: ");
            double baseCost = sc.nextDouble();
            room.setBaseCost(baseCost);
            System.out.println("Enter number of bed: ");
            int numberOfBeds = sc.nextInt();
            ((BedRoom) room).setNumberOfBeds(numberOfBeds);
            roomList.add(room);
        }
    }
    
    
    public boolean updateRoomById(String id){
        for(Room room : roomList){
            if(room.getId().equals(id)){
                if(room instanceof MeetingRoom){
                    sc.nextLine();
                    System.out.println("Enter Name: ");
                    String name = sc.nextLine();
                    room.setName(name);
                    System.out.println("Enter base Cost: ");
                    double baseCost = sc.nextDouble();
                    room.setBaseCost(baseCost);
                    System.out.println("Enter capacity: ");
                    int capacity = sc.nextInt();
                    ((MeetingRoom) room).setCapacity(capacity);
                    System.out.println("Update successful");
                    return true;
                } else if(room instanceof BedRoom){
                    sc.nextLine();
                    System.out.println("Enter Name: ");
                    String name = sc.nextLine();
                    room.setName(name);
                    System.out.println("Enter base Cost: ");
                    double baseCost = sc.nextDouble();
                    room.setBaseCost(baseCost);
                    System.out.println("Enter number of bed: ");
                    int numberOfBeds = sc.nextInt();
                    ((BedRoom) room).setNumberOfBeds(numberOfBeds);
                    System.out.println("Update successful");
                    return true;
                }
            }
        }
        System.out.println("Not found ID!");
        return false;
    }
    
    public boolean deleteRoomById(String id){
        for(Room room : roomList){
            if(room.getId().equals(id)){
                roomList.remove(room);
                System.out.println("Delete successful");
                return true;
            }
        }
        System.out.println("Not found ID");
        return false;
    }
    
    public Room findRoomById(String id){
        for(Room room : roomList){
            if(room.getId().equals(id)){
                System.out.println("Find successful");
                room.displayDetails();
                return room;
            }
        }
        System.out.println("Not found ID");
        return null;
    }
    
    public void displayAllRooms(){
        for(Room room : roomList){
            room.displayDetails();
        }
    }
    
    public Room findMostExpensiveRoom(){
        double maxCost = 0;
        Room maxRoom = null;
        for (Room room : roomList) {
            double cost = room.calculateCost();
            if (cost > maxCost) {
                maxCost = cost;
                maxRoom = room;
            }
        }
        maxRoom.displayDetails();
        return maxRoom;
    }
    
    public void countRooms(){
        int countM = 0 ;
        int countB = 0 ;
        for(Room room : roomList){
            if(room instanceof MeetingRoom){
                countM++;
            } else{
                countB++;
            }
        }
        System.out.println("Quantity meeting room: " + countM);
        System.out.println("Quantity bed room: " + countB);
    }
}
