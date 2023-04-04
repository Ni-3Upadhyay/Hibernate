// adding a comment to check whether i am doing it correct.
package EmbeddableAnnotation;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
    private String course;
    private boolean completed;

    public Certificate(){
        super();
    }
    public String getCourse() {
        return course;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
