package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Registro_cliente;
import Dao.Registro_local;
import Model.CrudPersona;
import Model.Crudlocal;

/**
 * Servlet implementation class Proceso
 */
public class Proceso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Proceso() {
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
		Registro_cliente cliente = new Registro_cliente();
        CrudPersona crudcliente = new CrudPersona();
        
         cliente.setNombre(request.getParameter("nombre"));
         cliente.setRut(request.getParameter("rut"));
         cliente.setEmail(request.getParameter("email"));
         cliente.setPwd(request.getParameter("pwd"));
         cliente.setFono( Integer.parseInt(request.getParameter("fono")));
         cliente.setDireccion(request.getParameter("direccion"));

        
         String respuesta = crudcliente.create(cliente);
         
         response.setContentType("text/html;charset=UTF-8");
         try (PrintWriter out = response.getWriter()) {
             /* TODO output your page here. You may use following sample code. */
             out.println("<!DOCTYPE html>");
             out.println("<html>");
             out.println("<head>");
             out.println("<title>Servlet Proceso</title>");            
             out.println("</head>");
             out.println("<body>");
             out.println("<h1>Servlet Proceso at " + respuesta + "</h1>");
             out.println("</body>");
             out.println("</html>");
         }
     }
	}
