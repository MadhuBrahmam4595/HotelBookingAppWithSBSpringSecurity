package com.app.model;

import java.math.BigDecimal;
import java.sql.Blob;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.web.multipart.MultipartFile;

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

	public RoomResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public BigDecimal getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(BigDecimal roomPrice) {
		this.roomPrice = roomPrice;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}

	public List<BookingResponse> getBookings() {
		return bookings;
	}

	public void setBookings(List<BookingResponse> bookings) {
		this.bookings = bookings;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "RoomResponse [id=" + id + ", roomType=" + roomType + ", roomPrice=" + roomPrice + ", isBooked="
				+ isBooked + ", bookings=" + bookings + ", photo=" + photo + "]";
	}
	
	

	 
	
}
