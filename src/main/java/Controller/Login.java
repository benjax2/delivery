package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Registro_cliente;
import Model.Validar_cliente;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		doGet(request, response);
		Validar_cliente validar = new Validar_cliente();
		Registro_cliente cliente = new Registro_cliente();
		int r;
		String accion = request.getParameter("accion");
		if(accion.equals("Ingresar")) {
			String email = request.getParameter("email");
			String pwd = request.getParameter("pwd");
			cliente.setEmail(email);
			cliente.setPwd(pwd);
			r=validar.validar(cliente);
			if(r==1) {
				request.getRequestDispatcher("interfaz_u.jsp").forward(request, response);
			}else {
				
				request.getRequestDispatcher("index.html").forward(request, response);
			}
		}
	}

}
