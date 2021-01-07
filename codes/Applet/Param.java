import java.applet.Applet;
import java.awt.Graphics;

public class Param extends Applet {

    public void paint(Graphics g) {
        String str = getParameter("message");
        g.drawString(str, 50, 50);
    }

}
/*
 * <applet code="Param.class" width="300" height="300"> <param name="message"
 * value="Ei Toh Hoye Jabe"> </applet>
 */