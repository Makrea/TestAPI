package pt.airc.bpm.carmo.tiago.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import pt.airc.bpm.carmo.tiago.pojos.Input;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Tiago Carmo
 *
 */
public class Form extends JPanel implements ActionListener {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	/**
	 *
	 */
	private final MainApp app;
	/**
	 *
	 */
	private final JButton btnExit, btnRun, btnBack;
	/**
	 *
	 */
	private JTextField field;
	/**
	 *
	 */
	private JLabel lbl;
	/**
	 *
	 */
	private int x = 10, y = 11, a = 1;
	/**
	 *
	 */
	private final List<String> noSubs;
	/**
	 *
	 */
	private final Map<String, Input[]> subs;
	/**
	 *
	 */
	private final Map<Integer, JTextField> inputs;
	/**
	 *
	 */
	private final JTextArea formArea;

	/**
	 * Instantiate new screen.
	 *
	 * @param app1
	 *            main app
	 * @param noSubs1
	 *            array with inputs that are not complex
	 * @param subs1
	 *            hashmap with complex elements
	 */
	public Form(final MainApp app1, final List<String> noSubs1, final Map<String, Input[]> subs1) {
		super();
		this.app = app1;
		this.noSubs = noSubs1;
		this.subs = subs1;
		setBackground(Color.WHITE);
		setForeground(Color.WHITE);
		setLayout(null);

		inputs = new HashMap<Integer, JTextField>();

		btnExit = new JButton("Logout");
		btnExit.setBounds(487, 426, 87, 23);
		btnExit.setForeground(Color.BLACK);
		btnExit.setBackground(Color.WHITE);
		final Image imageLogout = new ImageIcon(this.getClass().getResource("/logout.png")).getImage();
		btnExit.setIcon(new ImageIcon(imageLogout));
		btnExit.setFont(new Font("Cambria Math", Font.PLAIN, 12));
		btnExit.setContentAreaFilled(false);
		btnExit.setOpaque(true);
		btnExit.addActionListener(this);
		add(btnExit);

		btnRun = new JButton("Run");
		btnRun.setForeground(Color.BLACK);
		btnRun.setBackground(Color.WHITE);
		final Image imageRun = new ImageIcon(this.getClass().getResource("/start.png")).getImage();
		btnRun.setIcon(new ImageIcon(imageRun));
		btnRun.setBounds(10, 426, 73, 23);
		btnRun.setFont(new Font("Cambria Math", Font.PLAIN, 12));
		btnRun.setContentAreaFilled(false);
		btnRun.setOpaque(true);
		btnRun.addActionListener(this);
		add(btnRun);

		btnBack = new JButton("Back");
		btnBack.setForeground(Color.BLACK);
		btnBack.setBackground(Color.WHITE);
		final Image imageBack = new ImageIcon(this.getClass().getResource("/back.png")).getImage();
		btnBack.setIcon(new ImageIcon(imageBack));
		btnBack.setBounds(249, 426, 77, 23);
		btnBack.setFont(new Font("Cambria Math", Font.PLAIN, 12));
		btnBack.setContentAreaFilled(false);
		btnBack.setOpaque(true);
		btnBack.addActionListener(this);
		add(btnBack);
		formArea = new JTextArea();
		formArea.setEditable(false);
		formArea.setLineWrap(true);
		final JScrollPane scroll = new JScrollPane(formArea);
		scroll.setVisible(true);
		scroll.setBounds(304, 11, 270, 181);
		add(scroll);

		for (final Map.Entry<String, Input[]> entry : this.subs.entrySet()) {
			for (int i = 0; i < entry.getValue().length; i++) {
				field = new JTextField();
				field.setBounds(x, y + 14, 86, 20);
				field.setName(entry.getValue()[i].getName());
				add(field);
				field.setColumns(10);

				lbl = new JLabel(entry.getValue()[i].getName());
				lbl.setLabelFor(field);
				lbl.setBounds(x, y, 89, 14);
				add(lbl);

				inputs.put(a, field);
				y = y + 41;
				a++;
			}
		}

		for (final String input : this.noSubs) {
			field = new JTextField();
			field.setBounds(x, y + 14, 86, 20);
			field.setName(input);
			add(field);
			field.setColumns(10);

			lbl = new JLabel(input);
			lbl.setLabelFor(field);
			lbl.setBounds(x, y, 89, 14);
			add(lbl);

			y = y + 41;
			inputs.put(a, field);
			a++;
		}
		repaint();
		revalidate();
	}

	/**
	 * Action listener for the screen.
	 */
	@Override
	public final void actionPerformed(final ActionEvent event) {
		if (event.getSource() == this.btnExit) {
			final String[] objButtons = { "Yes", "No" };
			final int promptResult = JOptionPane.showOptionDialog(null, "Are you sure?", null,
					JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, objButtons, objButtons[1]);
			if (promptResult == JOptionPane.YES_OPTION) {
				String response = this.app.logout();
				if (response.equals("-6")) {
					JOptionPane.showMessageDialog(null, "Error logging out", "Error", JOptionPane.ERROR_MESSAGE);
				} else if (response.equals("-101")) {
					JOptionPane.showMessageDialog(null, "Unexpected error logging out", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else if (response.equals("1")) {
					System.exit(0);
				}
			}
		} else if (event.getSource() == this.btnRun) {
			String response = this.app.startProcessHere(this.inputs);
			if (response.equals("-6")) {
				JOptionPane.showMessageDialog(null, "Error starting process", "Error", JOptionPane.ERROR_MESSAGE);
			} else if (response.equals("-8")) {
				JOptionPane.showMessageDialog(null, "Error parsing JSON", "Error", JOptionPane.ERROR_MESSAGE);
			} else if (response.equals("-101")) {
				JOptionPane.showMessageDialog(null, "Unexpected error starting process", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, response, "Success", JOptionPane.INFORMATION_MESSAGE);
				formArea.setText(response);
			}
		} else if (event.getSource() == this.btnBack) {
			this.app.backBtn();
		}
	}
}
