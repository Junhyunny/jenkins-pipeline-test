package action.in.blog;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest
class BackendApplicationIT {

    @Test
    void simpleTest() {
        assertThat(1, equalTo(1));
    }
}
