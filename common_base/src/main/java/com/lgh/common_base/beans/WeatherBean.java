package com.lgh.common_base.beans;

import java.util.List;

public class WeatherBean {

    private String cityid;
    private String date;
    private String week;
    private String update_time;
    private String city;
    private String cityEn;
    private String country;
    private String countryEn;
    private String wea;
    private String wea_img;
    private String tem;
    private String tem1;
    private String tem2;
    private String win;
    private String win_speed;
    private String win_meter;
    private String humidity;
    private String visibility;
    private String pressure;
    private String air;
    private String air_pm25;
    private String air_level;
    private String air_tips;
    private AlarmDTO alarm;
    private String wea_day;
    private String wea_day_img;
    private String wea_night;
    private String wea_night_img;
    private String sunrise;
    private String sunset;
    private List<HoursDTO> hours;
    private AqiDTO aqi;
    private ZhishuDTO zhishu;

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityEn() {
        return cityEn;
    }

    public void setCityEn(String cityEn) {
        this.cityEn = cityEn;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryEn() {
        return countryEn;
    }

    public void setCountryEn(String countryEn) {
        this.countryEn = countryEn;
    }

    public String getWea() {
        return wea;
    }

    public void setWea(String wea) {
        this.wea = wea;
    }

    public String getWea_img() {
        return wea_img;
    }

    public void setWea_img(String wea_img) {
        this.wea_img = wea_img;
    }

    public String getTem() {
        return tem;
    }

    public void setTem(String tem) {
        this.tem = tem;
    }

    public String getTem1() {
        return tem1;
    }

    public void setTem1(String tem1) {
        this.tem1 = tem1;
    }

    public String getTem2() {
        return tem2;
    }

    public void setTem2(String tem2) {
        this.tem2 = tem2;
    }

    public String getWin() {
        return win;
    }

    public void setWin(String win) {
        this.win = win;
    }

    public String getWin_speed() {
        return win_speed;
    }

    public void setWin_speed(String win_speed) {
        this.win_speed = win_speed;
    }

    public String getWin_meter() {
        return win_meter;
    }

    public void setWin_meter(String win_meter) {
        this.win_meter = win_meter;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getAir() {
        return air;
    }

    public void setAir(String air) {
        this.air = air;
    }

    public String getAir_pm25() {
        return air_pm25;
    }

    public void setAir_pm25(String air_pm25) {
        this.air_pm25 = air_pm25;
    }

    public String getAir_level() {
        return air_level;
    }

    public void setAir_level(String air_level) {
        this.air_level = air_level;
    }

    public String getAir_tips() {
        return air_tips;
    }

    public void setAir_tips(String air_tips) {
        this.air_tips = air_tips;
    }

    public AlarmDTO getAlarm() {
        return alarm;
    }

    public void setAlarm(AlarmDTO alarm) {
        this.alarm = alarm;
    }

    public String getWea_day() {
        return wea_day;
    }

    public void setWea_day(String wea_day) {
        this.wea_day = wea_day;
    }

    public String getWea_day_img() {
        return wea_day_img;
    }

    public void setWea_day_img(String wea_day_img) {
        this.wea_day_img = wea_day_img;
    }

    public String getWea_night() {
        return wea_night;
    }

    public void setWea_night(String wea_night) {
        this.wea_night = wea_night;
    }

    public String getWea_night_img() {
        return wea_night_img;
    }

    public void setWea_night_img(String wea_night_img) {
        this.wea_night_img = wea_night_img;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public List<HoursDTO> getHours() {
        return hours;
    }

    public void setHours(List<HoursDTO> hours) {
        this.hours = hours;
    }

    public AqiDTO getAqi() {
        return aqi;
    }

    public void setAqi(AqiDTO aqi) {
        this.aqi = aqi;
    }

    public ZhishuDTO getZhishu() {
        return zhishu;
    }

    public void setZhishu(ZhishuDTO zhishu) {
        this.zhishu = zhishu;
    }

    public static class AlarmDTO {
        private String alarm_type;
        private String alarm_level;
        private String alarm_content;

        public String getAlarm_type() {
            return alarm_type;
        }

        public void setAlarm_type(String alarm_type) {
            this.alarm_type = alarm_type;
        }

        public String getAlarm_level() {
            return alarm_level;
        }

        public void setAlarm_level(String alarm_level) {
            this.alarm_level = alarm_level;
        }

        public String getAlarm_content() {
            return alarm_content;
        }

        public void setAlarm_content(String alarm_content) {
            this.alarm_content = alarm_content;
        }
    }

    public static class AqiDTO {
        private String update_time;
        private String air;
        private String air_level;
        private String air_tips;
        private String pm25;
        private String pm25_desc;
        private String pm10;
        private String pm10_desc;
        private String o3;
        private String o3_desc;
        private String no2;
        private String no2_desc;
        private String so2;
        private String so2_desc;
        private String co;
        private String co_desc;
        private String kouzhao;
        private String yundong;
        private String waichu;
        private String kaichuang;
        private String jinghuaqi;

        public String getUpdate_time() {
            return update_time;
        }

        public void setUpdate_time(String update_time) {
            this.update_time = update_time;
        }

        public String getAir() {
            return air;
        }

        public void setAir(String air) {
            this.air = air;
        }

        public String getAir_level() {
            return air_level;
        }

        public void setAir_level(String air_level) {
            this.air_level = air_level;
        }

        public String getAir_tips() {
            return air_tips;
        }

        public void setAir_tips(String air_tips) {
            this.air_tips = air_tips;
        }

        public String getPm25() {
            return pm25;
        }

        public void setPm25(String pm25) {
            this.pm25 = pm25;
        }

        public String getPm25_desc() {
            return pm25_desc;
        }

        public void setPm25_desc(String pm25_desc) {
            this.pm25_desc = pm25_desc;
        }

        public String getPm10() {
            return pm10;
        }

        public void setPm10(String pm10) {
            this.pm10 = pm10;
        }

        public String getPm10_desc() {
            return pm10_desc;
        }

        public void setPm10_desc(String pm10_desc) {
            this.pm10_desc = pm10_desc;
        }

        public String getO3() {
            return o3;
        }

        public void setO3(String o3) {
            this.o3 = o3;
        }

        public String getO3_desc() {
            return o3_desc;
        }

        public void setO3_desc(String o3_desc) {
            this.o3_desc = o3_desc;
        }

        public String getNo2() {
            return no2;
        }

        public void setNo2(String no2) {
            this.no2 = no2;
        }

        public String getNo2_desc() {
            return no2_desc;
        }

        public void setNo2_desc(String no2_desc) {
            this.no2_desc = no2_desc;
        }

        public String getSo2() {
            return so2;
        }

        public void setSo2(String so2) {
            this.so2 = so2;
        }

        public String getSo2_desc() {
            return so2_desc;
        }

        public void setSo2_desc(String so2_desc) {
            this.so2_desc = so2_desc;
        }

        public String getCo() {
            return co;
        }

        public void setCo(String co) {
            this.co = co;
        }

        public String getCo_desc() {
            return co_desc;
        }

        public void setCo_desc(String co_desc) {
            this.co_desc = co_desc;
        }

        public String getKouzhao() {
            return kouzhao;
        }

        public void setKouzhao(String kouzhao) {
            this.kouzhao = kouzhao;
        }

        public String getYundong() {
            return yundong;
        }

        public void setYundong(String yundong) {
            this.yundong = yundong;
        }

        public String getWaichu() {
            return waichu;
        }

        public void setWaichu(String waichu) {
            this.waichu = waichu;
        }

        public String getKaichuang() {
            return kaichuang;
        }

        public void setKaichuang(String kaichuang) {
            this.kaichuang = kaichuang;
        }

        public String getJinghuaqi() {
            return jinghuaqi;
        }

        public void setJinghuaqi(String jinghuaqi) {
            this.jinghuaqi = jinghuaqi;
        }
    }

    public static class ZhishuDTO {
        private ChuanyiDTO chuanyi;
        private DaisanDTO daisan;
        private GanmaoDTO ganmao;
        private ChenlianDTO chenlian;
        private ZiwaixianDTO ziwaixian;
        private LiangshaiDTO liangshai;
        private KaicheDTO kaiche;
        private XicheDTO xiche;
        private LvyouDTO lvyou;
        private DiaoyuDTO diaoyu;

        public ChuanyiDTO getChuanyi() {
            return chuanyi;
        }

        public void setChuanyi(ChuanyiDTO chuanyi) {
            this.chuanyi = chuanyi;
        }

        public DaisanDTO getDaisan() {
            return daisan;
        }

        public void setDaisan(DaisanDTO daisan) {
            this.daisan = daisan;
        }

        public GanmaoDTO getGanmao() {
            return ganmao;
        }

        public void setGanmao(GanmaoDTO ganmao) {
            this.ganmao = ganmao;
        }

        public ChenlianDTO getChenlian() {
            return chenlian;
        }

        public void setChenlian(ChenlianDTO chenlian) {
            this.chenlian = chenlian;
        }

        public ZiwaixianDTO getZiwaixian() {
            return ziwaixian;
        }

        public void setZiwaixian(ZiwaixianDTO ziwaixian) {
            this.ziwaixian = ziwaixian;
        }

        public LiangshaiDTO getLiangshai() {
            return liangshai;
        }

        public void setLiangshai(LiangshaiDTO liangshai) {
            this.liangshai = liangshai;
        }

        public KaicheDTO getKaiche() {
            return kaiche;
        }

        public void setKaiche(KaicheDTO kaiche) {
            this.kaiche = kaiche;
        }

        public XicheDTO getXiche() {
            return xiche;
        }

        public void setXiche(XicheDTO xiche) {
            this.xiche = xiche;
        }

        public LvyouDTO getLvyou() {
            return lvyou;
        }

        public void setLvyou(LvyouDTO lvyou) {
            this.lvyou = lvyou;
        }

        public DiaoyuDTO getDiaoyu() {
            return diaoyu;
        }

        public void setDiaoyu(DiaoyuDTO diaoyu) {
            this.diaoyu = diaoyu;
        }

        public static class ChuanyiDTO {
            private String level;
            private String tips;

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public String getTips() {
                return tips;
            }

            public void setTips(String tips) {
                this.tips = tips;
            }
        }

        public static class DaisanDTO {
            private String level;
            private String tips;

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public String getTips() {
                return tips;
            }

            public void setTips(String tips) {
                this.tips = tips;
            }
        }

        public static class GanmaoDTO {
            private String level;
            private String tips;

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public String getTips() {
                return tips;
            }

            public void setTips(String tips) {
                this.tips = tips;
            }
        }

        public static class ChenlianDTO {
            private String level;
            private String tips;

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public String getTips() {
                return tips;
            }

            public void setTips(String tips) {
                this.tips = tips;
            }
        }

        public static class ZiwaixianDTO {
            private String level;
            private String tips;

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public String getTips() {
                return tips;
            }

            public void setTips(String tips) {
                this.tips = tips;
            }
        }

        public static class LiangshaiDTO {
            private String level;
            private String tips;

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public String getTips() {
                return tips;
            }

            public void setTips(String tips) {
                this.tips = tips;
            }
        }

        public static class KaicheDTO {
            private String level;
            private String tips;

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public String getTips() {
                return tips;
            }

            public void setTips(String tips) {
                this.tips = tips;
            }
        }

        public static class XicheDTO {
            private String level;
            private String tips;

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public String getTips() {
                return tips;
            }

            public void setTips(String tips) {
                this.tips = tips;
            }
        }

        public static class LvyouDTO {
            private String level;
            private String tips;

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public String getTips() {
                return tips;
            }

            public void setTips(String tips) {
                this.tips = tips;
            }
        }

        public static class DiaoyuDTO {
            private String level;
            private String tips;

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public String getTips() {
                return tips;
            }

            public void setTips(String tips) {
                this.tips = tips;
            }
        }
    }

    public static class HoursDTO {
        private String hours;
        private String wea;
        private String wea_img;
        private String tem;
        private String win;
        private String win_speed;
        private String aqi;

        public String getHours() {
            return hours;
        }

        public void setHours(String hours) {
            this.hours = hours;
        }

        public String getWea() {
            return wea;
        }

        public void setWea(String wea) {
            this.wea = wea;
        }

        public String getWea_img() {
            return wea_img;
        }

        public void setWea_img(String wea_img) {
            this.wea_img = wea_img;
        }

        public String getTem() {
            return tem;
        }

        public void setTem(String tem) {
            this.tem = tem;
        }

        public String getWin() {
            return win;
        }

        public void setWin(String win) {
            this.win = win;
        }

        public String getWin_speed() {
            return win_speed;
        }

        public void setWin_speed(String win_speed) {
            this.win_speed = win_speed;
        }

        public String getAqi() {
            return aqi;
        }

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }
    }
}
