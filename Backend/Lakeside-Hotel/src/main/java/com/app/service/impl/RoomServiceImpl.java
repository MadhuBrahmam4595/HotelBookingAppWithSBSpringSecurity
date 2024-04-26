package com.app.service.impl;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.app.model.Room;
import com.app.repo.RoomRepository;
import com.app.service.IRoomService;

@Service
public class RoomServiceImpl implements IRoomService{
	
	private final RoomRepository roomRepository;
	
	
	public RoomServiceImpl(RoomRepository roomRepository) {
		super();
		this.roomRepository = roomRepository;
	}


	@Override
	public Room addNewRoom(MultipartFile file, String roomType, BigDecimal roomPrice) throws IOException, SerialException, SQLException {
		// TODO Auto-generated method stub
		Room room = new Room();
		room.setRoomType(roomType);
		room.setRoomPrice(roomPrice);
		
		if(!file.isEmpty()) {
			byte[] filebytes = file.getBytes();
			Blob fileblob = new SerialBlob(filebytes);
			room.setPhoto(fileblob);;
		}
		
		return roomRepository.save(room);
	}

}
