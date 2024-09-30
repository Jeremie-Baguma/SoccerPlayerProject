// Remove Duplicates from a List Using Set
//Write a program that:
//-Takes a list of integers.
//-Uses a HashSet to remove duplicate integers from the list.
//-Prints the list without duplicates.


import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args){
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(2);
        integerList.add(4);
        integerList.add(4);
        integerList.add(3);

        Set<Integer> integerSet = new HashSet<> (integerList);
        integerList.clear();
        integerList.addAll(integerSet);
        System.out.println(integerList);

        //Set of Unique Characters in a String
        //Write a program that:
        //Takes a string as input.
        //Uses a HashSet to store each unique character from the string.
        //Prints the set of unique characters.

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        HashSet<Character> uniqueChars = new HashSet<>();

        for (char c: input.toCharArray()){
            uniqueChars.add(c);



        }
        System.out.println(uniqueChars);
    }


}