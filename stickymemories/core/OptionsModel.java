package stickymemories.core;

import java.awt.Color;
import stickymemories.core.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author andre
 */
public class OptionsModel implements Serializable {
    
    private boolean notificationsMode;
    private Color color;
    
    public OptionsModel(boolean notificationsMode, Color color){
        this.notificationsMode = notificationsMode;
        this.color = color;
    }

    public boolean getNotificationsMode() {
        return notificationsMode;
    }

    public Color getColorCode() {
        return color;
    }
    
    public static final OptionsModel loadOptions(){
        FileInputStream fins = null;
        try {
            fins = new FileInputStream(new File(Constants.OPTIONS_FILE_NAME));
        } catch (FileNotFoundException e) {
            return null;
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fins);
            return (OptionsModel) ois.readObject();
        } catch (ClassNotFoundException e){
            return null;
        } catch (IOException e) {
            return null;
        }
    }
    
    public final void saveOptions(){
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream(Constants.OPTIONS_FILE_NAME);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(fout);
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
