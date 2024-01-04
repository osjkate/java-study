package javalang.string;

public class StringBufferEx3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("01");
        StringBuffer sb2 = sb.append(23);
        sb.append('4').append(56);

        StringBuffer sb3 = sb.append(78);
        sb3.append(9.0);

        System.out.println("sb : " + sb);
        System.out.println("sb2 : " + sb2);
        System.out.println("sb3 : " + sb3);

        System.out.println("sb = " + sb.deleteCharAt(10)); // 01234567890
        System.out.println("sb = " + sb.delete(3, 6));  //01267890
        System.out.println("sb = " + sb.insert(3, "abc"));  //012abc67890
        System.out.println("sb = " + sb.replace(6, sb.length(), "END"));    //012abcEND

        System.out.println("capacity = " + sb.capacity());
        // 처음 생성자에 넣은 문자열보다 16 길게 설정된다. -> 18
        System.out.println("length = " + sb.length());
    }
}
