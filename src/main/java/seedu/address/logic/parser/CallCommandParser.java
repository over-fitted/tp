package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.CallCommand;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new CallCommand object
 */
public class CallCommandParser implements Parser<CallCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the CallCommand
     * and returns a CallCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public CallCommand parse(String args) throws ParseException {
        try {
            Index index = ParserUtil.parseIndex(args);
            return new CallCommand(index);
        } catch (ParseException pe) {
            throw new ParseException(
                String.format(MESSAGE_INVALID_COMMAND_FORMAT, CallCommand.MESSAGE_USAGE), pe);
        }
    }

}