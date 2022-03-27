package com.lgh.module_main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lgh.common_base.beans.WeatherBean;
import com.lgh.common_base.net.DefaultObserver;
import com.lgh.common_base.net.RetrofitHelper;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



@Route(path = "/module_main/StartActivity")
public class StartActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
    }


    @Override
    protected void onStart() {
        super.onStart();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

/*

                RetrofitHelper.getApiService().getWeatherMsg("武汉").enqueue(new Callback<WeatherBean>() {
                    @Override
                    public void onResponse(Call<WeatherBean> call, Response<WeatherBean> response) {

                        Log.d("lgh", "onResponse: " + response.body().getAir_level());
                        textView.setText("" + response.body().getAir_level());

                    }

                    @Override
                    public void onFailure(Call<WeatherBean> call, Throwable t) {
                        Log.d("lgh", "Throwable:  " + t.toString());
                    }
                });
*/


                RetrofitHelper.getApiService().getWeatherMsg2("武汉")
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new DefaultObserver<WeatherBean>() {
                            @Override
                            public void onSuccess(WeatherBean response) {
                                textView.setText("" + response.getAir_level());
                            }


                        });



            }
        });
    }
}