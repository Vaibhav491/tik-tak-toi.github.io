import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class editor extends JFrame implements ActionListener,ItemListener {
JMenu file, edit, exit;
 JMenuItem fopen,fsave,fclose,fprint,ecut,ecopy,epaste;
 JMenuBar mb = new JMenuBar() ;
 editor()
 {
 file = new JMenu("File")    ;
 edit= new JMenu("Edit");
 exit=new JMenu("Exit") ;

 fopen = new JMenuItem("Open");
  fsave = new JMenuItem("Save");
  fprint= new JMenuItem("Print");
     fclose = new JMenuItem("Close");
ecut= new JMenuItem("cut");
ecopy= new JMenuItem("copy");
epaste= new JMenuItem("paste");

    file.add(fopen);
     file.add(fsave);
     file.add(fprint);
     file.add(fclose);

     file.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
     edit.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
     exit.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));

     fopen.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
     fsave.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
     fclose.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
     fprint.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
     ecut.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
     ecopy.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
     epaste.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));


     edit.add(ecut);
     edit.add(ecopy);
     edit.add(epaste);

mb.add(file);
mb.add(edit);
mb.add(exit);
setJMenuBar(mb);

JTextArea t1 = new JTextArea(300,300);
t1.setFont(new Font("Times New Roman",Font.BOLD,30));
JScrollPane  sc = new JScrollPane(t1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
sc.setBounds(0,0,1900,980);
add(sc);
exit.addItemListener(this);
fclose.addActionListener(this);

 setSize(2000,1200);
 setTitle("Text Editor");
 setLayout(null);
 setVisible(true);
 }
    @Override
    public void actionPerformed(ActionEvent e) {

     if (e.getSource()==fclose)
     {
         System.exit(0);
     }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource()==exit)
        {
            System.exit(0);
        }
    }
}
