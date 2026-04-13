import javax.swing.*;
import java.awt.event.*;

public class JavaSwing extends JFrame {
    private JTextField username;
    private JPasswordField password;
    private JButton loginBtn;

    public JavaSwing() {
        setTitle("Login");
        setSize(300, 200);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(30, 30, 80, 25);
        add(userLabel);

        username = new JTextField();
        username.setBounds(120, 30, 120, 25);
        add(username);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(30, 70, 80, 25);
        add(passLabel);

        password = new JPasswordField();
        password.setBounds(120, 70, 120, 25);
        add(password);

        loginBtn = new JButton("Login");
        loginBtn.setBounds(100, 110, 80, 30);
        add(loginBtn);

        // Event Handling Login
        loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pass = new String(password.getPassword());

                if (pass.isEmpty()) {
                    JOptionPane.showMessageDialog(null, 
                        "Password tidak boleh kosong!", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                } else {
                    new MainFrame();
                    dispose(); // tutup login
                }
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JavaSwing();
    }
}