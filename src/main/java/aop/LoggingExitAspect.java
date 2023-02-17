package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class LoggingExitAspect {

    private final Logger logger = Logger.getLogger(LoggingExitAspect.class.getCanonicalName());

    @After("@annotation(ToLog)")
    public void logExit(JoinPoint joinPoint) {
        logger.info("Level: EXIT, Class:" + joinPoint.getSignature().getDeclaringTypeName());
    }
}
