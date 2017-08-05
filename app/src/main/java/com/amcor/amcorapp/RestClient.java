package com.amcor.amcorapp;

import com.amcor.amcorapp.data.model.UserResponse;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by johel on 4/08/2017.
 */

public interface RestClient {

    @POST("authenticate/")
    Call<UserResponse> authenticate(@Body UserLogin userLogin);
}
