package com.zhuravchak.command.factory;

import com.zhuravchak.command.ActionCommand;
import com.zhuravchak.command.client.CommandEnum;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ActionFactory {

    public ActionCommand defineCommand(HttpServletRequest request, HttpServletResponse response) {
        ActionCommand current = null;
        String action = request.getParameter("shape");

        try {
            CommandEnum currentEnum = CommandEnum.valueOf(action.toUpperCase());
            current = currentEnum.getCurrentCommand();
        } catch (IllegalArgumentException e) {
           e.printStackTrace();
    }
        return current;
    }
}
