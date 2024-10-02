
package model;

import javax.swing.JTextArea;

public class StudyMaterial {
    private String theme;
    private String content;

    public StudyMaterial(String theme, String content) {
        this.theme = theme;
        this.content = content;
    }

    public StudyMaterial() {
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public void printStudyMaterial(JTextArea studyMaterialArea){
        studyMaterialArea.setText(theme);
        studyMaterialArea.append("\nContent: " + content);
    }
}
