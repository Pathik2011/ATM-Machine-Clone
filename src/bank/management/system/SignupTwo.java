package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public  class SignupTwo extends JFrame implements ActionListener{
    
   
    JTextField pan,aadhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
   // JDateChooser dateChooser;
    JComboBox religion,category,occupation,education,income;
    String formno;
    
 SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACOUNT APPLICATION FORM - PAGE 2");
       
       
        
         JLabel additionalDetails = new JLabel("page 2 : Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD,22));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        String valReligion[] = {"Hindu","Muslim","Sikh","Other"};
         religion  = new JComboBox(valReligion); 
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
        
        JLabel Fname = new JLabel("Category:");
        Fname.setFont(new Font("Raleway",Font.BOLD,22));
        Fname.setBounds(100, 190, 200, 30);
        add(Fname);
        
        String valcategory[]={"General","OBC","SC","ST","Other",};
         category = new JComboBox(valcategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);
        
        
        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway",Font.BOLD,22));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
         String incomecategory[]={"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000",};
         income = new JComboBox(incomecategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
        
        
        
        JLabel gender = new JLabel("Educational");
        gender.setFont(new Font("Raleway",Font.BOLD,22));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
         JLabel email = new JLabel("Qualifaction:");
        email.setFont(new Font("Raleway",Font.BOLD,22));
        email.setBounds(100, 315, 200, 30);
        add(email);
        
        
         String educationValue[]={"Non Graducation","Graducation","Post Graducation","Doctrate","Other",};
         education = new JComboBox(educationValue);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);
        
        
        
         JLabel marital = new JLabel("Occupation:");
        marital.setFont(new Font("Raleway",Font.BOLD,22));
        marital.setBounds(100, 390, 200, 30);
        add(marital);
        
        String occupationValue[]={"Salaried","Self Employed","Bussiness","Student","Retired","Other"};
         occupation = new JComboBox(occupationValue);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
//         married = new JRadioButton("Married");
//        married.setBounds(300, 390, 100, 30);
//        married.setBackground(Color.WHITE);
//        add(married);
//                
//         unmarried = new JRadioButton("Unmarried");
//        unmarried.setBounds(450, 390, 120, 30);
//        unmarried.setBackground(Color.WHITE);
//        add(unmarried);
//        
//          other = new JRadioButton("Other");
//        other.setBounds(630, 390, 120, 30);
//        other.setBackground(Color.WHITE);
//        add(other);
//        
        

        
        JLabel address = new JLabel("PAN Number:");
        address.setFont(new Font("Raleway",Font.BOLD,22));
        address.setBounds(100, 440, 200, 30);
        add(address);
        
         pan = new JTextField();
        pan.setFont(new Font("raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);
        
        JLabel city = new JLabel("Aadhar Number:");
        city.setFont(new Font("Raleway",Font.BOLD,22));
        city.setBounds(100, 490, 200, 30);
        add(city);
        
         aadhar = new JTextField();
        aadhar.setFont(new Font("raleway", Font.BOLD, 14));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);
        
         JLabel state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway",Font.BOLD,22));
        state.setBounds(100, 540, 200, 30);
        add(state);
       
         syes = new JRadioButton("Yes");
     syes.setBounds(300, 540, 100, 30);
      syes.setBackground(Color.WHITE);
       add(syes);
               
        sno = new JRadioButton("No");
      sno.setBounds(450, 540, 120, 30);
       sno.setBackground(Color.WHITE);
       add(sno);
       
       
       ButtonGroup maritalroup = new ButtonGroup();
        maritalroup.add(syes);
        maritalroup.add(sno);
        
        JLabel pincode = new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway",Font.BOLD,22));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
       
        
         eyes = new JRadioButton("Yes");
     eyes.setBounds(300, 590, 100, 30);
      eyes.setBackground(Color.WHITE);
       add(eyes);
               
        eno = new JRadioButton("No");
      eno.setBounds(450, 590, 120, 30);
       eno.setBackground(Color.WHITE);
       add(eno);
       
       
       ButtonGroup emaritalroup = new ButtonGroup();
        emaritalroup.add(eyes);
        emaritalroup.add(eno);
        
        
        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("RALEWAY", Font.BOLD,14));
        next.setBounds(620, 660, 80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);  
        
    }
    
 public void actionPerformed(ActionEvent ae){
   
        String sreligion = (String)religion.getSelectedItem(); 
        String scategory =(String)category.getSelectedItem(); 
        String sincome = (String)income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        
        String seniorcitizen = null; 
        if (syes.isSelected()){
            seniorcitizen = "Yes";
        } else if (sno.isSelected()){
            seniorcitizen = "No";
        }
       
        String existingaccount =null;
        if(eyes.isSelected()){
            existingaccount = "Yes";
        } else if (eno.isSelected()){
            existingaccount = "No";
        }
        
        String span = pan.getText();
        String saadhar = aadhar.getText();
       
        try{
          
                 conn c = new conn();
                String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+existingaccount+"')";
            c.s.executeUpdate(query);
            
            //Signupthree
            setVisible(false);
            new SignupThree(formno).setVisible(true);
            }catch(Exception e){
            System.out.println(e);
        }
 }
    
    
    public static void main(String args[]){
    new SignupTwo("");
}   
}


