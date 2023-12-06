import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;


public class MyFrame implements ActionListener{

    JButton openshop = new JButton();
    JFrame frame = new JFrame("Networked Footwear System");
    MyFrame(){

      
        Border border = BorderFactory.createLineBorder(new Color(0,0,0),3);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("SHOES.png");
        frame.setIconImage(image.getImage());
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);

        ImageIcon back = new ImageIcon("background10.png");
        JLabel backback = new JLabel(back);
        backback.setSize(500,500);


        ImageIcon imageIcon = new ImageIcon("panelogo.png"); // load the image to a imageIcon
        Image imagee = imageIcon.getImage(); // transform it 
        Image newimg = imagee.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon = new ImageIcon(newimg);  // transform it back

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        panel.setBounds(15,50,450,130);
        panel.setBorder(border);
        JLabel label = new JLabel("Networked Footwear System");
        label.setIcon(imageIcon);
        label.setForeground(new Color(0, 0, 0));
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        label.setHorizontalTextPosition(JLabel.RIGHT);
        label.setVerticalTextPosition(JLabel.CENTER);

     
        JLabel user = new JLabel();
        ImageIcon userr = new ImageIcon("backgroundremoved.png");
        Image userimage = userr.getImage();
        Image modifieduserr = userimage.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH);
        userr = new ImageIcon(modifieduserr);

        user.setIcon(userr);
        user.setBounds(65,200,100,30);
        user.setForeground(Color.white);
        user.setLayout(null);
        JTextField username = new JTextField("USER_NAME");
        username.setLayout(null);
        username.setBounds(100,200,200,30);


        ImageIcon loc = new ImageIcon("locationbackgroundremoved.png");
        Image locimage = loc.getImage();
        Image modifiedloc = locimage.getScaledInstance(35, 30, java.awt.Image.SCALE_SMOOTH);
        loc = new ImageIcon(modifiedloc);
        JLabel loccimage = new JLabel();
        loccimage.setIcon(loc);
        loccimage.setLayout(null);
        loccimage.setBounds(65,215,100,100);

        JTextField location = new JTextField("LOCATION");
        location.setLayout(null);
        location.setBounds(100,250,200,30);

        ImageIcon numm = new ImageIcon("numberlogo.png");
        Image nummimage = numm.getImage();
        Image modifiednumm = nummimage.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
        numm = new ImageIcon(modifiednumm);
        JLabel numimage = new JLabel();
        numimage.setIcon(numm);
        numimage.setLayout(null);
        numimage.setBounds(65,260,100,100);

        JTextField number = new JTextField("NUMBER");
        number.setLayout(null);
        number.setBounds(100,295,200,30);

        ImageIcon powerbutton = new ImageIcon("powerbutton.png");
        Image powerimage = powerbutton.getImage();
        Image modifiedpower = powerimage.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        powerbutton = new ImageIcon(modifiedpower);
        
        openshop.setIcon(powerbutton);
        openshop.setLayout(null);
        openshop.setBounds(220,350,50,50);
        openshop.addActionListener(this);

        

        
        
        frame.add(openshop);
        frame.add(number);
        frame.add(numimage);
        frame.add(location);
        frame.add(loccimage);
        frame.add(user);
        frame.add(username);
        frame.add(panel);
        panel.add(label);
        frame.add(backback);
        frame.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==openshop){
            frame.dispose();
            newWindow mywindow = new newWindow();
        }
    }
    
}

