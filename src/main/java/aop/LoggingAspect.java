package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private final Logger logger = Logger.getLogger(LoggingAspect.class.getCanonicalName());

    @Around("execution(* beans.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {

        logger.info(joinPoint.getSignature().getDeclaringTypeName());
        joinPoint.proceed();
        logger.info(joinPoint.getSignature().getDeclaringTypeName());
    }
}
