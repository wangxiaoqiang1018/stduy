import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Love extends JFrame {


    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Love frame = new Love();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame.
     */
    public Love() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel label = new JLabel("小姐姐处对象吗？");
        label.setFont(new Font("幼圆", Font.PLAIN, 18));
        label.setBounds(147, 20, 211, 41);
        contentPane.add(label);

        JButton button = new JButton("好的");
        button.addActionListener(arg0 -> JOptionPane.showMessageDialog(null, "恭喜！成功拿下！", "表白幺~", JOptionPane.PLAIN_MESSAGE));
        button.setBounds(98, 179, 93, 23);
        contentPane.add(button);

        JButton button_1 = new JButton("不行");
        button_1.addActionListener(e -> {
            boolean flag = false;
            int isDone = JOptionPane.showConfirmDialog(null, "房子写你名", "表白~", JOptionPane.YES_NO_OPTION);
            if (isDone == JOptionPane.NO_OPTION) {
                isDone = JOptionPane.showConfirmDialog(null, "我会做饭", "表白~", JOptionPane.YES_NO_OPTION);
                if (isDone == JOptionPane.NO_OPTION) {
                    isDone = JOptionPane.showConfirmDialog(null, "我会洗衣服", "表白~", JOptionPane.YES_NO_OPTION);
                    if (isDone == JOptionPane.NO_OPTION) {
                        JOptionPane.showMessageDialog(null, "现在可以成为我女票吗？", "表白幺~", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        flag = true;
                    }
                } else {
                    flag = true;
                }
            } else {
                flag = true;
            }

            if (flag) {
                JOptionPane.showMessageDialog(null, "恭喜！成功拿下！", "表白幺~", JOptionPane.PLAIN_MESSAGE);
            }

        });
        button_1.setBounds(251, 179, 93, 23);
        contentPane.add(button_1);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("love.png"));
        lblNewLabel.setBounds(157, 57, 114, 98);
        contentPane.add(lblNewLabel);
    }
}