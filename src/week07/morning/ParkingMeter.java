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


    public static void main(String[] args) {
        ParkingMeter parkMeter1 = new ParkingMeter();
        parkMeter1.setInfo(0,50);  // max Time is 50 minutes
        System.out.println("parkMeter1.isExpired() = " + parkMeter1.isExpired());

        System.out.println("parkMeter1.add(10) = " + parkMeter1.add(10));
        System.out.println("parkMeter1.isExpired() = " + parkMeter1.isExpired());

        System.out.println("parkMeter1.add(25) = " + parkMeter1.add(25));
        System.out.println("parkMeter1.timeLeft = " + parkMeter1.timeLeft);
        System.out.println("parkMeter1.add(25) = " + parkMeter1.add(25));
        System.out.println("parkMeter1.timeLeft = " + parkMeter1.timeLeft);
        
        while (!parkMeter1.isExpired()){
            parkMeter1.tick();
            System.out.println("parkMeter1.timeLeft = " + parkMeter1.timeLeft);
        }
    }


}
