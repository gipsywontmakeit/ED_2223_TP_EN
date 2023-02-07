package Gui;

import javax.swing.*;

public class Menu extends JFrame {

    public Menu(String title){
      super (title);
    }

 public static void main(String[] args){
     JFrame frame = new Menu("Menu");
     frame.setVisible(true);
 }
}
