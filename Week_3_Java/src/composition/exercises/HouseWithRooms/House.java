package composition.exercises.HouseWithRooms;

import javax.swing.tree.RowMapper;

/**
 1. Create class Room with fields: length, width.
 2. Add method getArea() in Room.
 3. Create class House that HAS-A Room.
 4. Add method printRoomArea() in House to delegate to Room.
 */
public class House {
    private String name;
    private Room room;

    public House(String name, Room room) {
        this.name = name;
        this.room = room;
    }

    public void printRoomArea() {
        System.out.println("Area of " + this.name + " = " + room.getArea());
    }
}