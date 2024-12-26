package javaproject;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.SimpleDateFormat;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
class button{
public ArrayList<Boolean>added;	
public ArrayList<String>descr;
public ArrayList<JPanel>buttons;
public ArrayList<JButton>dish;
public ArrayList<JLabel>edit;
public ArrayList<Double>prices;
public ArrayList<Integer>bowlsr;
public ArrayList<String>name;
public ArrayList<JButton>talab;
button(){
	added=new ArrayList<Boolean>();
	descr=new ArrayList<String>();
	buttons=new ArrayList<JPanel>();
	prices=new ArrayList<Double>();
	bowlsr=new ArrayList<Integer>();
	dish=new ArrayList<JButton>();
	edit=new ArrayList<JLabel>();
	talab=new ArrayList<JButton>();
	name=new ArrayList<String>();
	}
public void add(JPanel x,JButton y,JLabel b,double p,int bo,String n,String m) {
	descr.add(m);
buttons.add(x);	
dish.add(y);
edit.add(b);
prices.add(p);
bowlsr.add(bo);
name.add(n);
JButton j=new JButton("add");
added.add(true);
j.setBackground(new Color(31,29,43));
j.setForeground(Color.white);
talab.add(j);
}

}


public class projectjava extends JFrame {
	private JPanel ordero,order1,title,allo;
private Dimension d=new Dimension(200,250);	
private JButton save,discard,adder;
private button[] bowlss=new button[6];
private JPanel []dishes=new JPanel[6];
private JButton Hot,cold,sop,gril,ap,de,confirm;
private JButton dine,togo,del;
JScrollPane f;
private Color t=new Color(31,29,43 );

private void founder(Object object,JLabel v,double x,int y,String k) {
 	for(int i=0;i<bowlss[0].dish.size();i++) {
		if(object==bowlss[0].talab.get(i)||object==bowlss[0].dish.get(i)) {
			bowlss[0].edit.get(i).setText(v.getText());
		bowlss[0].bowlsr.set(i,y);
		bowlss[0].prices.set(i,x);
		bowlss[0].descr.set(i, k);
		}
		
	}
	for(int i=0;i<bowlss[1].dish.size();i++) {
		if(object==bowlss[1].talab.get(i)||object==bowlss[1].dish.get(i)) {
			bowlss[1].edit.get(i).setText(v.getText());
		bowlss[1].bowlsr.set(i,y);
		bowlss[1].prices.set(i,x);
		bowlss[1].descr.set(i, k);}
	}
	for(int i=0;i<bowlss[2].dish.size();i++) {
		if(object==bowlss[2].talab.get(i)||object==bowlss[2].dish.get(i));
		bowlss[2].edit.get(i).setText(v.getText());{
		bowlss[2].bowlsr.set(i,y);
		bowlss[2].prices.set(i,x);
		bowlss[2].descr.set(i, k);}
	}
	for(int i=0;i<bowlss[3].dish.size();i++) {
		if(object==bowlss[3].talab.get(i)||object==bowlss[3].dish.get(i)) {
			bowlss[3].edit.get(i).setText(v.getText());
		bowlss[3].bowlsr.set(i,y);
		bowlss[3].prices.set(i,x);
		bowlss[3].descr.set(i, k);}
	}
	for(int i=0;i<bowlss[4].dish.size();i++) {
		if(object==bowlss[3].talab.get(i)||object==bowlss[4].dish.get(i)) {
			bowlss[4].edit.get(i).setText(v.getText());
		bowlss[4].bowlsr.set(i,y);
		bowlss[4].prices.set(i,x);
		bowlss[4].descr.set(i, k);}
	}
	for(int i=0;i<bowlss[5].dish.size();i++) {
		if(object==bowlss[5].talab.get(i)||object==bowlss[5].dish.get(i)) {
			bowlss[5].edit.get(i).setText(v.getText());
		bowlss[5].bowlsr.set(i,y);
		bowlss[5].prices.set(i,x);
		bowlss[5].descr.set(i, k);}
	}
	
	
	
}
private button clone[]=new button[6];
private pay pp;
private int ordercount=1;
private JButton cancel,ret;
private JPanel p4;
private JLabel glopal,glopal2;

private class pay extends JPanel{

pay(){ 
	
	cancel=new JButton("   Cancel");
	cancel.setBackground(t);
	cancel.setForeground(new Color(234, 124, 105));
	cancel.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			projectjava.this.setVisible(false);
			  card.show(cent,"panel1");
			ordero.add(r,BorderLayout.CENTER);
			
			confirm.setVisible(true);
			projectjava.this.setVisible(true);
			
		}

	
	});
	ret=new JButton("   Confirm Payment");
	
	JPanel sou=new JPanel();
	sou.setLayout(new GridLayout());
	sou.add(cancel);
	sou.add(ret);
	ret.setBackground(new Color(234, 124, 105));
	ret.setForeground(Color.white);
this.setLayout(new BorderLayout());
JPanel p1,p2;
p1=new JPanel();
p1.setBackground(t);
p2=new JPanel(new BorderLayout());
p2.setBackground(t);
add(p1,BorderLayout.WEST);
add(p2);
JPanel p3=new JPanel(new FlowLayout(FlowLayout.LEFT));
p3.setBackground(t);
p4=new JPanel(new BorderLayout());
p4.setBackground(t);
p1.setLayout(new BorderLayout());
p1.add(p3,BorderLayout.NORTH);
JLabel glp=new JLabel("<html>   Confirmation<br>"+glopal.getText());
glp.setBackground(t);
glp.setForeground(Color.white);
p3.add(glp); 
p1.add(p4,BorderLayout.CENTER);
glopal2=new JLabel();
glopal2.setForeground(Color.white);
p1.add(glopal2,BorderLayout.SOUTH);
p4.add(r,BorderLayout.CENTER);
p4.add(sum,BorderLayout.SOUTH);

