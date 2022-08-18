package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContactForm extends JFrame{
    JTextField name_field, email_field;
    JRadioButton male, femail;
    JCheckBox check;

    public  ContactForm() {

        super( "контактная форма");
        super.setBounds(200, 100, 300, 230);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(5, 2, 2, 10));

        JLabel name = new JLabel("Введите имя");
        name_field = new JTextField("", 1);
        JLabel email = new JLabel("Введите email");
        email_field = new JTextField("@", 1);

        container.add(name);
        container.add(name_field);
        container.add(email);
        container.add(email_field);

        JRadioButton male = new JRadioButton("Мужской");
        JRadioButton female = new JRadioButton("Женский");
        JRadioButton check = new JRadioButton("Согласен?", false);
        JButton send_button = new JButton("Отправить");

        male.setSelected(true);
        container.add(male);
        container.add(female);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        container.add(check);
        container.add(send_button);

       // send_button.addActionListener(new ButtonEventManager());
  //  }
   // class ButtonEventManager implements ActionListener {

        //  @Override
     //   public void  actionPerformed(ActiveEvent e) {
        //    String name = name_field.getText();
         //   String email = email_field.getText();

         //   String ismale = "Мужской";
         //   if(male.isSelected())
         //       ismale = "Женский";

         //   boolean checkBox = check.isSelected();

         //   JOptionPane.showMessageDialog(null,"", "privet," + name, JOptionPane.PLAIN_MESSAGE);
      //  }


        //@Override
      //  public void actionPerformed(ActionEvent e) {

      //  }
    }
}
