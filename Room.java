public abstract class Room {
protected int numberOfBeds;
protected int squareFeet;
protected double pricePerNight;
public Room(int numberOfBeds,int squareFeet,double pricePerNight){
this.numberOfBeds=numberOfBeds;
this.squareFeet=squareFeet;
this.pricePerNight=pricePerNight;
}
public void displayRoomDetails(){
System.out.println(&quot;Beds: &quot;+numberOfBeds);
System.out.println(&quot;Size: &quot;+squareFeet+&quot; sqft&quot;);
System.out.println(&quot;Price per night: &quot;+pricePerNight);
}
}
