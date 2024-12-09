import javax.swing.*;
import java.text.*;

public class Lab203 
{

	public static void main(String[] args) 
	{
		DecimalFormat frm = new DecimalFormat("#.#");

        String inputWeight = JOptionPane.showInputDialog(null, "Input weight :", "Input", JOptionPane.QUESTION_MESSAGE);
        String inputHeight = JOptionPane.showInputDialog(null, "Input height :", "Input", JOptionPane.QUESTION_MESSAGE);

        
            Double totalWeight = Double.parseDouble(inputWeight);
            Double totalHeight = Double.parseDouble(inputHeight);

            Double heightInMeters = totalHeight / 100;
            Double total = totalWeight / (heightInMeters * heightInMeters);

            String text = "";
            if (total <= 18.5)
            {
                text = "Underweight";
            } else if (total > 18.5 && total <= 24.9) 
            {
                text = "Normal weight";
            } else if (total >= 25.0 && total <= 29.9) 
            {
                text = "Overweight";
            } else {
                text = "Obesity";
            }

            JOptionPane.showMessageDialog(null, "BMI: " + frm.format(total) + "\nYou're " + text, "BMI ", JOptionPane.INFORMATION_MESSAGE);
        
    }
}