package com.spring.project.repository;

import com.spring.project.model.Room;
import com.spring.project.model.enumeration.RoomStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoomRepository extends JpaRepository<Room,String> {

    Optional<Room> findByStatusLike(RoomStatus status);

    @Query(value = "update room set status = ?1 where id like ?2",nativeQuery = true)
    Room updateRoom(RoomStatus status,String id);
}
