public class UseCase2RoomInitialization {
public static void main(String[] args) {
Room singleRoom=new SingleRoom();
Room doubleRoom=new DoubleRoom();
Room suiteRoom=new SuiteRoom();
int singleAvailability=5;
int doubleAvailability=3;
int suiteAvailability=2;
System.out.println(&quot;Hotel Room Initialization&quot;);
System.out.println();
System.out.println(&quot;Single Room:&quot;);
singleRoom.displayRoomDetails();
System.out.println(&quot;Available: &quot;+singleAvailability);
System.out.println();
System.out.println(&quot;Double Room:&quot;);
doubleRoom.displayRoomDetails();
System.out.println(&quot;Available: &quot;+doubleAvailability);
System.out.println();
System.out.println(&quot;Suite Room:&quot;);
suiteRoom.displayRoomDetails();
System.out.println(&quot;Available: &quot;+suiteAvailability);
}
}
