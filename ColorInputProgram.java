/**
 * Testing the values of red
 * @author Nikhil Paranjape 
 * @version March 2013 v2.0
 * DO NOT RERELEASE WITHOUT PERMISSION
 * you may use for guidance, education, and entertainment
 * feel free to add on, repost onto this repository
 */
import java.applet.Applet;
import java.awt.*;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
public class ColorInputProgram
{
    public static void main(String args[]){
        String ColorInput;
        UIManager UI=new UIManager();
        
        //Sets default window color
        UI.put("OptionPane.background",new ColorUIResource(250,235,215));
        UI.put("Panel.background",new ColorUIResource(250,235,215));
        JOptionPane.showMessageDialog(null, "Welcome to nikhil's color converter");
        ColorInput = JOptionPane.showInputDialog("Tell me a hex number color and I will make a color");
        
        //Converts hex into rgb so the computer can use it
        Color color = Color.decode(ColorInput);
        JOptionPane.showMessageDialog(null,"Your color awaits, press OK!");
        
        //Next method sets the color of the window
        UI.put("OptionPane.background",new ColorUIResource(color));
        UI.put("Panel.background",new ColorUIResource(color));
        JOptionPane.showMessageDialog(null,"UR BRAND NEW COLOR","Color Window", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Check the next window for the rgb color code");
        JOptionPane.showMessageDialog(null,color);
        if(ColorInput.equalsIgnoreCase("#FF69B4")){
            JOptionPane.showMessageDialog(null,"Hmm... Hotpink...");
        }
        else if (ColorInput.equalsIgnoreCase("#FF00FF")){
            JOptionPane.showMessageDialog(null,"WHAT KIND OF COLOR IS FUCHSIA");
        }
        else if (ColorInput.equalsIgnoreCase("#E0B0FF")){
            JOptionPane.showMessageDialog(null,"WHAT KIND OF COLOR IS MAUVE!!!");
        }

    }
}