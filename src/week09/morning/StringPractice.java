package week09.morning;

public class StringPractice {
    public static void main(String[] args) {

        // get me only numbers as Double
        String result = "some more words 16,120 results";
        String resultAsNumbersString = "";
        for(char each : result.toCharArray()){
            if(Character.isDigit(each)){
                resultAsNumbersString+=each;
            }
        }
        System.out.println("resultAsNumbersString = " + resultAsNumbersString);

        Double resultAsNumbers = Double.valueOf(resultAsNumbersString);

        System.out.println("resultAsNumbers = " + resultAsNumbers);



    }
}
