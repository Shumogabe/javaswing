import java.awt.*;
import java.awt.event.*;

class Painting extends Frame implements ItemListener, ActionListener, AdjustmentListener
{
	Choice shapeChoice;
	List colorList;
	CheckboxGroup colorGroup;
	Checkbox redCheckbox, greenCheckbox, blueCheckbox;
	Scrollbar sizeScrollbar;
	MyCanvas paintCanvas;
	MenuBar menubar;
	Menu menu;
	CheckboxMenuItem roundItem, squareItem, lineItem;
	MenuItem exitItem;
	Button resetButton, exitButton;
	Label sizeLabel;
	
	Color []colorarray ={Color.RED, Color.GREEN, Color.BLUE};
	int []shapearray ={0,1,2}; //0.Round 1.Square 2.Line
	//default values:
	Color color = colorarray[0];
	int shape = shapearray[0]; 
	int size = 60;

	
	
	Painting()
	{
		setTitle("My Painting");
		setLayout(null);
		
		menubar = new MenuBar(); 
		menu = new Menu("Shapes");
		roundItem = new CheckboxMenuItem("Round");
		squareItem = new CheckboxMenuItem("Square");
		lineItem = new CheckboxMenuItem("Line");
		exitItem = new MenuItem("Exit");
		//lineItem.disable();
		//roundItem.addActionListener(this);
		roundItem.addItemListener(this);
		squareItem.addItemListener(this);
		lineItem.addItemListener(this);
		//exitItem.addItemListener(this);
		exitItem.addActionListener(this);
                

		menu.add(roundItem);
		menu.add(squareItem);
		menu.add(lineItem);
		menu.addSeparator();
		menu.add(exitItem);
                menubar.add(menu);
		this.setMenuBar(menubar);
		
		
		shapeChoice = new Choice();
		shapeChoice.setBounds(30,80,100,50);
		shapeChoice.addItem("Round");
		shapeChoice.addItem("Square");
		shapeChoice.addItem("Line");
		shapeChoice.setBackground(Color.GREEN);
		shapeChoice.addItemListener(this);
		add(shapeChoice);
		
		colorList = new List();
		colorList.setBounds(30,310,100,50);
		colorList.addItem("Red");
		colorList.addItem("Green");
		colorList.addItem("Blue");
		colorList.setBackground(Color.cyan);
		colorList.addItemListener(this);
		add(colorList);
	
		colorGroup = new CheckboxGroup();
		redCheckbox = new Checkbox("Red",colorGroup,true);
		greenCheckbox = new Checkbox("Green",colorGroup,false);
		blueCheckbox = new Checkbox("Blue",colorGroup,false);
		redCheckbox.setBounds(70,140,50,50);
		greenCheckbox.setBounds(70,190,50,50);
		blueCheckbox.setBounds(70,240,50,50);
		redCheckbox.addItemListener(this);
		blueCheckbox.addItemListener(this);
		greenCheckbox.addItemListener(this);
		add(redCheckbox);
		add(greenCheckbox);
		add(blueCheckbox);
		
		sizeLabel = new Label("Size:");
		sizeLabel.setBounds(30,110,50,30);
		add(sizeLabel);
		
		sizeScrollbar = new Scrollbar(Scrollbar.VERTICAL,60,10,20,110);
		sizeScrollbar.setBounds(30,140,20,150);
		sizeScrollbar.addAdjustmentListener(this);
		add(sizeScrollbar);
		
		paintCanvas = new MyCanvas();
		paintCanvas.setBounds(150,80,420,300);
		add(paintCanvas);
		
		resetButton = new Button("Reset");
		resetButton.setBackground(Color.YELLOW);
		resetButton.setBounds(450,390,50,40);
		exitButton = new Button("Exit");
		exitButton.setBackground(Color.YELLOW);
		exitButton.setBounds(520,390,50,40);
		resetButton.addActionListener(this);
		exitButton.addActionListener(this);
		add(resetButton);
		add(exitButton);

		//default values:
		roundItem.setState(true);
		shapeChoice.select(0);
		colorList.select(0);
		
		
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent evt){System.exit(0);}
		});

		
	}
	public void adjustmentValueChanged(AdjustmentEvent evt)
	{
		size = sizeScrollbar.getValue();
		paintCanvas.setValues(size, color, shape);	
	}
	public void actionPerformed(ActionEvent evt)
	{
		if(evt.getSource()==exitItem)
			System.exit(0);
		if(evt.getSource()==exitButton)
			System.exit(0);
		if(evt.getSource()==resetButton)
		{
			roundItem.setState(true);
			squareItem.setState(false);
			lineItem.setState(false);
			shapeChoice.select(0);
			colorList.select(0);
			redCheckbox.setState(true);
			sizeScrollbar.setValue(60);
			color = colorarray[0];
			shape = shapearray[0]; 
			size = 60;
			paintCanvas.setValues(size,color,shape);
			paintCanvas.erase();
		}
	}

	public void itemStateChanged(ItemEvent event)
	{
		if(event.getSource()==roundItem)
		{
			squareItem.setState(false);
			lineItem.setState(false);
			shape = shapearray[0];
			shapeChoice.select(0);
		}
		if(event.getSource()==squareItem)
		{
			roundItem.setState(false);
			lineItem.setState(false);
			shape = shapearray[1];
			shapeChoice.select(1);
		}
		if(event.getSource()==lineItem)
		{
			squareItem.setState(false);
			roundItem.setState(false);
			shape = shapearray[2];
			shapeChoice.select(2);
		}
		
		if (event.getSource()==colorList)
		{
			int i = colorList.getSelectedIndex();
			color = colorarray[i];
			switch (i)
			{
				case 0: redCheckbox.setState(true); break;
				case 1: greenCheckbox.setState(true); break;
				case 2: blueCheckbox.setState(true);
			}
		}
		
		if (event.getSource()==shapeChoice)
		{
			shape = shapearray[shapeChoice.getSelectedIndex()];
			switch (shape)
			{
				case 0: 
					roundItem.setState(true);
					squareItem.setState(false); 
					lineItem.setState(false);
					break;
				case 1:
					roundItem.setState(false);
					squareItem.setState(true); 
					lineItem.setState(false);
					break;
				case 2:
					roundItem.setState(false);
					squareItem.setState(false); 
					lineItem.setState(true);
			}
		}
		
		if (event.getSource()==redCheckbox)
		{
			color = colorarray[0];
			colorList.select(0);
		}
		if (event.getSource()==greenCheckbox)
		{
			color = colorarray[1];
			colorList.select(1);
		}
		if (event.getSource()==blueCheckbox)
		{
			color = colorarray[2];
			colorList.select(2);
		}
		
		paintCanvas.setValues(size, color, shape);
	}
	
	public static void main (String[] args)
	{
		Painting p = new Painting();
		p.setBounds(50,50,600,450);
		p.setResizable(false);
		p.setVisible(true);
	}
}

