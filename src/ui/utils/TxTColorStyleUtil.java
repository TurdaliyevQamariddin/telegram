package src.ui.utils;

public interface TxTColorStyleUtil {

    /**
     * Text Style
     */
    String ANSI_ITALIC = "\u001B[3m";
    String ANSI_BOLD = "\u001B[1m";
    String ANSI_UNDERLINE = "\u001B[4m";

    /**
     * BackRound color
     */

    String ANSI_RED_BACKGROUND = "\u001B[41m";
    String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    /**
     * RESET
     */
    String ANSI_RESET = "\u001B[0m";

    /**
     * Text Color
     */
    // CYAN -> Moviy
    String ANSI_CYAN = "\u001B[36m";
    String ANSI_BLACK = "\u001B[30m";
    String ANSI_WHITE = "\u001B[37m";
    String ANSI_YELLOW = "\u001B[43m";
    String ANSI_BLUE = "\u001B[34m";
    String ANSI_RED = "\u001B[31m";
    String ANSI_GREEN = "\u001B[32m";
    String ANSI_PURPLE = "\u001B[45m";
}
