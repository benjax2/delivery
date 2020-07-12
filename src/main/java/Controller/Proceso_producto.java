package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Producto;
import Model.Crudproducto;

/**
 * Servlet implementation class Proceso
 */
public class Proceso_producto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Proceso_producto() {
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
		Producto producto = new Producto();
        Crudproducto crudproducto = new Crudproducto();
        
         producto.setNombre(request.getParameter("nombre"));
         producto.setPrecio(Integer.parseInt(request.getParameter("precio")));
         producto.setStock(Integer.parseInt(request.getParameter("stock")));
         producto.setFoto(request.getParameter("foto"));


        
         String respuesta = crudproducto.create(producto);
         
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
