
package model;

import java.util.ArrayList;
import javax.swing.JTextArea;

public class Student extends Person{
    public ArrayList<Lesson> listLesson = new ArrayList<>();

    public Student(String id, String name, String email, String password) {
        super(id, name, email, password);
    }

    public Student() {
    }
    


    public void printLessons(JTextArea studentLessonsArea){
        studentLessonsArea.setText("Lessons of: " + this.getName());
        for(int i = 0; i < listLesson.size(); i++){
            studentLessonsArea.append("\n\nLesson Name: " + listLesson.get(i).getName());
            studentLessonsArea.append("\nDescription: " + listLesson.get(i).getDescription());
            studentLessonsArea.append("\nStudy Material: " + listLesson.get(i).getMaterial().getTheme());
        }
    }    
}
