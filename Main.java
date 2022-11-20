import java.util.ArrayList;
import java.util.Random;
import java.util.*;
public class Main extends Thread {

        Random r= new Random();
        PondWithFishes obj=new PondWithFishes();
        ArrayList list = obj.getList();
        //if two random fishes meet
    synchronized void meet(ArrayList list ){
        while(list.size()!=0){
            int x=r.nextInt(20);
            int y=r.nextInt(20);
            // if both are male fishes
            if(list.get(x)=="m" && list.get(y)=="m"){
                list.remove(x);
                list.remove(y);
                System.out.println("Both fishes are killed");
            }
            //if both fishes are female
            if(list.get(x)=="f"&& list.get(y)=="f"){
                list.remove(x);
                System.out.println("Any one of female fish is killed");
            }
            //if one male and second female
            if((list.get(x)=="f"&& list.get(y)=="m") || (list.get(y)=="f"&& list.get(x)=="m")){
                int g1 = r.nextInt(2);
                int g2=r.nextInt(2);
                if(g1==0){
                    list.add("f");
                }
                else{
                    list.add("m");
                }
                if(g2==0){
                    list.add("f");
                }
                else{
                    list.add("m");
                }
                System.out.println("two child fishes are added");
            }
        }
        public void run() {
            // TODO Auto-generated method stub
            meet(list);
        }

    }
}