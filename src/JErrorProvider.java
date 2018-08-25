import javax.swing.*;
import java.awt.*;

/**
 * @author Barış
 * @since 2018.08.25
 * @apiNote jdk 10.0
 * @version 1.0
 *
 */
public class JErrorProvider{
    JLabel errorProvider;

    /**
     * Default Constructor
     */
    public JErrorProvider(){

        errorProvider = new JLabel();


    }


    private final ImageIcon DEFAULT_ERROR_ICON = new ImageIcon("res\\error.png");
    private final ImageIcon DEFAULT_OK_ICON = new ImageIcon("res\\ok.png");
    private final ImageIcon DEFAULT_ERROR_ICON_ANIMATE = new ImageIcon("res\\error.gif");




  /**
   * @param textField
   * @since 1.0
   */
    public void setProvider(JTextField textField){

        if (textField==null) throw new NullPointerException("textfield is null");

        else {
            int x = textField.getBounds().x + textField.getBounds().width + 2;
            int y = textField.getBounds().y + (textField.getBounds().height - 20);


            int width = 15;
            int height = 15;

            Image icon = DEFAULT_ERROR_ICON.getImage();

            errorProvider.setIcon(new ImageIcon(icon));

            errorProvider.setBounds(x, y, width, height);
        }
    }




  /**
   * disabled error icon or okey icon
   * @since 1.0
   */
    public void disableIcon(){

        errorProvider.setVisible(false);
    }


    /**
     *  stop icon animation
     *  @since 1.0
     */
    public  void stop(){


        errorProvider.setIcon(new ImageIcon(DEFAULT_ERROR_ICON.getImage()));
    }


    /**
     * visible ok icon not animated
     * @since 1.0
     */
    public  void visibleOkIcon(){


       errorProvider.setIcon(new ImageIcon(DEFAULT_OK_ICON.getImage()));
    }

    /**
     * start animate error icon
     * @since 1.0
     */
    public void startAnimatedError(){


        errorProvider.setIcon(new ImageIcon(DEFAULT_ERROR_ICON_ANIMATE.getImage()));


    }

    /**
     * get Error Provider icon
     * @return errorProviderIcon
     * @since 1.0
     */
    public Component getProvider(){
        return errorProvider;
    }

    /**
     * visible ToolTipText
     * @param text
     * @since 1.0
     */
    public void setToolTipText(String text){


        errorProvider.setToolTipText(text);

    }


}
