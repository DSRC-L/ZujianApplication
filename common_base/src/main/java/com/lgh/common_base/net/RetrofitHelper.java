package com.lgh.common_base.net;

import com.lgh.common_base.config.Constant;

public class RetrofitHelper {

    private RetrofitHelper() {
    }

    private static IdeaApiService apiService;

    public static IdeaApiService getApiService() {
        if (apiService == null) {
            apiService = RetrofitUtils.getApiService(IdeaApiService.class, Constant.BASE_URL);
        }
        return apiService;
    }




}
