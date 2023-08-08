package solutions;

public class StartEndsWith {
    public static boolean solution(String str, String ending) {

        char[] arr = str.toCharArray();
        char[] end = ending.toCharArray();

        int startLen = arr.length - 1;
        int endLen = end.length-1;
        int count = 0;
        if (arr.length >= end.length) {
            for (int i = arr.length - 1; i >= arr.length - end.length; i--) {
                if (arr[i] == end[endLen]) {
                    count++;
                }
                endLen--;
            }
            if (end.length == count) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