JPanel cashp=new JPanel(new BorderLayout());
JPanel uu=new JPanel();
JPanel b=new JPanel();
JPanel f=new JPanel(new FlowLayout(FlowLayout.LEFT));
cashp.add(f,BorderLayout.CENTER);
f.setBackground(t);
b.add(cashp);
b.add(uu);
cashp.setVisible(false);

b.setBackground(t);
p2.add(b,BorderLayout.CENTER);

uu.setBackground(t);
uu.setLayout(new BorderLayout());
JLabel io=new JLabel("<html>   Payment<br>2 payment methods avilable<br>-------------------------------------------------------------------------------------");
io.setBackground(t);
io.setForeground(Color.WHITE);
JLabel io2=new JLabel("<html>   Payment<br>2 payment methods avilable<br>-------------------------------------------------------------------------------------");
io2.setBackground(t);cashp.add(io2,BorderLayout.NORTH);
io2.setForeground(Color.WHITE);
uu.add(io,BorderLayout.NORTH);
JPanel cc=new JPanel();
cc.setBackground(t);
cc.setLayout(new BorderLayout());
JLabel i1=new JLabel("  Payment Method");
i1.setBackground(t);
i1.setForeground(Color.WHITE);
cc.add(i1,BorderLayout.NORTH);
uu.add(cc,BorderLayout.CENTER);

cashp.setBackground(t);
JButton open=new JButton("open the cash box");
open.setBackground(new Color(234, 124, 105));
open.setForeground(Color.white);
JButton close=new JButton("Close the cash Box");
close.setBackground(new Color(234, 124, 105));
close.setForeground(Color.white);

close.setVisible(false);
open.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		JOptionPane.showMessageDialog(null,"You opend the cash Box","Cash Box",JOptionPane.INFORMATION_MESSAGE);
		projectjava.this.setVisible(false);open.setVisible(false);
close.setVisible(true);projectjava.this.setVisible(true);		
	}
});
close.addActionListener(new ActionListener() {
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null,"You closed the cash Box","Cash Box",JOptionPane.INFORMATION_MESSAGE);
		projectjava.this.setVisible(false);open.setVisible(true);
close.setVisible(false);projectjava.this.setVisible(true);		
	}
	
});
JPanel evert=new JPanel(new GridLayout(0,1));
cc.add(evert,BorderLayout.CENTER);
JPanel cent1=new JPanel();
cent1.setBackground(t);this.setBackground(t);
JButton v1,v2 ;
v1=new JButton("Credit Card");v2=new JButton("Cash");
v1.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		projectjava.this.setVisible(false);
		cashp.setVisible(false);uu.setVisible(true);
	
		cent1.add(v1);
		cent1.add(v2);
		projectjava.this.setVisible(true);
		
	}
	
});
v2.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		projectjava.this.setVisible(false);
		uu.setVisible(false);
		cashp.setVisible(true);
		f.add(v1);
		f.add(v2);
		f.add(open);
		f.add(close);
		projectjava.this.setVisible(true);
		
	}

	
	
});
v1.setVerticalTextPosition(SwingConstants.BOTTOM);
v1.setHorizontalTextPosition(SwingConstants.CENTER);
v1.setIcon(new ImageIcon(getClass().getResource("cr.jpg")));
v1.setBackground(t);
v1.setForeground(Color.white);


