
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


/**
 * @author Barış
 * @version 1.0
 * @apiNote jdk 10.0
 * @since 2018.08.25
 *
 * test class
 */
public class Main{

    static JFrame frame;

    static JTextField textField;

    static JLabel tcLabel;

    /**
     * test main Method
     * @param args
     */
    public static void main(String[] args) {


   frame = new JFrame("Demo");

   frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
   frame.setLocationRelativeTo(null);
   frame.setSize(300,150);
   frame.setLayout(null);

   textField = new JTextField();
   textField.setBounds(50,40,110,24);


        tcLabel = new JLabel("Tc No:");
        tcLabel.setBounds(60,20,200,14);

frame.add(tcLabel);



   frame.add(textField);





    JErrorProvider errorProvider = new JErrorProvider();

    errorProvider.setToolTipText("Please enter 11 characters");

    errorProvider.setProvider(textField);

    frame.add(errorProvider.getProvider());




    textField.getDocument().addDocumentListener(new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {

            if (textField.getText().length()==11)
                errorProvider.visibleOkIcon();

            else
                errorProvider.startAnimatedError();

        }

        @Override
        public void removeUpdate(DocumentEvent e) {

            if (textField.getText().length()==11)
                errorProvider.visibleOkIcon();

            else
                errorProvider.startAnimatedError();

        }

        @Override
        public void changedUpdate(DocumentEvent e) {

        }
    });

        frame.setVisible(true);


    }


}
