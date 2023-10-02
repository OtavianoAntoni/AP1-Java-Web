package Pacote1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Jogo")
public class Jogo extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Recuperar os valores dos campos de input
        String numero1 = request.getParameter("numero1");
        String numero2 = request.getParameter("numero2");
        String numero3 = request.getParameter("numero3");
        String numero4 = request.getParameter("numero4");
        String numero5 = request.getParameter("numero5");
        
        // Verificar quais números são pares e quais são ímpares
        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        int num3 = Integer.parseInt(numero3);
        int num4 = Integer.parseInt(numero4);
        int num5 = Integer.parseInt(numero5);
        
        String resultado = "Números Pares: ";
        if (num1 % 2 == 0) resultado += num1 + " ";
        if (num2 % 2 == 0) resultado += num2 + " ";
        if (num3 % 2 == 0) resultado += num3 + " ";
        if (num4 % 2 == 0) resultado += num4 + " ";
        if (num5 % 2 == 0) resultado += num5 + " ";
        
        resultado += "<br>Números Ímpares: ";
        if (num1 % 2 != 0) resultado += num1 + " ";
        if (num2 % 2 != 0) resultado += num2 + " ";
        if (num3 % 2 != 0) resultado += num3 + " ";
        if (num4 % 2 != 0) resultado += num4 + " ";
        if (num5 % 2 != 0) resultado += num5 + " ";
        
        // Configurar o tipo de conteúdo da resposta
        response.setContentType("text/html");
        
        // Obter o objeto PrintWriter para escrever a resposta
        PrintWriter out = response.getWriter();
        
        // Escrever a página dinâmica
        out.println("<html>");
        out.println("<head><title>Resultado do Jogo</title></head>");
        out.println("<body>");
        out.println("<h1>Resultado do Jogo</h1>");
        out.println("<p>" + resultado + "</p>");
        out.println("<p><a href='index.html'>Voltar para a página inicial</a></p>");
        out.println("</body>");
        out.println("</html>");
    }
}
