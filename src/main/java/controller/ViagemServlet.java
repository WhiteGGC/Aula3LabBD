package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Onibus;
import model.Viagem;
import persistence.GenericDao;
import persistence.OnibusDao;
import persistence.ViagemDao;

@WebServlet("/viagem")
public class ViagemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ViagemServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("codigo");
		
		Viagem v = new Viagem();
		v.setId(Integer.parseInt(id));
		
		Onibus o = new Onibus();
		o.setCodigo(Integer.parseInt(id));
		
		GenericDao gDao = new GenericDao();
		ViagemDao vDao = new ViagemDao(gDao);
		OnibusDao oDao = new OnibusDao(gDao);
		String erro = "";
		
		try {
			
			v = vDao.consultaViagem(v);
			o = oDao.consultaOnibus(o);
			
		} catch (Exception e) {
			
			erro = e.getMessage();
			
		} finally {
			
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			request.setAttribute("viagem", v);
			request.setAttribute("onibus", o);
			request.setAttribute("erro", erro);
			
			rd.forward(request, response);
			
		}
			
	}

}
