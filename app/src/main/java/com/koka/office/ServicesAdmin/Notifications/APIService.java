package com.koka.office.ServicesAdmin.Notifications;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAaMIOxNI:APA91bGACuXiQJwBthdPYBGJkxsKAmHFEic7tWg64kk6jq_OcS_aN1FFgIrXBfLrYgGMa6nVuw141EQxElxadLkNMlYa5s1m5lo2plEnhY4qlLdUECJ6AswKnC101Eu2jDKve7tIb3DE"

    })
    @POST("fcm/send")
    Call<MyResponse>sendNotification(@Body Sender body);






}