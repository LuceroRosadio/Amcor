package com.amcor.amcorapp.login.view;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.amcor.amcorapp.Constant;
import com.amcor.amcorapp.FakeInterceptor;
import com.amcor.amcorapp.HomeActivity;
import com.amcor.amcorapp.R;
import com.amcor.amcorapp.RestClient;
import com.amcor.amcorapp.UserLogin;
import com.amcor.amcorapp.data.model.UserResponse;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "Login";

    private TextInputEditText user;
    private TextInputEditText password;

    private UserLogin userLogin = new UserLogin();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user        = (TextInputEditText)findViewById(R.id.edt_username);
        password    = (TextInputEditText)findViewById(R.id.edt_password);

    }

    private void loadJson(UserLogin u) {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();

        OkHttpClient client = new OkHttpClient.Builder()
                //using okhttp3 interceptor fake response ya mira aqui es donde llamas osea la informacion lo tienes aca y de aca tiene que viajar a donde llenas los menus y submenus.
                .addInterceptor(new FakeInterceptor())
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://amcore/api/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(client)
                .build();

        RestClient restClient = retrofit.create(RestClient.class);
        Call<UserResponse> call = restClient.authenticate(u);

        call.enqueue(new Callback<UserResponse>() {
            @Override
            public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
                Log.d(TAG, "567");
                Log.d(TAG, response.code() +"");

                Log.d(TAG, response.raw().body().contentType() +"");

                switch (response.code()) {
                    case 200:

                        UserResponse data = response.body();
                        Log.d(TAG, data.toString());

                        Log.d(TAG, data +"");
                        goHome(data);

                        break;
                    case 401:

                        break;
                    default:

                        break;
                }
            }

            @Override
            public void onFailure(Call<UserResponse> call, Throwable t) {

            }

        });
    }

    @Override
    public void onClick(View v) {
        userLogin.setUsername(user.getText().toString());
        userLogin.setPassword(password.getText().toString());

        loadJson(userLogin);

    }

    public void goHome(UserResponse data) {
        Intent intent  = new Intent(this, HomeActivity.class);
        intent.putExtra("data",data);
        startActivity(intent);
    }
}