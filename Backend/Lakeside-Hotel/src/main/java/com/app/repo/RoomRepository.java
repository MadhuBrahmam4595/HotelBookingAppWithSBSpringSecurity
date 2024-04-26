package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Room;

public interface RoomRepository extends JpaRepository<Room, Long>{

}
