package serveur;

import javax.xml.ws.Endpoint;

import service.ConcoursWS;

public class ServeurWs {
   public static void main(String[] args) {
	   String url="http://localhost:6600/";
	   Endpoint.publish(url, new ConcoursWS()); 
	   System.out.println ("Votre web service est bien déployé sur :"+url) ;
   }
}
