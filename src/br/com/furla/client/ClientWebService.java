package br.com.furla.client;

import org.apache.http.client.fluent.Request;

public class ClientWebService {

	public static void main(String[] args) throws Exception {

		
		String conteudo = Request.Post("http://localhost:8080/gerenciador/empresas")
				.addHeader("Accept", "application/json")
				.execute().returnContent().asString();
		
		
		
		System.out.println(conteudo);
    }
	
}
