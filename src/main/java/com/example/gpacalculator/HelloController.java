package com.example.gpacalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    TextField course1_grade;
    @FXML
    TextField course2_grade;
    @FXML
    TextField course3_grade;
    @FXML
    TextField course4_grade;
    @FXML
    TextField course5_grade;
    @FXML
    TextField course6_grade;
    @FXML
    TextField course7_grade;
    @FXML
    ComboBox<Integer> course1_credit;
    @FXML
    ComboBox<Integer> course2_credit;
    @FXML
    ComboBox<Integer> course3_credit;
    @FXML
    ComboBox<Integer> course4_credit;
    @FXML
    ComboBox<Integer> course5_credit;
    @FXML
    ComboBox<Integer> course6_credit;
    @FXML
    ComboBox<Integer> course7_credit;
    @FXML
    Label EmptyGPA;
    @FXML
    Label EmptyCreditHours;
    @FXML
    TextField CurrentGPA;
    @FXML
    TextField TotalCreditHours;
    @FXML
    Label LetterGrade1;
    @FXML
    Label LetterGrade2;
    @FXML
    Label LetterGrade3;
    @FXML
    Label LetterGrade4;
    @FXML
    Label LetterGrade5;
    @FXML
    Label LetterGrade6;
    @FXML
    Label LetterGrade7;
    @FXML
    CheckBox checkCourse1;
    @FXML
    CheckBox checkCourse2;
    @FXML
    CheckBox checkCourse3;
    @FXML
    CheckBox checkCourse4;
    @FXML
    CheckBox checkCourse5;
    @FXML
    CheckBox checkCourse6;
    @FXML
    CheckBox checkCourse7;
    @FXML
    Label LatestGPA;
    @FXML
    CheckBox darkMode;
    @FXML
    AnchorPane mainPane;
    @FXML
    ImageView AASTLogo;
    @FXML
    Label LabelPoints;
    @FXML
    Label LabelCreditHours;
    @FXML
    Label LabelCurrentGPA;
    @FXML
    Label LabelTotalCreditHours;

    @Override

    public void initialize(URL url, ResourceBundle resourceBundle) {
        course1_credit.getItems().addAll(1, 2, 3);
        course2_credit.getItems().addAll(1, 2, 3);
        course3_credit.getItems().addAll(1, 2, 3);
        course4_credit.getItems().addAll(1, 2, 3);
        course5_credit.getItems().addAll(1, 2, 3);
        course6_credit.getItems().addAll(1, 2, 3);
        course7_credit.getItems().addAll(1, 2, 3);
        EmptyGPA.setText("");
        EmptyCreditHours.setText("");
        LetterGrade1.setText("");
        LetterGrade2.setText("");
        LetterGrade3.setText("");
        LetterGrade4.setText("");
        LetterGrade5.setText("");
        LetterGrade6.setText("");
        LetterGrade7.setText("");
        LatestGPA.setText("");

    }

    public double newTotal = 0;
    public int newCreditHours = 0;
    double oldTotal = 0;
    public double newGPA = 0;

    @FXML
    public void clickCalculate() throws Exception {

        if (Objects.equals(CurrentGPA.getText(), "")) {
            EmptyGPA.setText("*");
        }
        if (Objects.equals(TotalCreditHours.getText(), "")) {
            EmptyCreditHours.setText("*");
        } else if (Double.parseDouble(CurrentGPA.getText()) > 4) {
            AlertBoxController.display();
        } else {
            EmptyGPA.setText("");
            EmptyCreditHours.setText("");
            if (checkCourse1.isSelected()) {
                newCreditHours += course1_credit.getValue();
                if (Objects.equals(setLetterGrades(Integer.parseInt(course1_grade.getText())), "F")) {
                    LetterGrade1.setTextFill(Color.RED);
                } else {
                    LetterGrade1.setTextFill(Color.rgb(9, 29, 56));
                }
                LetterGrade1.setText(setLetterGrades(Integer.parseInt(course1_grade.getText())));
                newTotal += course1_credit.getValue() * getPoints(setLetterGrades(Integer.parseInt(course1_grade.getText())));
            }
            if (checkCourse2.isSelected()) {
                newCreditHours += course2_credit.getValue();
                if (Objects.equals(setLetterGrades(Integer.parseInt(course2_grade.getText())), "F")) {
                    LetterGrade2.setTextFill(Color.RED);
                } else {
                    LetterGrade2.setTextFill(Color.rgb(9, 29, 56));
                }
                LetterGrade2.setText(setLetterGrades(Integer.parseInt(course2_grade.getText())));
                newTotal += course2_credit.getValue() * getPoints(setLetterGrades(Integer.parseInt(course2_grade.getText())));
            }
            if (checkCourse3.isSelected()) {
                newCreditHours += course3_credit.getValue();
                if (Objects.equals(setLetterGrades(Integer.parseInt(course3_grade.getText())), "F")) {
                    LetterGrade3.setTextFill(Color.RED);
                } else {
                    LetterGrade3.setTextFill(Color.rgb(9, 29, 56));
                }
                LetterGrade3.setText(setLetterGrades(Integer.parseInt(course3_grade.getText())));
                newTotal += course3_credit.getValue() * getPoints(setLetterGrades(Integer.parseInt(course3_grade.getText())));
            }
            if (checkCourse4.isSelected()) {
                newCreditHours += course4_credit.getValue();
                if (Objects.equals(setLetterGrades(Integer.parseInt(course4_grade.getText())), "F")) {
                    LetterGrade4.setTextFill(Color.RED);
                } else {
                    LetterGrade4.setTextFill(Color.rgb(9, 29, 56));
                }
                LetterGrade4.setText(setLetterGrades(Integer.parseInt(course4_grade.getText())));
                newTotal += course4_credit.getValue() * getPoints(setLetterGrades(Integer.parseInt(course4_grade.getText())));
            }
            if (checkCourse5.isSelected()) {
                newCreditHours += course5_credit.getValue();
                if (Objects.equals(setLetterGrades(Integer.parseInt(course5_grade.getText())), "F")) {
                    LetterGrade5.setTextFill(Color.RED);
                } else {
                    LetterGrade5.setTextFill(Color.rgb(9, 29, 56));
                }
                LetterGrade5.setText(setLetterGrades(Integer.parseInt(course5_grade.getText())));
                newTotal += course5_credit.getValue() * getPoints(setLetterGrades(Integer.parseInt(course5_grade.getText())));
            }
            if (checkCourse6.isSelected()) {
                newCreditHours += course6_credit.getValue();
                if (Objects.equals(setLetterGrades(Integer.parseInt(course6_grade.getText())), "F")) {
                    LetterGrade6.setTextFill(Color.RED);
                } else {
                    LetterGrade6.setTextFill(Color.rgb(9, 29, 56));
                }
                LetterGrade6.setText(setLetterGrades(Integer.parseInt(course6_grade.getText())));
                newTotal += course6_credit.getValue() * getPoints(setLetterGrades(Integer.parseInt(course6_grade.getText())));
            }
            if (checkCourse7.isSelected()) {
                newCreditHours += course7_credit.getValue();
                if (Objects.equals(setLetterGrades(Integer.parseInt(course7_grade.getText())), "F")) {
                    LetterGrade7.setTextFill(Color.RED);
                } else {
                    LetterGrade7.setTextFill(Color.rgb(9, 29, 56));
                }
                LetterGrade7.setText(setLetterGrades(Integer.parseInt(course7_grade.getText())));
                newTotal += course7_credit.getValue() * getPoints(setLetterGrades(Integer.parseInt(course7_grade.getText())));
            }
            setGPA();
        }
    }

    public String setLetterGrades(int x) {
        if (x < 60) return "F";
        else if (x < 64) return "D";
        else if (x < 67) return "D+";
        else if (x < 70) return "C-";
        else if (x < 73) return "C";
        else if (x < 76) return "C+";
        else if (x < 80) return "B-";
        else if (x < 84) return "B";
        else if (x < 89) return "B+";
        else if (x < 93) return "A-";
        else if (x < 97) return "A";
        else return "A+";
    }

    public double getPoints(String s) {
        if (Objects.equals(s, "F")) return 0;
        else if (Objects.equals(s, "D")) return 1;
        else if (Objects.equals(s, "D+")) return 1.3;
        else if (Objects.equals(s, "C-")) return 1.7;
        else if (Objects.equals(s, "C")) return 2;
        else if (Objects.equals(s, "C+")) return 2.3;
        else if (Objects.equals(s, "B-")) return 2.7;
        else if (Objects.equals(s, "B")) return 3;
        else if (Objects.equals(s, "B+")) return 3.3;
        else if (Objects.equals(s, "A-")) return 3.7;
        else if (Objects.equals(s, "A")) return 3.83;
        else return 4;
    }

    public void setGPA() {
        oldTotal = Double.parseDouble(CurrentGPA.getText()) * Integer.parseInt(TotalCreditHours.getText());
        newGPA = (newTotal + oldTotal) / (newCreditHours + Integer.parseInt(TotalCreditHours.getText()));
        String GPA = "GPA = " + String.format("%.5f", newGPA) + "\n" + "Rounded GPA = " + String.format("%.2f", newGPA);
        LatestGPA.setText(GPA);
        oldTotal = 0;
        newGPA = 0;
        newTotal = 0;
        newCreditHours = 0;
    }

    @FXML
    public void setCredits() {
        if (checkCourse1.isSelected() && course1_credit.getValue() == null) course1_credit.setValue(1);
        if (checkCourse2.isSelected() && course2_credit.getValue() == null) course2_credit.setValue(1);
        if (checkCourse3.isSelected() && course3_credit.getValue() == null) course3_credit.setValue(1);
        if (checkCourse4.isSelected() && course4_credit.getValue() == null) course4_credit.setValue(1);
        if (checkCourse5.isSelected() && course5_credit.getValue() == null) course5_credit.setValue(1);
        if (checkCourse6.isSelected() && course6_credit.getValue() == null) course6_credit.setValue(1);
        if (checkCourse7.isSelected() && course7_credit.getValue() == null) course7_credit.setValue(1);
        if (!checkCourse1.isSelected()) course1_credit.setValue(null);
        if (!checkCourse2.isSelected()) course2_credit.setValue(null);
        if (!checkCourse3.isSelected()) course3_credit.setValue(null);
        if (!checkCourse4.isSelected()) course4_credit.setValue(null);
        if (!checkCourse5.isSelected()) course5_credit.setValue(null);
        if (!checkCourse6.isSelected()) course6_credit.setValue(null);
        if (!checkCourse7.isSelected()) course7_credit.setValue(null);
    }

    @FXML
    public void clickTable() throws IOException {
        Stage stage = new Stage();
        GradesTableController.sendStage(stage);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("GradesTable.fxml"));
        stage.initModality(Modality.APPLICATION_MODAL);
        Scene scene = new Scene(fxmlLoader.load());
        Image icon = new Image("D:\\JavaCodes\\GpaCalculator\\src\\main\\resources\\com\\example\\gpacalculator\\AAST.jpg");
        stage.setTitle("GPA Calculator");
        stage.setScene(scene);
        stage.getIcons().add(icon);
        stage.showAndWait();
    }

    @FXML
    public void clickDarkMode() {
        if (darkMode.isSelected()) {
            mainPane.setBackground(Background.fill(Color.rgb(18, 18, 18)));
            AASTLogo.setImage(new Image("D:\\JavaCodes\\GpaCalculator\\src\\main\\resources\\com\\example\\gpacalculator\\AASTDarkMode.jpg"));
            checkCourse1.setTextFill(Color.rgb(190, 190, 190));
            checkCourse2.setTextFill(Color.rgb(190, 190, 190));
            checkCourse3.setTextFill(Color.rgb(190, 190, 190));
            checkCourse4.setTextFill(Color.rgb(190, 190, 190));
            checkCourse5.setTextFill(Color.rgb(190, 190, 190));
            checkCourse6.setTextFill(Color.rgb(190, 190, 190));
            checkCourse7.setTextFill(Color.rgb(190, 190, 190));
            LabelPoints.setTextFill(Color.rgb(190, 190, 190));
            LabelCreditHours.setTextFill(Color.rgb(190, 190, 190));
            LabelTotalCreditHours.setTextFill(Color.rgb(190, 190, 190));
            LabelCurrentGPA.setTextFill(Color.rgb(190, 190, 190));
            darkMode.setTextFill(Color.rgb(190, 190, 190));

        } else {
            mainPane.setBackground(Background.fill(Color.WHITE));
            AASTLogo.setImage(new Image("D:\\JavaCodes\\GpaCalculator\\src\\main\\resources\\com\\example\\gpacalculator\\AAST.jpg"));
            checkCourse1.setTextFill(Color.BLACK);
            checkCourse2.setTextFill(Color.BLACK);
            checkCourse3.setTextFill(Color.BLACK);
            checkCourse4.setTextFill(Color.BLACK);
            checkCourse5.setTextFill(Color.BLACK);
            checkCourse6.setTextFill(Color.BLACK);
            checkCourse7.setTextFill(Color.BLACK);
            LabelPoints.setTextFill(Color.BLACK);
            LabelCreditHours.setTextFill(Color.BLACK);
            LabelTotalCreditHours.setTextFill(Color.BLACK);
            LabelCurrentGPA.setTextFill(Color.BLACK);
            darkMode.setTextFill(Color.BLACK);
        }
    }
}