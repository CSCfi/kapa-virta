package kapaVirtaAS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import static kapaVirtaAS.WSDLManipulator.generateVirtaKapaWSDL;

/**
 * Created by joni on 9.5.2016.
 */

@ComponentScan
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) throws Exception {
        generateVirtaKapaWSDL();
        SpringApplication.run(Application.class, args);
    }
}