import generator.GeneratorType;
import generator.PasswordGeneratorFacade;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Random;

public class PasswordGeneratorFacadeTest {

    PasswordGeneratorFacade facade;
    GeneratorType[] types;

    @Test
    public void testGetPassword() {
        facade = new PasswordGeneratorFacade();
        types = GeneratorType.values();

        Random random = new Random();

        for (GeneratorType type : types) {
            String password = facade.getPassword(random.nextInt(10), type);
            Assertions.assertThat(password)
                    .isNotNull();
        }
    }
}
