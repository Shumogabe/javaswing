package javaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu window = new menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenu mnFileNew = new JMenu("New");
		mnFileNew.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\Java\\buoi2\\javaSwing\\img\\new.png"));
		mnFile.add(mnFileNew);
		
		JMenuItem mnNewProject = new JMenuItem("Project");
		mnNewProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Clicked project");
			}
		});
		mnNewProject.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\Java\\buoi2\\javaSwing\\img\\project.png"));
		mnFileNew.add(mnNewProject);
		
		JMenuItem mnNewPackage = new JMenuItem("Package");
		mnNewPackage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Clicked package");
			}
		});
		mnNewPackage.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\Java\\buoi2\\javaSwing\\img\\package.png"));
		mnFileNew.add(mnNewPackage);
		
		JMenuItem mnFileOpen = new JMenuItem("Open");
		mnFileOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Clicked open");
			}
		});
		mnFileOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mnFileOpen.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\Java\\buoi2\\javaSwing\\img\\open.png"));
		mnFile.add(mnFileOpen);
		
		JSeparator separator = new JSeparator();
		mnFile.add(separator);
		
		JMenuItem mnFileSave = new JMenuItem("Save");
		mnFileSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Clicked save");
			}
		});
		mnFileSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnFileSave.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\Java\\buoi2\\javaSwing\\img\\save.png"));
		mnFile.add(mnFileSave);
		
		JMenuItem mnFileSaveas = new JMenuItem("Save as");
		mnFileSaveas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Clicked save as");
			}
		});
		mnFileSaveas.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		mnFileSaveas.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\Java\\buoi2\\javaSwing\\img\\saveas.png"));
		mnFile.add(mnFileSaveas);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenuItem mnEditCut = new JMenuItem("Cut");
		mnEditCut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Clicked cut");
			}
		});
		mnEditCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
		mnEditCut.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\Java\\buoi2\\javaSwing\\img\\cut.png"));
		mnEdit.add(mnEditCut);
		
		JMenuItem mnEditCopy = new JMenuItem("Copy");
		mnEditCopy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Clicked copy");
			}
		});
		mnEditCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
		mnEditCopy.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\Java\\buoi2\\javaSwing\\img\\copy.png"));
		mnEdit.add(mnEditCopy);
		
		JMenuItem mnEditPaste = new JMenuItem("Paste");
		mnEditPaste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Clicked paste");
			}
		});
		mnEditPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK));
		mnEditPaste.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\Java\\buoi2\\javaSwing\\img\\paste.png"));
		mnEdit.add(mnEditPaste);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mnHelpAbout = new JMenuItem("About...");
		mnHelpAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Clicked about");
			}
		});
		mnHelpAbout.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\Java\\buoi2\\javaSwing\\img\\about.png"));
		mnHelp.add(mnHelpAbout);
		
		JMenuItem mnHelpConnect = new JMenuItem("Connect");
		mnHelpConnect.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\Java\\buoi2\\javaSwing\\img\\connect.png"));
		mnHelpConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Clicked connect");
			}
		});
		mnHelp.add(mnHelpConnect);
		frame.getContentPane().setLayout(null);
	}
}