v2.setBackground(t);
v2.setForeground(Color.white);
v2.setHorizontalTextPosition(SwingConstants.CENTER);
v2.setVerticalTextPosition(SwingConstants.BOTTOM);
v2.setIcon(new ImageIcon(getClass().getResource("cash.jpg")));
cent1.setLayout(new FlowLayout(FlowLayout.LEFT));
cent1.add(v1);
cent1.add(v2);
JPanel cent2=new JPanel();
cent2.setBackground(t);
cent2.setLayout(new BorderLayout());
JLabel st=new JLabel("   Cardholder name");
st.setBackground(t);
st.setForeground(Color.white);
cent2.add(st,BorderLayout.NORTH);
JTextField tf=new JTextField(20);
tf.setPreferredSize(new Dimension(5,20));
String defaultText="enter the name";
tf.addFocusListener(new FocusListener() {
	String h=tf.getText();
    @Override
    public void focusGained(FocusEvent e) {
        // Clear the default text when the text field gains focus
        if (tf.getText().equals(defaultText)) {
            tf.setText(h);
            tf.setForeground(Color. white);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        // Restore the default text if the text field is empty when losing focus
        if (tf.getText().isEmpty()) {
            tf.setForeground(Color.gray);
            tf.setText(defaultText);
        }
    }
});
tf.setBackground(t);
tf.setForeground(Color.white);
p2.add(sou,BorderLayout.SOUTH);
tf.setCaretColor(Color.red);
cent2.add(tf,BorderLayout.CENTER);
JPanel cent3=new JPanel();
cent3.setBackground(t);
cent3.setLayout(new BorderLayout());
JLabel st1=new JLabel("   Card Number");

st1.setBackground(t);
st1.setForeground(Color.white);

cent3.add(st1,BorderLayout.NORTH);
JTextField tf1=new JTextField(20);
tf1.setBackground(t);
String defaultText2="enter the card number";
tf1.addFocusListener(new FocusListener() {
	String h=tf1.getText();
    @Override
    public void focusGained(FocusEvent e) {
        // Clear the default text when the text field gains focus
        if (tf1.getText().equals(defaultText2)) {
            tf1.setText(h);
            tf1.setForeground(Color. white);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        // Restore the default text if the text field is empty when losing focus
        if (tf1.getText().isEmpty()) {
            tf1.setForeground(Color.gray);
            tf1.setText(defaultText2);
        }
    }
});
tf1.setForeground(Color.white);
tf1.setCaretColor(Color.red);
cent3.add(tf1,BorderLayout.CENTER);
JPanel cent4=new JPanel(new GridLayout());
cent4.setBackground(t);
JPanel ce1=new JPanel();
ce1.setBackground(t);
JPanel ce2=new JPanel();
ce2.setBackground(t);
cent4.add(ce1);
cent4.add(ce2);
ce1.setLayout(new BorderLayout());
JLabel st2=new JLabel("   Expiration Date");
st2.setBackground(t);
st2.setForeground(Color.white);
ce1.add(st2,BorderLayout.NORTH);
JTextField tf3=new JTextField(20);
tf3.setSize(20, 5);
tf3.setBackground(t);
tf3.setForeground(Color.white);
tf3.setCaretColor(Color.red);
ce1.add(tf3,BorderLayout.CENTER);
ce2.setLayout(new BorderLayout());
JLabel st55=new JLabel("   CVV");
st55.setBackground(t);
st55.setForeground(Color.white);
ce2.add(st55,BorderLayout.NORTH);
JPasswordField tf34=new JPasswordField(20);
tf34.setBackground(t);
tf34.setForeground(Color.white);
tf34.setCaretColor(Color.red);
ce2.add(tf34,BorderLayout.CENTER);
evert.add(cent1);evert.add(cent2);evert.add(cent3);evert.add(cent4);
confirm.setVisible(true);
sum.add(confirm,BorderLayout.SOUTH);
ordero.add(sum,BorderLayout.SOUTH);
ordero.add(r,BorderLayout.CENTER);
ret.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		if(!cashp.isVisible()&&(tf1.getText().isEmpty()||tf.getText().isEmpty()||tf3.getText().isEmpty()||tf34.getText().isEmpty())) {
			JOptionPane.showMessageDialog(null,"Please fill all fields!","EROR",JOptionPane.ERROR_MESSAGE);
			
		}
		else if(count1==0) {
			JOptionPane.showMessageDialog(null,"You have nothing to sell!","EROR",JOptionPane.ERROR_MESSAGE);
		}
		else {
		projectjava.this.setVisible(false);
fdine.removeAll();
count1=0;
glopal2.setText("sub total:          "+count1);

r.setViewportView(fdine);
ftogo.setVisible(false);
fdine.setVisible(true);
fdel.setVisible(false);
card.show(cent,"panel1");
ordero.add(r,BorderLayout.CENTER);

confirm.setVisible(true);
dine.setForeground(new Color(234, 124, 105));
togo.setForeground(Color.white);
del.setForeground(Color.white);
c1.setText("sub total:          "+count1);
ordercount++;
glopal.setText("#Order:"+ ordercount );
for(int i=0;i<6;i++) {
	for(int j=0;j<bowlss[i].added.size();j++) {
		bowlss[i].added.set(j,true);
	}
}
	projectjava.this.setVisible(true);	
	}}
	
});

}
}
private class editor implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
	
		
	String m1 = null,m2 = null,m3;
	while(true) {
		try {
			
			m3=JOptionPane.showInputDialog("what is the description?");
			if(m3.isEmpty()) {
				JOptionPane.showMessageDialog(null,"enter an invalid value","EROR",JOptionPane.ERROR_MESSAGE);
				continue;
			}break;
			
		}
		catch(Exception em) {
			JOptionPane.showMessageDialog(null,"enter an invalid value","EROR",JOptionPane.ERROR_MESSAGE);
		}
	}
	boolean g=true;
	while(g) {
	try {
	m1=JOptionPane.showInputDialog("what is the price?");
	double price=Double.parseDouble(m1);
	
	if(Double.parseDouble(m1)<0) {
		JOptionPane.showMessageDialog(null,"enter an invalid value","EROR",JOptionPane.ERROR_MESSAGE);
	continue;}g=false;}
	catch(Exception e1) {
		
		JOptionPane.showMessageDialog(null,"You enterd a non double value\nplease enter the value again","EROR",JOptionPane.ERROR_MESSAGE);
		
	}}
	g=true;
	while(g) {
		try {
	m2=JOptionPane.showInputDialog("what is the remaning bowls of it?");
	int bolws=Integer.parseInt(m2);
	if(bolws<0) {
		JOptionPane.showMessageDialog(null,"enter an invalid value","EROR",JOptionPane.ERROR_MESSAGE);
	continue;}g=false;}
		catch(Exception e1) {
		
			JOptionPane.showMessageDialog(null,"You enterd a non integer value\nplease enter the value again","EROR",JOptionPane.ERROR_MESSAGE);
		}	
	}
	JLabel nep=new JLabel("<html>           price : "+m1+"$ , "+m2+" bowls exist<br>"+m3);
	founder(e.getSource(),nep,Integer.parseInt(m1),Integer.parseInt(m2),m3);
	projectjava.this.setVisible(false);
	projectjava.this.setVisible(true);
	}
	
}private class addb implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
	
		JPanel mn=new JPanel();
		String des;
		String name;
		while(true) {
		try {
		name=JOptionPane.showInputDialog("what is the name of the new bowl?");
		des=JOptionPane.showInputDialog("what is the description?");
		if(name.isEmpty()||des.isEmpty()) {
			 JOptionPane.showMessageDialog(null,"You enters an invalid value","EROR",JOptionPane.ERROR_MESSAGE);
continue;			
		}break;
		}catch(Exception en) {	
			 JOptionPane.showMessageDialog(null,"You enters an invalid value","EROR",JOptionPane.ERROR_MESSAGE);	
		}
			
			
		}
	String m1,m2;
	
	int p;
	while(true) {
		try{
	m1=JOptionPane.showInputDialog("what is the price of the new bowl?");
	p=Integer.parseInt(m1);
	if(p<0) {
		 JOptionPane.showMessageDialog(null,"You enters an invalid value","EROR",JOptionPane.ERROR_MESSAGE);
		 continue;
	}
	break;}
	catch(Exception em) {
		JOptionPane.showMessageDialog(null,"You enters an invalid value","EROR",JOptionPane.ERROR_MESSAGE);	
	}
	}
