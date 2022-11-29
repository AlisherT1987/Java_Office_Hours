package week10.qaTime;

public class Chef {
    public String name;   // instance variables: means belongs to every single object
    public int employeeID;
    public double hourlyRate;
    boolean fullTime;

    public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void makeOrder(){   // No return type, No parameter, instance method
        System.out.println(this.name+" is making an order");
    }
    @Override
    public String toString() {
        String str = "";
        if(fullTime){
            str = "Full-time";
        }else{
            str = "Part-time";
        }
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + str +
                '}';
    }
}
