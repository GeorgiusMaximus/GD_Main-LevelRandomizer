import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GD_MainLevelRandomizer implements ActionListener {

    JFrame project_frame;
    JPanel panel_0;
    JPanel panel_1;
    JPanel panel_2;
    JPanel panel_3;
    JPanel panel_4;
    JLabel level_name;
    JButton randomize_button;
    Random random;

    int level_number;

    public GD_MainLevelRandomizer(){

        random = new Random();

        panel_0 = new JPanel();
        panel_1 = new JPanel();
        panel_1.setPreferredSize(new Dimension(50, 50));
        panel_2 = new JPanel();
        panel_2.setPreferredSize(new Dimension(50, 50));
        panel_3 = new JPanel();
        panel_3.setPreferredSize(new Dimension(50, 50));
        panel_4 = new JPanel();
        panel_4.setPreferredSize(new Dimension(50, 50));

        level_name = new JLabel();

        randomize_button = new JButton("Randomize");
        randomize_button.addActionListener(this);
        panel_2.add(randomize_button);

        level_number = random.nextInt(0, 22);

        switch (level_number){
            case 0:
                level_name.setText("Stereo Madness");
                break;
            case 1:
                level_name.setText("Back On Track");
                break;
            case 2:
                level_name.setText("Polargeist");
                break;
            case 3:
                level_name.setText("Dry Out");
                break;
            case 4:
                level_name.setText("Base After Base");
                break;
            case 5:
                level_name.setText("Cant Let Go");
                break;
            case 6:
                level_name.setText("Jumper");
                break;
            case 7:
                level_name.setText("Time Machine");
                break;
            case 8:
                level_name.setText("Cycles");
                break;
            case 9:
                level_name.setText("xStep");
                break;
            case 10:
                level_name.setText("Clutterfunk");
                break;
            case 11:
                level_name.setText("Theory of Everything");
                break;
            case 12:
                level_name.setText("Electroman Adventures");
                break;
            case 13:
                level_name.setText("Clubstep");
                break;
            case 14:
                level_name.setText("Electrodynamix");
                break;
            case 15:
                level_name.setText("Hexagon Force");
                break;
            case 16:
                level_name.setText("Blast Processing");
                break;
            case 17:
                level_name.setText("Theory of Everything 2");
                break;
            case 18:
                level_name.setText("Geometrical Dominator");
                break;
            case 19:
                level_name.setText("Deadlocked");
                break;
            case 20:
                level_name.setText("Fingerdash");
                break;
            case 21:
                level_name.setText("Dash");
                break;

        }

        panel_0.add(level_name);

        project_frame = new JFrame("GD Main Level Randomizer");
        project_frame.setSize(350, 250);
        project_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        project_frame.setLocationRelativeTo(null);
        project_frame.setResizable(false);
        project_frame.setLayout(new BorderLayout());


        project_frame.add(panel_0, BorderLayout.CENTER);
        project_frame.add(panel_1, BorderLayout.NORTH);
        project_frame.add(panel_2, BorderLayout.SOUTH);
        project_frame.add(panel_3, BorderLayout.EAST);
        project_frame.add(panel_4, BorderLayout.WEST);


        project_frame.setVisible(true);
    }


    public static void main(String[] args) {
        new GD_MainLevelRandomizer();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == randomize_button){
            level_number = random.nextInt(0, 22);

            switch (level_number){
                case 0:
                    level_name.setText("Stereo Madness");
                    break;
                case 1:
                    level_name.setText("Back On Track");
                    break;
                case 2:
                    level_name.setText("Polargeist");
                    break;
                case 3:
                    level_name.setText("Dry Out");
                    break;
                case 4:
                    level_name.setText("Base After Base");
                    break;
                case 5:
                    level_name.setText("Cant Let Go");
                    break;
                case 6:
                    level_name.setText("Jumper");
                    break;
                case 7:
                    level_name.setText("Time Machine");
                    break;
                case 8:
                    level_name.setText("Cycles");
                    break;
                case 9:
                    level_name.setText("xStep");
                    break;
                case 10:
                    level_name.setText("Clutterfunk");
                    break;
                case 11:
                    level_name.setText("Theory of Everything");
                    break;
                case 12:
                    level_name.setText("Electroman Adventures");
                    break;
                case 13:
                    level_name.setText("Clubstep");
                    break;
                case 14:
                    level_name.setText("Electrodynamix");
                    break;
                case 15:
                    level_name.setText("Hexagon Force");
                    break;
                case 16:
                    level_name.setText("Blast Processing");
                    break;
                case 17:
                    level_name.setText("Theory of Everything 2");
                    break;
                case 18:
                    level_name.setText("Geometrical Dominator");
                    break;
                case 19:
                    level_name.setText("Deadlocked");
                    break;
                case 20:
                    level_name.setText("Fingerdash");
                    break;
                case 21:
                    level_name.setText("Dash");
                    break;

            }
        }
    }
}