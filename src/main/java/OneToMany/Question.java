package OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "OneToManyQues")
public class Question {
    @Id
    private int questionId;
    private String question;

    @OneToMany(mappedBy = "question")
    private List<Answer> answers;   // without using mapped by an extra table will be created.

    public Question(){
        super();
    }

    public Question(int questionId, String question, List<Answer> answers){
        this.answers = answers;
        this.question = question;
        this.questionId = questionId;
    }
    public int getQuestionId() {
        return questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
