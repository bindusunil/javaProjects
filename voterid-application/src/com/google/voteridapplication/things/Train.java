package com.google.voteridapplication.things;

public class Train {
     public String trainName;
     public String from;
     public String to;
     public int trainNumber;
     public boolean isAvailable;
     
     @Override
     public boolean equals(Object obj) {
         if(obj==null||this==null)
        	 return false;
         if(!(obj instanceof Train))
        	 return false;
         Train train = (Train) obj;
         if(!(this.trainName.equals(train.trainName))
        		 ||!(this.from.equals(train.from))
        		 ||!(this.to.equals(train.to))
        		 ||this.trainNumber!=train.trainNumber
        		 ||this.isAvailable!=train.isAvailable)
        	 return false;
    	 return true;
}
}