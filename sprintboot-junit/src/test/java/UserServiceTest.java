import org.cat.JuintTestApplication;
import org.cat.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = JuintTestApplication.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void addTest(){
        userService.addUser();
    }

}
