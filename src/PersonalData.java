import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonalData extends JPanel {


    public PersonalData (int x, int y, int width, int height){
        this.setBounds(x,y,width,height);
    }

    public void paintComponent (Graphics graphics){
        super.paintComponent(graphics);
        setLayout(new GridLayout(4,2,10,10));
        setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Personal Data"),BorderFactory.createEmptyBorder(5,5,5,5)));
        JLabel name = new JLabel("Name");
        JLabel familyName = new JLabel("Family Name");
        JLabel age = new JLabel("Age");
        add(name);
        JTextField nameBox = new JTextField();
        add(nameBox);
        add(familyName);
        JTextField familyNameBox = new JTextField();
        add(familyNameBox);
        add(age);
        JTextField ageBox = new JTextField();
        add(ageBox);
        JButton  printResult = new JButton("Print");
        add(printResult);
        setVisible(true);
        printResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("The name is : " + nameBox.getText());
                System.out.println("The family name is : " + familyNameBox.getText());
                System.out.println("The age is : " + ageBox.getText());
              //  System.out.println("The gender is : " + GenderPanel.getDefaultLocale().toString());;

            }
        });

    }
}
