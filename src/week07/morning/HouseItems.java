package week07.morning;

public class HouseItems {
    public String name,color;  // instance variables belongs to each object
    public int amount;

    public String toString(){
        return "name : "+name+"\ncolor : "+color+"\namount : "+amount;
    }

    // setInfo method for assigning values in one shot
    public void setInfo(String name,String color, int amount){
        this.name=name;
        this.color=color;
        this.amount=amount;
    }



}
