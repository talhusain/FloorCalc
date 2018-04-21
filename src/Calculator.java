import com.sun.org.glassfish.external.statistics.annotations.Reset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator extends JPanel {
    public Calculator() {
        super(new GridLayout(1, 1));

        JPanel squareFootagePanel = new JPanel();
        JPanel wallInfoPanel = new JPanel();
        JPanel roomInfoPanel, roomInfoPanel2, roomInfoPanel3, roomInfoPanel4, roomInfoPanel5, roomInfoPanel6, roomInfoPanel7, roomInfoPanel8, roomInfoPanel9, roomInfoPanel10,
                pLength, pLength2, pLength3, pLength4, pLength5, pLength6, pLength7, pLength8, pLength9, pLength10,
                pWidth, pWidth2, pWidth3, pWidth4, pWidth5, pWidth6, pWidth7, pWidth8, pWidth9, pWidth10,
                pOverage, pOverage2, pCalculate, pCalculate2, pBoxSize, pBoxSize2, pOutput, pOutput2, pSqft, pLW;
        JLabel Length, Length2, Length3, Length4, Length5, Length6, Length7, Length8, Length9, Length10,
                Width, Width2, Width3, Width4, Width5, Width6, Width7, Width8, Width9, Width10,
                overageLabel, overageLabel2, boxSizeLabel, boxSizeLabel2, outputsqftLabel, outputsqftLabel2, outputOverageLabel,
                BoxesLabel, BoxesLabel2, RollsLabel, RollsLabel2, SqftLabel, moldingLabel, moldingLabel2;
        JTextField lengthFeet, lengthFeet2, lengthFeet3, lengthFeet4, lengthFeet5, lengthFeet6, lengthFeet7, lengthFeet8, lengthFeet9, lengthFeet10,
                lengthInches, lengthInches2, lengthInches3, lengthInches4, lengthInches5, lengthInches6, lengthInches7, lengthInches8, lengthInches9, lengthInches10,
                widthFeet, widthFeet2, widthFeet3, widthFeet4, widthFeet5, widthFeet6, widthFeet7, widthFeet8, widthFeet9, widthFeet10,
                widthInches, widthInches2, widthInches3, widthInches4, widthInches5, widthInches6, widthInches7, widthInches8, widthInches9, widthInches10,
                boxSize, boxSize2, Overage, Overage2, Sqft;
        JTextArea outputsqft, outputsqft2, outputOverage, Boxes, Boxes2, Rolls, Rolls2, Molding, Molding2;
        JButton Calculate, Calculate2, Reset;


        wallInfoPanel.setLayout(new GridLayout(5, 1));


        pLW = new JPanel();
        pLW.setLayout(new GridLayout(1, 1));

        JTabbedPane tabbedPane2 = new JTabbedPane();

        roomInfoPanel = new JPanel();
        JComponent panel3 = roomInfoPanel;
        tabbedPane2.addTab("Room 1", panel3);
        tabbedPane2.setMnemonicAt(0, KeyEvent.VK_3);

        roomInfoPanel2 = new JPanel();
        JComponent panel4 = roomInfoPanel2;
        tabbedPane2.addTab("Room 2", panel4);
        tabbedPane2.setMnemonicAt(0, KeyEvent.VK_3);

        roomInfoPanel3 = new JPanel();
        JComponent panel5 = roomInfoPanel3;
        tabbedPane2.addTab("Room 3", panel5);
        tabbedPane2.setMnemonicAt(0, KeyEvent.VK_3);

        roomInfoPanel4 = new JPanel();
        JComponent panel6 = roomInfoPanel4;
        tabbedPane2.addTab("Room 4", panel6);
        tabbedPane2.setMnemonicAt(0, KeyEvent.VK_3);

        roomInfoPanel5 = new JPanel();
        JComponent panel7 = roomInfoPanel5;
        tabbedPane2.addTab("Room 5", panel7);
        tabbedPane2.setMnemonicAt(0, KeyEvent.VK_3);

        roomInfoPanel6 = new JPanel();
        JComponent panel8 = roomInfoPanel6;
        tabbedPane2.addTab("Room 6", panel8);
        tabbedPane2.setMnemonicAt(0, KeyEvent.VK_3);

        roomInfoPanel7 = new JPanel();
        JComponent panel9 = roomInfoPanel7;
        tabbedPane2.addTab("Room 7", panel9);
        tabbedPane2.setMnemonicAt(0, KeyEvent.VK_3);

        roomInfoPanel8 = new JPanel();
        JComponent panel10 = roomInfoPanel8;
        tabbedPane2.addTab("Room 8", panel10);
        tabbedPane2.setMnemonicAt(0, KeyEvent.VK_3);

        roomInfoPanel9 = new JPanel();
        JComponent panel11 = roomInfoPanel9;
        tabbedPane2.addTab("Room 9", panel11);
        tabbedPane2.setMnemonicAt(0, KeyEvent.VK_3);

        roomInfoPanel10 = new JPanel();
        JComponent panel12 = roomInfoPanel10;
        tabbedPane2.addTab("Room 10", panel12);
        tabbedPane2.setMnemonicAt(0, KeyEvent.VK_3);

        pLW.add(tabbedPane2);

        pLength = new JPanel();
        pLength.setLayout(new GridLayout(1, 3));
        Length = new JLabel("Length: ");
        lengthFeet = new JTextField("0");
        lengthFeet.setPreferredSize(new Dimension(100, 20));
        lengthInches = new JTextField("0");
        lengthInches.setPreferredSize(new Dimension(100, 20));

        pWidth = new JPanel();
        pWidth.setLayout(new GridLayout(1, 3));
        Width = new JLabel("Width: ");
        widthFeet = new JTextField("0");
        widthFeet.setPreferredSize(new Dimension(100, 20));
        widthInches = new JTextField("0");
        widthInches.setPreferredSize(new Dimension(100, 20));

        pLength2 = new JPanel();
        pLength2.setLayout(new GridLayout(1, 3));
        Length2 = new JLabel("Length: ");
        lengthFeet2 = new JTextField("0");
        lengthFeet2.setPreferredSize(new Dimension(100, 20));
        lengthInches2 = new JTextField("0");
        lengthInches2.setPreferredSize(new Dimension(100, 20));

        pWidth2 = new JPanel();
        pWidth2.setLayout(new GridLayout(1, 3));
        Width2 = new JLabel("Width: ");
        widthFeet2 = new JTextField("0");
        widthFeet2.setPreferredSize(new Dimension(100, 20));
        widthInches2 = new JTextField("0");
        widthInches2.setPreferredSize(new Dimension(100, 20));

        pLength3 = new JPanel();
        pLength3.setLayout(new GridLayout(1, 3));
        Length3 = new JLabel("Length: ");
        lengthFeet3 = new JTextField("0");
        lengthFeet3.setPreferredSize(new Dimension(100, 20));
        lengthInches3 = new JTextField("0");
        lengthInches3.setPreferredSize(new Dimension(100, 20));

        pWidth3 = new JPanel();
        pWidth3.setLayout(new GridLayout(1, 3));
        Width3 = new JLabel("Width: ");
        widthFeet3 = new JTextField("0");
        widthFeet3.setPreferredSize(new Dimension(100, 20));
        widthInches3 = new JTextField("0");
        widthInches3.setPreferredSize(new Dimension(100, 20));

        pLength4 = new JPanel();
        pLength4.setLayout(new GridLayout(1, 3));
        Length4 = new JLabel("Length: ");
        lengthFeet4 = new JTextField("0");
        lengthFeet4.setPreferredSize(new Dimension(100, 20));
        lengthInches4 = new JTextField("0");
        lengthInches4.setPreferredSize(new Dimension(100, 20));

        pWidth4 = new JPanel();
        pWidth4.setLayout(new GridLayout(1, 3));
        Width4 = new JLabel("Width: ");
        widthFeet4 = new JTextField("0");
        widthFeet4.setPreferredSize(new Dimension(100, 20));
        widthInches4 = new JTextField("0");
        widthInches4.setPreferredSize(new Dimension(100, 20));

        pLength5 = new JPanel();
        pLength5.setLayout(new GridLayout(1, 3));
        Length5 = new JLabel("Length: ");
        lengthFeet5 = new JTextField("0");
        lengthFeet5.setPreferredSize(new Dimension(100, 20));
        lengthInches5 = new JTextField("0");
        lengthInches5.setPreferredSize(new Dimension(100, 20));

        pWidth5 = new JPanel();
        pWidth5.setLayout(new GridLayout(1, 3));
        Width5 = new JLabel("Width: ");
        widthFeet5 = new JTextField("0");
        widthFeet5.setPreferredSize(new Dimension(100, 20));
        widthInches5 = new JTextField("0");
        widthInches5.setPreferredSize(new Dimension(100, 20));

        pLength6 = new JPanel();
        pLength6.setLayout(new GridLayout(1, 3));
        Length6 = new JLabel("Length: ");
        lengthFeet6 = new JTextField("0");
        lengthFeet6.setPreferredSize(new Dimension(100, 20));
        lengthInches6 = new JTextField("0");
        lengthInches6.setPreferredSize(new Dimension(100, 20));

        pWidth6 = new JPanel();
        pWidth6.setLayout(new GridLayout(1, 3));
        Width6 = new JLabel("Width: ");
        widthFeet6 = new JTextField("0");
        widthFeet6.setPreferredSize(new Dimension(100, 20));
        widthInches6 = new JTextField("0");
        widthInches6.setPreferredSize(new Dimension(100, 20));

        pLength7 = new JPanel();
        pLength7.setLayout(new GridLayout(1, 3));
        Length7 = new JLabel("Length: ");
        lengthFeet7 = new JTextField("0");
        lengthFeet7.setPreferredSize(new Dimension(100, 20));
        lengthInches7 = new JTextField("0");
        lengthInches7.setPreferredSize(new Dimension(100, 20));

        pWidth7 = new JPanel();
        pWidth7.setLayout(new GridLayout(1, 3));
        Width7 = new JLabel("Width: ");
        widthFeet7 = new JTextField("0");
        widthFeet7.setPreferredSize(new Dimension(100, 20));
        widthInches7 = new JTextField("0");
        widthInches7.setPreferredSize(new Dimension(100, 20));

        pLength8 = new JPanel();
        pLength8.setLayout(new GridLayout(1, 3));
        Length8 = new JLabel("Length: ");
        lengthFeet8 = new JTextField("0");
        lengthFeet8.setPreferredSize(new Dimension(100, 20));
        lengthInches8 = new JTextField("0");
        lengthInches8.setPreferredSize(new Dimension(100, 20));

        pWidth8 = new JPanel();
        pWidth8.setLayout(new GridLayout(1, 3));
        Width8 = new JLabel("Width: ");
        widthFeet8 = new JTextField("0");
        widthFeet8.setPreferredSize(new Dimension(100, 20));
        widthInches8 = new JTextField("0");
        widthInches8.setPreferredSize(new Dimension(100, 20));

        pLength9 = new JPanel();
        pLength9.setLayout(new GridLayout(1, 3));
        Length9 = new JLabel("Length: ");
        lengthFeet9 = new JTextField("0");
        lengthFeet9.setPreferredSize(new Dimension(100, 20));
        lengthInches9 = new JTextField("0");
        lengthInches9.setPreferredSize(new Dimension(100, 20));

        pWidth9 = new JPanel();
        pWidth9.setLayout(new GridLayout(1, 3));
        Width9 = new JLabel("Width: ");
        widthFeet9 = new JTextField("0");
        widthFeet9.setPreferredSize(new Dimension(100, 20));
        widthInches9 = new JTextField("0");
        widthInches9.setPreferredSize(new Dimension(100, 20));

        pLength10 = new JPanel();
        pLength10.setLayout(new GridLayout(1, 3));
        Length10 = new JLabel("Length: ");
        lengthFeet10 = new JTextField("0");
        lengthFeet10.setPreferredSize(new Dimension(100, 20));
        lengthInches10 = new JTextField("0");
        lengthInches10.setPreferredSize(new Dimension(100, 20));

        pWidth10 = new JPanel();
        pWidth10.setLayout(new GridLayout(1, 3));
        Width10 = new JLabel("Width: ");
        widthFeet10 = new JTextField("0");
        widthFeet10.setPreferredSize(new Dimension(100, 20));
        widthInches10 = new JTextField("0");
        widthInches10.setPreferredSize(new Dimension(100, 20));


        pOverage = new JPanel();
        pOverage.setLayout(new GridLayout(1, 2));
        overageLabel = new JLabel("Overage: ");
        Overage = new JTextField();
        Overage.setPreferredSize(new Dimension(100, 10));


        pBoxSize = new JPanel();
        pBoxSize.setLayout(new GridLayout(1, 1));
        boxSizeLabel = new JLabel("Box Size: ");
        boxSize = new JTextField();

        pCalculate = new JPanel();
        pCalculate.setLayout(new GridLayout(1, 2));
        Calculate = new JButton("Calculate");
        Reset = new JButton("Reset");



        pOutput = new JPanel();
        pOutput.setLayout(new GridLayout(3, 1));
        outputsqftLabel = new JLabel("Square Footage: ");
        outputsqft = new JTextArea();
        outputsqft.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        outputOverageLabel = new JLabel("With Overage: ");
        outputOverage = new JTextArea();
        outputOverage.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        BoxesLabel = new JLabel("# of Boxes: ");
        Boxes = new JTextArea();
        Boxes.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        RollsLabel = new JLabel("# of Rolls: ");
        Rolls = new JTextArea();
        Rolls.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        moldingLabel = new JLabel("Molding: ");
        Molding = new JTextArea();
        Molding.setBorder(BorderFactory.createLineBorder(Color.BLACK));


        Calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double lengthF = Integer.parseInt(lengthFeet.getText());
                double lengthF2 = Integer.parseInt(lengthFeet2.getText());
                double lengthF3 = Integer.parseInt(lengthFeet3.getText());
                double lengthF4 = Integer.parseInt(lengthFeet4.getText());
                double lengthF5 = Integer.parseInt(lengthFeet5.getText());
                double lengthF6 = Integer.parseInt(lengthFeet6.getText());
                double lengthF7 = Integer.parseInt(lengthFeet7.getText());
                double lengthF8 = Integer.parseInt(lengthFeet8.getText());
                double lengthF9 = Integer.parseInt(lengthFeet9.getText());
                double lengthF10 = Integer.parseInt(lengthFeet10.getText());

                double lengthI = Integer.parseInt(lengthInches.getText());
                double lengthI2 = Integer.parseInt(lengthInches2.getText());
                double lengthI3 = Integer.parseInt(lengthInches3.getText());
                double lengthI4 = Integer.parseInt(lengthInches4.getText());
                double lengthI5 = Integer.parseInt(lengthInches5.getText());
                double lengthI6 = Integer.parseInt(lengthInches6.getText());
                double lengthI7 = Integer.parseInt(lengthInches7.getText());
                double lengthI8 = Integer.parseInt(lengthInches8.getText());
                double lengthI9 = Integer.parseInt(lengthInches9.getText());
                double lengthI10 = Integer.parseInt(lengthInches10.getText());

                double widthF = Integer.parseInt(widthFeet.getText());
                double widthF2 = Integer.parseInt(widthFeet2.getText());
                double widthF3 = Integer.parseInt(widthFeet3.getText());
                double widthF4 = Integer.parseInt(widthFeet4.getText());
                double widthF5 = Integer.parseInt(widthFeet5.getText());
                double widthF6 = Integer.parseInt(widthFeet6.getText());
                double widthF7 = Integer.parseInt(widthFeet7.getText());
                double widthF8 = Integer.parseInt(widthFeet8.getText());
                double widthF9 = Integer.parseInt(widthFeet9.getText());
                double widthF10 = Integer.parseInt(widthFeet10.getText());

                double widthI = Integer.parseInt(widthInches.getText());
                double widthI2 = Integer.parseInt(widthInches2.getText());
                double widthI3 = Integer.parseInt(widthInches3.getText());
                double widthI4 = Integer.parseInt(widthInches4.getText());
                double widthI5 = Integer.parseInt(widthInches5.getText());
                double widthI6 = Integer.parseInt(widthInches6.getText());
                double widthI7 = Integer.parseInt(widthInches7.getText());
                double widthI8 = Integer.parseInt(widthInches8.getText());
                double widthI9 = Integer.parseInt(widthInches9.getText());
                double widthI10 = Integer.parseInt(widthInches10.getText());

                double boxS = Double.parseDouble(boxSize.getText());
                double overageV = Integer.parseInt(Overage.getText());


                outputsqft.setText("" + Math.ceil((((lengthF * 12) + lengthI) / 12) * (((widthF * 12) + widthI) / 12) + (((lengthF2 * 12) + lengthI2) / 12) * (((widthF2 * 12) + widthI2) / 12) +
                        (((lengthF3 * 12) + lengthI3) / 12) * (((widthF3 * 12) + widthI3) / 12) + (((lengthF4 * 12) + lengthI4) / 12) * (((widthF4 * 12) + widthI4) / 12) +
                        (((lengthF5 * 12) + lengthI5) / 12) * (((widthF5 * 12) + widthI5) / 12) + (((lengthF6 * 12) + lengthI6) / 12) * (((widthF6 * 12) + widthI6) / 12) +
                        (((lengthF7 * 12) + lengthI7) / 12) * (((widthF7 * 12) + widthI7) / 12) + (((lengthF8 * 12) + lengthI8) / 12) * (((widthF8 * 12) + widthI8) / 12) +
                        (((lengthF9 * 12) + lengthI9) / 12) * (((widthF9 * 12) + widthI9) / 12) + (((lengthF10 * 12) + lengthI10) / 12) * (((widthF10 * 12) + widthI10) / 12)));

                outputOverage.setText("" + Math.ceil(((((lengthF * 12) + lengthI) / 12) * (((widthF * 12) + widthI) / 12) + (((lengthF2 * 12) + lengthI2) / 12) * (((widthF2 * 12) + widthI2) / 12) +
                        (((lengthF3 * 12) + lengthI3) / 12) * (((widthF3 * 12) + widthI3) / 12) + (((lengthF4 * 12) + lengthI4) / 12) * (((widthF4 * 12) + widthI4) / 12) +
                        (((lengthF5 * 12) + lengthI5) / 12) * (((widthF5 * 12) + widthI5) / 12) + (((lengthF6 * 12) + lengthI6) / 12) * (((widthF6 * 12) + widthI6) / 12) +
                        (((lengthF7 * 12) + lengthI7) / 12) * (((widthF7 * 12) + widthI7) / 12) + (((lengthF8 * 12) + lengthI8) / 12) * (((widthF8 * 12) + widthI8) / 12) +
                        (((lengthF9 * 12) + lengthI9) / 12) * (((widthF9 * 12) + widthI9) / 12) + (((lengthF10 * 12) + lengthI10) / 12) * (((widthF10 * 12) + widthI10) / 12)) * ((overageV / 100) + 1)));

                Boxes.setText("" + Math.ceil(((((lengthF * 12) + lengthI) / 12) * (((widthF * 12) + widthI) / 12) + (((lengthF2 * 12) + lengthI2) / 12) * (((widthF2 * 12) + widthI2) / 12) +
                        (((lengthF3 * 12) + lengthI3) / 12) * (((widthF3 * 12) + widthI3) / 12) + (((lengthF4 * 12) + lengthI4) / 12) * (((widthF4 * 12) + widthI4) / 12) +
                        (((lengthF5 * 12) + lengthI5) / 12) * (((widthF5 * 12) + widthI5) / 12) + (((lengthF6 * 12) + lengthI6) / 12) * (((widthF6 * 12) + widthI6) / 12) +
                        (((lengthF7 * 12) + lengthI7) / 12) * (((widthF7 * 12) + widthI7) / 12) + (((lengthF8 * 12) + lengthI8) / 12) * (((widthF8 * 12) + widthI8) / 12) +
                        (((lengthF9 * 12) + lengthI9) / 12) * (((widthF9 * 12) + widthI9) / 12) + (((lengthF10 * 12) + lengthI10) / 12) * (((widthF10 * 12) + widthI10) / 12)) * ((overageV / 100) + 1) / boxS));
                Rolls.setText("" + Math.ceil(((((lengthF * 12) + lengthI) / 12) * (((widthF * 12) + widthI) / 12) + (((lengthF2 * 12) + lengthI2) / 12) * (((widthF2 * 12) + widthI2) / 12) +
                        (((lengthF3 * 12) + lengthI3) / 12) * (((widthF3 * 12) + widthI3) / 12) + (((lengthF4 * 12) + lengthI4) / 12) * (((widthF4 * 12) + widthI4) / 12) +
                        (((lengthF5 * 12) + lengthI5) / 12) * (((widthF5 * 12) + widthI5) / 12) + (((lengthF6 * 12) + lengthI6) / 12) * (((widthF6 * 12) + widthI6) / 12) +
                        (((lengthF7 * 12) + lengthI7) / 12) * (((widthF7 * 12) + widthI7) / 12) + (((lengthF8 * 12) + lengthI8) / 12) * (((widthF8 * 12) + widthI8) / 12) +
                        (((lengthF9 * 12) + lengthI9) / 12) * (((widthF9 * 12) + widthI9) / 12) + (((lengthF10 * 12) + lengthI10) / 12) * (((widthF10 * 12) + widthI10) / 12)) * ((overageV / 100) + 1) / 100));
                Molding.setText("" + Math.ceil(((Math.ceil((((lengthF * 12) + lengthI) / 12) * (((widthF * 12) + widthI) / 12) + (((lengthF2 * 12) + lengthI2) / 12) * (((widthF2 * 12) + widthI2) / 12) +
                        (((lengthF3 * 12) + lengthI3) / 12) * (((widthF3 * 12) + widthI3) / 12) + (((lengthF4 * 12) + lengthI4) / 12) * (((widthF4 * 12) + widthI4) / 12) +
                        (((lengthF5 * 12) + lengthI5) / 12) * (((widthF5 * 12) + widthI5) / 12) + (((lengthF6 * 12) + lengthI6) / 12) * (((widthF6 * 12) + widthI6) / 12) +
                        (((lengthF7 * 12) + lengthI7) / 12) * (((widthF7 * 12) + widthI7) / 12) + (((lengthF8 * 12) + lengthI8) / 12) * (((widthF8 * 12) + widthI8) / 12) +
                        (((lengthF9 * 12) + lengthI9) / 12) * (((widthF9 * 12) + widthI9) / 12) + (((lengthF10 * 12) + lengthI10) / 12) * (((widthF10 * 12) + widthI10) / 12))
                        * ((overageV / 100) + 1) / boxS) * boxS) * .3 / 12 + 1));
            }

        }
        );

        Reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lengthFeet.setText("0");
                lengthFeet2.setText("0");
                lengthFeet3.setText("0");
                lengthFeet4.setText("0");
                lengthFeet5.setText("0");
                lengthFeet6.setText("0");
                lengthFeet7.setText("0");
                lengthFeet8.setText("0");
                lengthFeet9.setText("0");
                lengthFeet10.setText("0");

                lengthInches.setText("0");
                lengthInches2.setText("0");
                lengthInches3.setText("0");
                lengthInches4.setText("0");
                lengthInches5.setText("0");
                lengthInches6.setText("0");
                lengthInches7.setText("0");
                lengthInches8.setText("0");
                lengthInches9.setText("0");
                lengthInches10.setText("0");

                widthFeet.setText("0");
                widthFeet2.setText("0");
                widthFeet3.setText("0");
                widthFeet4.setText("0");
                widthFeet5.setText("0");
                widthFeet6.setText("0");
                widthFeet7.setText("0");
                widthFeet8.setText("0");
                widthFeet9.setText("0");
                widthFeet10.setText("0");

                widthInches.setText("0");
                widthInches2.setText("0");
                widthInches3.setText("0");
                widthInches4.setText("0");
                widthInches5.setText("0");
                widthInches6.setText("0");
                widthInches7.setText("0");
                widthInches8.setText("0");
                widthInches9.setText("0");
                widthInches10.setText("0");
            }
        });


        outputsqft.setEditable(false);
        outputOverage.setEditable(false);
        Boxes.setEditable(false);
        Rolls.setEditable(false);
        Molding.setEditable(false);


        pLength.add(Length);
        pLength.add(lengthFeet);
        pLength.add(lengthInches);

        pLength2.add(Length2);
        pLength2.add(lengthFeet2);
        pLength2.add(lengthInches2);

        pLength3.add(Length3);
        pLength3.add(lengthFeet3);
        pLength3.add(lengthInches3);

        pLength4.add(Length4);
        pLength4.add(lengthFeet4);
        pLength4.add(lengthInches4);

        pLength5.add(Length5);
        pLength5.add(lengthFeet5);
        pLength5.add(lengthInches5);

        pLength6.add(Length6);
        pLength6.add(lengthFeet6);
        pLength6.add(lengthInches6);

        pLength7.add(Length7);
        pLength7.add(lengthFeet7);
        pLength7.add(lengthInches7);

        pLength8.add(Length8);
        pLength8.add(lengthFeet8);
        pLength8.add(lengthInches8);

        pLength9.add(Length9);
        pLength9.add(lengthFeet9);
        pLength9.add(lengthInches9);

        pLength10.add(Length10);
        pLength10.add(lengthFeet10);
        pLength10.add(lengthInches10);

        pWidth.add(Width);
        pWidth.add(widthFeet);
        pWidth.add(widthInches);

        pWidth2.add(Width2);
        pWidth2.add(widthFeet2);
        pWidth2.add(widthInches2);

        pWidth3.add(Width3);
        pWidth3.add(widthFeet3);
        pWidth3.add(widthInches3);

        pWidth4.add(Width4);
        pWidth4.add(widthFeet4);
        pWidth4.add(widthInches4);

        pWidth5.add(Width5);
        pWidth5.add(widthFeet5);
        pWidth5.add(widthInches5);

        pWidth6.add(Width6);
        pWidth6.add(widthFeet6);
        pWidth6.add(widthInches6);

        pWidth7.add(Width7);
        pWidth7.add(widthFeet7);
        pWidth7.add(widthInches7);

        pWidth8.add(Width8);
        pWidth8.add(widthFeet8);
        pWidth8.add(widthInches8);

        pWidth9.add(Width9);
        pWidth9.add(widthFeet9);
        pWidth9.add(widthInches9);

        pWidth10.add(Width10);
        pWidth10.add(widthFeet10);
        pWidth10.add(widthInches10);

        pOverage.add(overageLabel);
        pOverage.add(Overage);

        pBoxSize.add(boxSizeLabel);
        pBoxSize.add(boxSize);

        pCalculate.add(Calculate);
        pCalculate.add(Reset);

        pOutput.add(outputsqftLabel);
        pOutput.add(outputsqft);
        pOutput.add(outputOverageLabel);
        pOutput.add(outputOverage);
        pOutput.add(BoxesLabel);
        pOutput.add(Boxes);
        pOutput.add(RollsLabel);
        pOutput.add(Rolls);
        pOutput.add(moldingLabel);
        pOutput.add(Molding);

        roomInfoPanel.add(pLength);
        roomInfoPanel.add(pWidth);
        roomInfoPanel2.add(pLength2);
        roomInfoPanel2.add(pWidth2);
        roomInfoPanel3.add(pLength3);
        roomInfoPanel3.add(pWidth3);
        roomInfoPanel4.add(pLength4);
        roomInfoPanel4.add(pWidth4);
        roomInfoPanel5.add(pLength5);
        roomInfoPanel5.add(pWidth5);
        roomInfoPanel6.add(pLength6);
        roomInfoPanel6.add(pWidth6);
        roomInfoPanel7.add(pLength7);
        roomInfoPanel7.add(pWidth7);
        roomInfoPanel8.add(pLength8);
        roomInfoPanel8.add(pWidth8);
        roomInfoPanel9.add(pLength9);
        roomInfoPanel9.add(pWidth9);
        roomInfoPanel10.add(pLength10);
        roomInfoPanel10.add(pWidth10);

        wallInfoPanel.add(pLW);
        wallInfoPanel.add(pBoxSize);
        wallInfoPanel.add(pOverage);
        wallInfoPanel.add(pCalculate);
        wallInfoPanel.add(pOutput);

        squareFootagePanel.setLayout(new GridLayout(5, 1));


        pSqft = new JPanel();
        pSqft.setLayout(new GridLayout(1, 1));
        SqftLabel = new JLabel("Square Feet: ");
        Sqft = new JTextField();
        Sqft.setPreferredSize(new Dimension(100, 10));

        pBoxSize2 = new JPanel();
        pBoxSize2.setLayout(new GridLayout(1, 1));
        boxSizeLabel2 = new JLabel("Box Size: ");
        boxSize2 = new JTextField();
        boxSize2.setPreferredSize(new Dimension(100, 10));

        pOverage2 = new JPanel();
        pOverage2.setLayout(new GridLayout(1, 1));
        overageLabel2 = new JLabel("Overage: ");
        Overage2 = new JTextField();
        Overage2.setPreferredSize(new Dimension(100, 10));

        pCalculate2 = new JPanel();
        pCalculate.setLayout(new GridLayout(1, 1));
        Calculate2 = new JButton("Calculate");
        Calculate2.setPreferredSize(new Dimension(400, 35));

        pOutput2 = new JPanel();
        pOutput2.setLayout(new GridLayout(2, 1));
        outputsqftLabel2 = new JLabel("Sqft With Overage: ");
        outputsqft2 = new JTextArea();
        outputsqft2.setPreferredSize(new Dimension(100, 10));
        outputsqft2.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        BoxesLabel2 = new JLabel("Number of Boxes: ");
        Boxes2 = new JTextArea();
        Boxes2.setPreferredSize(new Dimension(100, 10));
        Boxes2.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        RollsLabel2 = new JLabel("Number of Rolls: ");
        Rolls2 = new JTextArea();
        Rolls2.setPreferredSize(new Dimension(100, 10));
        Rolls2.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        moldingLabel2 = new JLabel("Molding: ");
        Molding2 = new JTextArea();
        Molding2.setPreferredSize(new Dimension(100, 10));
        Molding2.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        Calculate2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double BoxSize3 = Double.parseDouble(boxSize2.getText());
                double sqft2 = Integer.parseInt(Sqft.getText());
                double Overage3 = Integer.parseInt(Overage2.getText());


                outputsqft2.setText("" + Math.ceil(sqft2 * ((Overage3 / 100) + 1)));
                Boxes2.setText("" + Math.ceil((sqft2 * ((Overage3 / 100) + 1)) / BoxSize3));
                Rolls2.setText("" + Math.ceil(sqft2 / 100));
                Molding2.setText("" + Math.ceil((Math.ceil((sqft2 * ((Overage3 / 100) + 1)) / BoxSize3) * BoxSize3) * .3 / 12 + 1));
            }
        });



        outputsqft2.setEditable(false);
        Boxes2.setEditable(false);
        Rolls2.setEditable(false);
        Molding.setEditable(false);

        pSqft.add(SqftLabel);
        pSqft.add(Sqft);

        pBoxSize2.add(boxSizeLabel2);
        pBoxSize2.add(boxSize2);

        pOverage2.add(overageLabel2);
        pOverage2.add(Overage2);

        pCalculate2.add(Calculate2);

        pOutput2.add(outputsqftLabel2);
        pOutput2.add(outputsqft2);
        pOutput2.add(BoxesLabel2);
        pOutput2.add(Boxes2);
        pOutput2.add(RollsLabel2);
        pOutput2.add(Rolls2);
        pOutput2.add(moldingLabel2);
        pOutput2.add(Molding2);

        squareFootagePanel.add(pSqft);
        squareFootagePanel.add(pBoxSize2);
        squareFootagePanel.add(pOverage2);
        squareFootagePanel.add(pCalculate2);
        squareFootagePanel.add(pOutput2);

        JTabbedPane tabbedPane = new JTabbedPane();


        JComponent panel1 = wallInfoPanel;
        tabbedPane.addTab("Wall Dimensions", panel1);
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

        JComponent panel2 = squareFootagePanel;
        tabbedPane.addTab("Square Footage", panel2);
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);


        //Add the tabbed pane to this panel.
        add(tabbedPane);


        //The following line enables to use scrolling tabs.
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        tabbedPane2.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }


    protected JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }

    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = Calculator.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("CTG Flooring Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add content to the window.
        frame.add(new Calculator(), BorderLayout.CENTER);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //Turn off metal's use of bold fonts
                UIManager.put("swing.boldMetal", Boolean.FALSE);
                createAndShowGUI();
            }
        });
    }
}

