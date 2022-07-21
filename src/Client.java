import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try  
	        {  
	            //create instance of the CreateLoginForm  
	            CreateLoginForm form = new CreateLoginForm();  
	            form.setSize(600,400);  //set size of the frame  
	            form.setLocationRelativeTo(null);  
	            form.setVisible(true);  //make form visible to the user  
	        }  
	        catch(Exception e)  
	        {     
	            //handle exception   
	            JOptionPane.showMessageDialog(null, e.getMessage());  
	        }  
	}

}
