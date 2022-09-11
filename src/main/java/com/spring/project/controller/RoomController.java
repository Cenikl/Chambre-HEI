package com.spring.project.controller;

import com.spring.project.model.Room;
import com.spring.project.model.enumeration.RoomStatus;
import com.spring.project.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@CrossOrigin
public class RoomController {

    private final RoomService roomService;

    @GetMapping("/rooms")
    public List<Room> getRooms(){
        return roomService.getAll();
    }
    @GetMapping("/room/{roomId}")
    public Optional<Room> getRoomById(@PathVariable String roomId){
        return roomService.getRoomById(roomId);
    }
    @GetMapping("/rooms/{status}")
    public Optional<Room> getRoomByStatus(@PathVariable RoomStatus roomStatus){
        return roomService.getRoomByStatus(roomStatus);
    }

    @DeleteMapping("/room/{roomId}")
    public void deleteRoomById(@PathVariable String roomId){
        roomService.deleteRoomById(roomId);
    }

    @PostMapping("/rooms")
    public Room createRoom(@RequestBody Room toCreate){
        return roomService.createNewRoom(toCreate);
    }

    @PatchMapping("/room/{roomId}")
    @Transactional
    public Room updateRoomStatus(@PathVariable String roomId,@RequestParam RoomStatus status){
        return roomService.updateRoom(status,roomId);
    }

}
