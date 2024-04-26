package com.app.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialException;

import org.springframework.web.multipart.MultipartFile;

import com.app.model.Room;

public interface IRoomService {
	
	public Room addNewRoom(MultipartFile file, String roomType,BigDecimal roomPrice) throws IOException, SerialException, SQLException;

}
