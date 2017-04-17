package pt.airc.bpm.carmo.tiago.ui;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pt.airc.bpm.carmo.tiago.bonita.Connections;
import pt.airc.bpm.carmo.tiago.pojos.Contract;

/**
 *
 * @author Tiago Carmo
 *
 */
public class MainApp {
	/**
	 *
	 */
	private boolean loggedIn = false;
	/**
	 * Log for main app.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(MainApp.class);
	/**
	 *
	 */
	private JFrame mainFrame;
	/**
	 *
	 */
	private final CardLayout layout;
	/**
	 *
	 */
	private final LogIn logIn;
	/**
	 *
	 */
	private Form form;
	/**
	 *
	 */
	private MainMenu mainMenu;
	/**
	 *
	 */
	private final Connections request;
	/**
	 *
	 */
	static final String LOGIN = "logIn", MAINMENU = "mainMenu", FORM = "form";
	/**
	 *
	 */
	private final Container cont;

	/**
	 *
	 */
	public MainApp() {

		request = new Connections();

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			LOGGER.error("Error building UI");
		}

		logIn = new LogIn(this);
		mainMenu = null;

		layout = new CardLayout();
		mainFrame = new JFrame();
		mainFrame.setSize(600, 500);
		mainFrame.setTitle("Bonita BPM API Test");
		final Image image = new ImageIcon(this.getClass().getResource("/Bonitasoft.jpg")).getImage();
		mainFrame.setIconImage(image);
		cont = mainFrame.getContentPane();
		getCont().setLayout(getLayout());

		// getCont().add(mainMenu, MAINMENU);
		getCont().add(logIn, LOGIN);
		getLayout().show(getCont(), LOGIN);

