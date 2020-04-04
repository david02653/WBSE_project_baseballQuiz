package cs.controller;

import cs.model.AnswerAnalysis;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class QuizServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("testing");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("post method activated");
        String answer = req.getParameter("ans");
        req.setAttribute("answer", answer);
        boolean result = AnswerAnalysis.ifCorrect(answer);
        req.setAttribute("result", result);

        RequestDispatcher view;
        if(result){
            view = req.getRequestDispatcher("./result-correct.jsp");
        }else{
            view = req.getRequestDispatcher("./result-wrong.jsp");
        }
        view.forward(req, resp);
    }
}
