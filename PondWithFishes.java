import java.util.ArrayList;
import java.util.*;
public class PondWithFishes extends Thread  {

    ArrayList ls=new ArrayList();
    public void addFishes(){
        for(int i=0;i<20;i++){
            if(i<10){
                ls.add('f');
            }
            else{
                ls.add('m');
            }
        }
    }
    public ArrayList getList() {
        return ls;
    }
    public static void main(String[] args) {
        int n = 5; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread object= new PondWithFishes();
            object.start();
        }
        
    }
}
