package collection.map.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 알려주세요");
            System.out.print("id : ");
            String id = sc.nextLine().trim();

            System.out.print("password : ");
            String password = sc.nextLine().trim();
            System.out.println();

            if (!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. " +
                        "다시 입력해주세요.");
                continue;
            }
            if (!(map.get(id)).equals(password)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            } else {
                System.out.println("로그인 되었습니다. ");
                break;
            }
        }
    }
}
