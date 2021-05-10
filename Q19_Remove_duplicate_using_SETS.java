//Q19. Write a program to remove duplicates from the array using sets(data structure).


import java.util.HashSet;

public class Q19_Remove_duplicate_using_SETS {

    public static void main(String[] args) {

        String[] names = {"raj", "rohan", "jai", "karan", "rahul", "jai", "abhishek", "rohan"};

        HashSet<String> set = new HashSet<String>();

        for(int i=0; i<names.length; i++){
            if(!set.contains(names[i])){
                set.add(names[i]);
            }
        }
        System.out.println(set);

    }
}
