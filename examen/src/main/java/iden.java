import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Servlet implementation class iden
 */
@WebServlet("/idens")
public class iden extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public iden() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @return 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public int[] generador() {
		Random rd = new Random();

		int[] lista= {rd.nextInt(1000),rd.nextInt(1000),rd.nextInt(1000),rd.nextInt(1000),rd.nextInt(1000)};
		return lista;
	
	}
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int id = Integer.parseInt((request.getParameter("num1")));
		
	int []lista = generador();
		 if(id==lista[0]||id==lista[1]||id==lista[2]||id==lista[3]||id==lista[4]) {
			 System.out.print("Es igual el numero"); 
		 }else {
			 System.out.print("no es igual el numero");
		 }
	System.out.print(lista);
		}
	
		
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
