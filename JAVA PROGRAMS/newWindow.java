import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class newWindow implements ActionListener{
    JFrame frame = new JFrame("Networked Footwear System");
    JButton adidasbutton = new JButton();
    JButton nikebutton = new JButton();
    JButton pumabutton = new JButton();
    JButton conversebutton = new JButton();

    newWindow(){
        ImageIcon image = new ImageIcon("SHOES.png");
        frame.setIconImage(image.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

        ImageIcon backgrounds = new ImageIcon("background10.png");
        Image backgroundpic = backgrounds.getImage();
        Image modifiedbackground = backgroundpic.getScaledInstance(700,500,java.awt.Image.SCALE_SMOOTH);
        backgrounds = new ImageIcon(modifiedbackground);
        JLabel background = new JLabel();
        background.setIcon(backgrounds);
        background.setSize(700,500);

        ImageIcon adidas = new ImageIcon("addddd.png");
        Image adidaspic = adidas.getImage();
        Image modifedadidas = adidaspic.getScaledInstance(100,100,java.awt.Image.SCALE_SMOOTH);
        adidas = new ImageIcon(modifedadidas);

        
        adidasbutton.setIcon(adidas);
        adidasbutton.setLayout(null);
        adidasbutton.setBounds(60,200,100,100);
        adidasbutton.addActionListener(this);

        ImageIcon nike = new ImageIcon("nike.png");
        Image nikepic = nike.getImage();
        Image modifiednike = nikepic.getScaledInstance(100,100,java.awt.Image.SCALE_SMOOTH);
        nike = new ImageIcon(modifiednike);

       
        nikebutton.setIcon(nike);
        nikebutton.setLayout(null);
        nikebutton.setBounds(210,200,100,100);
        nikebutton.addActionListener(this);

        ImageIcon puma = new ImageIcon("puma.png");
        Image pumapic = puma.getImage();
        Image modifiedpuma = pumapic.getScaledInstance(100,100,java.awt.Image.SCALE_SMOOTH);
        puma = new ImageIcon(modifiedpuma);

       
        pumabutton.setIcon(puma);
        pumabutton.setLayout(null);
        pumabutton.setBounds(360,200,100,100);
        pumabutton.addActionListener(this);

        ImageIcon converse = new ImageIcon("converse.png");
        Image conversepic = converse.getImage();
        Image modifiedconverse = conversepic.getScaledInstance(100,100,java.awt.Image.SCALE_SMOOTH);
        converse = new ImageIcon(modifiedconverse);

        
        conversebutton.setIcon(converse);
        conversebutton.setLayout(null);
        conversebutton.setBounds(510,200,100,100);
        conversebutton.addActionListener(this);

        JLabel label1 = new JLabel("Choose a Brand:");
        label1.setLayout(null);
        label1.setFont(new Font("MV Boli",Font.PLAIN,20));
        label1.setBounds(250,100,500,100);

        frame.add(label1);
        frame.add(conversebutton);
        frame.add(pumabutton);
        frame.add(nikebutton);
        frame.add(adidasbutton);
        frame.add(background);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==adidasbutton){
            System.out.println("you pressed adidas");
        }else if(e.getSource()==nikebutton){
            System.out.println("you pressed nike");
        }else if(e.getSource()==pumabutton){
            System.out.println("you pressed puma");
        }else if(e.getSource()==conversebutton){
            System.out.println("you pressed reebok");
        }
    }
    
}
