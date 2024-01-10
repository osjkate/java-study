package javalang.scanner;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] argArr = null;

        while (true) {
            String prompt = ">>";
            System.out.print(prompt);

            String input = s.nextLine();

            input = input.trim();   // input 값에서 앞뒤 공백 제거
            argArr = input.split(" +"); // 공백을 구분자로 자른다. 공백이 여러 개일 수 있으므로 + 추가

            String command = argArr[0].trim();

            if ("".equals(command)) {
                continue;
            }

            command = command.toLowerCase();

            if (command.equals("q")) {
                System.exit(0);
            } else {
                for (int i = 0; i < argArr.length; i++) {
                    System.out.println(argArr[i]);
                }
            }
        }
    }
}
