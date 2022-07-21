import javax.swing.*;  
import java.awt.*;  
  
//create NewPage class to create a new page on which user will navigate  
class NewPage extends JFrame  
{  
	static String server_type = "s";
    //constructor  
    NewPage()  
    {  
        setDefaultCloseOperation(javax.swing.  
        WindowConstants.DISPOSE_ON_CLOSE);  
        setTitle("Inventory");  
        setSize(900, 600);  
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JLabel product_id = new JLabel("ProductID");
        JTextField product = new JTextField(15);
        JButton get_prodcut = new JButton("Get Product");
        
        p1.add(product_id);
        p1.add(product);
        p1.add(get_prodcut);
        
        JLabel product_id2 = new JLabel("ProductID");
        JTextField product2 = new JTextField(15);
        JLabel new_value = new JLabel("Value");
        JTextField value = new JTextField(15);
        JButton set_product = new JButton("SetProduct");
        
        p2.add(product_id2);
        p2.add(product2);
        p2.add(new_value);
        p2.add(value);
        p2.add(set_product);
        
        p3.add(p1);
        p3.add(p2);
        
        add(p3);
        
        
        System.out.println(server_type);
    }  
}  