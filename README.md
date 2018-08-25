# Java-ErrorProvider
Custom Error Provider for Java

# Easy use
# use of:

## we first need a Jframe and JTextField
<code>
JFrame frame = new JFrame();
JTextField jtextField = new JTextField(); <code/>

## set frame
<code> frame.setSize(300,300);
        frame.setDefaultCloseOperation(3);
        frame.setlocationRelativeTo(null);
        frame.setVisible(true);
</code>

## set jTextField
<code> 
jTextField.setBounds(50,50,100,20);
</code>

## Create an JErrorProvider object 
<code> JErrorProvider errorProvider = new JErrorProvider(); <code/>

## set errorProvider
<code> errorProvider.setProvider(jtextField) <code/>

## Add textField and errorProvider in frame
<code>frame.add(textField);
      frame.add(errorProvider.getErrorProvider());
<code/>

# JErrorProvider Methods
<code>
public void setProvider(JTextField jtextfield) // set provider
public void disableIcon() // disible icon
public void stop() // stopped animate icon
public void visibleOkIcon() // visibled ok icon
public void startAnimatedError() // started animate error icon 
public Component getProvider() // returned errorprovider
public void setToolTipText(String text) // set Tooltip text
</code>

