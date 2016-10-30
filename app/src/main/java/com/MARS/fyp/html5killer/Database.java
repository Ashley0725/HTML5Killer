package com.MARS.fyp.html5killer;


import com.MARS.fyp.html5killer.Class.User;

public class Database {
    private static String DB_NAME = "html5killer";
    private static String COLLECTION_NAME ="userData";
    public static String API_KEY ="HAEkDAWEiiTYLjoF-8fNg5SFsJa2bi-K";

    public static String getAddressSingle(User user){
        String baseUrl = String.format("https://api.mlab.com/api/i/databases/%s/collections/%s",DB_NAME,COLLECTION_NAME);
        StringBuilder stringBuilder = new StringBuilder(baseUrl);
        stringBuilder.append("/"+ user.get_id().getOid() +"?apiKey="+API_KEY);
        return stringBuilder.toString();
    }

    public static  String getAddressAPI(){
        String baseUrl = String.format("https://api.mlab.com/api/i/databases/%s/collections/%s",DB_NAME,COLLECTION_NAME);
        StringBuilder stringBuilder = new StringBuilder(baseUrl);
        stringBuilder.append("?apiKey="+API_KEY);
        return stringBuilder.toString();

    }
}
