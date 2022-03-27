package com.lgh.common_base.net;


import android.util.Log;

import androidx.annotation.NonNull;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lgh.common_base.config.Constant;
import com.lgh.common_base.utils.JsonUtil;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;


import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtils {


    private static final String TAG = "HttpLogger";
    private static StringBuilder mMessage = new StringBuilder();


    public static <T> T getApiService(Class<T> cls, String baseUrl) {
        Retrofit retrofit = RetrofitUtils.getRetrofitBuilder(baseUrl).build();
        return retrofit.create(cls);
    }


    private static Retrofit.Builder getRetrofitBuilder(String baseUrl) {

        OkHttpClient okHttpClient = RetrofitUtils.getOkHttpClientBuilder().build();

        //设置gson解析不严格模式,防止一些解析错误,比如double数据出现NaN时  可不要
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create());

    }


    private static OkHttpClient.Builder getOkHttpClientBuilder() {

        OkHttpClient.Builder builder = new OkHttpClient.Builder();


        //日志拦截器
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(@NonNull String message) {


                // 请求或者响应开始
                if (message.startsWith("--> POST")) {
                    mMessage.setLength(0);
                }
                // 以{}或者[]形式的说明是响应结果的json数据，需要进行格式化
                if ((message.startsWith("{") && message.endsWith("}"))
                        || (message.startsWith("[") && message.endsWith("]"))) {
                    message = JsonUtil.formatJson(JsonUtil.decodeUnicode(message));
                }
                mMessage.append(message.concat("\n"));
                // 响应结束，打印整条日志
                if (message.startsWith("<-- END HTTP")) {
                    Log.d(TAG, mMessage.toString());
                }


            }
        });
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);


        builder.readTimeout(Constant.DEFAULT_TIMEOUT, TimeUnit.MILLISECONDS)
                .connectTimeout(Constant.DEFAULT_TIMEOUT, TimeUnit.MILLISECONDS)
                .addInterceptor(loggingInterceptor)
                //.cache()
                .addNetworkInterceptor(new HeaderInterceptor());

        return builder;
    }


}
