package MyCode;

// Interfacce grafiche

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Win {

	public static void main(String[] args) {
        JFrame frame = new JFrame("Esempio di JButton");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creazione di un pulsante
        JButton button = new JButton("Cliccami!");

        // Aggiunta di un ActionListener per gestire il click del pulsante
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hai cliccato il pulsante");
            }
        });

        frame.add(button);
        frame.setVisible(true);
    }
}
