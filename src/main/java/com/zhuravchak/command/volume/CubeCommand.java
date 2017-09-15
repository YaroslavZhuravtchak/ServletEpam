package com.zhuravchak.command.volume;

import com.zhuravchak.command.ActionCommand;
import com.zhuravchak.command.helper.Rounder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Yaroslav on 13-Sep-17.
 */
public class CubeCommand  implements ActionCommand {
    public String execute(HttpServletRequest request, HttpServletResponse response) {

        double h = Double.valueOf(request.getParameter("h"));
        if(h<0) throw new  NumberFormatException();
        double result = h*h*h;

        int accuracy = Integer.valueOf(request.getParameter("accuracy"));

        result = Rounder.round(result, accuracy);
        String img = "/images/cube.png";
        request.setAttribute("img", img);
        request.setAttribute("result", result);
        return "/result.jsp";
    }
}
