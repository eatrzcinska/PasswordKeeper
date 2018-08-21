package generator;

import static generator.GeneratorType.TYPE1;
import static generator.GeneratorType.TYPE2;
import static generator.GeneratorType.TYPE3;

class PasswordGeneratorFactory {

    //This factory returns only an object of generator type (class which implements PasswordGenerator interface).
    // You can get password in the facade.

    PasswordGenerator getGenerator (GeneratorType type){
        if (type == TYPE1){
            FirstGenerator generator = new FirstGenerator();
            return generator;
        }
        else if (type == TYPE2){
            SecondGenerator generator = new SecondGenerator();
            return generator;
        }
        else if (type == TYPE3){
            ThirdGenerator generator = new ThirdGenerator();
            return generator;
        }

        throw new PasswordGeneratorException("No such generator");
    }



}
