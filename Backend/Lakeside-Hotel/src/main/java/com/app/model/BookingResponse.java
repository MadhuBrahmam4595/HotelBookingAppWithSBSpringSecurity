package com.app.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;

public class BookingResponse {
	
private Long bookingId;
	
	private LocalDate checkInDate;
	
	private LocalDate checkOutDate;
	
	private String guestFullName;
	
	private String guestEmail;
	
	private int numOfChildren;
	
	private int numOfAdults;
	
	private int totalNumOfGuest;
	
	private String bookingConfirmCode;
	
	private RoomResponse room;

	public BookingResponse(Long bookingId, LocalDate checkInDate, LocalDate checkOutDate, String bookingConfirmCode) {
		super();
		this.bookingId = bookingId;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.bookingConfirmCode = bookingConfirmCode;
	}

	public BookingResponse(Long bookingId, LocalDate checkInDate, LocalDate checkOutDate, String guestFullName,
			String guestEmail, int numOfChildren, int numOfAdults, int totalNumOfGuest, String bookingConfirmCode,
			RoomResponse room) {
		super();
		this.bookingId = bookingId;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.guestFullName = guestFullName;
		this.guestEmail = guestEmail;
		this.numOfChildren = numOfChildren;
		this.numOfAdults = numOfAdults;
		this.totalNumOfGuest = totalNumOfGuest;
		this.bookingConfirmCode = bookingConfirmCode;
		this.room = room;
	}

	public BookingResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public LocalDate getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(LocalDate checkInDate) {
		this.checkInDate = checkInDate;
	}

	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public String getGuestFullName() {
		return guestFullName;
	}

	public void setGuestFullName(String guestFullName) {
		this.guestFullName = guestFullName;
	}

	public String getGuestEmail() {
		return guestEmail;
	}

	public void setGuestEmail(String guestEmail) {
		this.guestEmail = guestEmail;
	}

	public int getNumOfChildren() {
		return numOfChildren;
	}

	public void setNumOfChildren(int numOfChildren) {
		this.numOfChildren = numOfChildren;
	}

	public int getNumOfAdults() {
		return numOfAdults;
	}

	public void setNumOfAdults(int numOfAdults) {
		this.numOfAdults = numOfAdults;
	}

	public int getTotalNumOfGuest() {
		return totalNumOfGuest;
	}

	public void setTotalNumOfGuest(int totalNumOfGuest) {
		this.totalNumOfGuest = totalNumOfGuest;
	}

	public String getBookingConfirmCode() {
		return bookingConfirmCode;
	}

	public void setBookingConfirmCode(String bookingConfirmCode) {
		this.bookingConfirmCode = bookingConfirmCode;
	}

	public RoomResponse getRoom() {
		return room;
	}

	public void setRoom(RoomResponse room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "BookingResponse [bookingId=" + bookingId + ", checkInDate=" + checkInDate + ", checkOutDate="
				+ checkOutDate + ", guestFullName=" + guestFullName + ", guestEmail=" + guestEmail + ", numOfChildren="
				+ numOfChildren + ", numOfAdults=" + numOfAdults + ", totalNumOfGuest=" + totalNumOfGuest
				+ ", bookingConfirmCode=" + bookingConfirmCode + ", room=" + room + "]";
	}
	
	

}
