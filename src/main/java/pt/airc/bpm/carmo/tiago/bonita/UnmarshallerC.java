package pt.airc.bpm.carmo.tiago.bonita;

import java.util.List;
import javax.xml.bind.JAXBException;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import pt.airc.bpm.carmo.tiago.pojos.ActivityVariable;
import pt.airc.bpm.carmo.tiago.pojos.ActorMember;
import pt.airc.bpm.carmo.tiago.pojos.Case;
import pt.airc.bpm.carmo.tiago.pojos.CaseVariable;
import pt.airc.bpm.carmo.tiago.pojos.Contract;
import pt.airc.bpm.carmo.tiago.pojos.Design;
import pt.airc.bpm.carmo.tiago.pojos.Document;
import pt.airc.bpm.carmo.tiago.pojos.Process;
import pt.airc.bpm.carmo.tiago.pojos.Task;
import pt.airc.bpm.carmo.tiago.pojos.TimerEvent;
import pt.airc.bpm.carmo.tiago.pojos.User;

/**
 *
 * @author Tiago Carmo
 *
 */
public class UnmarshallerC {
	/**
	 * string for warning suppression.
	 */
	private static final String WARNING = "serial";

	/**
	 * Unmarshall Processes to a list.
	 *
	 * @param msg
	 *            json message received
	 * @return the list of processes after unmarshalling
	 * @throws JAXBException
	 *             in case there is a problem with the unmarshall
	 */
	@SuppressWarnings(WARNING)
	public final List<Process> processList(final String msg) throws JAXBException {

		final Gson gson = new Gson();

		final TypeToken<List<Process>> token = new TypeToken<List<Process>>() {
		};
		final List<Process> personList = gson.fromJson(msg, token.getType());

		return personList;
	}

	/**
	 * Unmarshall Cases to an arrayList.
	 *
	 * @param msg
	 *            json message received
	 * @return list of cases
	 * @throws JAXBException
	 *             in case there is a problem
	 */
	@SuppressWarnings(WARNING)
	public final List<Case> caseList(final String msg) throws JAXBException {

		final Gson gson = new Gson();

		final TypeToken<List<Case>> token = new TypeToken<List<Case>>() {
		};
		final List<Case> personList = gson.fromJson(msg, token.getType());

		return personList;
	}

	/**
	 * Unmarshall Variables to an arrayList.
	 *
	 * @param msg
	 *            json message received
	 * @return list of variables
	 * @throws JAXBException
	 *             in case there is a problem
	 */
	@SuppressWarnings(WARNING)
	public final List<CaseVariable> variableList(final String msg) throws JAXBException {

		final Gson gson = new Gson();

		final TypeToken<List<CaseVariable>> token = new TypeToken<List<CaseVariable>>() {
		};
		final List<CaseVariable> variableList = gson.fromJson(msg, token.getType());

		return variableList;
	}

	/**
	 * Unmarshall Tasks to an arrayList.
	 *
	 * @param msg
	 *            json message received
	 * @return list of tasks
	 * @throws JAXBException
	 *             in case there is a problem
	 */
	@SuppressWarnings(WARNING)
	public final List<Task> taskList(final String msg) throws JAXBException {
		final Gson gson = new Gson();

		final TypeToken<List<Task>> token = new TypeToken<List<Task>>() {
		};
		final List<Task> taskList = gson.fromJson(msg, token.getType());

		return taskList;
	}
	
	/**
	 *
	 * @param msg
	 * @return
	 * @throws JAXBException
	 */
	public final Case unCase(final String msg) throws JAXBException {
		final Gson gson = new Gson();

		final Case unCase = gson.fromJson(msg, Case.class);

		return unCase;
	}

	/**
	 * Unmarshall a Task to a java class.
	 *
	 * @param msg
	 *            the json message to unmarshall
	 * @return the java object
	 * @throws JAXBException
	 *             in case something goes wrong
	 */
	public final Task task(final String msg) throws JAXBException {
		final Gson gson = new Gson();

		final Task task = gson.fromJson(msg, Task.class);

		return task;
	}
	
