package week17.evening;

import java.util.*;

public class JavaMap {
    static List<Map<String, Long>> phoneBook = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int usersInPhoneBook = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < usersInPhoneBook; i++) {

            String name = scanner.nextLine();
            long phone = scanner.nextLong();
            scanner.nextLine();
            Map<String, Long> user = new HashMap<>();
            if ((phone + "").length() == 8 && !(phone + "").substring(0, 1).equals("0")) {
                user.put(name.toLowerCase(), phone);
            } else {
                System.out.println("your phone is not correct");
                phone = scanner.nextLong();
                user.put(name.toLowerCase(), phone);
            }

            phoneBook.add(user);
        }

        System.out.println(phoneBook);
        System.out.println( foundPerson(scanner.nextLine()));
        System.out.println(foundPerson(scanner.nextLine()));
        System.out.println(foundPerson(scanner.nextLine()));


        scanner.close();
    }

    private static String foundPerson(String name) {
        Map<String, Long> result = new HashMap<>();
        for (Map<String, Long> eachUser : phoneBook) {
            Long s = eachUser.get(name);
            if (s != null) {
                result = eachUser;
                break;
            }
        }

        return result.isEmpty() ? "Not Found" : result.toString();
    }
}
