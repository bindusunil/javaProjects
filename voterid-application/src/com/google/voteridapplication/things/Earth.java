package com.google.voteridapplication.things;
import com.gooogle.voteridapplication.constant.Days;
import com.gooogle.voteridapplication.constant.Months;
import com.gooogle.voteridapplication.constant.Places;
import com.gooogle.voteridapplication.constant.Planets;


public class Earth {
	public int numOfStates;
    public int population;
    public String countryName;
    public boolean isRevolving;
    public Days days;
    
    @Override
    public boolean equals(Object obj) {
    	if(obj==null||this==null)
    		return false;
    	if(!(obj instanceof Earth))
    		return false;
    	Earth earth = (Earth) obj;
    	if(this.numOfStates!=earth.numOfStates
    			||this.population!=earth.population
    			||!(this.countryName.equals(earth.countryName))
    			||this.isRevolving!=earth.isRevolving)
    		return false;
    	if(!(this.days.equals(earth.days)))
    		return false;
    	return true;
    }
    @Override
    public String toString() {
    	return "Earth---->"+"numofstates: "+this.numOfStates+" "+"population: "+this.population+" "+"country name: "+this.countryName+" "+"isrevolving: "+this.isRevolving;
    }
    @Override
    public int hashCode() {
    	return this.numOfStates;
    }
}