int bo;
while(true) {
	try {
	m2=JOptionPane.showInputDialog("how many bowls did you prepare?");
	bo=Integer.parseInt(m2);
	if(bo<0) {
		 JOptionPane.showMessageDialog(null,"You enters an invalid value","EROR",JOptionPane.ERROR_MESSAGE);
		 continue;
	}
	break;
	}catch(Exception em) {
		JOptionPane.showMessageDialog(null,"You enters an invalid value","EROR",JOptionPane.ERROR_MESSAGE);	
	}
}
	JLabel nep=new JLabel("<html>           price : "+m1+"$ , "+m2+" bowls exist<br>"+des);
	mn.setLayout(new BorderLayout());
	JButton b=new JButton("edit dish");
	mn.setBackground(t);
	b.setBackground(t);
	b.setForeground(Color.white);
	nep.setBackground(t);
	nep.setForeground(Color.white);
	JFileChooser sor=new JFileChooser();
	JFrame z=new JFrame(); boolean r=true;JLabel g=new JLabel();
	  while(r) { int result = sor.showOpenDialog(z);

   
   
      if (result == JFileChooser.APPROVE_OPTION) {
          java.io.File selectedFile = sor.getSelectedFile();

          ImageIcon icon = new ImageIcon(selectedFile.getAbsolutePath());
         g.setIcon(icon);
         r=false;
      } else {
    	  JOptionPane.showMessageDialog(null,"You didn't choose a file yet!","EROR",JOptionPane.ERROR_MESSAGE);
    	  continue;
      }
    }
    
    mn.add(g,BorderLayout.NORTH);
    mn.add(nep,BorderLayout.CENTER);
    mn.add(b,BorderLayout.SOUTH);
    b.addActionListener(new editor());
    
    if(dishes[0].isVisible()) {
    	bowlss[0].add(mn, b, nep,p,bo,name,des);
    	dishes[0].add(mn);
    }
    else if(dishes[1].isVisible()) {
    	bowlss[1].add(mn, b, nep,p,bo,name,des);
    	dishes[1].add(mn);
    }
    else if(dishes[2].isVisible()) {
    	bowlss[2].add(mn, b, nep,p,bo,name,des);
    	dishes[2].add(mn);
    	}else if(dishes[3].isVisible()) {
    		bowlss[3].add(mn, b, nep,p,bo,name,des);
    		dishes[3].add(mn);
    	}
    	else if(dishes[4].isVisible()) {
    		bowlss[4].add(mn, b, nep,p,bo,name,des);
    		dishes[4].add(mn);
    	}
    	else if(dishes[5].isVisible()) {
    		bowlss[5].add(mn, b, nep,p,bo,name,des);
    		dishes[5].add(mn);
    	}
   getContentPane().validate();
	}
	
}
private class trasport implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if(!up.isVisible()) {
			adder.setVisible(false);
		}
		else 	adder.setVisible(true);
		if(e.getSource()==Hot) {
			for(int i=0;i<6;i++) {
			dishes[i].setVisible(false);
			}
			dishes[0].setVisible(true);
		dishes[0].add(adder);
		for(JPanel i:bowlss[0].buttons) {
			dishes[0].add(i);
		}
    Hot.setForeground(Color.ORANGE);
	cold.setForeground(Color.white);
	sop.setForeground(Color.white);
	gril.setForeground(Color.white);
	ap.setForeground(Color.white);
	de.setForeground(Color.white);
	f.setViewportView(dishes[0]);
	}else if(e.getSource()==cold) {
		for(int i=0;i<6;i++) {
			dishes[i].setVisible(false);
			}
			dishes[1].setVisible(true);
		dishes[1].add(adder);
		for(JPanel i:bowlss[1].buttons) {
			dishes[1].add(i);
		}
		cold.setForeground(Color.ORANGE);
Hot.setForeground(Color.white);
sop.setForeground(Color.white);
gril.setForeground(Color.white);
ap.setForeground(Color.white);
de.setForeground(Color.white);
f.setViewportView(dishes[1]);
}else if(e.getSource()==sop) {
	for(int i=0;i<6;i++) {
		dishes[i].setVisible(false);
		}
		dishes[2].setVisible(true);
	dishes[2].add(adder);
	for(JPanel i:bowlss[2].buttons) {
		dishes[2].add(i);
	}
	sop.setForeground(Color.ORANGE);
cold.setForeground(Color.white);
Hot.setForeground(Color.white);
gril.setForeground(Color.white);
ap.setForeground(Color.white);
de.setForeground(Color.white);
f.setViewportView(dishes[2]);
}
else if(e.getSource()==gril) {
	for(int i=0;i<6;i++) {
		dishes[i].setVisible(false);
		}
		dishes[3].setVisible(true);
	dishes[3].add(adder);
	for(JPanel i:bowlss[3].buttons) {
		dishes[3].add(i);
	}
	gril.setForeground(Color.ORANGE);
cold.setForeground(Color.white);
sop.setForeground(Color.white);
Hot.setForeground(Color.white);
ap.setForeground(Color.white);
de.setForeground(Color.white);
f.setViewportView(dishes[3]);
}else if(e.getSource()==ap) {
	for(int i=0;i<6;i++) {
		dishes[i].setVisible(false);
		}
		dishes[4].setVisible(true);
	dishes[4].add(adder);
	for(JPanel i:bowlss[4].buttons) {
		dishes[4].add(i);
	}
	ap.setForeground(Color.ORANGE);
cold.setForeground(Color.white);
sop.setForeground(Color.white);
gril.setForeground(Color.white);
Hot.setForeground(Color.white);
de.setForeground(Color.white);
f.setViewportView(dishes[4]);
}
else if(e.getSource()==de) {
	for(int i=0;i<6;i++) {
		dishes[i].setVisible(false);
		}
		dishes[5].setVisible(true);
	dishes[5].add(adder);
	for(JPanel i:bowlss[5].buttons) {
		
		dishes[5].add(i);
	}
	
	de.setForeground(Color.ORANGE);
cold.setForeground(Color.white);
sop.setForeground(Color.white);
gril.setForeground(Color.white);
ap.setForeground(Color.white);
Hot.setForeground(Color.white);
f.setViewportView(dishes[5]);
}	
}
	
}
private void go() {
	ho.setSize(up.getWidth(),up.getHeight());
	ho.add(f,BorderLayout.CENTER);
	adder.setVisible(false);
	oop1.add(Hot);
	oop1.add(cold);
	oop1.add(sop);
	oop1.add(gril);
	oop1.add(ap);
	oop1.add(de);
	  card.show(cent,"panel1");
	  for(int i=0;i<6;i++) {
		 
	for(int j=0;j<bowlss[i].buttons.size();j++) {
	bowlss[i].buttons.get(j).remove(bowlss[i].dish.get(j));
	bowlss[i].buttons.get(j).add(bowlss[i].talab.get(j),BorderLayout.SOUTH);
	bowlss[i].talab.get(j).addActionListener(new addt());
	}
	 dishes[i].setPreferredSize(new Dimension(400,2000));
	  }
	view.add(f,BorderLayout.CENTER);
	  
}
private JPanel x2;
private class update extends JPanel{
	public update(){
		JLabel title=new JLabel("Product Management");
		title.setForeground(Color.WHITE);
		Hot=new JButton("Hot Dishes");
		cold=new JButton("Cold Dishes");
		sop=new JButton("Soup");
		gril=new JButton("Grill");
		ap=new JButton("Appetizer");
		de=new JButton("Dessert");
	for(int i=0;i<6;i++) {
	dishes[i]=new JPanel();
	bowlss[i]=new button();
	dishes[i].setLayout(new  FlowLayout(FlowLayout.LEFT));
	dishes[i].setPreferredSize(new Dimension(400,2000));
	dishes[i].setBackground(t);
	}
		this.setLayout(new BorderLayout());
		JPanel x=new JPanel();
		x.setLayout(new BorderLayout());
		x.setBackground(t);
		x.add(title,BorderLayout.NORTH);
		
	
		x2=new JPanel();
		x2.setLayout(new FlowLayout(FlowLayout.LEFT));
		x2.add(Hot);x2.add(cold);x2.add(sop);
		x2.add(gril);x2.add(ap);x2.add(de);
		x2.setBackground(t);
		x.add(x2,BorderLayout.CENTER);
	 add(x,BorderLayout.NORTH);
		
		save =new JButton("Save Changes");
		discard=new JButton("Discard Changes");
		JPanel x3=new JPanel();
		x3.setBackground(t);
		x3.setLayout(new FlowLayout(FlowLayout.LEFT));
		x3.add(discard);
		
		x3.add(save);
		add(x3,BorderLayout.SOUTH);
		adder=new JButton();
		adder.setIcon(new ImageIcon(getClass().getResource("add.jpg")));
		
		adder.setPreferredSize(d);
		dishes[0].add(adder);

	
	
		f=new JScrollPane(dishes[0]);
		
		f.setBackground(t);
		
	    f.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	   f.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		f.setBackground(t);
		//f.setPreferredSize(new Dimension(400,300));
		add(f);
		JPanel mn=new JPanel();
		JLabel dish1=new JLabel();
		Icon v=new ImageIcon(getClass().getResource("spicy.jpg"));
		mn.add(dish1);
		JLabel sora=new JLabel();
		sora.setIcon(v);
		mn.setLayout(new BorderLayout());
		mn.add(sora,BorderLayout.NORTH);  
		JLabel o=new JLabel("           price : 2.69$, 30 bowls exist");
		o.setForeground(Color.WHITE);
		o.setBackground(t);
		mn.add(o,BorderLayout.CENTER);
		JButton edit1 =new JButton("edit dish");
		edit1.setBackground(t);
		edit1.setForeground(Color.white);
		mn.add(edit1,BorderLayout.SOUTH);
		mn.setPreferredSize(d);
		bowlss[0].add(mn, edit1, o,2.69,30,"spicy","");
		dishes[0].add(mn);
		JPanel mn2=new JPanel();
		JLabel o2=new JLabel("           price : 2.29$ , 20 bowls exist");
		save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	JOptionPane.showMessageDialog(null,"changes saved");
            go();
            
            }
        });
		discard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           
      
                // Handle Discard button click event
                int result = JOptionPane.showConfirmDialog(projectjava.this, "Discard changes?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(projectjava.this, "Changes discarded");
                
                bowlss=Arrays.copyOf(clone,6);
                  go();    
                }
            	
            	
            	
            }
        });
		JButton edit2=new JButton("edit dish");
		JLabel sora2=new JLabel();
		sora2.setIcon(new ImageIcon(getClass().getResource("pasta.jpg")));
		mn2.setLayout(new BorderLayout());
		mn2.add(sora2,BorderLayout.NORTH);
		mn2.add(o2,BorderLayout.CENTER);
		mn2.add(edit2,BorderLayout.SOUTH);
		o2.setBackground(t);
		o2.setForeground(Color.white);
		edit2.setBackground(t);
		edit2.setForeground(Color.white);
		mn2.setPreferredSize(d);
		dishes[0].add(mn2);
		mn2.setBackground(t);
		mn.setBackground(t);
		bowlss[0].add(mn2,edit2,o2,2.29,20,"pasta","");
		for(JButton i:bowlss[0].dish) {
			i.addActionListener(new editor());
		}
		adder.setBackground(t);
	adder.addActionListener(new addb());	
	Hot.addActionListener(new trasport());
	cold.addActionListener(new trasport());
	ap.addActionListener(new trasport());
	sop.addActionListener(new trasport());
	gril.addActionListener(new trasport());
	de.addActionListener(new trasport());
	Hot.setBackground(t);
	cold.setBackground(t);
	sop.setBackground(t);
	gril.setBackground(t);
	ap.setBackground(t);
	de.setBackground(t); 
	Hot.setForeground(Color.ORANGE);
	cold.setForeground(Color.white);
	sop.setForeground(Color.white);
	gril.setForeground(Color.white);
	ap.setForeground(Color.white);
	de.setForeground(Color.white);
	save.setBackground(new Color(234, 124, 105));
	save.setForeground(Color.white);
	discard.setBackground(t);
	discard.setForeground(new Color(234,124,105));	
	}
}
private ArrayList<JPanel>din;
private JPanel fdine,ftogo,fdel;
private class changer implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==dine||box.getSelectedIndex()==0) {
		c1.setText("sub total:          "+count1);
		r.setViewportView(fdine);
		ftogo.setVisible(false);
		fdine.setVisible(true);
		fdel.setVisible(false);
		dine.setForeground(new Color(234, 124, 105));
		togo.setForeground(Color.white);
		del.setForeground(Color.white);
	}else if(e.getSource()==togo||box.getSelectedIndex()==1) {
		c1.setText("sub total:          "+count2);
		r.setViewportView(ftogo);
		ftogo.setVisible(true);
		fdine.setVisible(false);
		fdel.setVisible(false);
		dine.setForeground(Color.white);
		togo.setForeground(new Color(234, 124, 105));
		del.setForeground(Color.white);
	}else if(e.getSource()==del||box.getSelectedIndex()==2) {
		c1.setText("sub total:          "+count3);
		ftogo.setVisible(false);
		fdine.setVisible(false);
		fdel.setVisible(true);
		r.setViewportView(fdel);
		dine.setForeground(Color.white);
		togo.setForeground(Color.white);
		del.setForeground(new Color(234, 124, 105));
	}
		
	}
	
}
private class action implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
	for(int i=0;i<6;i++) {
		select[i].setForeground(Color.white);
		if(e.getSource()==select[i]) {
			select[i].setForeground(new Color(234, 124, 105) );
			r2.setViewportView(select2[i]);
		}
	}
		
	}
	
}
private JComboBox box;
private JPanel oop1,sum;
private JButton sitn;
private JButton[]select=new JButton[6];
private JPanel[]select2=new JPanel[6];
private JScrollPane r,r2;
private button[]newfz=new button [6];

