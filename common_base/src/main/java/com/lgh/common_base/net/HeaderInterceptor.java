package com.lgh.common_base.net;

import androidx.annotation.NonNull;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.http.Headers;



//给请求头添加参数的拦截器
public class HeaderInterceptor implements Interceptor {
    @NonNull
    @Override
    public Response intercept(@NonNull Chain chain) throws IOException {

        String token = "  ";
        Request originalRequest = chain.request();
        Request updateRequest = originalRequest.newBuilder()
                .addHeader("token", token)
                .addHeader("X-Bce-Signature","AppCode/09b27811ced44ae29e04f2c95e76a901")
                .build();
        return chain.proceed(updateRequest);

    }
}
