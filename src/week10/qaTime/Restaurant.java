package week10.qaTime;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    public String owner;
    public String location;
    public int numberOfStars;

    public ArrayList<Server> workCrew = new ArrayList<>(); // we declared an ArrayList object, never initialized it
    public ArrayList<Chef> leadCrew = new ArrayList<>();


    /*
    Important rule: Instance variables can be initialized at the same line or in the constructor
     */

    public Restaurant() {
  }

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
        this.leadCrew = new ArrayList<>();
    }

    public Restaurant(String owner, String location, int numberOfStars, ArrayList<Chef> chefs) {  // Constructor overloading
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
        this.leadCrew = chefs;
    }
    public void hireServer(Server server){
        this.workCrew.add(server);
    }
    public void hireServer(Server [] servers){ // there is NO DATA at the moment, it is all in my head
        this.workCrew.addAll(Arrays.asList(servers)); // when the data is ready I want to be ready for action
    }

    public void hireChefs(Chef [] chefs){ // there is NO DATA at the moment, it is all in my head
        this.leadCrew.addAll(Arrays.asList(chefs)); // when the data is ready I want to be ready for action
    }
    public void terminateChef(int employeeID){
//      for (Chef each : leadCrew){          //  java.util.ConcurrentModificationException
//          if(each.employeeID==employeeID){
//              leadCrew.remove(each);
//          }
//      }
     this.leadCrew.removeIf(chef -> chef.employeeID==employeeID);
    }

    public void terminateServer(int employeeID){
        this.workCrew.removeIf(server -> server.employeeID==employeeID);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +'\''+
                "number of servers = "+workCrew.size()+'\''+
                "number of chefs = "+leadCrew.size()+'\''+
                '}';
    }
}
