import java.awt.*;
import java.awt.event.*;

public class GreetingApplication {
    public static void main(String []args){
        Frame frame = new Frame("Greeting Application");
        frame.setSize(400,300);
        frame.setLayout(new FlowLayout());

        Label nameLabel = new Label("Enter your Name : ");
        TextField nameField = new TextField(25);
        System.out.println();
        Label ageLabel = new Label("Enter your Age : ");
        TextField ageField = new TextField(3);
        System.out.println();
        Button sButton = new Button("Submit");
        System.out.println();
        Label outLabel = new Label("");

        sButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String name = nameField.getText();
                String age = ageField.getText();
                outLabel.setText("Hello "+ name + " !You are "+ age +" years old...");
            }
        });
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(sButton);
        frame.add(outLabel);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }
        });
        frame.setVisible(true);
    }
}
