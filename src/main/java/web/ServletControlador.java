package web;

import data.LibrosDAO;
import java.io.IOException;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import model.*;

@WebServlet("/servletControlador")
public class ServletControlador extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException{
        List <Biblioteca> libros = new LibrosDAO().findAll();
        libros.forEach(System.out::println);
        req.setAttribute("libros", libros);
        req.setAttribute("cantidadLibros",calcularCopias(libros));
        req.setAttribute("precioTotal", calcularPrecio(libros));
        req.getRequestDispatcher("libros.jsp").forward(req, res);
    }
    
    private int calcularCopias(List<Biblioteca> lib){
        int cant=0;
        for (int i = 0; i < lib.size(); i++) {
            cant += lib.get(i).getCopias();
        }
        return cant;
    }
    
    private double calcularPrecio(List<Biblioteca> lib){
        double precio = 0;
        for (int i = 0; i < lib.size(); i++) {
            precio += (lib.get(i).getPrecio() * lib.get(i).getCopias());
        }
        return precio;
    }
}