private double count1=0,count2=0,count3=0;
private JLabel c1;

private class home extends JPanel{
home(){	
c1=new JLabel("sub total:            0");


	
	din=new ArrayList<JPanel>();
	this.setLayout(new BorderLayout());
fdine=new JPanel(new GridLayout(0,1));
fdine.setBackground(t);
r=new JScrollPane();
String namesp[]= {"Dine In","To Go","Delivery"};
box =new JComboBox(namesp);

r.setBackground(t);
r.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
r.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
r.setBackground(t);
ftogo=new JPanel(new GridLayout(0,1));
ftogo.setBackground(t);
fdel=new JPanel(new GridLayout(0,1));
fdel.setBackground(t);
ordero=new JPanel();
title=new JPanel();
order1=new JPanel();

JLabel tit=new JLabel("An-Najah-Rest");
JLabel kk=new JLabel();
kk.setLayout(new FlowLayout(FlowLayout.LEFT));
kk.setBackground(t);
tit.setBackground(t);
tit.setLayout(new FlowLayout(FlowLayout.LEFT));
kk.setForeground(Color.white);
tit.setForeground(Color.white);

JPanel oo=new JPanel();
oo.setLayout(new BorderLayout());
SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
Date currentDate = new Date();
String cd = dateFormat.format(currentDate);
kk.setText(cd);
oo.setBackground(t);
oo.add(tit,BorderLayout.NORTH);
oo.add(kk,BorderLayout.CENTER);
JTextField search=new JTextField(20);
search.setBackground(Color.white);
JPanel rr=new JPanel();
rr.add(search);
search.setBackground(new Color(45, 48, 63));
search.setForeground(Color.white);
JPanel newview=new JPanel();
returnview=(JPanel) f.getViewport().getView();
search.addActionListener(new ActionListener() {

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stuborder1.remove(f);
	
	
int ol1 = 0,ol2=0;
boolean found=false;
if(search.getText().isEmpty()) {
	f.setViewportView(returnview);
}
	for(int i=0;i<6;i++) {	
		for(int j=0;j<bowlss[i].buttons.size();j++) {
			if(search.getText().equals(bowlss[i].name.get(j))) {
				newview.add(bowlss[i].buttons.get(j));
				ol1=i;ol2=j;found=true;
				returnview=(JPanel) f.getViewport().getView();
			f.setViewportView(newview);
			newview.setBackground(t);
				break;
				
			}
		}
		}
	if(!found) {
		for(int i=0;i<6;i++) {
			for(int j=0;j<bowlss[i].buttons.size();j++) {
				dishes[i].add(bowlss[i].buttons.get(j));
			}
		}
		f.setViewportView(returnview);
	}
	
	   getContentPane().validate();
	
}
});
rr.setBackground(t);
oo.add(rr,BorderLayout.EAST);
JPanel n=new JPanel();
n.setLayout(new GridLayout(0,2));
n.add(oo);
JPanel ggk=new JPanel(new BorderLayout());
ggk.add(n,BorderLayout.CENTER);
this.setBackground(t);
add(ordero,BorderLayout.EAST);
dine=new JButton("Dine In");
del=new JButton("Delivery");
togo=new JButton("To Go");
glopal=new JLabel("  #Orders:1");
JPanel fok=new JPanel();
fok.setLayout(new BorderLayout());
fok.add(glopal,BorderLayout.NORTH);
JPanel cen=new JPanel();
cen.setLayout(new FlowLayout(FlowLayout.LEFT));
cen.add(dine);
cen.add(togo);
cen.add(del);
cen.setBackground(t);
fok.setBackground(t);
glopal.setBackground(t);
glopal.setForeground(Color.WHITE);
dine.setBackground(t);
dine.setForeground(Color.WHITE);
togo.setBackground(t);
togo.setForeground(Color.WHITE);
del.setBackground(t);
del.setForeground(Color.WHITE);
fok.add(cen,BorderLayout.CENTER); 
JLabel item=new JLabel("  Item          Qty     Price");
item.setForeground(Color.white);
fok.add(item,BorderLayout.SOUTH);
add(ordero,BorderLayout.EAST);
ordero.setBackground(t);
ordero.setLayout(new BorderLayout());
add(order1,BorderLayout.CENTER);
JPanel z=new JPanel(new FlowLayout(FlowLayout.RIGHT));
z.add(fok);
z.setBackground(t);
n.add(z);
order1.setBackground(t);

add(ggk,BorderLayout.NORTH);
ordero.add(r,BorderLayout.CENTER);

dine.setForeground(new Color(234, 124, 105));
dine.addActionListener(new changer());

togo.addActionListener(new changer());
del.addActionListener(new changer());
r.setViewportView(fdine);
box.addActionListener(new changer());
JPanel oop=new JPanel(new GridLayout(0,2));
oop1=new JPanel(new FlowLayout(FlowLayout.LEFT));
JPanel oop2=new JPanel(new FlowLayout(FlowLayout.CENTER));
ggk.add(oop,BorderLayout.SOUTH);
oop1.add(Hot);
oop1.add(cold);
oop1.add(sop);
oop1.add(gril);
oop1.add(ap);
oop1.add(de);



sitn=new JButton();
sitn.setIcon(new ImageIcon(getClass().getResource("sit.jpg")));
sitn.setBackground(t);
oop2.add(sitn);
oop2.setBackground(t);
oop1.setBackground(t);
oop.setBackground(t);
oop.add(oop1);
oop.add(oop2);
adder.setVisible(false);
view=new JPanel(new BorderLayout());
JPanel gl=new JPanel();
gl.add(box);
view.add(f,BorderLayout.CENTER);
view.add(gl,BorderLayout.EAST);
box.setBackground(t);
box.setForeground(Color.white);

gl.setBackground(t);
add(view,BorderLayout.CENTER);
bowlss[0].buttons.get(0).remove(bowlss[0].dish.get(0));
bowlss[0].buttons.get(1).remove(bowlss[0].dish.get(1));
bowlss[0].buttons.get(0).add(bowlss[0].talab.get(0),BorderLayout.SOUTH);
bowlss[0].buttons.get(1).add(bowlss[0].talab.get(1),BorderLayout.SOUTH);
bowlss[0].talab.get(0).addActionListener(new addt());
bowlss[0].talab.get(1).addActionListener(new addt());
ftogo.setVisible(false);
fdel.setVisible(false);

confirm=new JButton("Continue to Payment");
confirm.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		r.setViewportView(fdine);
		ftogo.setVisible(false);
		fdine.setVisible(true);
		fdel.setVisible(false);
		
