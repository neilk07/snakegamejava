package SnakeGameJava;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class SnakeGame {

    public static void main(String[] args) {

        new GameFrame();
        SwingUtilities.invokeLater(GameFrame::new);
    }
}