package com.counter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


@WebServlet(urlPatterns = "/Servlet1", description = "Simple parser by Bychek Anton") 
public class Pars extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//ввыставляем кодировку символов
		response.setCharacterEncoding("UTF-8");
		//принимаем параметр с формы текстового поля
		String parserParam = request.getParameter("urlParse");
		
		//вызываем ответы клиенту с сервера
		PrintWriter out = response.getWriter();
		
		//берем наш checkbox
		String toText = request.getParameter("textOrHtml");
		/***
		 * Если наш чекбокс не равен пустоте то выводим все с тексте
		 * 
		 * Иначе, все рендерим
		 */
		
		if (toText != null){
			response.setContentType("text/plain;");
			response.setCharacterEncoding("UTF-8");
		}
		else {
			response.setContentType("text/html;");
			response.setCharacterEncoding("UTF-8");
		}
		
	//подключаемся к Jsoup и парсим введеный параметр на клиенте
        try{
        	//конектимся
            Document doc = Jsoup.connect("http://" +parserParam).get();
            //добавляем в список из элементов все что лежит между тегами <html> </html>
            List<Element> elements = doc.select("html");
            //FileOutputStream createFile = new FileOutputStream("/home/rem0tec0de/workspace/letterCounter/src/com/counter/parsed.html");
    		
            //for (Element elm : elements){
            //	createFile.write(elm);
            //}
            //выводим на клиента все что спарсилось	
            out.print(elements);  
        }
        //перехватываем исключение если че
        catch(Exception e){
        	e.printStackTrace();
        	out.print("ERROR, possible somthing wrong with your query");
        }
        //закрываем поток вывода
		out.close();
	 
	}
	

	
	//protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//}

}
