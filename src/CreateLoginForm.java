import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.lang.Exception;  


class CreateLoginForm extends JFrame implements ActionListener  
{  
    //initialize button, panel, label, and text field  
    JButton b1;  
    JPanel newPanel;  
    JLabel userLabel, passLabel;  
    final JTextField  textField1, textField2;  
    JComboBox c1;
    String selectedServer;
    //calling constructor  
    CreateLoginForm()  
    {   
          
        //create label for username   
        userLabel = new JLabel();  
        userLabel.setText("Username");      //set label value for textField1  
        String s1[] = { "PHP Server", "Servlet" };  
        c1 = new JComboBox(s1);
        //c1.addActionListener(this);
        selectedServer = (String)c1.getSelectedItem();
        //create text field to get username from the user  
        textField1 = new JTextField(15);    //set length of the text  
  
        //create label for password  
        passLabel = new JLabel();  
        passLabel.setText("Password");      //set label value for textField2  
          
        //create text field to get password from the user  
        textField2 = new JPasswordField(15);    //set length for the password  
          
        //create submit button  
        b1 = new JButton("SUBMIT"); //set label to button  
          
        //create panel to put form elements  
        newPanel = new JPanel(new GridLayout(12, 1));  
        newPanel.add(userLabel);    //set username label to panel  
        newPanel.add(textField1);   //set text field to panel  
        newPanel.add(passLabel);    //set password label to panel  
        newPanel.add(textField2);   //set text field to panel  
        newPanel.add(b1);           //set button to panel  
        newPanel.add(c1);
        //set border to panel   
        add(newPanel, BorderLayout.CENTER);  
          
        //perform action on button click   
        b1.addActionListener(this);     //add action listener to button  
        setTitle("LOGIN FORM");         //set title to the login form  
    }  
      
    //define abstract method actionPerformed() which will be called on button click   
    public void actionPerformed(ActionEvent ae)     //pass action listener as a parameter  
    {  
        String userValue = textField1.getText();        //get user entered username from the textField1  
        String passValue = textField2.getText();        //get user entered pasword from the textField2  
          
        //check whether the credentials are authentic or not  
        if (userValue.equals("admin") && passValue.equals("admin")) {  //if authentic, navigate user to a new page  
              
            //create instance of the NewPage  
            NewPage page = new NewPage();  
              
            //make page visible to the user  
            page.setVisible(true);  
            NewPage.server_type = selectedServer;
            //create a welcome label and set it to the new page  
            JLabel wel_label = new JLabel("Welcome: "+userValue + " Server Type = " +selectedServer);  
            page.getContentPane().add(wel_label);  
        }  
        else{  
            //show error message  
            JOptionPane.showMessageDialog(b1,"Please enter valid username and password"); 
        }  
    }  
} 