package component;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageComponent extends Component {
    private String imgFilename;

    public void setImgFilename(String imgFilename) {
        this.imgFilename = imgFilename;
    }

    @Override
    public void createLabel() {
        super.createLabel();
        Image image = resizeImage(createImageIcon());
        label.setIcon(new ImageIcon(image));
    }

    public ImageIcon createImageIcon(){
        URL imgURL = getClass().getClassLoader().getResource(imgFilename);

        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.out.println("Couldn't find file: " + imgFilename);
            return null;
        }
    }

    public Image resizeImage(ImageIcon icon){
        assert icon != null;
        return icon.getImage().getScaledInstance(CELL_SIZE, CELL_SIZE, Image.SCALE_SMOOTH);
    }
}
