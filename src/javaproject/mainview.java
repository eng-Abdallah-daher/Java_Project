package javaproject;
import javax.swing.*;
import java.awt.*;
import java.text.*;
import java.util.*;
class dishg extends JButton{

	private static final long serialVersionUID = 1L;
private int price,bowls;
String name;
public dishg(String nn,int pp,int bb){
price=pp;
name=nn;
bowls=bb;
setText(name+"\n$"+pp+".Bowls:"+bowls);
}
public void setImage(ImageIcon v) {
this.setImage(v);
}

class button{
public ArrayList<dishg>dishis;
button(){
	dishis=new ArrayList<dishg>();
	
	
}
public void addbutton() {
String name,price,number;
try {
name=JOptionPane.showInputDialog("what is the name of the new dish?");
price=JOptionPane.showInputDialog("what is the price of the new dish?");
number=JOptionPane.showInputDialog("how many bowls you prepared?");
int bowls=Integer.parseInt(number);
dishg x1=new dishg(name,Integer.parseInt(price),bowls);
add(x1);}
catch(Exception e) {
	JOptionPane.showMessageDialog(null,"invalid input","EROR",JOptionPane.ERROR_MESSAGE);
}

}
}
public class mainview extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JScrollPane evpanel;
private JTextField search;
private JButton hotdish,colddish,soup,gril,apptizre,dessert;
private JPanel hotd,coldd,soupp,app,grill,desert;
private JButton dine,togo,delv;
private button dishs;


	public mainview() {
super("Resturant");
setLayout(new BorderLayout());
JPanel o=new JPanel();
Color t=new Color(20,0,60);
search=new JTextField(20);
search.setToolTipText("Search");
o.setLayout(new BorderLayout());
o.add(search,BorderLayout.EAST);
getContentPane().setBackground(t);
JLabel n=new JLabel("An-Najah Rest");
n.setForeground(Color.white);
//n.setCaretColor(Color.white);
o.add(n,BorderLayout.NORTH);
n.setBackground(t);
o.setBackground(t);

add(o,BorderLayout.NORTH);

SimpleDateFormat g=new SimpleDateFormat("EEEE,yyyy-MM-dd");

Calendar c=Calendar.getInstance();
Date cu=c.getTime();
String kl=g.format(cu);
JLabel n1=new JLabel(kl);
o.add(n1,BorderLayout.WEST);
n1.setEnabled(false);
n1.setForeground(Color.white);
n1.setBackground(t);
search.setBackground(t);
search.setForeground(Color.WHITE);
JPanel nus=new JPanel();
nus.setLayout(new FlowLayout());
hotdish=new JButton("Hot Dish");
colddish=new JButton("Cold Dish");
hotdish=new JButton("Soup");
hotdish=new JButton("Gril");
hotdish=new JButton("Apptizer");
hotdish=new JButton("Dessert");
hotd=new JPanel();
coldd=new JPanel();
soupp=new JPanel();
app=new JPanel();
desert=new JPanel();
grill=new JPanel();
evpanel=new JScrollPane(hotd);
hotd.setVisible(true);
hotd.setBackground(t);
evpanel.add(coldd);
hotd.setVisible(true);
coldd.setVisible(false);
Box box = Box.createHorizontalBox();
box.add(evpanel);

add(box,BorderLayout.CENTER);
hotd.setLayout(new GridLayout(2,99,10,10));
dishs=new button();





	}

}}
