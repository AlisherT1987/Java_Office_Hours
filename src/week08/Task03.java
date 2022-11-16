package week08;

public class Task03 {
    /*
    Write a program that accepts String array.Count how many names have the same first and last letter

                Input : "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"

                Output : 4
     */
    public static void main(String[] args) {
        String[] arr = {"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"};
        System.out.println(countSameFirstAndLast(arr));
    }

    public static int countSameFirstAndLast(String[] arr){
        int count = 0;
        /*
        I need to loop through the array and check each word if it has first and last char is same
        use charAt(index)  ----- first index 0 , last index str.length()-1
         */
       for (String each : arr) {
            each = each.toLowerCase();  // we make it case insensitive
            if(each.charAt(0) == each.charAt(each.length()-1)){
                count++;
            }
        }
        return count;
    }

}
