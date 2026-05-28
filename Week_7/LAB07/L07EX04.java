package Week_7.LAB07;

import java.awt.*;
import javax.swing.*;

public class L07EX04 {
    public static void main(String[] args) {
        JFrame f = new JFrame("L07EX04");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setLayout(new BorderLayout());

        JLabel l1 = new JLabel("Settings");
        l1.setFont(new Font("Arial", Font.BOLD, 24));
        l1.setBorder(BorderFactory.createEmptyBorder(20, 35, 20, 0));
        f.add(l1, BorderLayout.NORTH);


        JPanel SettingPanel = new JPanel(new GridLayout(7, 1, 5, 5));
        SettingPanel.setBorder(BorderFactory.createEmptyBorder(100, 100, 200, 100));

        JPanel GeneralPanel = new JPanel(new GridLayout(4, 1, 5, 5));
        GeneralPanel.setBorder(BorderFactory.createEmptyBorder(100, 100, 200, 100));

        JPanel AboutPanel = new JPanel();
        AboutPanel.setLayout(null);
        AboutPanel.setSize(500, 500);

        JButton generalbutton = new JButton("1. General");
        JButton wifibutton = new JButton("2. Wi-Fi");
        JButton bluetoothbutton = new JButton("3. Bluetooth");
        JButton mobiledatabutton = new JButton("4. Mobile Data");
        JButton hotspotbutton = new JButton("5. Hotspot");
        JButton notificationbutton = new JButton("6. Notification");
        JButton quitbutton = new JButton("Quit");

        JButton aboutbutton = new JButton("1. About");
        JButton softwareupdatebutton = new JButton("2. Software Update");
        JButton storagebutton = new JButton("3. Storage");
        JButton backbutton = new JButton("Back");

        JButton[] buttons = {generalbutton, wifibutton, bluetoothbutton, mobiledatabutton, hotspotbutton, notificationbutton, quitbutton, aboutbutton, softwareupdatebutton, storagebutton, backbutton};
        for (JButton button : buttons) {
            button.setFont(new Font("Arial", Font.BOLD, 12));
            button.setBackground(Color.WHITE);
            button.setHorizontalAlignment(SwingConstants.LEFT);
        }

        //for AboutPanel content
        //===================================================================================
        JButton backbutton2 = new JButton("Back");
        backbutton2.setBounds(100, 200, 400, 30);
        backbutton2.setFont(new Font("Arial", Font.BOLD, 12));
        backbutton2.setBackground(Color.WHITE);
        backbutton2.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel model = new JLabel("Model: ", SwingConstants.LEFT);
        model.setBounds(100, 100, 200, 30);
        JLabel name = new JLabel("Name: ", SwingConstants.LEFT);
        name.setBounds(100, 130, 200, 30);
        JLabel version = new JLabel("Version: ", SwingConstants.LEFT);
        version.setBounds(100, 160, 200, 30);
        JLabel modelValue = new JLabel("L07EX04", SwingConstants.RIGHT);
        modelValue.setBounds(300, 100, 200, 30);
        JLabel nameValue = new JLabel("L07EX04", SwingConstants.RIGHT);
        nameValue.setBounds(300, 130, 200, 30);
        JLabel versionValue = new JLabel("1.0", SwingConstants.RIGHT);
        versionValue.setBounds(300, 160, 200, 30);
        JLabel[] labels = {name, model, version};
        for (JLabel label : labels) {
            label.setFont(new Font("Arial", Font.BOLD, 12));
        }
        //===================================================================================
        

        SettingPanel.add(generalbutton);
        SettingPanel.add(wifibutton);
        SettingPanel.add(bluetoothbutton);
        SettingPanel.add(mobiledatabutton);
        SettingPanel.add(hotspotbutton);
        SettingPanel.add(notificationbutton);
        SettingPanel.add(quitbutton);

        GeneralPanel.add(aboutbutton);
        GeneralPanel.add(softwareupdatebutton);
        GeneralPanel.add(storagebutton);
        GeneralPanel.add(backbutton);


        AboutPanel.add(name);
        AboutPanel.add(nameValue);
        AboutPanel.add(model);
        AboutPanel.add(modelValue);
        AboutPanel.add(version);
        AboutPanel.add(versionValue);
        AboutPanel.add(backbutton2);

        JPanel cardPanel = new JPanel(new CardLayout());
        cardPanel.add(SettingPanel, "settings");
        cardPanel.add(GeneralPanel, "general");
        cardPanel.add(AboutPanel, "about");
        f.add(cardPanel, BorderLayout.CENTER);

        generalbutton.addActionListener(e -> {
            CardLayout layout = (CardLayout) cardPanel.getLayout();
            layout.show(cardPanel, "general");
            l1.setText("Settings > General");
        });

        backbutton.addActionListener(e -> {
            CardLayout layout = (CardLayout) cardPanel.getLayout();
            layout.show(cardPanel, "settings");
            l1.setText("Settings");
        });

        aboutbutton.addActionListener(e -> {
            CardLayout layout = (CardLayout) cardPanel.getLayout();
            layout.show(cardPanel, "about");
            l1.setText("Settings > General > About");
        });

        backbutton2.addActionListener(e -> {
            CardLayout layout = (CardLayout) cardPanel.getLayout();
            layout.show(cardPanel, "general");
            l1.setText("Settings > General");
        });


        quitbutton.addActionListener(e -> System.exit(0));

        f.setSize(600, 800);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