		  card.show(cent,"panel3");
		  p4.add(r,BorderLayout.CENTER);
	confirm.setVisible(false);
	glopal2.setText(c1.getText());

	   getContentPane().revalidate();
	}
	
});
confirm.setBackground(new Color(234, 124, 105));

confirm.setForeground(Color.white);
sum=new JPanel();
sum.setLayout(new BorderLayout());
sum.add(c1);
sum.setBackground(t);
c1.setForeground(Color.white);

sum.add(confirm,BorderLayout.SOUTH);
ordero.add(sum,BorderLayout.SOUTH);
r.setBackground(t); 
row=new ArrayList<Integer>();column=new ArrayList<Integer>();

sitn.addActionListener(new ActionListener(){

	@Override
	public void actionPerformed(ActionEvent e) {
		
	 	 up.setSize(ho.getWidth(),ho.getHeight());
	 	 up.add(f,BorderLayout.CENTER);
	 	x2.add(Hot);
	 	x2.add(cold);
	 	x2.add(sop);
	 	x2.add(gril);
	 	x2.add(ap);
	 	x2.add(de);
	 	  for(int i=0;i<6;i++) {
	 			for(int j=0;j<bowlss[i].buttons.size();j++) {
	 			bowlss[i].buttons.get(j).remove(bowlss[i].talab.get(j));
	 			bowlss[i].buttons.get(j).add(bowlss[i].dish.get(j),BorderLayout.SOUTH);
	 			
	 			}} 
	 	clone=Arrays.copyOf(bowlss,6);
	 	  adder.setVisible(true);
    card.show(cent,"panel2");
  
	}
	
});
ordero.setPreferredSize(new Dimension(250, 0));
count1=0;
}
}


