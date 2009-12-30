package atan.model;

/**
 * An Enum for lines.
 * @author Nick James
 */
public enum Line {

    /**
     * The center line.
     */
    CENTER,

    /**
     * The line behind your goal.
     */
    OWN,

    /**
     * The line behind the other goal.
     */
    OTHER,

    /**
     * The line along the left hand edge (dependant on which direction your playing)
     */
    LEFT,

    /**
     * The line along the right hand edge (dependant on which direction your playing)
     */
    RIGHT
}
