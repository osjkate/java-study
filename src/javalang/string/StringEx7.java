package javalang.string;

public class StringEx7 {
    public static void main(String[] args) {
        String fullName = "Hello.java";

        // "."의 위치 찾기
        int index = fullName.indexOf('.');

        // subString 추출
        String sub = fullName.substring(0, index);
        // 마지막 인덱스는 포함하지 않는다. '.' 제외

        // 확장자 추출
        String ext = fullName.substring(index + 1);

        System.out.println(fullName + "의 확장자를 제외한 파일 이름은 " + sub);
        System.out.println(fullName + "의 확장자는 " + ext);
    }
}
