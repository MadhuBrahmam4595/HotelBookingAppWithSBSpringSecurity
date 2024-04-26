package com.app.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.app.model.Room;
import com.app.model.RoomResponse;
import com.app.service.IRoomService;

@RestController
@RequestMapping("/rooms")
public class RoomController {

	private final IRoomService roomService;

	public RoomController(IRoomService roomService) {
		super();
		this.roomService = roomService;
	}
	
	//adding new room
	@PostMapping("add-room")
	public ResponseEntity<RoomResponse> addNewRoom(
			@RequestParam("photo") MultipartFile file,
			@RequestParam("roomType") String roomType,
			@RequestParam("roomPrice") BigDecimal roomPrice) throws SerialException, IOException, SQLException{
		Room savedRoom = roomService.addNewRoom(file, roomType, roomPrice);
		//System.out.println("savedRoom=>"+savedRoom.toString());
		RoomResponse response = new RoomResponse(savedRoom.getId(), roomType, roomPrice);
		//System.out.println("response=>"+response.toString());
		return ResponseEntity.ok(response);
	}
	
	
}
