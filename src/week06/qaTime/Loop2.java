package week06.qaTime;

public class Loop2 {
    public static void main(String[] args) {


        for (int i = 0 ; i < 10 ; i++){      // each rows
          for(int j = 0 ; j < 10 ; j++ ){    // each columns
                System.out.print(" * ");
            }
            System.out.println();
        }

        String str = "aabbccccd";

        String unique = "";

        for(int i =0  ; i < str.length() ; i++ )  {
            char each = str.charAt(i);

            for(int j = 0 ; j < str.length() ; j++){

                if(each == str.charAt(j)){

                }


            }

        }



    }
}
