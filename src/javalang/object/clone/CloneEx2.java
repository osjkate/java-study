package javalang.object.clone;

public class CloneEx2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrClone = arr.clone();   // 배열 객체에서 clone이 public으로 오버라이딩 되어있기 때문에 바로 사용 가능
        arrClone[0] = 6;

        System.out.println(arr[0]);
        System.out.println(arrClone[0]);

        int[] arr2 = {6, 7, 8, 9, 10};
        int[] arrClone2 = new int[arr2.length];
        System.arraycopy(arr2, 0, arrClone2, 0, arr.length);
        // System.arraycopy(오리지널배열, 복사할 시작점, 복사할배열, 복사 시작점, 복사할 길이
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arrClone2[i] + " ");
        }
    }

    // 일반적으로 배열을 복사할때는 같은 길이의 배열을 새로 만든 다음에 System.arraycopy()를 이용해서 내용을 복사한다.
    // clone()을 사용해서 간단하게 복사하는 것도 가능하다.
    // 배열 뿐만 아니라 Vector, ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap, Calendar, Date 와 같은 클래스들이 이런 방식으로 복제가 가능하다.
}
