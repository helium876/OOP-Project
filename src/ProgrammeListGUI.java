package test;

/*import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

//import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ProgrammeListGUI extends JFrame {
	private static final long serialVersionUID = 1L;

	public ProgrammeListGUI() {
		Date date = new Date();
		setTitle("JCTCL Cable TV Programming Listing       " + date);
		setSize(1000, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		JPanel panel = new JPanel(new GridLayout(1, 0));
		JTable table = new JTable(new ProgrammListModel());
		table.setPreferredScrollableViewportSize(new Dimension(1800, 400));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.getTableHeader().setReorderingAllowed(false);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setPreferredSize(new Dimension(1800, 400));
		panel.add(scroll, BorderLayout.CENTER);
		add(panel);

	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				Programme Collette = new Programme("2 hrs", "Purple", "Caaan Badda", "yes", "New");
				Collette.Mark();
				System.out.println("MARK");
				new ProgrammeListGUI();
			}
		});

	}
	
}
*/