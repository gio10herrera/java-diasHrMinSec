package convertdaysapp;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Days {
    static int numberOfDays, hours, minutes, seconds;

    public static void main(String[] args) {
        numberOfDays = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of days you want to convert", "Number of Days", JOptionPane.QUESTION_MESSAGE));
        convertDays();
        showResults();
    }

    private static void convertDays() {
        hours = numberOfDays * 24;
        minutes = hours * 60;
        seconds = minutes * 60;
    }

    private static void showResults() {
        String result = "HOURS - MINUTES - SECONDS\n\nNumber of Days: " + numberOfDays + "\n\nHours: " + hours + "\nMinutes: " + minutes + "\nSeconds: " + seconds + "\n\n\n" + numberOfDays + " days have " + hours + " hours - " + minutes + " minutes - " + seconds + " seconds";

        //JTextArea Configuration
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setSize(420, 420);
        textArea.setBorder(new EmptyBorder(5, 25, 5, 5));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setText(result);
        JOptionPane.showMessageDialog(null, textArea, "Convert Days", JOptionPane.PLAIN_MESSAGE);
    }
}
