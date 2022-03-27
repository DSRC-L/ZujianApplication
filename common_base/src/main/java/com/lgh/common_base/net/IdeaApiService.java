package com.lgh.common_base.net;

import com.lgh.common_base.beans.WeatherBean;


import io.reactivex.rxjava3.core.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;



public interface IdeaApiService {

    @GET("day")
    Call<WeatherBean> getWeatherMsg(@Query("city") String city);

   @GET("day")
   Observable<WeatherBean> getWeatherMsg2(@Query("city") String city);

}
