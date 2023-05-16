import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Hashtable;

//לא לשכוח לראות הקלטה של אבי מה3.5
public class Main extends JFrame {

    public static void main(String[] args) {

        new Main();
    }
//לא לשכוח לראות הקלטה של אבי מה3.5

    public Main() {
        JButton printButton = new JButton("Print");
        JPanel personalData = createPersonalData();
        this.add(personalData);
        JLabel name = new JLabel("Name");
        JLabel familyName = new JLabel("Family Name");
        JLabel age = new JLabel("Age");
        personalData.add(name);
        JTextField nameBox = new JTextField();
        personalData.add(nameBox);
        personalData.add(familyName);
        JTextField familyNameBox = new JTextField();
        personalData.add(familyNameBox);
        personalData.add(age);
        JTextField ageBox = new JTextField();
        personalData.add(ageBox);
        personalData.add(printButton);
        JPanel genderPanel = createGenderPanel();
        this.add(genderPanel);
        String[] gender = {"Male", "Female"};
        JComboBox<String> genderBox = new JComboBox<>(gender);
        genderPanel.add(genderBox);
        JPanel heightPanel = createHeightPanel();
        this.add(heightPanel);
        JPanel weightPanel = createWeightPanel();
        this.add(weightPanel);
        JTextField weightBox = new JTextField();
        weightBox.setBounds(Finals.WEIGTH_X + 10, Finals.WEIGTH_Y + 10, Finals.WEIGTH_WIDTH - 10, Finals.WEIGTH_HEIGHT + 10);
        weightPanel.add(weightBox);
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 100, Finals.General_SCREEN_WIDTH, Finals.General_SCREEN_HEIGHT);
        this.setTitle("Test");
        this.setVisible(true);
        JSlider heightSlider = new JSlider(JSlider.VERTICAL, 140, 190, 160);
        heightSlider.setMinorTickSpacing(1);
        heightSlider.setMajorTickSpacing(5);
        heightSlider.setPaintTicks(true);
        Hashtable<Integer, JLabel> heights = new Hashtable<>();
        heights.put(140, new JLabel("140"));
        heights.put(150, new JLabel("150"));
        heights.put(160, new JLabel("160"));
        heights.put(170, new JLabel("170"));
        heights.put(180, new JLabel("180"));
        heights.put(190, new JLabel("190"));
        heightSlider.setLabelTable(heights);
        JLabel height = new JLabel("160");
        heightSlider.setPaintLabels(true);
        heightPanel.add(height);
        heightPanel.add(heightSlider);
        heightSlider.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                height.setText(""+ heightSlider.getValue());
            }
            @Override
            public void mouseMoved(MouseEvent e) {
            }
        });
        heightSlider.setPaintLabels(true);
        heightPanel.add(height);
        heightPanel.add(heightSlider);
        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("The name is : " + nameBox.getText());
                System.out.println("The family name is : " + familyNameBox.getText());
                System.out.println("The age is : " + ageBox.getText());
                System.out.println("The gender is : " + genderBox.getSelectedItem());
                System.out.println("The height is : " + heightSlider.getValue());
                System.out.println("The weight is : " + weightBox.getText());
            }
        });
        repaint();
    }

    protected static JPanel createPersonalData() {
        JPanel personalData = new JPanel();
        personalData.setBounds(Finals.PERSONAL_DATA_X, Finals.PERSONAL_DATA_Y, Finals.PERSONAL_DATA_WIDTH, Finals.PERSONAL_DATA_HEIGHT);
        personalData.setLayout(new GridLayout(4, 2, 10, 10));
        personalData.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Personal Data"), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        return personalData;
    }

    protected static JPanel createGenderPanel() {
        JPanel genderPanel = new JPanel();
        genderPanel.setBounds(Finals.GENDER_X, Finals.GENDER_Y, Finals.GENDER_WIDTH, Finals.GENDER_HEIGHT);
        genderPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Gender"), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        return genderPanel;
    }

    protected static JPanel createHeightPanel() {
        JPanel heightPanel = new JPanel();
        heightPanel.setBounds(Finals.HEIGHT_SLIDE_X, Finals.HEIGHT_SLIDE_Y, Finals.HEIGHT_SLIDE_WIDTH, Finals.HEIGHT_SLIDE_HEIGHT);
        heightPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Height"), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        return heightPanel;
    }

    protected static JPanel createWeightPanel() {
        JPanel weightPanel = new JPanel();
        weightPanel.setBounds(Finals.WEIGTH_X, Finals.WEIGTH_Y, Finals.WEIGTH_WIDTH, Finals.WEIGTH_HEIGHT);
        weightPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Weight"), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        weightPanel.setLayout(new GridLayout(0, 1));
        return weightPanel;
    }
}