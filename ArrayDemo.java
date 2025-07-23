import java.util.*;


class Shirt{
    private int size;
    private int fit;
    private String color;
    private int cost;
    Shirt(){}
    Shirt(int fit,int size,String color, int cost){
        this.fit=fit;
        this.size=size;
        this.color=color;
        this.cost=cost;
    }
    public String toString(){
        return fit+"/"+size+"/"+color+"/"+cost;
    }
}
public class ArrayDemo {
    public static void main(String[] args) {
        int ar[]=new int[3];
        ar[0]=10;
        ar[1]=20;
        ar[2]=30;
        System.out.println(ar[1]);
        Shirt sh[]=new Shirt[3];
        sh[0]=new Shirt(40,45,"yellow",6000);
        sh[1]=new Shirt(50,90,"Blue",900);
        System.out.println(sh[1].toString());
    }
    
}
