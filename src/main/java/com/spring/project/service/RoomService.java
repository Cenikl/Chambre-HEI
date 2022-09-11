package com.spring.project.service;

import com.spring.project.model.Room;
import com.spring.project.model.enumeration.RoomStatus;
import com.spring.project.repository.RoomRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class RoomService {

    private final RoomRepository roomRepository;

    public List<Room> getAll() {return roomRepository.findAll();}

    public Optional<Room> getRoomById(String roomId) {return roomRepository.findById(roomId);}

    public Optional<Room> getRoomByStatus(RoomStatus roomStatus){return roomRepository.findByStatusLike(roomStatus);}

    public void deleteRoomById(String roomId){roomRepository.deleteById(roomId);}

    public Room createNewRoom(Room room){return roomRepository.save(room);}

    public Room updateRoom(RoomStatus status,String id){return roomRepository.updateRoom(status,id);}
}
