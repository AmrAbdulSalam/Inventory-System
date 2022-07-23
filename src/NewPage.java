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
        JTable j;
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p22 = new JPanel();
        JPanel p23 = new JPanel();
        JPanel p3 = new JPanel();
        JLabel product_id = new JLabel("ProductID");
        JTextField product = new JTextField(15);
        JButton get_prodcut = new JButton("Get Product");
        
        p1.add(product_id);
        p1.add(product);
        p1.add(get_prodcut);
        
        JLabel product_id2 = new JLabel("ProductID");
        JTextField product2 = new JTextField(15);
        JLabel count = new JLabel("Count");
        JTextField count_text = new JTextField(15);
        JLabel product_price = new JLabel("Price");
        JTextField price = new JTextField(15);
        JLabel product_name = new JLabel("Name");
        JTextField name = new JTextField(15);
        JButton set_product = new JButton("AddProduct");
        JButton update = new JButton("UpdateProduct");
        
        String[][] data = {
                { "Kundan Kumar Jha", "4031", "CSE"  , "500"},
                { "Anand Jha", "6014", "IT" , "200" }
            };
     
            // Column Names
            String[] columnNames = { "ID", "Name", "Price"  , "Count"};
     
            // Initializing the JTable
            j = new JTable(data, columnNames);
            j.setBounds(30, 40, 200, 300);
     
            // adding it to JScrollPane
            JScrollPane sp = new JScrollPane(j);
        
        
        p2.add(product_id2);
        p2.add(product2);
        p2.add(count);
        p2.add(count_text);
        p2.add(product_price);
        p2.add(price);
        p22.add(product_name);
        p22.add(name);
        p22.add(set_product);
        p22.add(update);
        p23.add(sp);
        
        
        
        p3.add(p1);
        p3.add(p2);
        p3.add(p22);
        p3.add(p23);
        add(p3);
        
        
        System.out.println(server_type);
    }  
}  