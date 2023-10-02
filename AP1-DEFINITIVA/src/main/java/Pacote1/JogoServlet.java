package Pacote1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JogoServlet")
public class JogoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Recupere os valores dos campos de input
        String numero1Str = request.getParameter("numero1");
        String numero2Str = request.getParameter("numero2");
        String numero3Str = request.getParameter("numero3");
        String numero4Str = request.getParameter("numero4");
        String numero5Str = request.getParameter("numero5");
        
        // Converta os valores para números inteiros
        int numero1 = Integer.parseInt(numero1Str);
        int numero2 = Integer.parseInt(numero2Str);
        int numero3 = Integer.parseInt(numero3Str);
        int numero4 = Integer.parseInt(numero4Str);
        int numero5 = Integer.parseInt(numero5Str);
        
        // Verifique quais números são pares e quais são ímpares
        boolean par1 = numero1 % 2 == 0;
        boolean par2 = numero2 % 2 == 0;
        boolean par3 = numero3 % 2 == 0;
        boolean par4 = numero4 % 2 == 0;
        boolean par5 = numero5 % 2 == 0;
        
        // Configure a resposta HTTP
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        // Montar a página dinâmica com os resultados
        out.println("<html>");
        out.println("<head><title>Resultados do Jogo</title></head>");
        out.println("<body>");
        out.println("<h1>Resultados do Jogo</h1>");
        out.println("<p>Números pares: ");
        if (par1) out.print(numero1 + " ");
        if (par2) out.print(numero2 + " ");
        if (par3) out.print(numero3 + " ");
        if (par4) out.print(numero4 + " ");
        if (par5) out.print(numero5 + " ");
        out.println("</p>");
        out.println("<p>Números ímpares: ");
        if (!par1) out.print(numero1 + " ");
        if (!par2) out.print(numero2 + " ");
        if (!par3) out.print(numero3 + " ");
        if (!par4) out.print(numero4 + " ");
        if (!par5) out.print(numero5 + " ");
        out.println("</p>");
        out.println("<a href=\"index.html\">Voltar para a página inicial</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
