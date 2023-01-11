package week16.morning;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfCharacters {
    /*
     Write a method that prints the frequency of each character from a String

    * Create a method that will accept a String and print out the frequency of every character in the String

Hint: use maps to keep track of the frequency. Go through the String using only one loop

Ex:
    Input: "apple"
    Output: Key "a" = Value "1"
    Map < Character , Integer >
            p = 2
            l = 1
            e = 1
     */

    public static void frequencyTest(String str){
        // I want to keep insertion order
        Map<Character,Integer> frequencyMap = new LinkedHashMap<>();
        for(Character each : str.toCharArray()){  // loop through string by turning it into an array
            // if frequencyMap contains the character, I will increase it's value by one, if not then I will add that key with a value 1 to the map
            if(frequencyMap.containsKey(each)){
                frequencyMap.put(each,frequencyMap.get(each)+1); // if frequencyMap contains the character, I will increase it's value by one
            }else {
                frequencyMap.put(each,1);// if not then I will add that key with a value 1 to the map
            }

        }
        System.out.println("frequencyMap = " + frequencyMap);
    }

    public static void main(String[] args) {
        frequencyTest("apple");
        frequencyTestSecondApproach("apple");
    }

    public static void frequencyTestSecondApproach(String str){
        Map<Character,Integer> frequencyMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length() ; i++) {
             char key = str.charAt(i);

             // check if the frequencyMap contains or not the key: so it will go inside the if statement only if it is a new character
            if(!frequencyMap.containsKey(key)){
                frequencyMap.put(key,0);
            }

            frequencyMap.put(key,frequencyMap.get(key)+1);

        }
        System.out.println("frequencyMap = " + frequencyMap);
    }

    public static void frequencyTestThirdApproach(String word){
        String[] str = word.split("");

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < word.length(); i++) {

            map.put(word.charAt(i), Collections.frequency(List.of(str),str[i]));
        }

        System.out.println(map); // {a=1, p=2, l=1, e=1}
    }

    }

