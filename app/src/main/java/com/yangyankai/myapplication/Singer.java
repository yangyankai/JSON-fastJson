package com.yangyankai.myapplication;

/**
 * Created by yangyankai on 2015/11/27.
 */
public class Singer {
    private String chinese;
    private String englishName;

    Singer(){
        chinese = "null";
        englishName = "null";
    }
    Singer(String k, String v) {
        chinese = k;
        englishName = v;
    }

    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }
}
