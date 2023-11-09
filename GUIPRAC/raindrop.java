package GUIPRAC;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class raindrop extends JFrame {
    private JButton meowButton;
    private JPanel jpanelle;
    private JTextField textField1;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JComboBox breed;
    private JTextArea textArea1;
    private JCheckBox aliveCheckBox;
    private JCheckBox deceasedCheckBox;

    public raindrop() {
        raindrop jc = this;
        meowButton.addActionListener(e -> {
            String namae = textField1.getText();
            if(namae.equals(" ") || breed.getSelectedIndex() == 0){
                    JOptionPane.showMessageDialog(jc, "ID Invalid");
                if(breed.getSelectedIndex() == 0){
                    int opt = JOptionPane.showConfirmDialog(jc, "No breed. Set to Feline?");
                    if(JOptionPane.YES_NO_OPTION == 0){
                        breed.setSelectedIndex(1);
                    }else {
                        return;
                    }
                }
                if(namae.equals("")){
                    namae = JOptionPane.showInputDialog("What is the cat's name?");
                    textField1.setText(namae);
                    textArea1.append("Pet the cat " + namae + "\n");
                    textArea1.append("The feline's gender is: ");
                    if(femaleRadioButton.isSelected()){
                        textArea1.append("female\n");
                    }else if (maleRadioButton.isSelected()){
                        textArea1.append("male\n");
                    }
                }
            }else{
                textArea1.append("Pet the cat " + namae + "\n");
                textArea1.append("The feline's gender is: ");
                if(femaleRadioButton.isSelected()){
                    textArea1.append("female\n");
                }else if (maleRadioButton.isSelected()){
                    textArea1.append("male\n");
                }
            }

            String fru = (String) breed.getSelectedItem();
            textArea1.append("Breed of " + namae + " is " + fru + "\n");

            if(aliveCheckBox.isSelected()){
                textArea1.append("The cat is still alive");
            }else if (deceasedCheckBox.isSelected()){
                textArea1.append("The cat has already passed");
            } else{
                textArea1.append("Status is not revealed");
            }
        });
    }

    public static void main(String[] args) {
        raindrop rd = new raindrop();
        rd.setContentPane(rd.jpanelle);
        rd.setSize(480, 380);
        rd.setDefaultCloseOperation(EXIT_ON_CLOSE);
        rd.setVisible(true);
        rd.setTitle("Raindrops");
    }
}
