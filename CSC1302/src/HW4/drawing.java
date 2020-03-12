package HW4;
import HW4.DrawingPanel1;
import java.awt.*;
public class drawing {
		public static void main(String[] args) {
			DrawingPanel1 panel = new DrawingPanel1(400, 400);
			panel.setBackground(Color.CYAN);
			Graphics g = panel.getGraphics();
			//top Left 
			Point tL = new Point(0,0);
			String s = "TL";
			int tLSize = 100;
			int tLCircles = 5;
			int tLGrid = 1;
			drawShapes(g, s, tL, tLSize, tLCircles, tLGrid);
			//top Right 
			Point tR = new Point(150, 20);
			String s1 = "TR";
			int tRSize = 40;
			int tRCircles = 5;
			int tRGrid = 6;
			drawShapes(g, s1, tR, tRSize, tRCircles, tRGrid);
			//bottom Left
			Point bL = new Point(10, 120);
			String s2 = "BL";
			int bLSize = 24;
			int bLCircles = 4;
			int bLGrid = 5;
			drawShapes(g, s2, bL, bLSize, bLCircles, bLGrid);
			//bottom Right 
			Point bR = new Point(135, 275);
			String s3 = "BR";
			int bRSize = 36;
			int bRCircles = 3;
			int bRGrid = 3;
			drawShapes(g, s3, bR, bRSize, bRCircles, bRGrid);
		}

		public static void drawShapes (Graphics g, String str, Point p, int size, int circle, int grid) {
			int x = p.x;
			int y = p.y;
			int width = size;
			int height = size;
			for(int i =1; i <= grid; i++) {
				for(int j = 1; j <= grid; j++) {
					int centerX = x + width /2;
					int centerY = y + height /2;
					g.setColor(Color.GREEN);
					g.fillRect(x, y, width, height);
					g.setColor(Color.BLACK);
					g.drawRect(x, y, width, height);
					Point p2 = new Point(x,y);
					drawCircle(g, p2, size, circle, grid);
					switch(str) {
						case "TL":
							g.setColor(Color.BLACK);
							//tL to bR line
							g.drawLine(x, y, x+ size, y + size);
							//bL to tR line 
							g.drawLine(x + size , y, x, y + size);
							//horizontal line 
							g.drawLine(x, centerY,  x+ size, centerY);
							if(x < p.x +(size *grid)) {
								x = x + size;
							}
							//vertical line 
							//g.drawLine(centerX,  y, centerX, y + size);
							break;
						case "TR":
							g.setColor(Color.BLACK);
							//tL to bR line
							g.drawLine(x, y, x+ size, y + size);
							//bL to tR line 
							g.drawLine(x + size , y, x, y + size);
							//horizontal line 
							if ( i != 2 && i != 4) {
								g.drawLine(x, centerY,  x+ size, centerY);
							}	
							if(x < p.x +(size *grid)) {
								x = x + size;
							}
							//vertical line
							if( j != 2) { 
								g.drawLine(centerX, y, centerX, y + size);
							}
							break;
						case "BL":
							g.setColor(Color.BLACK);
							//tL to bR line
							g.drawLine(x, y, x+ size, y + size);
							//bL to tR line 
							g.drawLine(x + size , y, x, y + size);
							//horizontal line
							if( i != 3 && i != 4) {
								g.drawLine(x, centerY,  x+ size, centerY);
							}
							if(x < p.x +(size *grid)) {
								x = x + size;
							}
							//vertical line
							if( j != 1 && j != 3) {
								g.drawLine(centerX,  y, centerX, y + size);
							}	
							break;
						case "BR":
							g.setColor(Color.BLACK);
							//tL to bR line
							g.drawLine(x, y, x+ size, y + size);
							//bL to tR line 
							g.drawLine(x + size , y, x, y + size);
							//horizontal line 
							if( i != 1 && i != 4) {
								g.drawLine(x, centerY,  x+ size, centerY);
							}
							if(x < p.x +(size *grid)) {
								x = x + size;
							}
							//vertical line
							if( j != 1) {
								g.drawLine(centerX,  y, centerX, y + size);
							}	
							break;
						}
					
				}
				y = y + size;
				x = p.x;
			}
		}
		
		public static void drawCircle (Graphics g, Point p, int size, int circle, int grid) {
			int gap = (size / 2) / circle;
			int circleHeight = size;
			int circleWidth = size;
			int circleX = p.x;
			int circleY = p.y;
			for( int i = 1; i <= circle; i++) {
				g.setColor(Color.YELLOW);
				g.fillOval(circleX, circleY, circleWidth, circleHeight);
				g.setColor(Color.BLACK);
				g.drawOval(circleX, circleY, circleWidth, circleHeight);
				circleX = circleX + gap;
				circleY = circleY + gap;
				circleWidth = circleWidth - 2 * gap;
				circleHeight = circleHeight - 2 * gap;
				
			}
			if (circleX < p.x + (size * grid)) {
				circleX = circleX + size;
			}
		}

	
}