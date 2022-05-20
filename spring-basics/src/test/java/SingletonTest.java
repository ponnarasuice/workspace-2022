import com.example.basics.prototype.PrototypeClass;
import com.example.basics.prototype.SingletonClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SingletonTest {

  @Autowired
  private SingletonClass singletonClass;


}
