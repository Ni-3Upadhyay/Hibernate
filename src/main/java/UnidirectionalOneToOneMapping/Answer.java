package UnidirectionalOneToOneMapping;

import javax.persistence.*;

@Entity
@Table (name = "answe")
public class Answer {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int answerId;
    private String answer;

    public Answer(){
        super();
    }

    public Answer(int answerId, String answer){
        this.answer = answer;
        this.answerId = answerId;
    }

    public int getAnswerId() {
        return answerId;
    }
    public void setAnswerId(int answerId){
        this.answerId = answerId;
    }

    public String getAnswer(){
        return answer;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }
}
