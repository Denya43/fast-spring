import beans.CustomFrame;
import beans.RandomService;
import config.MyConfig;
import dto.Comment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        CustomFrame customFrame = context.getBean(CustomFrame.class);
        RandomService randomService = context.getBean(RandomService.class);

        Comment comment = new Comment();
        comment.setAuthor("Alexander");
        comment.setText("I'll be back..");

        customFrame.publishComment(comment);
        randomService.randomMethod();
    }
}
