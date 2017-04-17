package pt.airc.bpm.carmo.tiago.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

/**
 *
 * @author Tiago Carmo
 *
 */
public class MainMenu extends JPanel implements ActionListener, KeyListener {
	/**
	 *
	 */
	private static final String ERROR = "Error";
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
	private final LogIn logIn;
	/**
	 *
	 */
	private final JButton btnExitMenu, btnProcesses, searchTask, btnTimer, btnVariable, btnCases, btnStartCase,
			btnLogout, btnTasks, btnAssignTask, btnRunTask, btnRunTaskP, btnStart, btnDescription, btnActivityVariable,
			btnStepItems, btnProcessFields, btnSetVariable, btnGetCandidates, btnSetActivityVar, btnMilestone,
			btnAllSteps, btnDocumentUrl, btnOverview, btnCancelPi, btnGetProcessid;
	/**
	 *
	 */
	private JLabel lblUsername;
	/**
	 *
	 */
	private final JTextArea txtArea, contractsArea;
	/**
	 *
	 */
	private final JTextField fieldID, fieldProcess, nameField, versionField, taskName, userName, textTaskID,
			approvedField, textVariableName, txtVariableValue, urlField, docName, txtProcessNameVersion;

	/**
	 *
	 * @param app1
	 *            main app screen
	 * @param logIn1
	 *            log in screen
	 */
	public MainMenu(final MainApp app1, final LogIn logIn1) {
		super();
		setBackground(Color.WHITE);
		setForeground(Color.WHITE);
		this.app = app1;
		this.logIn = logIn1;
		setLayout(null);

		btnExitMenu = new JButton("Exit");
		btnExitMenu.setForeground(Color.BLACK);
		btnExitMenu.setBackground(Color.WHITE);
		btnExitMenu.setBounds(179, 121, 89, 23);
		final Image imageExit = new ImageIcon(this.getClass().getResource("/exit.png")).getImage();
		btnExitMenu.setIcon(new ImageIcon(imageExit));
		btnExitMenu.setFont(new Font("Cambria Math", Font.PLAIN, 12));
		btnExitMenu.setContentAreaFilled(false);
		btnExitMenu.setOpaque(true);
		btnExitMenu.addActionListener(this);
		add(btnExitMenu);

		txtArea = new JTextArea();
		txtArea.setEditable(false);
		txtArea.setLineWrap(true);
		final JScrollPane scroll = new JScrollPane(txtArea);
		scroll.setVisible(true);
		scroll.setBounds(10, 273, 270, 146);
		add(scroll);

		btnProcesses = new JButton("Processes");
		btnProcesses.setForeground(Color.BLACK);
		btnProcesses.setBackground(Color.WHITE);
		btnProcesses.setBounds(10, 11, 83, 23);
		btnProcesses.addActionListener(this);
		add(btnProcesses);

		btnVariable = new JButton("Variables");
		btnVariable.setForeground(Color.BLACK);
		btnVariable.setBackground(Color.WHITE);
		btnVariable.setBounds(10, 239, 83, 23);
		btnVariable.addActionListener(this);
		add(btnVariable);

		fieldID = new JTextField();
		fieldID.setText("Case ID");
		fieldID.setToolTipText("Case ID");
		fieldID.setBounds(10, 208, 83, 20);
		add(fieldID);
		fieldID.setColumns(10);

		btnCases = new JButton("Cases");
		btnCases.setForeground(Color.BLACK);
		btnCases.setBackground(Color.WHITE);
		btnCases.setBounds(103, 11, 62, 23);
		btnCases.addActionListener(this);
		add(btnCases);

		btnStartCase = new JButton("Start Form");
		btnStartCase.setForeground(Color.BLACK);
		btnStartCase.setBackground(Color.WHITE);
		btnStartCase.setBounds(10, 431, 83, 23);
		btnStartCase.addActionListener(this);
		add(btnStartCase);

		fieldProcess = new JTextField();
		fieldProcess.setText("ProcessID");
		fieldProcess.setToolTipText("Process ID");
		getFieldProcess().setBounds(385, 273, 189, 20);
		add(getFieldProcess());
		getFieldProcess().setColumns(10);

		textVariableName = new JTextField();
		textVariableName.setText("Variable Name");
		textVariableName.setToolTipText("Variable Name");
		textVariableName.setBounds(290, 399, 98, 20);
		add(textVariableName);
		textVariableName.setColumns(10);

		contractsArea = new JTextArea();
		contractsArea.setEditable(false);
		contractsArea.setLineWrap(true);
		contractsArea.setWrapStyleWord(true);

		final JScrollPane scroll2 = new JScrollPane(contractsArea);
		scroll2.setBounds(385, 43, 189, 152);
		add(scroll2);

		btnLogout = new JButton("Logout");
		btnLogout.setBounds(49, 121, 89, 23);
		btnLogout.setForeground(Color.BLACK);
		btnLogout.setBackground(Color.WHITE);
		final Image imageLogout = new ImageIcon(this.getClass().getResource("/logout.png")).getImage();
		btnLogout.setIcon(new ImageIcon(imageLogout));
		btnLogout.setFont(new Font("Cambria Math", Font.PLAIN, 12));
		btnLogout.setContentAreaFilled(false);
		btnLogout.setOpaque(true);
		btnLogout.addActionListener(this);
		add(btnLogout);

		btnTasks = new JButton("Get Current Task");
		btnTasks.setBounds(459, 239, 115, 23);
		btnTasks.addActionListener(this);
		add(btnTasks);

		btnOverview = new JButton("Overview");
		btnOverview.setBounds(496, 207, 78, 23);
		btnOverview.addActionListener(this);
		add(btnOverview);

		lblUsername = new JLabel("Welcome, " + this.app.getUserName());
		lblUsername.setBounds(10, 155, 139, 14);
		add(lblUsername);

		final JLabel lblBPM = new JLabel("");
		lblBPM.setBounds(10, 45, 290, 117);
		final Image imagemBPM = new ImageIcon(this.getClass().getResource("/bpm.png")).getImage();
		lblBPM.setIcon(new ImageIcon(imagemBPM));
		add(lblBPM);

		versionField = new JTextField();
		versionField.setText("Process Version");
		versionField.setToolTipText("Process Version");
		versionField.setBounds(399, 330, 175, 20);
		add(versionField);
		versionField.setColumns(10);

		nameField = new JTextField();
		nameField.setText("Process Name");
		nameField.setToolTipText("Process Name");
		nameField.setBounds(385, 302, 189, 20);
		add(nameField);
		nameField.setColumns(10);

		btnTimer = new JButton("Timer");
		btnTimer.setBounds(206, 11, 62, 23);
		btnTimer.addActionListener(this);
		add(btnTimer);

		searchTask = new JButton("Search All Flow Nodes");
		searchTask.setBounds(290, 239, 159, 23);
		searchTask.addActionListener(this);
		add(searchTask);

		taskName = new JTextField();
		taskName.setToolTipText("Task Name");
		taskName.setText("Task Name");
		taskName.setBounds(393, 12, 181, 20);
		add(taskName);
		taskName.setColumns(10);

		btnAssignTask = new JButton("Assign");
		btnAssignTask.addActionListener(this);
		btnAssignTask.setBounds(310, 74, 65, 23);
		add(btnAssignTask);

		userName = new JTextField();
		userName.setToolTipText("UserName");
		userName.setText("UserName");
		userName.setBounds(310, 43, 65, 20);
		add(userName);
		userName.setColumns(10);

		textTaskID = new JTextField();
		textTaskID.setToolTipText("Task ID");
		textTaskID.setText("Task ID");
		textTaskID.setBounds(310, 12, 72, 20);
		add(textTaskID);
		textTaskID.setColumns(10);

		btnRunTask = new JButton("RUN");
		btnRunTask.setBounds(310, 108, 65, 23);
		btnRunTask.addActionListener(this);
		add(btnRunTask);

		approvedField = new JTextField();
		approvedField.setToolTipText("Approved?");
		approvedField.setText("Approved?");
		approvedField.setBounds(310, 142, 65, 20);
		add(approvedField);
		approvedField.setColumns(10);

		btnRunTaskP = new JButton("Run task");
		btnRunTaskP.setBounds(290, 173, 85, 23);
		btnRunTaskP.addActionListener(this);
		add(btnRunTaskP);

		btnStart = new JButton("Start Case");
		btnStart.setBounds(290, 301, 89, 23);
		btnStart.addActionListener(this);
		add(btnStart);

		btnDescription = new JButton("Task description");
		btnDescription.setBounds(290, 360, 115, 23);
		btnDescription.addActionListener(this);
		add(btnDescription);

		btnStepItems = new JButton("Step Items");
		btnStepItems.setBounds(290, 272, 89, 23);
		btnStepItems.addActionListener(this);
		add(btnStepItems);

		btnProcessFields = new JButton("Process Fields");
		btnProcessFields.setBounds(290, 329, 99, 23);
		btnProcessFields.addActionListener(this);
		add(btnProcessFields);

		txtVariableValue = new JTextField();
		txtVariableValue.setToolTipText("Variable Value");
		txtVariableValue.setText("Variable Value");
		txtVariableValue.setBounds(398, 399, 83, 20);
		add(txtVariableValue);
		txtVariableValue.setColumns(10);

		btnSetVariable = new JButton("Set Variable");
		btnSetVariable.setBounds(491, 396, 83, 23);
		btnSetVariable.addActionListener(this);
		add(btnSetVariable);

		btnGetCandidates = new JButton("Candidate");
		btnGetCandidates.setToolTipText("Candidate");
		btnGetCandidates.setBounds(290, 206, 85, 23);
		btnGetCandidates.addActionListener(this);
		add(btnGetCandidates);

		btnSetActivityVar = new JButton("Set Activity Variable");
		btnSetActivityVar.setBounds(435, 431, 139, 23);
		btnSetActivityVar.addActionListener(this);
		add(btnSetActivityVar);

		btnActivityVariable = new JButton("Activity variable");
		btnActivityVariable.setBounds(290, 431, 134, 23);
		add(btnActivityVariable);
		btnActivityVariable.addActionListener(this);

		btnMilestone = new JButton("Milestones");
		btnMilestone.setBounds(191, 431, 89, 23);
		btnMilestone.addActionListener(this);
		add(btnMilestone);

		btnCancelPi = new JButton("Cancel PI");
		btnCancelPi.setBounds(385, 207, 83, 23);
		btnCancelPi.addActionListener(this);
		add(btnCancelPi);

		btnAllSteps = new JButton("All Steps");
		btnAllSteps.setBounds(103, 431, 78, 23);
		btnAllSteps.addActionListener(this);
		add(btnAllSteps);

		btnDocumentUrl = new JButton("Add Doc");
		btnDocumentUrl.setBounds(10, 173, 83, 23);
		btnDocumentUrl.addActionListener(this);
		add(btnDocumentUrl);

		urlField = new JTextField();
		urlField.setToolTipText("Doc Url");
		urlField.setText("Doc Url");
		urlField.setBounds(103, 176, 86, 20);
		add(urlField);
		urlField.setColumns(10);

		docName = new JTextField();
		docName.setToolTipText("Doc Name");
		docName.setText("Doc Name");
		docName.setBounds(197, 176, 83, 20);
		add(docName);
		docName.setColumns(10);

		btnGetProcessid = new JButton("ProcessID");
		btnGetProcessid.setBounds(103, 239, 177, 23);
		btnGetProcessid.addActionListener(this);
		add(btnGetProcessid);

		txtProcessNameVersion = new JTextField();
		txtProcessNameVersion.setToolTipText("Process Name And Version");
		txtProcessNameVersion.setText("Process Name and Version");
		txtProcessNameVersion.setBounds(103, 208, 177, 20);
		add(txtProcessNameVersion);
		txtProcessNameVersion.setColumns(10);

		final JLabel peopleLabel = new JLabel("");
		peopleLabel.setBounds(327, 227, 258, 238);
		final Image imagemPeople = new ImageIcon(this.getClass().getResource("/people.png")).getImage();
		peopleLabel.setIcon(new ImageIcon(imagemPeople));
		add(peopleLabel);

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
	public void keyPressed(final KeyEvent event) {
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

		// sair do menu
		if (event.getSource() == this.btnExitMenu) {

			final String[] objButtons = { "Yes", "No" };
			final int promptResult = JOptionPane.showOptionDialog(null, "Are you sure?", null,
					JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, objButtons, objButtons[1]);
			if (promptResult == JOptionPane.YES_OPTION) {
				final String logOut = this.app.sair();
				if (logOut.equals("1")) {
					System.exit(0);
				} else if (logOut.equals("-6")) {
					JOptionPane.showMessageDialog(null, "Error logging out", "Error", JOptionPane.ERROR_MESSAGE);
				} else if (logOut.equals("-101")) {
					JOptionPane.showMessageDialog(null, "Unexpected error logging out", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}

			// processos expostos
		} else if (event.getSource() == this.btnProcesses) {

			txtArea.setText("");
			final String[] processListName = this.app.ofInvokeGetWorkClasses();
			if (processListName[0].equals("-6")) {
				JOptionPane.showMessageDialog(null, "Error obtaining exposed workflows", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else if (processListName[0].equals("-101")) {
				JOptionPane.showMessageDialog(null, "Unexpected error executing method", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else if (processListName[0].equals("-8")) {
				JOptionPane.showMessageDialog(null, "Error parsing JSON", "Error", JOptionPane.ERROR_MESSAGE);
			} else if (processListName[0].equals("-1")) {
				txtArea.setText("No processes");
			} else {
				for (int i = 0; i < processListName.length; i++) {
					txtArea.append(processListName[i]);
					txtArea.append("\n\n");
				}
			}

			// receber variáveis do processo
		} else if (event.getSource() == this.btnVariable) {

			txtArea.setText("");
			final String[] variableList = this.app.ofInvokeGetProcessVariables(this.fieldID.getText());
			if (variableList[0].equals("-6")) {
				JOptionPane.showMessageDialog(null, "Error obtaining process variables", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else if (variableList[0].equals("-8")) {
				JOptionPane.showMessageDialog(null, "Error parsing JSON", ERROR, JOptionPane.ERROR_MESSAGE);
			} else if (variableList[0].equals("-1")) {
				txtArea.setText("No variables");
			} else if (variableList[0].equals("-101")) {
				JOptionPane.showMessageDialog(null, "Unexpected error while executing the method", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else if (variableList[0].equals("-5")) {
				JOptionPane.showMessageDialog(null, "Missing/Wrong Parameters.\nParameters needed: Case ID", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else {
				for (final String variable : variableList) {
					txtArea.append(variable);
					txtArea.append("\n");
				}
			}

			// instancias expostas
		} else if (event.getSource() == this.btnCases) {

			txtArea.setText("");
			final String[] caseList = this.app.getCases();
			if (caseList[0].equals("-6")) {
				JOptionPane.showMessageDialog(null, "Error obtaining process instances", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else if (caseList[0].equals("-8")) {
				JOptionPane.showMessageDialog(null, "Error parsing JSON", ERROR, JOptionPane.ERROR_MESSAGE);
			} else if (caseList[0].equals("-1")) {
				txtArea.setText("No cases");
			} else if (caseList[0].equals("-101")) {
				JOptionPane.showMessageDialog(null, "Unexpected error while executing method", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else {
				for (final String caseB : caseList) {
					txtArea.append(caseB);
					txtArea.append("\n\n");
				}
			}

			// instanciar um processo
		} else if (event.getSource() == this.btnStartCase) {

			txtArea.setText("");
			String[] response = this.app.of_invokeCreateWorkflow(this.getFieldProcess().getText());
			if (response[0].equals("-5")) {
				JOptionPane.showMessageDialog(null,
						"Missing/Wrong Parameters.\nParameters needed: Process Name, Process ID, Process Version",
						ERROR, JOptionPane.ERROR_MESSAGE);
			} else if (response[0].equals("-6")) {
				JOptionPane.showMessageDialog(null, "Error starting case", ERROR, JOptionPane.ERROR_MESSAGE);
			} else if (response[0].equals("-101")) {
				JOptionPane.showMessageDialog(null, "Unexpected error while executing the method", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else if (response[0].equals("1")) {
				txtArea.setText("Browser opened in instantiation form");
			}

			// overview do processo
		} else if (event.getSource() == this.btnOverview) {

			txtArea.setText("");
			String response[] = this.app.of_invokeGetOverview(this.fieldID.getText());
			if (response[0].equals("-5")) {
				JOptionPane.showMessageDialog(null,
						"Missing/Wrong Parameters.\nParameters needed: Process Name, Case ID, Process Version", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else if (response[0].equals("-6")) {
				JOptionPane.showMessageDialog(null, "Error opening overview page", ERROR, JOptionPane.ERROR_MESSAGE);
			} else if (response[0].equals("-101")) {
				JOptionPane.showMessageDialog(null, "Unexpected error while executing the method", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else {
				txtArea.setText("Browser opened");
			}

			// logout do programa
		} else if (event.getSource() == this.btnLogout) {

			final String[] objButtons = { "Yes", "No" };
			final int promptResult = JOptionPane.showOptionDialog(null, "Are you sure?", null,
					JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, objButtons, objButtons[1]);
			if (promptResult == JOptionPane.YES_OPTION) {
				final String response = this.app.logout();
				if (response.equals("1")) {
					JOptionPane.showMessageDialog(null, "Logout successfull, Goodbye", "Success",
							JOptionPane.INFORMATION_MESSAGE);
					this.logIn.getUserField().setText("");
					this.logIn.getPasswordField().setText("");
					this.app.getLayout().show(this.app.getCont(), this.app.getLogin());
				} else if (response.equals("-6")) {
					JOptionPane.showMessageDialog(null, "Error logging out", "Error", JOptionPane.ERROR_MESSAGE);
				} else if (response.equals("-101")) {
					JOptionPane.showMessageDialog(null, "Unexpected error logging out", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}

			// receber as tarefas atuais
		} else if (event.getSource() == this.btnTasks) {

			contractsArea.setText("");
			final String[] taskList = this.app.of_invokeGetStepActual(this.fieldID.getText());
			if (taskList[0].equals("-6")) {
				JOptionPane.showMessageDialog(null, "Error obtaining current tasks", ERROR, JOptionPane.ERROR_MESSAGE);
			} else if (taskList[0].equals("-8")) {
				JOptionPane.showMessageDialog(null, "Error parsing JSON", ERROR, JOptionPane.ERROR_MESSAGE);
			} else if (taskList[0].equals("-1")) {
				contractsArea.setText("No tasks");
			} else if (taskList[0].equals("-101")) {
				JOptionPane.showMessageDialog(null, "Unexpected error while executing the method", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else if (taskList[0].equals("-5")) {
				JOptionPane.showMessageDialog(null, "Missing/Wrong Parameters.\nParameters needed: Case ID", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else {
				for (final String variable : taskList) {
					contractsArea.append(variable);
					contractsArea.append("\n");
				}
			}

		} else if (event.getSource() == this.btnTimer) {

			contractsArea.setText("");
			final String[] timerEvents = this.app.of_invokeTimerEvents(this.fieldID.getText());
			if (timerEvents[0].equals("-5")) {
				JOptionPane.showMessageDialog(null, "Missing/Wrong Parameters.\nParameters needed: Case ID", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else if (timerEvents[0].equals("-6")) {
				JOptionPane.showMessageDialog(null, "Error obtaining Timer Events", ERROR, JOptionPane.ERROR_MESSAGE);
			} else if (timerEvents[0].equals("-8")) {
				JOptionPane.showMessageDialog(null, "Error parsing JSON", ERROR, JOptionPane.ERROR_MESSAGE);
			} else if (timerEvents[0].equals("-101")) {
				JOptionPane.showMessageDialog(null, "Unexpected error executing method", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else if (timerEvents[0].equals("-1")) {
				contractsArea.setText("No timers found");
			} else {
				for (String timer : timerEvents) {
					contractsArea.append(timer + "\n\n");
				}
			}

			// obter passos do workflow até ao atual
		} else if (event.getSource() == this.searchTask) {

			contractsArea.setText("");
			final String[] archivedTaskList = this.app.searchArchivedTask(this.fieldID.getText());
			if (archivedTaskList[0].equals("-5")) {
				JOptionPane.showMessageDialog(null, "Missing/Wrong Parameters.\nParameters needed: Case ID", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else if (archivedTaskList[0].equals("-6")) {
				JOptionPane.showMessageDialog(null, "Error obtaining process flowNodes", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else if (archivedTaskList[0].equals("-1")) {
				contractsArea.setText("No tasks found");
			} else if (archivedTaskList[0].equals("-8")) {
				JOptionPane.showMessageDialog(null, "Error parsing JSON", ERROR, JOptionPane.ERROR_MESSAGE);
			} else if (archivedTaskList[0].equals("-101")) {
				JOptionPane.showMessageDialog(null, "Unexpected error executing method", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else {
				for (String task : archivedTaskList) {
					contractsArea.append(task + "\n\n");
				}
			}

			// atribuir tarefa a ator
		} else if (event.getSource() == this.btnAssignTask) {

			String[] assign = this.app.of_invokeReassignTaskCandidate(this.textTaskID.getText(),
					this.userName.getText());
			if (assign[0].equals("1")) {
				JOptionPane.showMessageDialog(null, "Task assigned", "Success", JOptionPane.INFORMATION_MESSAGE);
			} else if (assign[0].equals("-5")) {
				JOptionPane.showMessageDialog(null, "Missing/Wrong Parameters.\nParameters needed: Task ID, User Name",
						"Error", JOptionPane.ERROR_MESSAGE);
			} else if (assign[0].equals("-6")) {
				JOptionPane.showMessageDialog(null, "Error defining new candidate", ERROR, JOptionPane.ERROR_MESSAGE);
			} else if (assign[0].equals("-101")) {
				JOptionPane.showMessageDialog(null, "Unexpected error while executing method", ERROR,
						JOptionPane.ERROR_MESSAGE);
			}

			// executar tarefa
		} else if (event.getSource() == this.btnRunTask) {

			String[] runTask = this.app.of_invokeDispatchStep(this.textTaskID.getText());
			if (runTask[0].equals("1")) {
				txtArea.setText("Continue on your browser");
			} else if (runTask[0].equals("-5")) {
				JOptionPane.showMessageDialog(null, "Missing/Wrong Parameters.\nParameters needed: Task ID", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else if (runTask[0].equals("-6")) {
				JOptionPane.showMessageDialog(null, "Error opening browser on task", ERROR, JOptionPane.ERROR_MESSAGE);
			} else if (runTask[0].equals("-101")) {
				JOptionPane.showMessageDialog(null, "Unexpected error while executing method", ERROR,
						JOptionPane.ERROR_MESSAGE);
			}

			// executar tarefa (2)
		} else if (event.getSource() == this.btnRunTaskP) {

			String response = this.app.of_invokeDispatchStepP(this.textTaskID.getText(), this.approvedField.getText());
			if (response.equals("1")) {
				JOptionPane.showMessageDialog(null, "Task Executed", "Success", JOptionPane.INFORMATION_MESSAGE);
			} else if (response.equals("-5")) {
				JOptionPane.showMessageDialog(null,
						"Missing/Wrong Parameters.\nParameters needed: Task ID, Approved Field", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else if (response.equals("-6")) {
				JOptionPane.showMessageDialog(null, "Error executing task", ERROR, JOptionPane.ERROR_MESSAGE);
			} else if (response.equals("-101")) {
				JOptionPane.showMessageDialog(null, "Unexpected error while executing method", ERROR,
						JOptionPane.ERROR_MESSAGE);
			}

			// instanciar processo (2)
		} else if (event.getSource() == this.btnStart) {

			if (this.app.getContract2(this.getFieldProcess().getText()) == null) {
				JOptionPane.showMessageDialog(null, "Error retrieving contract", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				this.app.novoForm();
			}

			// receber a descrição de uma tarefa
		} else if (event.getSource() == this.btnDescription) {

			String[] description = this.app.of_invokeGetStepInstructions(this.textTaskID.getText());
			if (description[0].equals("-5")) {
				JOptionPane.showMessageDialog(null, "Missing/Wrong Parameters.\nParameters needed: Task ID", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else if (description[0].equals("-6")) {
				JOptionPane.showMessageDialog(null, "Error obtaining task inscructions", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else if (description[0].equals("-8")) {
				JOptionPane.showMessageDialog(null, "Error parsing JSON", ERROR, JOptionPane.ERROR_MESSAGE);
			} else if (description[0].equals("-101")) {
				JOptionPane.showMessageDialog(null, "Unexpected error while executing method", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else if (description[0].equals("-1")) {
				txtArea.setText("Task has no description");
			} else {
				txtArea.setText(description[0]);
			}

			// receber variáveis de tarefa
		} else if (event.getSource() == this.btnActivityVariable) {

			txtArea.setText("");
			String[] response = this.app.of_invokeGetActivityVariables(this.textTaskID.getText());
			if (response.length != 0) {
				if (response[0].equals("-6")) {
					JOptionPane.showMessageDialog(null, "Error obtaining variable details", ERROR,
							JOptionPane.ERROR_MESSAGE);
				} else if (response[0].equals("-5")) {
					JOptionPane.showMessageDialog(null, "Missing/Wrong Parameters.\nParameters needed: Task ID", ERROR,
							JOptionPane.ERROR_MESSAGE);
				} else if (response.equals("-8")) {
					JOptionPane.showMessageDialog(null, "Error parsing JSON", ERROR, JOptionPane.ERROR_MESSAGE);
				} else if (response[0].equals("-101")) {
					JOptionPane.showMessageDialog(null, "Unexpected error while executing method", ERROR,
							JOptionPane.ERROR_MESSAGE);
				} else {
					for (String var : response) {
						txtArea.append(var + "\n");
					}
				}
			} else {
				txtArea.setText("No variables");
			}

			// receber inputs necessários a execução de tarefa
		} else if (event.getSource() == this.btnStepItems) {

			txtArea.setText("");
			String[] response = this.app.of_invokeGetStepResponseItems(this.textTaskID.getText());
			if (response[0].equals("-5")) {
				JOptionPane.showMessageDialog(null, "Missing/Wrong Parameters.\nParameters needed: Task ID", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else if (response[0].equals("-6")) {
				JOptionPane.showMessageDialog(null, "Error obtaining process step items", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else if (response[0].equals("-8")) {
				JOptionPane.showMessageDialog(null, "Error parsing JSON", ERROR, JOptionPane.ERROR_MESSAGE);
			} else if (response[0].equals("-101")) {
				JOptionPane.showMessageDialog(null, "Unexpected error executing method", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else if (response[0].equals("-1")) {
				txtArea.setText("No items found");

			} else {
				for (String item : response) {
					txtArea.append(item + "\n");
				}
			}

			// receber inputs necessários a instanciação de processo
		} else if (event.getSource() == this.btnProcessFields) {

			txtArea.setText("");
			String[] response = this.app.of_invokeGetProcessDataFields(this.fieldProcess.getText());
			if (response[0].equals("-5")) {
				JOptionPane.showMessageDialog(null, "Missing/Wrong Parameters.\nParameters needed: Process ID", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else if (response[0].equals("-1")) {
				txtArea.setText("No fields found");
			} else if (response[0].equals("-101")) {
				JOptionPane.showMessageDialog(null, "Unexpected error during method execution", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else {
				for (String item : response) {
					txtArea.append(item + "\n\n");
				}
			}

			// definição de valor de variáveis de processo
		} else if (event.getSource() == this.btnSetVariable) {

			String response[] = this.app.of_invokeSetProcessVariable(this.fieldID.getText(),
					this.textVariableName.getText(), this.txtVariableValue.getText());
			if (response[0].equals("-6")) {
				JOptionPane.showMessageDialog(null, "Error obtaining variable", ERROR, JOptionPane.ERROR_MESSAGE);
			} else if (response[0].equals("-5")) {
				JOptionPane.showMessageDialog(null,
						"Missing/Wrong Parameters.\nParameters needed: Case ID, Variable Name, Variable Value", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else if (response[0].equals("-101")) {
				JOptionPane.showMessageDialog(null, "Unexpected error while executing method", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else if (response[0].equals("1")) {
				JOptionPane.showMessageDialog(null, "Variable updated", "Success", JOptionPane.INFORMATION_MESSAGE);
			}

			// receber candidatos a uma tarefa
		} else if (event.getSource() == this.btnGetCandidates) {

			contractsArea.setText("");
			String response[] = this.app.of_invokeGetCandidates(this.textTaskID.getText());
			if (response[0].equals("-5")) {
				JOptionPane.showMessageDialog(null, "Missing/Wrong Parameters.\nParameters needed: Task ID", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else if (response[0].equals("-6")) {
				JOptionPane.showMessageDialog(null, "Error obtaining candidate", ERROR, JOptionPane.ERROR_MESSAGE);
			} else if (response[0].equals("-8")) {
				JOptionPane.showMessageDialog(null, "Error parsing JSON", ERROR, JOptionPane.ERROR_MESSAGE);
			} else if (response[0].equals("-101")) {
				JOptionPane.showMessageDialog(null, "Unexpected error during method execution", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else {
				contractsArea.append(response[0]);
			}

			// definir valor de variavel de tarefa
		} else if (event.getSource() == this.btnSetActivityVar) {

			String[] response = this.app.of_invokeSetActivityVariable(this.textTaskID.getText(),
					this.textVariableName.getText(), this.txtVariableValue.getText());
			if (response[0].equals("-5")) {
				JOptionPane.showMessageDialog(null,
						"Missing/Wrong Parameters.\nParameters needed: Task ID, Variable Name, Variable Value", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else if (response[0].equals("-6")) {
				JOptionPane.showMessageDialog(null, "Error obtaining activity variable", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else if (response[0].equals("-101")) {
				JOptionPane.showMessageDialog(null, "Unexpected error during method execution", ERROR,
						JOptionPane.ERROR_MESSAGE);
			} else if (response[0].equals("1")) {
				JOptionPane.showMessageDialog(null, "Task updated", "Success", JOptionPane.INFORMATION_MESSAGE);
			}

			// receber milestones passadas e não passadas
		} else if (event.getSource() == this.btnMilestone) {

			txtArea.setText("");
			String[] milestones = this.app.of_invokeGetMilestones(this.fieldID.getText());
			if (milestones[0].equals("-1")) {
				JOptionPane.showMessageDialog(null, "Haven't reached any milestones or there are no milestones", "Info",
						JOptionPane.INFORMATION_MESSAGE);
			} else if (milestones[0].equals("-5")) {
				JOptionPane.showMessageDialog(null, "Missing/Wrong Parameters.\nParameters needed: Case ID, Process ID",
						"Error", JOptionPane.ERROR_MESSAGE);
			} else if (milestones[0].equals("-6")) {
				JOptionPane.showMessageDialog(null, "Error obtaining milestones", "Error", JOptionPane.ERROR_MESSAGE);
			} else if (milestones[0].equals("-8")) {
				JOptionPane.showMessageDialog(null, "Error parsing JSON", "Error", JOptionPane.ERROR_MESSAGE);
			} else if (milestones[0].equals("-101")) {
				JOptionPane.showMessageDialog(null, "Unexpected error while executing the method", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else {
				for (String milestone : milestones) {
					txtArea.append(milestone);
					txtArea.append("\n");
				}
			}

			// receber todos os passos do workflow
		} else if (event.getSource() == this.btnAllSteps) {

			txtArea.setText("");
			String[] allSteps = this.app.of_invokeGetEveryStep(this.fieldProcess.getText());
			if (allSteps[0].equals("-5")) {
				JOptionPane.showMessageDialog(null, "Missing/Wrong Parameters.\nParameters needed: Process ID", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else if (allSteps[0].equals("-6")) {
				JOptionPane.showMessageDialog(null, "Error retrieving Steps", "Error", JOptionPane.ERROR_MESSAGE);
			} else if (allSteps[0].equals("-8")) {
				JOptionPane.showMessageDialog(null, "Error parsing JSON", "Error", JOptionPane.ERROR_MESSAGE);
			} else if (allSteps[0].equals("-101")) {
				JOptionPane.showMessageDialog(null, "Unexpected error while executing the method", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else {
				for (String step : allSteps) {
					txtArea.append(step);
					txtArea.append("\n");
				}
			}

			// criação de documento
		} else if (event.getSource() == this.btnDocumentUrl) {

			txtArea.setText("");
			String response = this.app.of_invokeCreateDocument(this.fieldID.getText(), this.urlField.getText(),
					this.docName.getText());
			if (response.equals("-5")) {
				JOptionPane.showMessageDialog(null,
						"Missing/Wrong Parameters.\nParameters needed: CaseID, URL, Doc Name", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else if (response.equals("-1")) {
				JOptionPane.showMessageDialog(null, "Unauthorized access to file", "Error", JOptionPane.ERROR_MESSAGE);
			} else if (response.equals("-6")) {
				JOptionPane.showMessageDialog(null, "Error posting document", "Error", JOptionPane.ERROR_MESSAGE);
			} else if (response.equals("-8")) {
				JOptionPane.showMessageDialog(null, "Error parsing JSON", "Error", JOptionPane.ERROR_MESSAGE);
			} else if (response.equals("-101")) {
				JOptionPane.showMessageDialog(null, "Unexpected error while executing the method", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Document created", "Success", JOptionPane.INFORMATION_MESSAGE);
				txtArea.setText(response);
			}

			// delete process instance
		} else if (event.getSource() == this.btnCancelPi) {

			contractsArea.setText("");
			String[] response = this.app.of_invokeCancelInstance(this.fieldID.getText());
			if (response[0].equals("-5")) {
				JOptionPane.showMessageDialog(null, "Missing/Wrong Parameters.\n Parameters needed: CaseID", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else if (response[0].equals("-6")) {
				JOptionPane.showMessageDialog(null, "Error deleting Process Instance", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else if (response[0].equals("-101")) {
				JOptionPane.showMessageDialog(null, "Unexpected error while executing the method", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Case Deleted", "Success", JOptionPane.INFORMATION_MESSAGE);
			}

			// obtain processid from name and version
		} else if (event.getSource() == this.btnGetProcessid) {

			txtArea.setText("");
			String[] response = this.app.getProcessID(this.txtProcessNameVersion.getText());
			if (response[0].equals("-8")) {
				JOptionPane.showMessageDialog(null, "Error parsing JSON", "Error", JOptionPane.ERROR_MESSAGE);
			} else if (response.equals("-5")) {
				JOptionPane.showMessageDialog(null,
						"Missing/Wrong Parameters.\nParameters needed: processName--processVersion", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else if (response[0].equals("-6")) {
				JOptionPane.showMessageDialog(null, "Error deleting Process Instance", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else if (response[0].equals("-101")) {
				JOptionPane.showMessageDialog(null, "Unexpected error while executing the method", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else {
				txtArea.setText(response[0]);
			}

		}
	}

	/**
	 *
	 * @return the JTextField with process ID
	 */
	public final JTextField getFieldProcess() {
		return fieldProcess;
	}

	/**
	 *
	 * @return the main app
	 */
	public MainApp getApp() {
		return app;
	}

	/**
	 *
	 * @return the login screen
	 */
	public LogIn getLogIn() {
		return logIn;
	}
}
