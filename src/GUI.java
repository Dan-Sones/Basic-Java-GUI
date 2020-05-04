import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    public GUI() {
        //Create Objects
        frame = new JFrame();
        panel = new JPanel();
        JButton button = new JButton("ClickMe");
        button.addActionListener(this);
        label = new JLabel("Number of clicks: 0");
        // Set Border with pixel sizes : top, bottom, left, right
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        // Set layout
        panel.setLayout(new GridLayout(0, 1));
        //Add A button
        panel.add(button);
        //Add A label
        panel.add(label);
        //Set postioning
        frame.add(panel, BorderLayout.CENTER);
        //What Happens when they close the windows
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set the title of tehe window
        frame.setTitle("Our GUI");
        //Set the window to be a certain size
        frame.pack();
        //Set the window to be visible
        frame.setVisible(true);
    }

    public static void main(String[] args){
        new GUI();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);

    }
}
