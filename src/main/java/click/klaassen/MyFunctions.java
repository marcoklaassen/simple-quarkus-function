package click.klaassen;

import io.quarkus.funqy.Funq;
import io.quarkus.logging.Log;

public class MyFunctions {

    @Funq
    public void event(Object event) {
         Log.info(event);
    }

}
