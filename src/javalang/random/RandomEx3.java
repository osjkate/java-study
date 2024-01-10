package javalang.random;

import java.util.Arrays;

public class RandomEx3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(getRand(5, 10) + ", ");
        }
        System.out.println();

        int[] result = fillRand(new int[10], new int[]{2, 3, 7, 5});

        System.out.println(Arrays.toString(result));
    }

    // 선언부만 다르면 같은 이름의 함수를 만들 수 있다. (반환타입, 매개변수가 다르면)
    public static int[] fillRand(int[] arr, int from, int to) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRand(from, to);
        }
        return arr;
    }

    public static int[] fillRand(int[] arr, int[] data) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = data[getRand(0, data.length - 1)];
        }
        return arr;
    }

    public static int getRand(int from, int to) {
        return (int) (Math.random() * Math.abs(to - from) + 1) + Math.min(from, to);
    }
}
