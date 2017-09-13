package com.zhuravchak.controler;

import com.zhuravchak.command.ActionCommand;
import com.zhuravchak.command.factory.ActionFactory;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class VolumeController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    private void processRequest(HttpServletRequest request,
                                HttpServletResponse response)
            throws ServletException, IOException {

        String page = null;

        ActionFactory client = new ActionFactory();
        ActionCommand command = client.defineCommand(request, response);

        page = command.execute(request, response);

        if (page != null) {
            RequestDispatcher dispatcher =
                    getServletContext().getRequestDispatcher(page);

            dispatcher.forward(request, response);
        } else {
            //todo
        }
    }
}