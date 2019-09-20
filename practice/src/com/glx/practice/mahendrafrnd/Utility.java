/*package com.glx.practice.mahendrafrnd;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class Utility {

	
	
	
	*//**
	 * HTTP GET call mechanism
	 * @param params
	 * @param endPoint
	 * @return
	 *//*
	public static String httpClientGetEvent(List<NameValuePair> params , String endPoint){
		String responseString = null;
		HttpClient client = HttpClientBuilder.create().build();
		try {
			String paramString = URLEncodedUtils.format(params, "UTF-8");
			
			HttpGet getRequest = new HttpGet(""  + endPoint + paramString);
			HttpResponse response = client.execute(getRequest);
			HttpEntity entity = response.getEntity();
			int status = response.getStatusLine().getStatusCode();
			responseString = EntityUtils.toString(entity, "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseString;
		
	}
	
	*//**
	 * HTTP POST call mechanism
	 * @param params
	 * @param endPoint
	 * @return
	 *//*
	public static String httpClinetPostEvent(String postJsonData , String endPoint){
		String responseString = null;
		HttpClient client = HttpClientBuilder.create().build();
		try{
		StringEntity jsonentity = new StringEntity(postJsonData, "UTF-8");
		jsonentity.setContentType("application/json");

		HttpPost httpPost = new HttpPost(endPoint);
		httpPost.setEntity(jsonentity);
		
		HttpResponse response = client.execute(httpPost);
		HttpEntity entity = response.getEntity();
		int status = response.getStatusLine().getStatusCode();
		
		
		responseString = EntityUtils.toString(entity, "UTF-8");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return responseString;
	}
	
	 public static String decode(String s, String enc)
		        throws UnsupportedEncodingException{

		        boolean needToChange = false;
		        int numChars = s.length();
		        StringBuffer sb = new StringBuffer(numChars > 500 ? numChars / 2 : numChars);
		        int i = 0;

		        if (enc.length() == 0) {
		            throw new UnsupportedEncodingException ("URLDecoder: empty string enc parameter");
		        }

		        char c;
		        byte[] bytes = null;
		        while (i < numChars) {
		            c = s.charAt(i);
		            switch (c) {
		            
		            case '%':
		                
		                 * Starting with this instance of %, process all
		                 * consecutive substrings of the form %xy. Each
		                 * substring %xy will yield a byte. Convert all
		                 * consecutive  bytes obtained this way to whatever
		                 * character(s) they represent in the provided
		                 * encoding.
		                 

		                try {

		                    // (numChars-i)/3 is an upper bound for the number
		                    // of remaining bytes
		                    if (bytes == null)
		                        bytes = new byte[(numChars-i)/3];
		                    int pos = 0;

		                    while ( ((i+2) < numChars) &&
		                            (c=='%')) {
		                        int v = Integer.parseInt(s.substring(i+1,i+3),16);
		                        if (v < 0)
		                            throw new IllegalArgumentException("URLDecoder: Illegal hex characters in escape (%) pattern - negative value");
		                        bytes[pos++] = (byte) v;
		                        i+= 3;
		                        if (i < numChars)
		                            c = s.charAt(i);
		                    }

		                    // A trailing, incomplete byte encoding such as
		                    // "%x" will cause an exception to be thrown

		                    if ((i < numChars) && (c=='%'))
		                        throw new IllegalArgumentException(
		                         "URLDecoder: Incomplete trailing escape (%) pattern");

		                    sb.append(new String(bytes, 0, pos, enc));
		                } catch (NumberFormatException e) {
		                    throw new IllegalArgumentException(
		                    "URLDecoder: Illegal hex characters in escape (%) pattern - "
		                    + e.getMessage());
		                }
		                needToChange = true;
		                break;
		            default:
		                sb.append(c);
		                i++;
		                break;
		            }
		        }

		        return (needToChange? sb.toString() : s);
		    }
		
}
*/