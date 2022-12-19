package week11.evening.encapsulation;

public class Student {

    private String name;
    private   int age;


    public Student(String name, int age) {
      //  this.name = name;
        setName(name);
      //  this.age = age;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if (age<0){
            System.err.println("you can not use the age smaller than 0");
            System.exit(0);
        }
        this.age = age;
    }

    public void setName(String name) {

       boolean isValid= checkTheName(name);
       if (!isValid){
           System.err.println("you can not use that name with digit");
           System.exit(0);
       }

        this.name = name;
    }



    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }











    private boolean checkTheName(String name) {
        boolean isValid=true;

        for (char c : name.toCharArray()) {
            if (Character.isDigit(c)){
                isValid=false;
                break;
            }
        }
        return isValid;
    }
}
