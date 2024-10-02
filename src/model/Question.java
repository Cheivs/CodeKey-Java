
package model;

import java.util.ArrayList;
import javax.swing.JTextArea;

public class Question {
    private String id;
    private String name;
    private String correctAnswer;
    private Lesson lesson;
    public ArrayList<Answer> listAnswers = new ArrayList<>();//Composición
    
    public Question(String name, String correctAnswer) {
        this.name = name;
        this.correctAnswer = correctAnswer;
        this.listAnswers = new ArrayList<>();
    }

    public Question() {
        
    }
    
    public void addAnswer(String content) {
        Answer answer = new Answer();
        answer.setContent(content);
        listAnswers.add(answer);
    }
    
    public void printAnswers(JTextArea answersArea){
        answersArea.setText("Question: " + this.name);
        answersArea.append("\n\nAnswers: ");
        for(int i = 0; i < listAnswers.size(); i++){
            answersArea.append("\n" + (i+1) + ") " + listAnswers.get(i).getContent());
        }
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    
    
}