private class addt implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		r.setBackground(t);
		
		String yu[]=new String[1];
		int[]  o1 = new int[1];int o2[]=new int[1];
		for(int i=0;i<6;i++) {
			for(int j=0;j<bowlss[i].talab.size();j++) {
				if(e.getSource()==bowlss[i].talab.get(j)) {
				
					
					o1[0]=i;o2[0]=j;
					break;
				}
				
			}
		}
		int ifremoved=bowlss[o1[0]].bowlsr.get(o2[0]);
			count1+=bowlss[o1[0]].prices.get(o2[0]);
		if(ifremoved==0) {
			JOptionPane.showMessageDialog(null,"sorry we dont have any bowl of this type!");
		}
		if(bowlss[o1[0]].added.get(o2[0])&&ifremoved>0) {
			bowlss[o1[0]].added.set(o2[0],false);
	JLabel newc=new JLabel("<html>      price:"+bowlss[o1[0]].prices.get(o2[0])+"$,"+(bowlss[o1[0]].bowlsr.get(o2[0])-1)+" exist<br>"+bowlss[o1[0]].descr.get(o2[0]));
founder(e.getSource(),newc,bowlss[o1[0]].prices.get(o2[0]),(bowlss[o1[0]].bowlsr.get(o2[0])),bowlss[o1[0]].descr.get(o2[0]));

		double u;
		JPanel ne=new JPanel();
		ne.setBackground(t);
		ne.setLayout(new BorderLayout());
		JPanel n1=new JPanel();
		JPanel n2=new JPanel();
		n1.setBackground(t);
		
		n2.setBackground(t);
		n2.setLayout(new FlowLayout(FlowLayout.LEFT));
		ne.add(n1,BorderLayout.NORTH);
		ne.add(n2,BorderLayout.CENTER);
		String h=bowlss[o1[0]].descr.get(o2[0]);
		if(h.length()>18) {
			h=h.substring(0,18);
		}
		JLabel g=new JLabel(h+"...");
		JTextField gy=new JTextField(3);
		
		gy.setBackground(new Color(45, 48, 63));
		gy.setForeground(Color.white);
		gy.setText("1");
		u=bowlss[o1[0]].prices.get(o2[0])*Double.parseDouble(gy.getText());
		g.setForeground(Color.white);
		n1.add(g);n1.add(gy);
	
		JLabel bn=new JLabel(""+bowlss[o1[0]].prices.get(o2[0]));
		bn.setForeground(Color.white);
		n1.add(bn);
		 boolean first[]=new boolean[1];
		 first[0]=true;
		 Component ycomp=(Component) e.getSource();
		 gy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(!gy.getText().isEmpty()&&ifremoved-Integer.parseInt(gy.getText())>=0)
					
			{bn.setText(""+bowlss[o1[0]].prices.get(o2[0])*Integer.parseInt(gy.getText()));
				count1+=bowlss[o1[0]].prices.get(o2[0])*Integer.parseInt(gy.getText());
				int newprice=0;
				if(first[0]) {
		
					count1-=bowlss[o1[0]].prices.get(o2[0]);
					first[0]=false;
					yu[0]=gy.getText();
					newprice=ifremoved-Integer.parseInt(gy.getText());
				}
				else {
					
				count1-=bowlss[o1[0]].prices.get(o2[0])*Integer.parseInt(yu[0]);
				newprice=ifremoved-Integer.parseInt(gy.getText());
				yu[0]=gy.getText();
				}
			
				yu[0]=gy.getText();
				JLabel newc=new JLabel("<html>      price:"+bowlss[o1[0]].prices.get(o2[0])+"f,"+newprice+" bowls exist<br>"+bowlss[o1[0]].descr.get(o2[0]));
				
				founder(ycomp,newc,bowlss[o1[0]].prices.get(o2[0]),newprice,bowlss[o1[0]].descr.get(o2[0]));
				glopal2.setText("sub total:          "+count1);
							c1.setText("sub total:          "+count1);
							
				
			}
				else{
					JOptionPane.showMessageDialog(null,"we dont have this number of bowls!\nwe have only "+ifremoved,"Eror",JOptionPane.ERROR_MESSAGE);}
				}
			
		});
	
		JTextField ex=new JTextField(18);
		ex.setCaretColor(Color.red);
		ex.setBackground(new Color(45, 48, 63));
		ex.setForeground(Color.white);
		n2.add(ex);
		JButton remove=new JButton();
	remove.setPreferredSize(new Dimension(30,40));
	
		n2.add(remove);
