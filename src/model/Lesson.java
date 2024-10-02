
package model;

import java.util.ArrayList;
import javax.swing.JTextArea;

public class Lesson {
    private String id;
    private String name;
    private String description;
    private StudyMaterial material; //Comṕosicion
    public ArrayList<Question> listQuestions;  //Agregación
    
    public Lesson(String name, String description, StudyMaterial material) {
        this.name = name;
        this.description = description;
        this.material = material;
        this.listQuestions = new ArrayList<>();
    }

    public Lesson() {
    }
    
    
    public void printQuestions(JTextArea questionsArea){
        questionsArea.setText("Questions of " + this.name);
        System.out.println("asd " + listQuestions.size());
        for(int i = 0; i < listQuestions.size(); i++){
            questionsArea.append("\n\nQuestion: " + listQuestions.get(i).getId());
            questionsArea.append("\n" + listQuestions.get(i).getName());
            questionsArea.append("\nCorrect answer: " + listQuestions.get(i).getCorrectAnswer());
            for(int p = 0; p< listQuestions.get(p).listAnswers.size();p++){
                questionsArea.append("\nAnswer : " +(p+2) + listQuestions.get(p).listAnswers.get(p).getContent());
                System.out.println( "2"+listQuestions.get(p).listAnswers.get(p).getContent());
            }
        }
    }
    
    public void addQuestion(Question question){
        System.out.println("addquestion");
        listQuestions.add(question);
    }
    public StudyMaterial getMaterial() {
        return material;
    }

    public void setMaterial(StudyMaterial material) {
        this.material = material;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
