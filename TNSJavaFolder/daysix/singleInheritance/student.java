package com.tnsif.daysix.singleinheritance;

public class Student {
	
	private String UID;
	
	private String name;
	private String stream;
	private String batch;
	private String batchNo;
	
	private static String collegeName;
	private static String ssTrainner;
	private static String ttTrainner;
	private long contactNo;
	protected float score;
	
	public Student() {
		
		super();
	}

	public Student(String uID, String name, String stream, String batch, String batchNo, long contactNo, float score) {
		super();
		UID = uID;
		this.name = name;
		this.stream = stream;
		this.batch = batch;
		this.batchNo = batchNo;
		this.contactNo = contactNo;
		this.score = score;
	}

	public String getUID() {
		return UID;
	}

	public void setUID(String uID) {
		UID = uID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public static String getCollegeName() {
		return collegeName;
	}

	public static void setCollegeName(String collegeName) {
		Student.collegeName = collegeName;
	}

	public static String getSsTrainner() {
		return ssTrainner;
	}

	public static void setSsTrainner(String ssTrainner) {
		Student.ssTrainner = ssTrainner;
	}

	public static String getTtTrainner() {
		return ttTrainner;
	}

	public static void setTtTrainner(String ttTrainner) {
		Student.ttTrainner = ttTrainner;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}
	
	
     
	
}


