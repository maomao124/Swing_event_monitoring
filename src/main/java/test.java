import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Project name(项目名称)：Swing事件监听
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/12/2
 * Time(创建时间)： 14:19
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test extends JFrame
{
    JLabel label;
    JButton button1;
    int clicks = 0;

    public test()
    {
        setTitle("测试");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 200);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        label = new JLabel(" ");
        label.setFont(new Font("楷体", Font.BOLD, 16));    //修改字体样式
        contentPane.add(label, BorderLayout.SOUTH);
        button1 = new JButton("我是普通按钮");    //创建JButton对象
        button1.setFont(new Font("黑体", Font.BOLD, 16));    //修改字体样式
        button1.addActionListener(new button1ActionListener());
            /*
        {
            public void actionPerformed(ActionEvent e)
            {
                label.setText("按钮被单击了 " + (clicks++) + " 次");
            }
        });

             */
        contentPane.add(button1);
    }

    class button1ActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            label.setText("按钮被单击了 " + (clicks++) + " 次");
        }
    }

    public static void main(String[] args)
    {
        test frame = new test();
        frame.setVisible(true);
        test2.main(null);
        test3.main(null);
    }
}
