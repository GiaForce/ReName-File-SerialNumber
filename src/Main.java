import javax.swing.*;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        String pass = JOptionPane.showInputDialog("フォルダのパスを入れてください。");
        File imagesFile = new File(pass);
        File[] images = imagesFile.listFiles();
        int a = 1;
        String extension;
        for(File f : images){
            String name = f.getName();
            extension = name.substring(name.lastIndexOf("."));
            File rename = new File(String.format(pass + "\\%d%s",a,extension));
            f.renameTo(rename);
            a++;
        }
    }
}