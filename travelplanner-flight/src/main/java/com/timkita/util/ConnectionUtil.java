package com.timkita.util;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.security.cert.X509Certificate;
import javax.sql.DataSource;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

@Dependent
public class ConnectionUtil {

	private static String DATASOURCE_URL = "java:jboss/datasources/travelplanner";
	private static String DATASOURCE_USERNAME = "root";
	private static String DATASOURCE_PASSWORD = "asdqwe123";
	
	@Produces
	public static Connection getConnection() throws SQLException, NamingException {
		DataSource ds = (DataSource) new InitialContext().lookup(DATASOURCE_URL);
		return ds.getConnection(DATASOURCE_USERNAME, DATASOURCE_PASSWORD);
	}
	
	@Produces
	public static HttpClient getUnsecureHttpClient() throws NoSuchAlgorithmException, KeyManagementException {
		TrustManager[] trustManager = new X509TrustManager[] { new X509TrustManager() {

			public void checkClientTrusted(java.security.cert.X509Certificate[] arg0, String arg1)
					throws CertificateException {
			}

			public void checkServerTrusted(java.security.cert.X509Certificate[] arg0, String arg1)
					throws CertificateException {
			}

			public java.security.cert.X509Certificate[] getAcceptedIssuers() {
				return null;
			}
		    
		}};

		SSLContext sslContext = SSLContext.getInstance("SSL");
		sslContext.init(null, trustManager, null);
		HttpClient httpClient = HttpClientBuilder.create()
                .setSSLContext(sslContext)
                .build();
		
		return httpClient;
	}
	

}
