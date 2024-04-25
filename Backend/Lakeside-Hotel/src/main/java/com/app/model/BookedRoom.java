package com.app.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class BookedRoom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookingId;
	
	@Column(name = "check_in")
	private LocalDate checkInDate;
	
	@Column(name = "check_out")
	private LocalDate checkOutDate;
	
	@Column(name = "guest_fullname")
	private String guestFullName;
	
	@Column(name = "guest_email")
	private String guestEmail;
	
	@Column(name = "childrens")
	private int numOfChildren;
	
	@Column(name = "adults")
	private int numOfAdults;
	
	@Column(name = "total_guest")
	private int totalNumOfGuest;
	
	@Column(name = "confirmation_code")
	private String bookingConfirmCode;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "room_id")
	private Room room;
	
	public void calculateTotalNumOfGuests() {
		this.totalNumOfGuest = this.numOfAdults + numOfChildren;
	}

	public void setNumOfChildren(int numOfChildren) {
		this.numOfChildren = numOfChildren;
		calculateTotalNumOfGuests();
	}

	public void setNumOfAdults(int numOfAdults) {
		this.numOfAdults = numOfAdults;
		calculateTotalNumOfGuests();
	}

	public void setBookingConfirmCode(String bookingConfirmCode) {
		this.bookingConfirmCode = bookingConfirmCode;
	}

	public BookedRoom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookedRoom(Long bookingId, LocalDate checkInDate, LocalDate checkOutDate, String guestFullName,
			String guestEmail, int numOfChildren, int numOfAdults, int totalNumOfGuest, String bookingConfirmCode,
			Room room) {
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

	public int getTotalNumOfGuest() {
		return totalNumOfGuest;
	}

	public void setTotalNumOfGuest(int totalNumOfGuest) {
		this.totalNumOfGuest = totalNumOfGuest;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public int getNumOfChildren() {
		return numOfChildren;
	}

	public int getNumOfAdults() {
		return numOfAdults;
	}

	public String getBookingConfirmCode() {
		return bookingConfirmCode;
	}

	@Override
	public String toString() {
		return "BookedRoom [bookingId=" + bookingId + ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate
				+ ", guestFullName=" + guestFullName + ", guestEmail=" + guestEmail + ", numOfChildren=" + numOfChildren
				+ ", numOfAdults=" + numOfAdults + ", totalNumOfGuest=" + totalNumOfGuest + ", bookingConfirmCode="
				+ bookingConfirmCode + ", room=" + room + "]";
	}
	
	
	

}
