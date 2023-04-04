package bidirectionalOneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Q2")
public class Answer {
    @Id
    private int ansNo;
    private String ans;
    @OneToOne(mappedBy = "ans")
    private Question ques;

    public Answer(){
        super();
    }
    public Answer(int ansNo, String ans, Question ques){
        this.ans = ans;
        this.ansNo = ansNo;
        this.ques = ques;
    }
    public void setAns(String ans) {
        this.ans = ans;
    }

    public void setQues(Question ques) {
        this.ques = ques;
    }

    public int getAnsNo() {
        return ansNo;
    }

    public Question getQues() {
        return ques;
    }

    public String getAns() {
        return ans;
    }

    public void setAnsNo(int ansNo) {
        this.ansNo = ansNo;
    }
}
