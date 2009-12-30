package atan.parser;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.Controller;
import atan.model.Flag;

/**
 * Class description
 * @author Atan
 */
class ObjNameFlagPenaltyEast implements ObjName {
    char qualifier;

    /**
     * Constructs ...
     * @param qualifier
     */
    ObjNameFlagPenaltyEast(char qualifier) {
        this.qualifier = qualifier;
    }

    /**
     * Method description
     * @param c
     * @param dist
     * @param dir
     */
    @Override
    public void infoSeeFromEast(Controller c, double dist, double dir) {
        switch (qualifier) {
            case 't' :
                c.infoSeeFlagPenaltyOwn(Flag.RIGHT, dist, dir);
                break;
            case 'b' :
                c.infoSeeFlagPenaltyOwn(Flag.LEFT, dist, dir);
                break;
            case 'c' :
                c.infoSeeFlagPenaltyOwn(Flag.CENTER, dist, dir);
                break;
        }
    }

    /**
     * Method description
     * @param c
     * @param dist
     * @param dir
     */
    @Override
    public void infoSeeFromWest(Controller c, double dist, double dir) {
        switch (qualifier) {
            case 't' :
                c.infoSeeFlagPenaltyOther(Flag.LEFT, dist, dir);
                break;
            case 'b' :
                c.infoSeeFlagPenaltyOther(Flag.RIGHT, dist, dir);
                break;
            case 'c' :
                c.infoSeeFlagPenaltyOther(Flag.CENTER, dist, dir);
                break;
        }
    }
}
