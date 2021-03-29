import java.awt.*;
import java.awt.event.*;

class MyCanvas extends Canvas implements MouseListener
{
	String str = new String("Init String");
	boolean solid = false;
	int size=50, shape=0;
	Color color = Color.RED;
	int x=50,y=50;
	int x1=10,y1=10,x2=50,y2=50;
	int twoClick = 0; //for drawing Lines
	boolean isErase = false;
	
	
	MyCanvas()
	{
		super();
		setBackground(Color.GRAY);
		this.addMouseListener(this);
	}
	public void paint(Graphics g)
	{
		if(isErase == true) g.setColor(getBackground());
		else g.setColor(color);
		switch (shape)
		{
			case 0: 
				if(solid==true) g.fillOval(x,y,size,size);
				else g.drawOval(x,y,size,size);
				break;
			case 1:
				if(solid==true) g.fillRect(x,y,size,size);
				else g.drawRect(x,y,size,size);
				break;
			case 2: 
				g.drawLine(x1,y1,x2,y2);
				break;
		}
		isErase = false;
	}
	public void setValues(int Size, Color c, int Shape)
	{
		size=Size; color=c; shape=Shape;
		repaint();
	}
	
	public void erase()
	{	
		isErase = true;
		repaint();
	}
	public void mouseClicked(MouseEvent mevt)
	{
		String str_bt = new String();
		int count = mevt.getClickCount();
		int mousebutton = mevt.getButton();
		if(mousebutton == MouseEvent.BUTTON1)//left mouse button
		{
			x = mevt.getX();
			y = mevt.getY();
			if(shape!=2)
			{ 
				if(count==2) solid=true;
				else solid = false;
				repaint();
			}
			
			if(shape==2)
			{ 	
				twoClick++;
				if(twoClick ==1) {x1=x;y1=y;}
				if(twoClick ==2) {x2=x;y2=y; twoClick=0; repaint();}
			}
		}
	}
	
	public void mousePressed(MouseEvent mevt){;}
	public void mouseReleased(MouseEvent mevt){;}
	public void mouseEntered(MouseEvent mevt){;}
	public void mouseExited(MouseEvent mevt){;}
}

