
package model;

import java.util.ArrayList;


public class Admin extends Person {
    private static Admin instance;
    private ArrayList<Lesson> createdLessons;
    private ArrayList<StudyMaterial> createdMaterials;
    private ArrayList<Question> createdQuestions;
    
    public Admin(String id, String name, String email, String password) {
        super(id, name, email, password);
        this.createdLessons = new ArrayList<>();
        this.createdMaterials = new ArrayList<>();
        this.createdQuestions = new ArrayList<>();
    }
    
    public static void initializeAdmin(String id, String name, String email, String password) {
            instance = new Admin(id, name, email, password);
    }
    
     public static Admin getInstance() {
        if (instance == null) {
            // Si no existe una instancia, la creamos con valores predeterminados
            instance = new Admin("admin1", "Administrator", "admin@example.com", "securePassword");
        }
        return instance;
    }
     
    public Lesson createLesson(String name, String description, StudyMaterial material) {
        Lesson lesson = new Lesson(name, description, material);
        createdLessons.add(lesson);
        return lesson;
    }

    public StudyMaterial createStudyMaterial(String theme, String content) {
        StudyMaterial material = new StudyMaterial(theme, content);
        createdMaterials.add(material);
        return material;
    }

    public Question createQuestion(String name, String correctAnswer) {
        Question question = new Question(name, correctAnswer);
        createdQuestions.add(question);
        return question;
    }
    
    public void addAnswerToQuestion(Question question, String answerContent) {
        question.addAnswer(answerContent);
    }
    
    
}

