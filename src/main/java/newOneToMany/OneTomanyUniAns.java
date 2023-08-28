package newOneToMany;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OneTomanyUniAns {

    @Id
    int id;

    int marks;

    String answer;

    public OneTomanyUniAns(){
        super();
    }

    public OneTomanyUniAns(int id, int marks, String answer){
        this.answer = answer;
        this.id = id;
        this.marks =marks;

    }


    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

}
