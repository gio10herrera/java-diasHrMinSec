package convertdaysapp;

import javax.swing.*;

public class Days {
    static int numberOfDays, hours, minutes, seconds;

    public static void main(String[] args) {
        numberOfDays = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of days you want to convert", "Number of Days", JOptionPane.QUESTION_MESSAGE));
        convertDays();
    }

    private static void convertDays() {
        hours = numberOfDays * 24;
        minutes = hours * 60;
        seconds = minutes * 60;
    }
}
