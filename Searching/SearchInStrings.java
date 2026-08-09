package Searching;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "palak";
        System.out.println(search(name, 'a'));

    }

    // boolean funtion returning true or false--->

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        // for (int i = 0; i < str.length(); i++) {
        // if (target == str.charAt(i)) {
        // return true;
        // }
        // }

        for (char ch : str.toCharArray()) {        // <---for each loop can be used
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

    // int function returning the index of char-->

    static int search1(String str, char target) {
        if (str.length() == 0) {
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return i;
            }
        }
        return -1;

    }

}
