package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Registro_cliente;
import Dao.Registro_local;
import Model.Validar_cliente;
import Model.Validar_local;

/**
 * Servlet implementation class Login_locales
 */
public class Login_locales extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_locales() {
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
		Validar_local validar = new Validar_local();
		Registro_local local = new Registro_local();
		int r;
		String accion = request.getParameter("accion");
		if(accion.equals("Ingresar")) {
			String email = request.getParameter("email");
			String pwd = request.getParameter("pwd");
			local.setEmail(email);
			local.setPwd(pwd);
			r=validar.validarC(local);
			if(r==1) {
				request.getRequestDispatcher("interfaz_u.jsp").forward(request, response);
			}else {
				
				request.getRequestDispatcher("index.html").forward(request, response);
			}
		}
	}

}
