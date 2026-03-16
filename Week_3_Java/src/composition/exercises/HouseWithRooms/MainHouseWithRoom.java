package composition.exercises.HouseWithRooms;

public class MainHouseWithRoom {
    public static void main(String[] args) {
        Room room = new Room(10, 20);
        House house = new House("Carles's House", room);

        house.printRoomArea();
    }
}
