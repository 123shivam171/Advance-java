import java.awt.*;
public class papersolutionjava {

    public static void main(String[] args) {
        
        // Create a new JFrame
        Frame f = new Frame("Programming Language List");
        f.setLayout(null);
        f.setSize(500, 500);
        f.setVisible(true);
        List l = new List();
        l.setBounds(90, 200, 300, 200);
        l.add("Java");
        l.add("C++");
        l.add("Python");
        l.add("C#");
        l.add("JavaScript");
        f.add(l);
        

    }
}