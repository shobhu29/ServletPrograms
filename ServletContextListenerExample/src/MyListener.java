

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyListener
 *
 */
@WebListener
public class MyListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public MyListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg)  { 

    	ServletContext context = arg.getServletContext();
    	try{
    		
    			String dname = context.getInitParameter("driver-name");
    			String url = context.getInitParameter("url");
    			String user = context.getInitParameter("user");
    			String password = context.getInitParameter("password");
    			
    			Class.forName(dname);
    			Connection conn = DriverManager.getConnection(url,user,password);
    			context.setAttribute("connect", conn);
    			
    	}catch(Exception e){
    		
    		e.printStackTrace();
    	}
    	
    }
}
