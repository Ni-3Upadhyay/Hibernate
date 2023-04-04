package OneToMany;

import javax.persistence.*;

@Entity
@Table(name = "oneToManyAns")
public class Answer {
    @Id
    private int answerId;
    private String answer;
    @ManyToOne
    private Question question;

    public Answer(){
        super();
    }

    public Answer(int answerId, String answer, Question question){
        this.answer = answer;
        this.answerId =answerId;
        this.question = question;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getAnswerId() {
        return answerId;
    }

    public Question getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
