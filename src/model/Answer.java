
package model;

import java.util.ArrayList;

public class Answer {
    private String id;
    private String content;
    private Question question;
    private String selectedAnswer;
    
    public Answer(String content) {
        this.content = content;
    }

    public Answer() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String name) {
        this.content = name;
    }

    public String getSelectedAnswer() {
        return selectedAnswer;
    }

    public void setSelectedAnswer(String selectedAnswer) {
        this.selectedAnswer = selectedAnswer;
    }
    
    
}
