package com.zhuravchak.command.volume;

import com.zhuravchak.command.ActionCommand;
import com.zhuravchak.command.helper.Rounder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Yaroslav on 13-Sep-17.
 */
public class CylinderCommand  implements ActionCommand {
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        double r = Double.valueOf(request.getParameter("r"));
        double h = Double.valueOf(request.getParameter("h"));

        double result = Math.PI*r*r*h;

        int accuracy = Integer.valueOf(request.getParameter("accuracy"));

        result = Rounder.round(result, accuracy);

        request.setAttribute("img", "images/cylinder.png");
        request.setAttribute("result", result);
        return "/result.jsp";
    }
}
