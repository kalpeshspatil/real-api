package com.realestate.Utility;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@Component("sessionCheck")
public class HttpSessionConfig {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Bean
	public HttpSessionListener httpSessionListener() {
		return new HttpSessionListener() {
			@Override
			public void sessionCreated(HttpSessionEvent se) {
				logger.info("Session Created with session id:" + se.getSession().getId());

			}

			@Override
			public void sessionDestroyed(HttpSessionEvent se) {
				logger.info("Session Destroyed, Session id:" + se.getSession().getId());
				se.getSession().invalidate();
			}
		};
	}

	@Bean
	public HttpSessionAttributeListener httpSessionAttributeListener() {
		return new HttpSessionAttributeListener() {
			@Override
			public void attributeAdded(HttpSessionBindingEvent se) {
				logger.info("Attribute Added following information");
				logger.info("Attribute Name:" + se.getName() + " -- Attribute Old Value:" + se.getValue());
			}

			@Override
			public void attributeRemoved(HttpSessionBindingEvent se) {
				logger.info("attributeRemoved");
				logger.info("Attribute Name:" + se.getName() + " -- Attribute Old Value:" + se.getValue());
			}

			@Override
			public void attributeReplaced(HttpSessionBindingEvent se) {
				logger.info("Attribute Replaced following information");
				logger.info("Attribute Name:" + se.getName() + " -- Attribute Old Value:" + se.getValue());
			}

		};
	}

	public boolean checkSession(HttpServletRequest request,String secretKey) {
		HttpSession session = request.getSession();
		return (session.getAttribute("secretKey") != null
				&& session.getAttribute("secretKey") != "null"
				&& session.getAttribute("secretKey").equals(secretKey));
	}
	

}
