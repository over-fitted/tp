package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.IncrementCommand;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new IncrementCommand object
 */
public class IncrementCommandParser implements Parser<IncrementCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the IncrementCommand
     * and returns a IncrementCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public IncrementCommand parse(String args) throws ParseException {
        try {
            Index index = ParserUtil.parseIndex(args);
            return new IncrementCommand(index);
        } catch (ParseException pe) {
            throw new ParseException(
                String.format(MESSAGE_INVALID_COMMAND_FORMAT, IncrementCommand.MESSAGE_USAGE), pe);
        }
    }

}