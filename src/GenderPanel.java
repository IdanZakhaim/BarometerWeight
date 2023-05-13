import javax.swing.*;
import java.awt.*;

public class GenderPanel extends JPanel {


    public GenderPanel (int x, int y, int width, int height){
        this.setBounds(x,y,width,height);
    }

protected void paintComponent (Graphics graphics){
    super.paintComponent(graphics);
    setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Gender"),BorderFactory.createEmptyBorder(5,5,5,5)));
    String[] gender = {"Male","Female"};
    JComboBox<String> genderBox = new JComboBox<>(gender);
    add(genderBox);
    setVisible(true);
}
}
