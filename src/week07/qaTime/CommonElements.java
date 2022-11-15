package week07.qaTime;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 =  {1,2,3,4,5};
        int [] arr2 = {4,5,6,7,8};
        String commonElements1 = "";
        String commonElements2 = "";
// first with  for loop
        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]){
                    commonElements1 += " "+ arr1[i];
                }}}
        System.out.println("commonElements = " + commonElements1);

// for each loop
        for (int i : arr1) { // 4,
            for (int j  : arr2) { //4
                if (i == j  ){ // 4==4,
                    commonElements2 += " "+ i;  // 5
                }
            }

        }

        System.out.println("commonElements = " + commonElements2);

    }
}
