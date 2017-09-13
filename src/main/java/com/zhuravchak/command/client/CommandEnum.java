package com.zhuravchak.command.client;

import com.zhuravchak.command.ActionCommand;
import com.zhuravchak.command.volume.*;

/**
 * Created by Yaroslav on 13-Sep-17.
 */
public enum CommandEnum {
    CUBE(new CubeCommand()),
    PRISM(new PrismCommand()),
    PARALLELEPIPED(new ParallelepipedCommand()),
    PYRAMID(new PyramidCommand()),
    CYLINDER(new CylinderCommand()),
    CONE(new ConeCommand()),
    BALL(new BallCommand());

    /** The command. */
    ActionCommand command;

    CommandEnum(ActionCommand command) {
        this.command = command;
    }

    public ActionCommand getCurrentCommand() {
        return command;
    }
}
