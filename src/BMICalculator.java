//Cheyanne Jackson
//GEEN163
//September 22, 2016
//Write a program with a Graphical User Interface (GUI) that calculates the user’s Body Mass Index (BMI)

import javax.swing.*;
import java.awt.*;

public class BMICalculator extends JFrame implements java.awt.event.ActionListener {

    JLabel enterHeight = new JLabel("Enter height in inches");  // to display the text
    JTextField inHeight = new JTextField();  // where the user will type the input
    JLabel enterWeight = new JLabel("Enter weight in pounds");  // to display the text
    JTextField inWeight = new JTextField();  // where the user will type the input
    JButton calcButton = new JButton("Calc");  // where the user can click the button to calculate their inputs
    JLabel showNormal = new JLabel();   // will be used in if statements to determine if the inputs come out normal 
    JLabel underW = new JLabel();  // will be used in if statements to determine if the inputs come out under weight
    JLabel overW = new JLabel();  // will be used in if statements to determine if the inputs come out over weight

    public BMICalculator() {
        setSize(750, 75);  // set size of the box where all the inputs and outputs will be display

        Container pane = getContentPane();

        BoxLayout where = new BoxLayout(pane, BoxLayout.X_AXIS);  // will place labels and text fields in a row

        setLayout(where);

        pane.add(enterHeight);  // the order of how the labels and text fields will appear in the layout
        pane.add(inHeight);
        pane.add(enterWeight);
        pane.add(inWeight);
        pane.add(calcButton);
        pane.add(showNormal);
        pane.add(underW);
        pane.add(overW);

        calcButton.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(java.awt.event.ActionEvent thing) {

        double height = Double.parseDouble(inHeight.getText());  // what the user typed as the input
        double inches = Double.parseDouble(inHeight.getText());  // converted to use in an equation to find BMI

        double weight = Double.parseDouble(inWeight.getText());  // what the user typed as the input
        double pounds = Double.parseDouble(inWeight.getText());  // converted to use in an equation to find BMI

        double BMI = (703.0) * (pounds / Math.pow(inches, 2.0));  // formula to find BMI

        if (BMI < 18.5) {
            underW.setText("BMI is " + BMI + " underweight");  // if the BMI is less than 18.5, then underweight
        } else if (18.5 <= BMI && BMI <= 25) {
            showNormal.setText("BMI is " + BMI + " normal");  //  if the BMI is greater than or equal to 18.5 and lesser than or equal to 25, then normal
        } else {
            overW.setText("BMI is " + BMI + " overweight");  // if the BMI is greater than 25, then overweight
        }
    }

    public static void main(String[] aardvark) {

        BMICalculator bmi = new BMICalculator();

    }

}
