package app.retrofit.com.retrofitwithrecyclerview;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by aishwarytandon on 2/28/16.
 */
public interface RequestInterface {

    @GET("android/jsonandroid")
    Call<JSONResponse> getJSON();
}
