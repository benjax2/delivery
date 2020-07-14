package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Producto;
import Model.Crudproducto;

/**
 * Servlet implementation class EliminarProducto
 */
public class EliminarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarProducto() {
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
		//codigo para eliminar registro...
		try {
		
	        Crudproducto crudProducto = new Crudproducto();
	        Producto producto = new Producto();
	        
	      //  if(request.getParameter("nombre") == "editar"){
	       // }else if(request.getParameter("nombre") == "eliminar"){
	        	
	        	int id = Integer.parseInt(request.getParameter("id_prod"));
		        producto.setId_producto(id);
		        String resp = crudProducto.delete(producto);
		        response.sendRedirect(request.getContextPath() + "/menu_local/productos.jsp");
	        
	        

		} catch (Exception e) {
			
		}

			
	}

}
