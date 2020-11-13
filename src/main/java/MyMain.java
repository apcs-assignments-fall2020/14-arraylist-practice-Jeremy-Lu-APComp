import java.util.ArrayList;

public class MyMain {

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) { 
        int c = 0;
        for(int i = 0; i<list.size(); i++){
            if(list.get(i) % 2 == 1) {
                c++;
            }
        }
        return c;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        for(int i = 0; i<list1.size(); i++){
            for(int d = 0; d<list2.size(); d++){
                if(list1.get(i) == list2.get(d)){
                    return true;
                }
            }
        }
        return false;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    public static ArrayList<Integer> convertToArrayList(int[] arr) { 
        ArrayList<Integer> list_hold = new ArrayList<Integer>();
        for(int i = 0; i<arr.length; i++){
            list_hold.add(arr[i]);
        }
        return list_hold;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list_int = new ArrayList<Integer>();
        ArrayList<Integer> list_int2 = new ArrayList<Integer>();
        int[] arr = {1,2,3,4,5};
        //I just wrote this code to automatically add numbers on the range [1,10] list_int
        for(int i = 1; i<=10; i++){
            list_int.add(i);
        }
        //This code automatically adds numbers on the range [11,20] to list_int2
        //(So the arrays aren't identical)
        for(int i = 11; i<=20; i++){
            list_int2.add(i);
        }
        System.out.println(convertToArrayList(arr)); //convert to arraylist method
        System.out.println(checkDuplicates(list_int, list_int2)); //check duplicates method
        System.out.println(countOdd(list_int));
    }
}
