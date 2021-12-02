import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

/**
 * Project name(项目名称)：Swing事件监听
 * Package(包名): PACKAGE_NAME
 * Class(类名): test3
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/12/2
 * Time(创建时间)： 14:48
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test3 extends JFrame
{
    JList<String> list;
    JLabel label;

    public test3()
    {
        setTitle("监听列表项选择事件");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 200);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        label = new JLabel(" ");
        contentPane.add(label, BorderLayout.SOUTH);
        JScrollPane scrollPane = new JScrollPane();
        contentPane.add(scrollPane, BorderLayout.CENTER);
        list = new JList<>();
        scrollPane.setViewportView(list);
        String[] listData = new String[6];
        listData[0] = "0-12";
        listData[1]="12-18";
        listData[2] = "18-36";
        listData[3] = "36-60";
        listData[4] = "60-80";
        listData[5] = "80-100";
        list.setListData(listData);
        list.setSelectionMode(0);
        list.addListSelectionListener(new ListSelectionListener()
        {
            @Override
            public void valueChanged(ListSelectionEvent e)
            {
                //Toolkit.getDefaultToolkit().beep();
                label.setText(e.getFirstIndex()+"  "+e.getLastIndex());
            }
        });
    }

    public static void main(String[] args)
    {
        test3 t=new test3();
        t.setVisible(true);
    }
}
