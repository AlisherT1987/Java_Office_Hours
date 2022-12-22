package week13.evening.final_keyword.final_with_method;

public class JuniorTester1 extends SeniorTester{

    @Override
    public void junior1() {
        System.out.println("Junior1");
    }

    @Override
    public void junior2() {
        super.junior2();
    }

    @Override
    public void junior3() {
        super.junior3();
    }
}
