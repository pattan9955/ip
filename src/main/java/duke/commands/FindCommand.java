package duke.commands;

import duke.PersistentStorage;
import duke.Tasklist;
import duke.UI;

/**
 * Class encapsulating a "find" command by the user.
 */
public class FindCommand extends Command {

    /** String containing the desired search terms */
    private String searchTerms;

    /**
     * A constructor for a FindCommand
     *
     * @param searchTerms A String representing the search terms by the user
     */
    public FindCommand(String searchTerms) {
        this.searchTerms = searchTerms;
    }

    /**
     * Executes a find command by finding task descriptions that contain the keywords
     * and printing said tasks.
     *
     * @param taskList The Tasklist associated with the Duke instance
     * @param ui The UI associated with the Duke instance
     * @param storage The PersistentStorage associated with the Duke instance
     */
    public void executeCommand(Tasklist taskList, UI ui, PersistentStorage storage) {
        Tasklist matchingTasks = taskList.findAllTasksWith(this.searchTerms);
        ui.showMatchingTasks(matchingTasks);
    }
}
