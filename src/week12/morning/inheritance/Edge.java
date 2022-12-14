package week12.morning.inheritance;

public class Edge extends Browser{
    String newcolor = super.color;

//    Browser browser = new Browser();

    public static void main(String[] args) {
        String color = "red";
        System.out.println(color);
        System.out.println(new Browser("chrome",2.5).color);
    }
    public Edge (String name, double version){
        super(name,version);
//        System.out.println(super.color);

    }

    public void showColor(){
        System.out.println(super.color);
    }






}
