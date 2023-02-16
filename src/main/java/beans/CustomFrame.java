package beans;

import dto.Comment;
import org.springframework.stereotype.Service;

@Service
public class CustomFrame {

    public void publishComment(Comment comment) {
        System.out.println("///Какая-то бизнес логика publishComment() класса CustomFrame///");
    }
}
