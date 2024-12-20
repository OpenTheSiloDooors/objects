public class computer {
String type; //declare variables
int speed;
int ports;
public computer(String type, int speed, int ports){ //current object
    this.type=type;
    this.speed=speed;
    this.ports=ports;
}
public void upgrade(int newSpeed){ //modify objects
    speed=newSpeed;
}
public String toString (){ //print objects
    return "Computer is a "+type+"The speed is "+speed+"The number of ports is "+ports;
};
}
