package pl.ireneuszderucki.webapp;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import pl.ireneuszderucki.config.AppConfiguration;

public class AppInitializer implements WebApplicationInitializer {
	
	private static final String TMP_CAT = "/tmp";
	private static final int MAX_UPLOAD_SIZE = 5 * 1024 * 1024;

	@Override
	public void onStartup(final ServletContext servletContext) throws ServletException {
		
		final AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(AppConfiguration.class);
		context.setServletContext(servletContext);
		servletContext.addListener(new ContextLoaderListener(context));
		
		final ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
		
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement(TMP_CAT, 
				MAX_UPLOAD_SIZE, MAX_UPLOAD_SIZE * 2, MAX_UPLOAD_SIZE / 2);
		         
		dispatcher.setMultipartConfig(multipartConfigElement);
	}
}	
	