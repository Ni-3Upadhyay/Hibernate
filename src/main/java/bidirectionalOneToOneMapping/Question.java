package bidirectionalOneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Q1")

public class Question {
    @Id
    private int quesNo;
    private String ques;
    @OneToOne
    private Answer ans;

    public Question(){
        super();
    }

    public Question(int quesNo, String ques, Answer ans){
        this.ans = ans;
        this.ques = ques;
        this.quesNo = quesNo;
    }
    public int getQuesNo() {
        return quesNo;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }

    public String getQues() {
        return ques;
    }

    public Answer getAns() {
        return ans;
    }

    public void setAns(Answer ans) {
        this.ans = ans;
    }

    public void setQuesNo(int quesNo) {
        this.quesNo = quesNo;
    }
}
