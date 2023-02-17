package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

import java.util.logging.Logger;

@Aspect
public class LoggingEntryAspect {

    private final Logger logger = Logger.getLogger(LoggingEntryAspect.class.getCanonicalName());

    //@Around("execution(* beans.*.*(..))")
    @Before("@annotation(ToLog)")
    public void logEntry(JoinPoint joinPoint) {
        logger.info("Level:ENTRY, Class:" + joinPoint.getSignature().getDeclaringTypeName());
    }
}
