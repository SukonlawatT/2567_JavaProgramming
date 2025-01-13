import javax.swing.JOptionPane;

public class Lab508 {

    public static void main(String[] args) {

        String input;
        int index = -1;
        int[] nums = {25, 78, 41, 22, 36, 85, 37};

        while (true) {
            input = JOptionPane.showInputDialog(null, "Input index of array", "Input", JOptionPane.QUESTION_MESSAGE);

            if (isNumeric(input)) {
                index = Integer.parseInt(input);
                if (checkIndex(nums, index)) 
                {
                    break; 
                } 
                else 
                {
                    input = JOptionPane.showInputDialog(null, "Input index of array, again", "Error", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
            } 
            else 
            {
                input = JOptionPane.showInputDialog(null, "Invalid input. Input index of array, again", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        String message = "Current data, nums[" + index + "] is " + currentData(nums, index) + "\n";

        if (index > 0) 
        {
            message += "Previous data, nums[" + (index - 1) + "] is " + prevData(nums, index) + "\n";
        } 
        else 
        {
            message += "No previous data\n";
        }

        if (index < nums.length - 1)
        {
            message += "Next data, nums[" + (index + 1) + "] is " + nextData(nums, index) + "\n";
        } 
        else
        {
            message += "No next data";
        }

        JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    public static boolean checkIndex(int[] nums, int index) 
    {
        return index >= 0 && index < nums.length;
    }

   
    public static boolean isNumeric(String str) 
    {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c) && c != '-') 
            {
                return false;
            }
        }
        return true;
    }

    
    public static int currentData(int[] nums, int index) 
    {
        return nums[index];
    }

  
    public static int prevData(int[] nums, int index) 
    {
        return nums[index - 1];
    }

 
    public static int nextData(int[] nums, int index) 
    {
        return nums[index + 1];
    }
}