package beans;

import aop.ToLog;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class RandomService {

    private final Logger logger = Logger.getLogger(RandomService.class.getCanonicalName());

    @ToLog
    public void randomMethod() {
        logger.info("///Какая-то бизнес логика randomMethod() класса RandomService///");
    }

    @ToLog
    public void randomMethod2() {
        logger.info("///Какая-то бизнес логика randomMethod2() класса RandomService///");
    }

    public void methodShouldNotToBeLogged() {
        logger.info(
                "///Какая-то бизнес логика methodShouldNotToBeLogged() класса RandomService, " +
                        "которая не должна быть залогирована///");
    }
}
