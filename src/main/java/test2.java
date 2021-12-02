import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * Project name(项目名称)：Swing事件监听
 * Package(包名): PACKAGE_NAME
 * Class(类名): test2
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/12/2
 * Time(创建时间)： 14:32
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test2 extends JFrame
{
    JLabel label;
    JButton button1;
    JTextField txtfield1;

    public test2()
    {
        setTitle("焦点事件监听器示例");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 200);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        label = new JLabel(" ");
        label.setFont(new Font("楷体", Font.BOLD, 16));    //修改字体样式
        contentPane.add(label, BorderLayout.SOUTH);
        txtfield1 = new JTextField();    //创建文本框
        txtfield1.setFont(new Font("黑体", Font.BOLD, 16));    //修改字体样式
        txtfield1.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                label.setText("文本框获得焦点，正在输入内容");
            }

            @Override
            public void focusLost(FocusEvent e)
            {
                label.setText("文本框失去焦点，内容输入完成");
            }
        });
        button1 = new JButton("测试按钮");
        button1.addActionListener(e -> Toolkit.getDefaultToolkit().beep());
        contentPane.add(txtfield1);
        contentPane.add(button1, BorderLayout.NORTH);
    }

    public static void main(String[] args)
    {
        test2 frame = new test2();
        frame.setVisible(true);
    }
}
