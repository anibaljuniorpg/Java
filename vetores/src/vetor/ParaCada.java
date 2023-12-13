package vetor;

import java.util.Arrays;

public class ParaCada {
    public static void main(String[] args) {
        int num[] = {5, 4, 3,6, 2, 3, 2};
        int pos = Arrays.binarySearch(num, 5);
        System.out.println(pos);
    }
}
