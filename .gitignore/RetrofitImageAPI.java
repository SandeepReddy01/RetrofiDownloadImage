package com.androidtutorialpoint.androidretrofit20imagedownload;

import com.squareup.okhttp.ResponseBody;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by navneet on 17/6/16.
 */
public interface RetrofitImageAPI {
    @GET("api/RetrofitAndroidImageResponse")
    Call<ResponseBody> getImageDetails();
}
