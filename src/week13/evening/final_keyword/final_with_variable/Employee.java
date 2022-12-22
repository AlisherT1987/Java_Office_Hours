package week13.evening.final_keyword.final_with_variable;

import java.time.LocalDate;

public class Employee {

    private final String birthDay;
    private final String gender;
    private String name;

    public String getBirthDay() {
        return birthDay;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name, String birthDay, String gender) {
        this.birthDay = birthDay;
        this.gender=gender;
    }
}
