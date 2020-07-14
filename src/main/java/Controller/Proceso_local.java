package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Registro_local;
import Model.Crudlocal;

public class Proceso_local extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Proceso_local() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		Registro_local local = new Registro_local();
        Crudlocal crudlocal = new Crudlocal();
        
         local.setNombre(request.getParameter("nombre"));
         local.setRut_representante(request.getParameter("rut"));
         local.setEmail(request.getParameter("email"));
         local.setPwd(request.getParameter("pwd"));
         local.setFono( Integer.parseInt(request.getParameter("fono")));
         local.setDireccion(request.getParameter("direccion"));
         local.setComuna(request.getParameter("comuna"));
         local.setGiro(request.getParameter("giro"));
         local.setPatente(request.getParameter("patente"));
        
         String respuesta = crudlocal.create(local);
         
         response.setContentType("text/html;charset=UTF-8");
         try (PrintWriter out = response.getWriter()) {
        	 response.sendRedirect(request.getContextPath() + "/index.html");
         }
     }
	}
	


