import java.util.ArrayList;

public class horseWrapper {
    public static void main(String[] args){
        ArrayList stable=new ArrayList<>(); //make new array list
Horse Juan=new Horse("Juan",2005); //make horse
stable.add(Juan); //store horse
Horse horse1=new Horse("Jean",2005); //make horse1
stable.add(horse1); //store horse1
horse1=new Horse("Bagel",2010); //make horse2
stable.add(horse1); //store horse2
for (int x=0;x<stable.size();x++){ //go through all horses
System.out.println(stable.get(x).toString()); //print all horses
}
    }
}