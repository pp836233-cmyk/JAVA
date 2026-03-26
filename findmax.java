import java.awt.*;
import java.awt.event.*;
class findmax extends Frame implements ActionListener
 
   Frame f1 = new Frame();
   Label l1 = new Label("Enter First Num");
   Label l2 = new Label("Enter Second Num");
   Label l3 = new Label("Enter the  third Num");
   Label l4 = new Label("Maximum number is");
   TextField t1 = new TextField();
   TextField t2 = new TextField();
   TextField t3 = new TextField();
   TextField t4 = new TextField();

   Button b1 = new Button("Max");
   Button b2 = new Button(" Cancel");

   findmax ()
   {
      l1.setBounds(50,100,100,20);
      l2.setBounds(50, 140, 100, 20);
      l3.setBounds(50, 180, 100, 20);
      l4.setBounds(50, 220, 100, 20);
      t1.setBounds(200, 100, 100, 20);
      t2.setBounds(200, 140, 100, 20);
      t3.setBounds(200, 180, 100, 20);
      t4.setBounds(200, 220, 100,20);

      b1.setBounds(50, 250, 50, 20);
      b2.setBounds(110, 250, 50, 20);

      b1.setBackground(Color.red);
      b2.setBackground(Color.green);

      f1.add(l1);
      f1.add(l2);
      f1.add(l3);
      f1.add(l4);
      f1.add(t1);
      f1.add(t2);
      f1.add(t3);
      f1.add(t4);
      f1.add(b1);
      f1.add(b2);

      b1.addActionListener(this);
      b2.addActionListener(this);

      f1.setLayout(null);
      f1.setVisible(true);
      f1.setSize(500,500);
      l1.setForeground(Color.red);
      l2.setForeground(Color.red);
      l3.setForeground(Color.red);
      l4.setForeground(Color.red);
      f1.setForeground(Color.pink);
   }
   public void actionPerformed(ActionEvent e)
   {
    int n1=Integer.parseInt(t1.getText());
    int n2=Integer.parseInt(t2.getText());
    int n3=Integer.parseInt(t3.getText());
    int result=0;
    if(e.getSource()==b1)
    {
        if(n1>n2 && n1>n3)
        {
            result=n1;
        }
        else if (n2>n1 && n2>n3)
        {
            result=n2;
        }
        else
        {
            result=n3;
        }
        t4.setText(String.valueOf(max));
    }
    if(e.getSource()==b2)
    {
        System.exit(0);
    }
 }
     public static void main(String args[])

     {
        new findmax();
     }
   
      
  
