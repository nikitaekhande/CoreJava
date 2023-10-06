package com.tnsif.daysix.singleinheritance;

public class StudentAssessment extends Student {
	
	private float ssScore;
	private float ttScore;
	public float getSsScore() {
		return ssScore;
	}
	public void setSsScore(float ssScore) {
		this.ssScore = ssScore;
	}
	public float getTtScore() {
		return ttScore;
	}
	public void setTtScore(float ttScore) {
		this.ttScore = ttScore;
	}
	
	public StudentAssessment() {
		
		super();
		
	}
	/**
	 * @param uID
	 * @param name
	 * @param stream
	 * @param batch
	 * @param batchNo
	 * @param contactNo
	 * @param score
	 */
	public StudentAssessment(String uID, String name, String stream, String batch, String batchNo, long contactNo,
		float score,	 float ttScore,float ssScore) {
		super(uID, name, stream, batch, batchNo, contactNo ,score);
		// TODO Auto-generated constructor stub
		
		this.ttScore = ttScore;
		this.ssScore = ssScore;
	   }
	
	  protected void  calculateFinalscore() {
		  
		  score = ttScore*0.8f+ssScore*0.2f;
		  System.out.println(score);
				  
	 }
	@Override     
	public String toString() {
		return "StudentAssessment [ssScore=" + ssScore + ", ttScore=" + ttScore + ", getSsScore()=" + getSsScore()
				+ ", getTtScore()=" + getTtScore() + "]";
	}
	  
	
	
	

}
