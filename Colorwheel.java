import java.awt.*;
import java.util.*;
public class Colorwheel {
	public static void main(String[] args) {
		DrawingPanel panel= new DrawingPanel(1000,1000);
		Graphics g= panel.getGraphics();
		int one= 255;
		int two=0;
		int three=0;
		g.setColor(Color.BLACK);
		g.fillOval(200, 300, 20,20);
		g.fillOval(400,300,20,20);
		g.fillOval(300,350,50,20);
		g.drawLine(60,300,100,340);
		g.drawLine(100,350,200,350);
		g.drawLine(60,400,200,360);
		for (int radius=1; radius<=1000; radius++) {
			for (int angle=0; angle<60; angle++) { // r to y
				g.setColor(new Color(one, two, three));
				g.fillArc(50, 100, 500/radius, 500/radius, 100-(60/40)*angle,60/40);
				two+=255/60;
			}
			for (int angle=0; angle<60; angle++) { //y to g
				two=235;
				g.setColor(new Color(one, two, three));
				g.fillArc(50, 100, 500/radius, 500/radius, 40-(60/40)*angle,60/40);
				one-=255/60;
			}
			for (int angle=0; angle<60; angle++) { //g to c
				one=0;
				two=235;
				g.setColor(new Color(one, two, three));
				g.fillArc(50, 100, 500/radius, 500/radius, -20-(60/40)*angle,60/40);
				three+=255/60;
			}
			one=0;
			two=236;
			three=245;
			for (int angle=0; angle<60; angle++) { //c to b
				g.setColor(new Color(one, two, three));
				g.fillArc(50, 100, 500/radius, 500/radius, -80-(60/40)*angle,60/40);
				two-=236/60;
				three+=15/60;
			}
			one=0;
			three=245;
			for (int angle=0; angle<60; angle++) { //b to p
				
				g.setColor(new Color(one, two, three));
				g.fillArc(50, 100, 500/radius, 500/radius, -140-(60/40)*angle,60/40);
				one+=255/60;
			}
			three=255;
			for (int angle=0; angle<60; angle++) { //p to r
			
				g.setColor(new Color(one, two, three));
				g.fillArc(50, 100, 500/radius, 500/radius, -200-(60/40)*angle,60/40);
				three-=255/60;
			}
		}
		
	}
}
//one=0;
		//for (int i=1; i<=1000; i++) {
		//for (int j=1; j<=3; j++) {
		//	g.fillArc(50, 100, 500, 500, 120*j,10*i);
		//}

		//}
		
		/*for (int angle=0; angle<60; angle++) { //y to g
			one=0;
			two=0;
			g.setColor(new Color(one, two, three));
			g.fillArc(500, 500, 500, 500, 40-(60/40)*angle,60/40);
			two+=255/60; 
		} */