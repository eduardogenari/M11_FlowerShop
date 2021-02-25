package com.front.domain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import static com.front.domain.MainPanel.shopNameField;

//new windows class for all windows appearing when clicking "create new shop"

public class SecondaryPanel extends JFrame {

    //Every new window will have a different name and number
    private static int counter = 0;

    /* SecondaryPanel contructor.
     * @param receives the MainPanel button closeWindows, so we can close all windows from the mainPanel close button
     * and the newShopName in order to receive the desiredName settet in the mainPanel
     */

    public SecondaryPanel(String newShopName, JButton mainPanelCloseButton) {
        counter++;
        setTitle("Shop " + counter + " " + newShopName);
        //we make sure that every window will appear in a different location
        setBounds(100 * counter, 100 * counter, 500, 500);
        setVisible(true);

        //We create an instance of the Listener class and set the close button as the event source.
        closeWindow closeWindowListener = new closeWindow();
        mainPanelCloseButton.addActionListener(closeWindowListener);

    }

    //Private and internal Listener class implementing ActionListener to close windows.
    private class closeWindow implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //For window closing we use the dispose() method which inherits from Window and in extension also from JFrame
            dispose();
        }
    }
}






