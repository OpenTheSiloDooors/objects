import java.util.ArrayList;

public class computerWrapper {
    public static void main(String[] args){
        ArrayList<computer> library=new ArrayList<computer>();
        computer comp=new computer("laptop",67,10); //make comp
        library.add(comp); //store comp
        computer comp1=new computer("desktop",246,20); //make comp1
        library.add(comp1); //store comp1
        computer comp2=new computer("server",200,2); //make comp2
        library.add(comp2); //store comp2
        for (int x=0;x<library.size();x++){ //go through all comps
            System.out.println(library.get(x).toString()); //print all comps
            }
            comp=library.get(0);
            comp.upgrade(200);
            comp=library.get(2);
            comp.upgrade(306);
            //upgrade 

            for (int x=0;x<library.size();x++){
                System.out.println(library.get(x).toString());
                }
    }
}
