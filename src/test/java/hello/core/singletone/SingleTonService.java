package hello.core.singletone;

public class SingleTonService {
    private static final SingleTonService instance = new SingleTonService();

    public static SingleTonService getInstance() {
        return instance;
    }

    // privae 생성자로 외부에서 객체가 생성되는것을 막는다.
    private SingleTonService() {
    }
}