	/**
	 *
	 * @param msg
	 * @return
	 * @throws JAXBException
	 */
	public final Process process(final String msg) throws JAXBException {
		final Gson gson = new Gson();

		final Process process = gson.fromJson(msg, Process.class);

		return process;
	}

	/**
	 * Unmarshall Users to an arrayList.
	 *
	 * @param msg
	 *            json message received
	 * @return user list
	 * @throws JAXBException
	 *             in case there is a problem
	 */
	@SuppressWarnings(WARNING)
	public final List<User> userList(final String msg) throws JAXBException {
		final Gson gson = new Gson();

		final TypeToken<List<User>> token = new TypeToken<List<User>>() {
		};
		final List<User> userList = gson.fromJson(msg, token.getType());

		return userList;
	}

	/**
	 * Retrieve the task contract.
	 *
	 * @param msg
	 *            JSON to be unmarshalled
	 * @return the task contract
	 * @throws JAXBException
	 *             in case something goes wrong
	 */
	public final Contract unContract(final String msg) throws JAXBException {
		final Gson gson = new Gson();

		final Contract contract = gson.fromJson(msg, Contract.class);

		return contract;
	}

	/**
	 * Unmarshall the activity to a java class.
	 *
	 * @param msg
	 *            the json to be unmarshalled
	 * @return the activity variables object
	 * @throws JAXBException
	 *             in case something goes wrong
	 */
	public ActivityVariable activityVariable(final String msg) throws JAXBException {
		final Gson gson = new Gson();

		final ActivityVariable activityVariable = gson.fromJson(msg, ActivityVariable.class);

		return activityVariable;
	}
	
	/**
	 *
	 * @param msg
	 * @return
	 * @throws JAXBException
	 */
	public CaseVariable caseVariable(final String msg) throws JAXBException {
		final Gson gson = new Gson();

		final CaseVariable caseVariable = gson.fromJson(msg, CaseVariable.class);

		return caseVariable;
	}

	/**
	 * Unmarshall a user.
	 *
	 * @param msg
	 *            the json to be unmarshalled
	 * @return the user object
	 * @throws JAXBException
	 *             in case something goes wrong
	 */
	public User user(final String msg) throws JAXBException {
		final Gson gson = new Gson();

		final User user = gson.fromJson(msg, User.class);

		return user;
	}

	/**
	 * Unmarshalle the actor list.
	 * 
	 * @param msg
	 *            to be unmarshalled
	 * @return the actor list
	 * @throws JAXBException
	 *             in case something goes wrong
	 */
	@SuppressWarnings(WARNING)
	public List<ActorMember> actorList(final String msg) throws JAXBException {
		final Gson gson = new Gson();

		final TypeToken<List<ActorMember>> token = new TypeToken<List<ActorMember>>() {
		};
		final List<ActorMember> actorList = gson.fromJson(msg, token.getType());

		return actorList;

	}

	/**
	 * Unmarshall the process design.
	 * 
	 * @param msg
	 *            to be unmarshalled
	 * @return the process design
	 * @throws JAXBException
	 *             in case something goes wrong
	 */
	public Design design(String msg) throws JAXBException {
		final Gson gson = new Gson();

		final Design design = gson.fromJson(msg, Design.class);

		return design;
	}

	/**
	 * Unmarshall a document.
	 * 
	 * @param msg
	 *            to be unamrshalled
	 * @return the document
	 * @throws JAXBException
	 *             in case something goes wrong
	 */
	public Document document(String msg) throws JAXBException {
		final Gson gson = new Gson();

		final Document document = gson.fromJson(msg, Document.class);

		return document;
	}

	/**
	 * Unmarshall the timer event list.
	 * 
	 * @param msg
	 *            to be unamrshalled
	 * @return the timer event list
	 * @throws JAXBException
	 *             in case something goes wrong
	 */
	@SuppressWarnings(WARNING)
	public List<TimerEvent> timerEvent(String msg) throws JAXBException {
		final Gson gson = new Gson();

		final TypeToken<List<TimerEvent>> token = new TypeToken<List<TimerEvent>>() {
		};
		final List<TimerEvent> timerList = gson.fromJson(msg, token.getType());

		return timerList;
	}

}
