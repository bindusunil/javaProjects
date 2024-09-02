package com.xworkz.app.Dto;

public class BirdsDto {
    private String birdName;
    private String birdColour;
    private boolean canFly;
    private int populationCount;
    
	public BirdsDto() {
		System.out.println("this is a no args constructer");
	}

	public BirdsDto(String birdName, String birdColour, boolean canFly, int populationCount) {
		super();
		this.birdName = birdName;
		this.birdColour = birdColour;
		this.canFly = canFly;
		this.populationCount = populationCount;
	}

	public String getBirdName() {
		return birdName;
	}

	public void setBirdName(String birdName) {
		this.birdName = birdName;
	}

	public String getBirdColour() {
		return birdColour;
	}

	public void setBirdColour(String birdColour) {
		this.birdColour = birdColour;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public int getPopulationCount() {
		return populationCount;
	}

	public void setPopulationCount(int populationCount) {
		this.populationCount = populationCount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birdColour == null) ? 0 : birdColour.hashCode());
		result = prime * result + ((birdName == null) ? 0 : birdName.hashCode());
		result = prime * result + (canFly ? 1231 : 1237);
		result = prime * result + populationCount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BirdsDto other = (BirdsDto) obj;
		if (birdColour == null) {
			if (other.birdColour != null)
				return false;
		} else if (!birdColour.equals(other.birdColour))
			return false;
		if (birdName == null) {
			if (other.birdName != null)
				return false;
		} else if (!birdName.equals(other.birdName))
			return false;
		if (canFly != other.canFly)
			return false;
		if (populationCount != other.populationCount)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BirdsDto [birdName=" + birdName + ", birdColour=" + birdColour + ", canFly=" + canFly
				+ ", populationCount=" + populationCount + "]";
	}
	
	
    
    
}
