import javax.swing.*;
import java.awt.*;
import java.util.Hashtable;

public class HeightPanel extends JPanel {

    public HeightPanel(int x, int y, int width, int height) {
        this.setBounds(x, y, width, height);
    }


    //להמשיך מדקה 21:18
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Height"), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        JSlider heightSlider = new JSlider(JSlider.VERTICAL,140,190,160);
        heightSlider.setMinorTickSpacing(1);
        heightSlider.setMajorTickSpacing(5);
        heightSlider.setPaintTicks(true);
        Hashtable<Integer,JLabel> heights = new Hashtable<>();
        heights.put(140,new JLabel("140"));
        heights.put(150,new JLabel("150"));
        heights.put(160,new JLabel("160"));
        heights.put(170,new JLabel("170"));
        heights.put(180,new JLabel("180"));
        heights.put(190,new JLabel("190"));
        heightSlider.setLabelTable(heights);
        JLabel height = new JLabel("160");
        heightSlider.setPaintLabels(true);
        add(height);
        add(heightSlider);
        setVisible(true);
    }
}
