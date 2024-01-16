package com.asignments;

import java.util.HashMap;

public class RequestParser 
{
	
	

	    public static String[] getResponses(String[] valid_auth_tokens, String[][] requests) {
	        String[] responses = new String[requests.length];

	        for (int i = 0; i < requests.length; i++) {
	            String[] request = requests[i];
	            String requestType = request[0];
	            String url = request[1];

	            // Parse parameters from URL
	            HashMap<String, String> params = parseUrlParameters(url);

	            // Validate authentication token
	            String authToken = params.get("token");
	            boolean isValidAuthToken = isValidAuthToken(authToken, valid_auth_tokens);

	            // Validate CSRF token for POST requests
	            boolean isValidCsrfToken = true;
	            if ("POST".equals(requestType)) {
	                String csrfToken = params.get("csrf");
	                isValidCsrfToken = isValidCsrfToken(csrfToken);
	            }

	            // Construct response
	            if (isValidAuthToken && isValidCsrfToken) {
	                String parameters = formatParameters(params);
	                responses[i] = "VALID," + parameters;
	            } else {
	                responses[i] = "INVALID";
	            }
	        }

	        return responses;
	    }

	    private static HashMap<String, String> parseUrlParameters(String url) {
	        HashMap<String, String> params = new HashMap<>();
	        String[] urlParts = url.split("\\?");
	        if (urlParts.length > 1) {
	            String[] paramPairs = urlParts[1].split("&");
	            for (String pair : paramPairs) {
	                String[] keyValue = pair.split("=");
	                if (keyValue.length == 2) {
	                    params.put(keyValue[0], keyValue[1]);
	                }
	            }
	        }
	        return params;
	    }

	    private static boolean isValidAuthToken(String authToken, String[] validTokens) {
	        for (String validToken : validTokens) {
	            if (validToken.equals(authToken)) {
	                return true;
	            }
	        }
	        return false;
	    }

	    private static boolean isValidCsrfToken(String csrfToken) {
	        return csrfToken != null && csrfToken.equals("-") && csrfToken.length() >= 8;
	    }

	    private static String formatParameters(HashMap<String, String> params) {
	        StringBuilder result = new StringBuilder();
	        for (HashMap.Entry<String, String> entry : params.entrySet()) {
	            result.append(entry.getKey()).append(",").append(entry.getValue()).append(",");
	        }
	        return result.toString().substring(0, result.length() - 1);
	    }

	    public static void main(String[] args) {
	        String[] valid_auth_tokens = {"et51u8i9p1q7", "b8nn5j4om76v", "r5b019lmlp09"};

	        String[][] requests = {
	                {"GET", "https://example.com/?token=et51u8i9p1q7&id=2e3rt&name=alex"},
	                {"POST", "https://example.com/?token=r5b019lmlp09&csrf=ia+09&id=u78we&name=evan"}
	        };

	        String[] responses = getResponses(valid_auth_tokens, requests);

	        for (String response : responses) {
	            System.out.println(response);
	        }
	    }
	}



