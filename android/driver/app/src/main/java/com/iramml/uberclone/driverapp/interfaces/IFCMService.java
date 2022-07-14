package com.iramml.uberclone.driverapp.interfaces;

import com.iramml.uberclone.driverapp.common.ConfigApp;
import com.iramml.uberclone.driverapp.model.fcm.FCMResponse;
import com.iramml.uberclone.driverapp.model.fcm.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers({
        "Content-Type:application/json",
        "Authorization:key=" + ConfigApp.CLOUD_MESSAGING_SERVER_GEY
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}
