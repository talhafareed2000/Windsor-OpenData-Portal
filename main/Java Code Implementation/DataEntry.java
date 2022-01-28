import java.awt.EventQueue;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//Possible class in charge of dataEntry for users
//Is a creator of Datasets()
public class DataEntry {
	
	//Variables needed for data entry
	private JFrame frame;
	private JTextField dataTitle;
	private JTextField dataDesc;
	private JTextField publisher;
	private JTextField date;
	private JTextField dataImg;
	private JTextField dataFile;
	private JTextField contactInfo;
	
	private boolean verified;
	
	private Dataset DATA [] = new Dataset [99];	//Array of Datasets to store inputs
	private int counter = 0;	//To keep track of how many records have been submitted

	//Main to test
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataEntry window = new DataEntry();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Default constructor
	public DataEntry() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		initializeVariablesOnFrame();
	}

	//Initialize and place variables onto Frame
	private void initializeVariablesOnFrame() {
		
		JLabel dataTitleLBL = new JLabel("Title");
		dataTitleLBL.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(dataTitleLBL);
		
		JLabel dataDescLBL = new JLabel("Description");
		dataDescLBL.setBounds(10, 36, 118, 14);
		frame.getContentPane().add(dataDescLBL);
		
		JLabel publisherLBL = new JLabel("Publisher");
		publisherLBL.setBounds(10, 61, 118, 14);
		frame.getContentPane().add(publisherLBL);
		
		JLabel dateLBL = new JLabel("Date");
		dateLBL.setBounds(10, 86, 46, 14);
		frame.getContentPane().add(dateLBL);
		
		JLabel dataImgLBL = new JLabel("File Image");
		dataImgLBL.setBounds(10, 111, 60, 14);
		frame.getContentPane().add(dataImgLBL);
		
		JLabel dataFileLBL = new JLabel("File");
		dataFileLBL.setBounds(10, 136, 46, 14);
		frame.getContentPane().add(dataFileLBL);
		
		JLabel contactInfoLBL = new JLabel("Contact Information");
		contactInfoLBL.setBounds(10, 161, 118, 14);
		frame.getContentPane().add(contactInfoLBL);
		
		dataTitle = new JTextField();
		dataTitle.setBounds(166, 8, 145, 20);
		frame.getContentPane().add(dataTitle);
		dataTitle.setColumns(10);
		
		dataDesc = new JTextField();
		dataDesc.setBounds(166, 33, 258, 20);
		frame.getContentPane().add(dataDesc);
		dataDesc.setColumns(10);
		
		publisher = new JTextField();
		publisher.setBounds(166, 58, 145, 20);
		frame.getContentPane().add(publisher);
		publisher.setColumns(10);
		
		date = new JTextField();
		date.setBounds(166, 83, 145, 20);
		frame.getContentPane().add(date);
		date.setColumns(10);
		
		dataImg = new JTextField();
		dataImg.setBounds(166, 108, 145, 20);
		frame.getContentPane().add(dataImg);
		dataImg.setColumns(10);
		
		dataFile = new JTextField();
		dataFile.setBounds(166, 133, 145, 20);
		frame.getContentPane().add(dataFile);
		dataFile.setColumns(10);
		
		contactInfo = new JTextField();
		contactInfo.setBounds(166, 158, 145, 20);
		frame.getContentPane().add(contactInfo);
		contactInfo.setColumns(10);
		
		JButton SubmitBttn = new JButton("Submit");
		SubmitBttn.setBounds(166, 213, 89, 23);
		frame.getContentPane().add(SubmitBttn);
		
		//Add Listener to Button
		SubmitBttn.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent arg0) {
						
						verified = verification();
						
						
						//If inputs are not null, create a new Data() object
						if(verified == true)
						{
							 DATA[counter] = new Dataset(counter, dataTitle.getText(), dataDesc.getText(), publisher.getText(), date.getText(), dataImg.getText(), dataFile.getText(), contactInfo.getText());
							 JOptionPane.showMessageDialog(null, "Thank you for your contribution. Your data has been recorded");
						}
						else
						{
							 JOptionPane.showMessageDialog(null, "Please go back and fill out all fields");
						} 
						
					}
			
				});
		
	}
	
	//This method is to verify all inputs are not NULL before making a new Data() object
	public boolean verification()
	{
		if(dataTitle.getText().isEmpty() || dataDesc.getText().isEmpty() || publisher.getText().isEmpty() || date.getText().isEmpty() || dataImg.getText().isEmpty() || dataFile.getText().isEmpty() || contactInfo.getText().isEmpty()) {
			return false;}
		
		else return true;
		
	}
}
