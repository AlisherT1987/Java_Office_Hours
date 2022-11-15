package week07.qaTime;

public class QATimeTasks {
    public static void main(String[] args) {
        String[][] items = {   // holding 1 dimensional array objects
                {"Apple", "Banana", "Grape", "Avocado"},  // String objects
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        // items[0] ---- which element it points : {"Apple", "Banana", "Grape", "Avocado"}

//        System.out.println(items[0].length);
//        for (int i = 0; i < items[0].length; i++) {
//            System.out.println(items[0][i]);
//        }

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {  // i = 0, i=1
                System.out.print(items[i][j]+"\t");
            }
            System.out.println();
        }

        for (int i = 0; i < items.length; i++) {
            for (int j = items[i].length-1; j >= 0;  j--) {  // i = 0, i=1
                System.out.print(items[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
