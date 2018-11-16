import com.realdolmen.jenkins.domain.Greeter;
import org.junit.Test;

public class GreeterTest {

    private Greeter greeter;

    @Test
    public void setUp(){
        this.greeter = new Greeter();
    }

    @Test
    public void greet(){
        String expect = "Welcome Jhon";
    }
    
}
