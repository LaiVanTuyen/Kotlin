import javax.swing.*;

public class HelloWorldUI {
    private JPanel pmMain;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton giảiButton;
    private JButton tiếpButton;
    private JButton thoátButton;

    public HelloWorldUI() {
        giảiButton.addActionListener(e -> xuLyGiai());
        tiếpButton.addActionListener(e -> {
            textField1.setText("");
            textField2.setText("");
            textField3.setText("");
            textField1.requestFocus();
        });
        thoátButton.addActionListener(e -> System.exit(0));
    }
    private void xuLyGiai() {
        double a=Integer.parseInt(textField1.getText());
        double b=Integer.parseInt(textField2.getText());
        textField3.setText((-b/a)+"");
    }
    public JPanel getPnMain() {
        return pmMain;
    }
}
