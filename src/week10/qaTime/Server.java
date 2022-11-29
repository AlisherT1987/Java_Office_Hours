package week10.qaTime;

import java.time.LocalDate;

public class Server {
    public String name;   // instance variables: means belongs to every single object
    public int employeeID;
    public double hourlyRate;
    boolean fullTime;
    LocalDate hire_date;
    public static String restaurantName = "Cydeo"; // static field same for all the objects of this class

    // free default constructor comes if you don't have any constructor that you defined
    // Constructors are special method : what is difference between regular methods and constructors
    //  to create object, we call with new keyword,


    public Server() {   // default constructor you need to define
    }

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime, LocalDate hire_date) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
        this.hire_date = hire_date;
    }

    public void takeOrder(){   // No return type, No parameter, instance method
        System.out.println(this.name+" is taking an order");
    }
    public static void companyName(){  // No return type, No parameter, static method
        System.out.println("Everyone works for "+restaurantName);
    }

    @Override
    public String toString() {
        String str = "";
        if(fullTime){
            str = "Full-time";
        }else{
            str = "Part-time";
        }
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + str +
                ", hire_date=" + hire_date +
                '}';
    }
}
