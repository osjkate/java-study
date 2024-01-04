package javalang.string;

public class StringBufferEx2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abcdef");
        System.out.println("sb = " + sb.toString());

        sb.delete(3, 6);
        System.out.println("--- 변경 후 ---");
        System.out.println("sb = " + sb.toString());
    }
}
