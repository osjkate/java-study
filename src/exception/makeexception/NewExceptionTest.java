package exception.makeexception;

public class NewExceptionTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFile();
        } catch (SpaceException se) {
            System.out.println("에러 메시지 : " + se.getMessage());
            se.printStackTrace();
            System.out.println("공간 확보 후 다시 시도해주십시오");
        } catch (MemoryException me) {
            System.out.println("에러 메시지 : " + me.getMessage());
            me.printStackTrace();
            System.gc();
            System.out.println("다시 설치를 시도하세요");
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace()) {
            throw new SpaceException("설치할 공간이 부족합니다. ");
        }
        if (!enoughMemory()) {
            throw new MemoryException("메모리가 부족합니다. ");
        }
    }

    static void copyFile() {
        System.out.println("파일 복사 완료");
    }
    static void deleteTempFiles() {
        System.out.println("임시 파일 삭제 완료");
    }

    static boolean enoughSpace() {
        return false;
    }

    static boolean enoughMemory() {
        return true;
    }
}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}
