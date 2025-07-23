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