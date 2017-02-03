package pt.airc.bpm.carmo.tiago.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Carmo
 *
 */
public class LogIn extends JPanel implements ActionListener, KeyListener {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	/**
	 *
	 */
	private final JTextField userField, servidorField;
	/**
	 *
	 */
	private final JPasswordField passwordField;
	/**
	 *
	 */
	private final MainApp app;
	/**
	 *
	 */
	private final JButton btnEnter, btnExit;
	/**
	 *
	 */
	private final JLabel lblAIRC;
	/**
	 *
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(LogIn.class);

	/**
	 *
	 * @param app1
	 *            the main class that initiated the components
	 */
	public LogIn(final MainApp app1) {
		super();

		setBackground(Color.WHITE);
		setForeground(Color.WHITE);
		this.app = app1;
		setLayout(null);

		final JLabel lblUser = new JLabel("Username:");
		lblUser.setBounds(177, 178, 60, 14);
		add(lblUser);

		btnEnter = new JButton("Enter");
		btnEnter.setForeground(Color.BLACK);
		btnEnter.setBackground(Color.WHITE);
		final Image imagemEnter = new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		btnEnter.setIcon(new ImageIcon(imagemEnter));
		btnEnter.setFont(new Font("Cambria Math", Font.PLAIN, 12));
		btnEnter.setBounds(80, 420, 89, 23);
		btnEnter.setContentAreaFilled(false);
		btnEnter.setOpaque(true);
		btnEnter.addActionListener(this);
		add(btnEnter);

		btnExit = new JButton("Exit");
		btnExit.setForeground(Color.BLACK);
		btnExit.setBackground(Color.WHITE);
		final Image imagemSair = new ImageIcon(this.getClass().getResource("/exit.png")).getImage();
		btnExit.setIcon(new ImageIcon(imagemSair));
		btnExit.setFont(new Font("Cambria Math", Font.PLAIN, 12));
		btnExit.setBounds(431, 420, 89, 23);
		btnExit.setContentAreaFilled(false);
		btnExit.setOpaque(true);
		btnExit.addActionListener(this);
		add(btnExit);

		final JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(177, 209, 60, 14);
		add(lblPassword);

		userField = new JTextField();
		userField.setToolTipText("Username");
		userField.setBounds(247, 175, 105, 20);
		add(userField);
		userField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setToolTipText("Password");
		passwordField.setBounds(247, 206, 105, 20);
		add(passwordField);

		final JLabel logo = new JLabel("");
		logo.setBounds(10, 191, 563, 203);
		final Image imagemLogo = new ImageIcon(this.getClass().getResource("/logo.jpg")).getImage();

		servidorField = new JTextField();
		servidorField.setToolTipText("Server IP Address");
		servidorField.setBounds(247, 237, 105, 20);
		add(servidorField);
		servidorField.setColumns(10);

		JLabel lblServidorIp = new JLabel("Server IP:");
		lblServidorIp.setBounds(177, 240, 60, 14);
		add(lblServidorIp);
		logo.setIcon(new ImageIcon(imagemLogo));
		add(logo);

		lblAIRC = new JLabel("");
		lblAIRC.setBounds(204, 8, 358, 138);
		final Image imagemAIRC = new ImageIcon(this.getClass().getResource("/airc.png")).getImage();
		lblAIRC.setIcon(new ImageIcon(imagemAIRC));
		add(lblAIRC);

	}

	/**
	 *
	 */
	@Override
	public void keyTyped(final KeyEvent event) {
		/**
		 *
		 */
	}

	/**
	 *
	 */
	@Override
	public final void keyPressed(final KeyEvent event) {
		/**
		 *
		 */
	}

	/**
	 *
	 */
	@Override
	public void keyReleased(final KeyEvent event) {
		/**
		 *
		 */
	}

	/**
	 *
	 */
	@Override
	public final void actionPerformed(final ActionEvent event) {
		if (event.getSource() == this.btnExit) {
			final String[] objButtons = { "Yes", "No" };
			final int promptResult = JOptionPane.showOptionDialog(null, "Are you sure?", null,
					JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, objButtons, objButtons[1]);
			if (promptResult == JOptionPane.YES_OPTION) {
				LOGGER.info("Exit app");
				this.app.setLoggedIn(false);
				System.exit(0);
			}
		} else if (event.getSource() == this.btnEnter) {
			final String username = this.getUserField().getText();
			final char[] password = this.getPasswordField().getPassword();
			final String IP_Servidor = this.getServidorField().getText();
			String response = this.app.verificaLogIn(username, password, IP_Servidor);
			switch (response) {
			case "1":
				JOptionPane.showMessageDialog(null, "Welcome, " + this.app.getUserName(), "Greetings",
						JOptionPane.INFORMATION_MESSAGE);
				this.app.getLayout().show(this.app.getCont(), this.app.getMainMenu());
				this.app.setLoggedIn(true);
				LOGGER.info("Login successfull. User: " + username);
				break;
			case "-1":
				JOptionPane.showMessageDialog(null, "Server unavailable", "Error", JOptionPane.ERROR_MESSAGE);
				LOGGER.error("Server unavailable while logging in");
				this.app.setLoggedIn(false);
				break;
			case "-2":
				JOptionPane.showMessageDialog(null, "Unsuccessfull login", "Error", JOptionPane.ERROR_MESSAGE);
				LOGGER.error("Unsuccessfull login");
				this.app.setLoggedIn(false);
				break;
			case "-5":
				JOptionPane.showMessageDialog(null, "Missing Parameters", "Error", JOptionPane.ERROR_MESSAGE);
				LOGGER.error("Missing parameters logging in");
				this.app.setLoggedIn(false);
				break;
			case "-6":
				JOptionPane.showMessageDialog(null, "Error obtaining login data", "Error", JOptionPane.ERROR_MESSAGE);
				LOGGER.error("Error obtaining login data");
				this.app.setLoggedIn(false);
				break;
			case "-101":
				JOptionPane.showMessageDialog(null, "Unexpected error logging in", "Error", JOptionPane.ERROR_MESSAGE);
				LOGGER.error("Unexpected error logging in");
				this.app.setLoggedIn(false);
				break;
			default:
				break;
			}
		}
	}

	/**
	 *
	 * @return the user field
	 */
	public final JTextField getUserField() {
		return userField;
	}

	/**
	 *
	 * @return the password field
	 */
	public final JPasswordField getPasswordField() {
		return passwordField;
	}

	/**
	 *
	 * @return the server field
	 */
	public final JTextField getServidorField() {
		return servidorField;
	}

}
