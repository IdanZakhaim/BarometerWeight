import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;

public class Main extends JFrame {




    public static void main(String[] args) {

        new Main();}
//לא לשכוח לראות הקלטה של אבי מה3.5


    public Main (){
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300,100,Finals.General_SCREEN_WIDTH,Finals.General_SCREEN_HEIGHT);
        this.setTitle("Test");
        this.setVisible(true);
        PersonalData personalData = new PersonalData(Finals.PERSONAL_DATA_X,Finals.PERSONAL_DATA_Y,Finals.PERSONAL_DATA_WIDTH,Finals.PERSONAL_DATA_HEIGHT);
        this.add(personalData);
        GenderPanel genderPanel = new GenderPanel(Finals.GENDER_X,Finals.GENDER_Y,Finals.GENDER_WIDTH,Finals.GENDER_HEIGHT);
        this.add(genderPanel);
        HeightPanel heightPanel = new HeightPanel(Finals.HEIGHT_SLIDE_X,Finals.HEIGHT_SLIDE_Y,Finals.HEIGHT_SLIDE_WIDTH,Finals.HEIGHT_SLIDE_HEIGHT);
        this.add(heightPanel);
        WeightPanel weightPanel = new WeightPanel(Finals.WEIGTH_X,Finals.WEIGTH_Y,Finals.WEIGTH_WIDTH,Finals.WEIGTH_HEIGHT);
        this.add(weightPanel);
        repaint();
    }



}