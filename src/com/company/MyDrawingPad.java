package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public interface MyDrawingPad extends MouseMotionListener, ActionListener {
    @Override
    public default void mouseDragged(MouseEvent e) {

    }

    @Override
    public default void mouseMoved(MouseEvent e) {

    }
    @Override
    public default void actionPerformed(ActionEvent e) {

    }

}
