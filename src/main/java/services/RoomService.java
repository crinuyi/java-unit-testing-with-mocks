package services;

import models.Room;

import java.util.List;

public interface RoomService {
    void add(Room room);
    Room get(int id);
    void update(Room room);
    void delete(int id);
    List<Room> getFreeRooms();
}
