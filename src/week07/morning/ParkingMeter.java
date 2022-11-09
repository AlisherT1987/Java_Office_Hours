package week07.morning;

public class ParkingMeter {
    public int timeLeft, maxTime;
    public void setInfo(int x, int y){
        timeLeft=x;
        maxTime=y;
    }
    public boolean add(int change){ // quarter,dime,nickel,penny
        boolean flag = false;
        //logic
        if(change==25){
            if(timeLeft+30>maxTime){
                timeLeft=maxTime;
            }else{
                timeLeft+=30;
            }
            flag=true;
        }
        return flag;
    }

    public void tick(){
        if(timeLeft>0){
            timeLeft-=1;
        }
    }

    public boolean isExpired(){
        return (timeLeft == 0); // if timeleft equals to zero it will return true
    }


}
