import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

public class WeightPanel extends JPanel {


public WeightPanel (int x, int y, int width, int height){
    this.setBounds(x,y,width,height);
}

    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Weight"),BorderFactory.createEmptyBorder(5,5,5,5)));
        setLayout(new GridLayout(0,1));
        JTextField weightBox = new JTextField();
        weightBox.setBounds(Finals.WEIGTH_X+10,Finals.WEIGTH_Y+10,Finals.WEIGTH_WIDTH-10,Finals.WEIGTH_HEIGHT+10);
        add(weightBox);
        setVisible(true);
    }



}