if(fdine.isVisible()) {
	
	glopal2.setText("sub total:          "+count1);
	first[0]=true;
				c1.setText("sub total:          "+count1);

fdine.add(ne);
din.add(ne);
}
else if(ftogo.isVisible()) {
	

	c1.setText("sub total:          "+count2);

	ftogo.add(ne);	

}
else if(fdel.isVisible()) {
	



	c1.setText("sub total:          "+count3);
	fdel.add(ne);
	
}


		remove.setIcon(new ImageIcon(getClass().getResource("removejpg.jpg")));
		remove.setHorizontalTextPosition(SwingConstants.CENTER);
		remove.setVerticalTextPosition(SwingConstants.BOTTOM);
		remove.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(ftogo.isVisible()) {
					ftogo.remove(ne);
					count2-=u;
					
					
					c1.setText("sub total:          "+count2);
					
					}
					else if(fdine.isVisible()) {
						
						JLabel newc=new JLabel("<html>      price:"+bowlss[o1[0]].prices.get(o2[0])+"$,"+ifremoved+" bowls exist<br>"+bowlss[o1[0]].descr.get(o2[0]));
						
						founder(ycomp,newc,bowlss[o1[0]].prices.get(o2[0]),ifremoved,bowlss[o1[0]].descr.get(o2[0]));
						
						bowlss[o1[0]].added.set(o2[0],true);
						count1-=Integer.parseInt(gy.getText())*bowlss[o1[0]].prices.get(o2[0]);
			
							fdine.remove(ne);
			glopal2.setText("sub total:          "+count1);
						c1.setText("sub total:          "+count1);
					}
					else if(fdel.isVisible()) {
						count3-=u;
						c1.setText("sub total:          "+count3);
						fdel.remove(ne);
					}
				
				if(fdine.getComponentCount()==0) {
					count1=0;
				c1.setText("sub total:          0");
				}
				if(ftogo.getComponentCount()==0) {
					count2=0;
				c1.setText("sub total:          0");
				}
				if(fdel.getComponentCount()==0) {
					count3=0;
				c1.setText("sub total:          0");
				}
			projectjava.this.setVisible(false);
				projectjava.this.setVisible(true);
			}
			
			//projectjava.this.setVisible(false);
			 //founder(bowlss[o1].dish.get(o2),neper,bowlss[o1].prices.get(o2),(bowlss[o1].bowlsr.get(o2)+1),bowlss[o1].descr.get(o2));
		});


		   getContentPane().validate();
	
}}}
private ArrayList<Integer>row;

private ArrayList<Integer>column;

JPanel view;
private CardLayout card; 
private home ho;
private update up,map;
private JPanel cent,returnview;;

	public projectjava() {

cent=new JPanel();
card=new CardLayout();
cent.setLayout(card);
up=new update();
ho=new home();
pp=new pay();
JPanel f=new JPanel(new BorderLayout());
f.add(ho,BorderLayout.WEST);
f.add(pp,BorderLayout.CENTER);
cent.add(ho,"panel1");
cent.add(up,"panel2");
cent.add(f,"panel3");
add(cent);

//add(pp);





	
	
		
	}

}
