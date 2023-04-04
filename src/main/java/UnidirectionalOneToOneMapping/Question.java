package UnidirectionalOneToOneMapping;

import javax.persistence.*;

@Entity
@Table(name = "Question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int quesId;
    private String ques;

    @OneToOne
//    @JoinColumn(name = "a_Id")
    private Answer answer;

    public Question(){
        super();
    }

    public Question(int quesId, String ques, Answer answer){
        this.quesId = quesId;
        this.ques = ques;
        this.answer = answer;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public int getQuesId() {
        return quesId;
    }

    public String getQues() {
        return ques;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }

    public void setQuesId(int quesId) {
        this.quesId = quesId;
    }
}
