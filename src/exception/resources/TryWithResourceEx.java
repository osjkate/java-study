package exception.resources;

import java.nio.file.ClosedFileSystemException;

public class TryWithResourceEx {
    public static void main(String[] args) {
        try (CloseableResource cr = new CloseableResource()) {
            System.out.println("예외가 발생하지 않음");
            cr.exceptionWork(false);
        } catch (WorkException | CloseException e) {
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println();

        try (CloseableResource cr = new CloseableResource()) {
            System.out.println("예외가 발생함");
            cr.exceptionWork(true);
        } catch (WorkException | CloseException e) {
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

class CloseableResource implements AutoCloseable{

    public void exceptionWork(boolean exception) throws WorkException{
        System.out.println("exceptionWork(" + exception + ")가 호출됨");
        if (exception) throw new WorkException("WorkException 발생");
    }

    @Override
    public void close() throws CloseException{
        System.out.println("close()가 호출됨");
        throw new CloseException("CloseExeption 발생");
    }
}

class WorkException extends Exception {
    WorkException(String msg) {super(msg);}
}

class CloseException extends Exception {
    CloseException(String msg) {super(msg);}
}