		final Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		mainFrame.setLocation(dim.width / 2 - mainFrame.getSize().width / 2,
				dim.height / 2 - mainFrame.getSize().height / 2);
		mainFrame.validate();
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		mainFrame.addWindowListener(new WindowAdapter() {
			/**
			 * What to do when closing window
			 */
			public void windowClosing(final WindowEvent event) {
				final String[] objButtons = { "Yes", "No" };
				final int promptResult = JOptionPane.showOptionDialog(null, "Are you sure?", null,
						JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, objButtons, objButtons[1]);
				if (promptResult == JOptionPane.YES_OPTION) {
					if (loggedIn) {
						if (sair().equals("1")) {
							LOGGER.info("Logout successfull. Exit app");
							System.exit(0);
						} else {
							LOGGER.error("Error logging out");
							final int result = JOptionPane.showOptionDialog(null, "Error logging out, continue anyway?",
									"Error", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, null, objButtons,
									objButtons[1]);
							if (result == JOptionPane.YES_OPTION) {
								System.exit(0);
							}
						}
					} else {
						LOGGER.info("Exit app");
						System.exit(0);
					}
				}
			}
		});
	}

	/**
	 *
	 * @return a string with success or error code
	 */
	public final String sair() {
		return this.request.of_logout();
	}

	/**
	 *
	 * @param username
	 *            from user logging in
	 * @param password
	 *            from user logging in
	 * @param iP_Servidor
	 *            where the server is running
	 * @return a string with an error or success code
	 */
	public final String[] verificaLogIn(String username, String password, String iP_Servidor) {
		return this.request.of_configuracao(username, password, iP_Servidor);
	}

	/**
	 *
	 * @return the process list
	 */
	public final String[] ofInvokeGetWorkClasses() {
		return request.of_invokeGetWorkClasses();
	}
	
	/**
	 *
	 * @param nameVersion
	 * @return
	 */
	public final String[] getProcessID(final String nameVersion){
		return request.getProcessID(nameVersion);
	}

	/**
	 *
	 * @param args
	 *            to start main app
	 */
	public static void main(final String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			/**
			 * Run te main app
			 */
			@Override
			public void run() {
				new MainApp();
			}
		});
	}

	/**
	 *
	 * @param taskID
	 *            from which to get candidate
	 * @return string with success or error code
	 */
	public final String[] of_invokeGetCandidates(final String taskID) {
		return this.request.of_invokeGetCandidates(taskID);
	}

	/**
	 *
	 * @param caseID
	 *            variables of the case
	 * @return the variable list
	 */
	public final String[] ofInvokeGetProcessVariables(final String caseID) {
		return request.of_invokeGetProcessVariables(caseID);
	}

	/**
	 *
	 * @return the case list
	 */
	public final String[] getCases() {
		return request.of_invokeGetProcessInstances();
	}

	/**
	 *
	 * @param processName
	 *            the process name
	 * @param caseID
	 *            the case id
	 * @param version
	 *            the process version
	 * @return a string with error or success code
	 */
	public final String[] of_invokeCreateWorkflow(final String processID) {
		return request.of_invokeCreateWorkflow(processID);

	}

	/**
	 * Logout function.
	 * 
	 * @return a string with success or error code
	 */
	public final String logout() {
		return request.of_logout();
	}

	/**
	 *
	 * @param processID
	 *            the process id
	 * @return an array with the data fields or an error code
	 */
	public final String[] of_invokeGetProcessDataFields(final String processID) {
		return this.request.of_invokeGetProcessDataFields(processID);
	}

	/**
	 *
	 * @param taskID
	 *            the task id
	 * @return an array with success or error code
	 */
	public final String[] of_invokeGetStepResponseItems(final String taskID) {
		return this.request.of_invokeGetStepResponseItems(taskID);
	}

	/**
	 *
	 * @param caseID
	 *            the task id
	 * @param variableName
	 *            the variable name
	 * @param variableType
	 *            the variable type
	 * @param value
	 *            the variable value
	 * @return a string with success or error code
	 */
	public final String[] of_invokeSetProcessVariable(final String caseID, final String variableName,
			final String value) {
		return this.request.of_invokeSetProcessVariable(caseID, variableName, value);
	}

	/**
	 *
	 * @param caseID
	 *            tasks in this case
	 * @return the tasks list
	 */
	public final String[] of_invokeGetStepActual(final String caseID) {
		return request.of_invokeGetStepActual(caseID);
	}

	/**
	 *
	 * @param caseID
	 *            the case with archived tasks
	 * @return the list of archived tasks
	 */
	public final String[] searchArchivedTask(final String caseID) {
		return request.of_invokeGetFlowNodesExec(caseID);
	}

	/**
	 *
	 * @param processID
	 *            process id to retrieve the steps
	 * @return the process steps
	 */
	public final String[] of_invokeGetEveryStep(final String processID) {
		return request.of_invokeGetEveryStep(processID);
	}

	/**
	 *
	 * @param caseID
	 *            case id from which to get the completed milestones
	 * @param processID
	 *            the process id from which to extract all the milestones
	 * @return all the milestones (passed and not)
	 */
	public final String[] of_invokeGetMilestones(final String caseID) {
		return request.of_invokeGetMilestones(caseID);
	}

	/**
	 *
	 * @param taskID
	 *            task id to be assigned
	 * @param userName
	 *            user name to assign task to
	 * @return a string with success or error code
	 */
	public final String[] of_invokeReassignTaskCandidate(final String taskID, final String userName) {
		return request.of_invokeReassignTaskCandidate(taskID, userName);
	}

	/**
	 *
	 * @param processName
	 *            the process name
	 * @param processVersion
	 *            the process version
	 * @param taskName
	 *            the task name
	 * @param taskID
	 *            the task id
	 * @return a string with success or error code
	 */
	public final String[] of_invokeDispatchStep(final String taskID) {
		return request.of_invokeDispatchStep(taskID);
	}

	/**
	 *
	 * @param taskID
	 *            from which to retrieve the variable
	 * @param variableName
	 *            the variable name
	 * @param variableValue
	 *            the variable value to be set
	 * @return a string with success or error code
	 */
	public final String[] of_invokeSetActivityVariable(final String taskID, final String variableName,
			final String variableValue) {
		return this.request.of_invokeSetActivityVariable(taskID, variableName, variableValue);
	}

	/**
	 *
	 * @param taskID
	 *            the task id
	 * @param approved
	 *            whether it approved or not
	 * @return a string with success or error code
	 */
	public final String of_invokeDispatchStepP(final String taskID, final String approved) {
		return request.of_invokeDispatchStepP(taskID, approved);
	}

	/**
	 * Function to obtain the contract of the given process.
	 *
	 * @param processID
	 *            process id of process
	 * @return the contract object
	 * @throws IOException
	 *             in case something goes wrong
	 */
	public final Contract getContract2(final String processID) {
		return request.of_invokeGetProcessContract(processID);
	}

	/**
	 * populate the form screen.
	 */
	public final void novoForm() {
		form = new Form(this, this.request.getNoSubs(), this.request.getSubs());
		getCont().add(form, FORM);
		getLayout().show(getCont(), FORM);
	}

	/**
	 * function to start any process.
	 *
	 * @param inputs
	 *            required to start process
	 * @return the json response
	 */
	public final String startProcessHere(final Map<Integer, JTextField> inputs) {
		return this.request.startProcessHere(inputs, mainMenu.getFieldProcess().getText());
	}

	/**
	 *
	 * @param taskId
	 *            from which to get the variable detail
	 * @param variableName
	 *            from which to get the details
	 * @return the variable details or error code
	 */
	public final String[] of_invokeGetActivityVariables(final String taskId) {
		return this.request.of_invokeGetActivityVariables(taskId);
	}

	/**
	 *
	 * @param taskID
	 *            from which to get the instructions
	 * @return the task instructions
	 */
	public final String[] of_invokeGetStepInstructions(final String taskID) {
		return this.request.of_invokeGetStepInstructions(taskID);
	}

	/**
	 *
	 * @param caseId
	 *            to attach the document to
	 * @param fileUrl
	 *            from which to extract the document
	 * @param name
	 *            the name for the document
	 * @return a string with the doc info
	 */
	public final String of_invokeCreateDocument(final String caseId, final String fileUrl, final String name) {
		return this.request.of_invokeCreateDocument(caseId, fileUrl, name);
	}

	/**
	 * simple function to switch screens.
	 */
	public final void backBtn() {
		getLayout().show(getCont(), MAINMENU);
	}

	/**
	 *
	 * @return the mainFrame
	 */
	public final JFrame getMainFrame() {
		return mainFrame;
	}

	/**
	 *
	 * @param mainFrame1
	 *            the mainFrame to be set
	 */
	public final void setMainFrame(final JFrame mainFrame1) {
		this.mainFrame = mainFrame1;
	}

	/**
	 *
	 * @return the layout
	 */
	public CardLayout getLayout() {
		return layout;
	}

	/**
	 *
	 * @return the container
	 */
	public Container getCont() {
		return cont;
	}

	/**
	 *
	 * @return the login string
	 */
	public String getLogin() {
		return LOGIN;
	}

	/**
	 *
	 * @return the main menu string
	 */
	public String getMainMenu() {
		mainMenu = new MainMenu(this, logIn);
		getCont().add(mainMenu, MAINMENU);
		return MAINMENU;
	}

	public String getUserName() {
		return this.request.getUserName();
	}

	/**
	 *
	 * @param processName
	 *            the process name
	 * @param caseID
	 *            the case id
	 * @param processVersion
	 *            the process version
	 * @return a string with an error or success code
	 */
	public final String[] of_invokeGetOverview(final String caseID) {
		return this.request.of_invokeGetOverview(caseID);
	}

	/**
	 *
	 * @param caseId
	 *            the case id
	 * @return a list of timer events or an error code
	 */
	public String[] of_invokeTimerEvents(String caseId) {
		return this.request.of_invokeTimerEvents(caseId);
	}

	/**
	 *
	 * @param caseId
	 *            the case id
	 * @return a string with error or success code
	 */
	public String[] of_invokeCancelInstance(String caseId) {
		return this.request.of_invokeCancelInstance(caseId);
	}

	/**
	 *
	 * @return if user is logged in
	 */
	public boolean isLoggedIn() {
		return loggedIn;
	}

	/**
	 *
	 * @param loggedIn1
	 *            to be set
	 */
	public void setLoggedIn(final boolean loggedIn1) {
		this.loggedIn = loggedIn1;
	}

}
