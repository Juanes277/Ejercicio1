/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author juan esteban
 */
@WebServlet(name = "control", urlPatterns = {"/control"})
public class control extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet control</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet control at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");

        String n = request.getParameter("txt_nombres");
        String a = request.getParameter("txt_apellidos");
        String t = request.getParameter("txt_telefono");
        String co = request.getParameter("txt_correo");
        

        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"\n" +
"<head>\n" +
"    <!--\n" +
"     - Roxy: Bootstrap template by GettTemplates.com\n" +
"     - https://gettemplates.co/roxy\n" +
"    -->\n" +
"    <meta charset=\"utf-8\">\n" +
"    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
"    <title>ProgComp</title>\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
"\n" +
"    <!-- External CSS -->\n" +
"    <link rel=\"stylesheet\" href=\"vendor/bootstrap/bootstrap.min.css\">\n" +
"    <link rel=\"stylesheet\" href=\"vendor/select2/select2.min.css\">\n" +
"    <link rel=\"stylesheet\" href=\"vendor/owlcarousel/owl.carousel.min.css\">\n" +
"    <link rel=\"stylesheet\" href=\"vendor/lightcase/lightcase.css\">\n" +
"    <link rel=\"stylesheet\" href=\"https://unpkg.com/aos@next/dist/aos.css\" />\n" +
                    "     <link rel=\"icon\" href=\"img/icons8-módulo-48.png\">\n" +

"\n" +
"    <!-- Fonts -->\n" +
"    <link href=\"https://fonts.googleapis.com/css?family=Lato:300,400|Work+Sans:300,400,700\" rel=\"stylesheet\">\n" +
"\n" +
"    <!-- CSS -->\n" +
"    <link href=\"css/style.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n" +
"    <link rel=\"stylesheet\" href=\"https://cdn.linearicons.com/free/1.0.0/icon-font.min.css\">\n" +
"    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\" integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\">\n" +
"\n" +
"    <!-- Modernizr JS for IE8 support of HTML5 elements and media queries -->\n" +
"    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.js\"></script>\n" +
"\n" +
"</head>\n" +
"<body data-spy=\"scroll\" data-target=\"#navbar\" class=\"static-layout\">\n" +
"	<nav id=\"header-navbar\" class=\"navbar navbar-expand-lg py-4\">\n" +
"    <div class=\"container\">\n" +
"        <a class=\"navbar-brand d-flex align-items-center text-white\" href=\"/\">\n" +
"            <h2 class=\"font-weight-bolder mb-0\">Juan Esteban Sanchez </h2>\n" +
"        </a>\n" +
"      \n" +
"        <div class=\"collapse navbar-collapse\" id=\"navbar-nav-header\">\n" +
"            <ul class=\"navbar-nav ml-auto\">\n" +
"             \n" +
"                <li class=\"nav-item\">\n" +
"                    <a id=\"side-search-open\" class=\"nav-link\" href=\"#\">\n" +
"                        <span class=\"lnr lnr-magnifier\"></span>\n" +
"                    </a>\n" +
"                </li>\n" +
"                 <li class=\"nav-item only-desktop\">\n" +
"                    <a class=\"nav-link\" id=\"side-nav-open\" href=\"#\">\n" +
"                        <span class=\"lnr lnr-menu\"></span>\n" +
"                    </a>\n" +
"                </li>\n" +
"            </ul>\n" +
"        </div>\n" +
"    </div>\n" +
"</nav>\n" +
"   <div class=\"jumbotron d-flex align-items-center\">\n" +
"       \n" +
"  <div class=\"container text-center\">\n" +
"      <div class= \"card-container\">\n" +
"        <h1 class=\"display-1 mb-4\">Domicilio</h1>\n" +
"            <form action=\"control\" method=\"get\">\n" +
"            <p></p>\n" +
"            <p></p>\n" +
"            <h2>Nombres:  " +n+"</h2>\n" +
"            <p></p>\n" +
"            <h2>Apellidos:  " + a +"</h2>\n"+
             "<p></p>\n"+
             "<h2>Telefono:  "+ t +"</h2>\n"+
             "<p></p>\n"+
             "<h2>Correo:  "+ co +"</h2>\n"+
"            </form>\n" +
"    </div>\n" +
"  </div>\n" +
"          \n" +
"  <div class=\"rectangle-1\"></div>\n" +
"  <div class=\"rectangle-2\"></div>\n" +
"  <div class=\"rectangle-transparent-1\"></div>\n" +
"  <div class=\"rectangle-transparent-2\"></div>\n" +
"  <div class=\"circle-1\"></div>\n" +
"  <div class=\"circle-2\"></div>\n" +
"  <div class=\"circle-3\"></div>\n" +
"  <div class=\"triangle triangle-1\">\n" +
"  	<img src=\"img/obj_triangle.png\" alt=\"\">\n" +
"  </div>\n" +
"  <div class=\"triangle triangle-2\">\n" +
"  	<img src=\"img/obj_triangle.png\" alt=\"\">\n" +
"  </div>\n" +
"  <div class=\"triangle triangle-3\">\n" +
"  	<img src=\"img/obj_triangle.png\" alt=\"\">\n" +
"  </div>\n" +
"  <div class=\"triangle triangle-4\">\n" +
"  	<img src=\"img/obj_triangle.png\" alt=\"\">\n" +
"  </div>\n" +
"</div>	\n" +
"    \n" +
"	\n" +
"    <!-- External JS -->\n" +
"	\n" +
"	<script src=\"vendor/bootstrap/popper.min.js\"></script>\n" +
"	<script src=\"vendor/bootstrap/bootstrap.min.js\"></script>\n" +
"	<script src=\"vendor/select2/select2.min.js \"></script>\n" +
"	<script src=\"vendor/owlcarousel/owl.carousel.min.js\"></script>\n" +
"	<script src=\"vendor/stellar/jquery.stellar.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\n" +
"	<script src=\"vendor/isotope/isotope.min.js\"></script>\n" +
"	<script src=\"vendor/lightcase/lightcase.js\"></script>\n" +
"	<script src=\"vendor/waypoints/waypoint.min.js\"></script>\n" +
"	 <script src=\"https://unpkg.com/aos@next/dist/aos.js\"></script>\n" +
"	 \n" +
"	<!-- Main JS -->\n" +
"	<script src=\"js/app.min.js \"></script>\n" +
"	<script src=\"//localhost:8080/livereload.js\"></script>\n" +
"</body>\n" +
"</html>\n" +
">");
            
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
