import java.applet.Applet;
import java.awt.Graphics;
/*
<applet code="AppletMax3.java"width=200 height=60>
*/

//HelloWorld class extends Applet
public class HelloWorld extends Applet {

    //overriding paint() method
    @Override public void paint(Graphics g)
    {
        g.drawString("Hello World",20,20);
    }
}