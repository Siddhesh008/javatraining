/*

Create a class “Room” which will hold the “height”, “width” and “breadth” of the room in three 
fields(variables). This class also has a method “volume()” to calculate the volume of this room

*/
class Room {
    int height;
    int width;
    int breadth;

    //Room(){}

    Room(int h, int w, int b){
        height = h;
        width = w;
        breadth = b;
    }

    int volume(){
        return height * width * breadth;
    }
}

public class Exercise6 {
public static void main(String args[])
{

Room r1 = new Room(1,2,3);
Room r2 = new Room(2,4,6);

System.out.println("The volume of room 1 is " + r1.volume());
System.out.println("The volume of room 2 is " + r2.volume());


}
}