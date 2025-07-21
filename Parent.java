import java.awt.*;
import java.awt.event.*;

public class Parent {
    public static void main(String[] args) {
        Frame f = new Frame("Parent Details");
        f.setSize(800, 700);
        f.setLayout(new FlowLayout());

        Label detailsLabel = new Label("Details will appear here");
        Button fbutton = new Button("Father");
        Button mbutton = new Button("Mother");

        fbutton.addActionListener(e -> detailsLabel.setText("Father: John, Age: 45, Designation: Doctor"));
        mbutton.addActionListener(e -> detailsLabel.setText("Mother: Sara, Age: 35, Designation: Teacher"));

        f.add(fbutton);
        f.add(mbutton);
        f.add(detailsLabel);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.setVisible(true);
    }
}
 