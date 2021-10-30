package hello.core.singletone;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletoneTest {
    @Test
    @DisplayName("싱글톤 패턴을 적용한 객체 사용")
    void SingletonServiceTest() {
        SingleTonService singleTonService1 = SingleTonService.getInstance();
        SingleTonService singleTonService2 = SingleTonService.getInstance();
        System.out.println("singleTonService1 = " + singleTonService1);
        System.out.println("singleTonService2 = " + singleTonService2);

        assertThat(singleTonService1).isSameAs(singleTonService2);
    }

}
