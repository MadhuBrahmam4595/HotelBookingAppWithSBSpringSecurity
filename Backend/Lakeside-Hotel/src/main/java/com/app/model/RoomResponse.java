package com.app.model;

import java.math.BigDecimal;
import java.sql.Blob;
import org.apache.tomcat.util.codec.binary.Base64;
import java.util.List;

public class RoomResponse {
	
	private Long id;
	private String roomType;
	private BigDecimal roomPrice;
	private boolean isBooked = false;
	private List<BookingResponse> bookings;
	private String photo;
	
	public RoomResponse(Long id, String roomType, BigDecimal roomPrice) {
		super();
		this.id = id;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
	}

	public RoomResponse(Long id, String roomType, BigDecimal roomPrice, boolean isBooked,
			List<BookingResponse> bookings, byte[] photoBytes) {
		super();
		this.id = id;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
		this.isBooked = isBooked;
		this.bookings = bookings;
		this.photo = photoBytes != null ? Base64.encodeBase64String(photoBytes) : null;
	}
	
}
