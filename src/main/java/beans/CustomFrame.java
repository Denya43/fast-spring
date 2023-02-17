package beans;

import aop.ToLog;
import dto.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CustomFrame {

    private final Logger logger = Logger.getLogger(CustomFrame.class.getCanonicalName());

    @ToLog
    public void publishComment(Comment comment) {
        logger.info("///Какая-то бизнес логика publishComment() класса CustomFrame///");
    }
}
