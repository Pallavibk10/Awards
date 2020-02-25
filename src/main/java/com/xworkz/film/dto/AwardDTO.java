package com.xworkz.film.dto;





public class AwardDTO {
	private String AwardName;
	private String Spansor;
	private String Gift;
	
	public void AwardDTO() {
		System.out.println("Created \t"+this.getClass().getName());
	}
	

	public String getAwardName() {
		return AwardName;
	}


	public void setAwardName(String awardName) {
		AwardName = awardName;
	}


	public String getSpansor() {
		return Spansor;
	}


	public void setSpansor(String spansor) {
		Spansor = spansor;
	}


	public String getGift() {
		return Gift;
	}


	public void setGift(String gift) {
		Gift = gift;
	}


	@Override
	public String toString() {
		return "AwardDTO [AwardName=" + AwardName + ", Spansor=" + Spansor + ", Gift=" + Gift + "]";
	}

	
}

