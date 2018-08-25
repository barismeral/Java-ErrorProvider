# Java-ErrorProvider
Youtube link https://youtu.be/lMtFVxjdaGM
Custom Error Provider for Java

# Easy use
# use of:
<code>
//we first need a Jframe and JTextField

JFrame frame = new JFrame();
JTextField jtextField = new JTextField(); <code/>

// set frame
frame.setSize(300,300);
        frame.setDefaultCloseOperation(3);
        frame.setlocationRelativeTo(null);
        frame.setVisible(true);


//set jTextField

jTextField.setBounds(50,50,100,20);


// Create an JErrorProvider object 
 JErrorProvider errorProvider = new JErrorProvider();

// set errorProvider
 errorProvider.setProvider(jtextField) 

//Add textField and errorProvider in frame
frame.add(textField);
      frame.add(errorProvider.getErrorProvider());


//JErrorProvider Methods

public void setProvider(JTextField jtextfield) // set provider
public void disableIcon() // disible icon
public void stop() // stopped animate icon
public void visibleOkIcon() // visibled ok icon
public void startAnimatedError() // started animate error icon 
public Component getProvider() // returned errorprovider
public void setToolTipText(String text) // set Tooltip text
</code>

