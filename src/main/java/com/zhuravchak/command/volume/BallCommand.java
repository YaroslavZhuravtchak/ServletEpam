package com.zhuravchak.command.volume;

import com.zhuravchak.command.ActionCommand;
import com.zhuravchak.command.helper.Rounder;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Yaroslav on 13-Sep-17.
 */
public class BallCommand implements ActionCommand {
    public String execute(HttpServletRequest request, HttpServletResponse response) {

        double r = Double.valueOf(request.getParameter("r"));

        double result = 4*Math.PI*r*r*r/3;

        int accuracy = Integer.valueOf(request.getParameter("accuracy"));

        result = Rounder.round(result, accuracy);

        request.setAttribute("img", "images/sphere.png");
        request.setAttribute("result", result);
        return "/result.jsp";
    }
}
