package com.song.cute;

import org.apache.catalina.startup.Tomcat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class WebApplicationServer {
	private static final Logger log = LoggerFactory.getLogger(WebApplicationServer.class);

	public static void main(String[] args) throws Exception {
		String webappDirLocation = "webapps/";
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8080);

		tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
		log.info("configuring app with basedir: {}", new File("./" + webappDirLocation).getAbsolutePath());

		tomcat.start();
		tomcat.getServer().await();
	}

}
