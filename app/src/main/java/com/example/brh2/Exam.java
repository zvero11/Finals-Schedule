package com.example.brh2;

public class Exam {
    int  rank;
    String name;
    String when;
    Exam(String n, String w, int r){
        name = n;
        when = w;
        rank = r;
    }
    Exam (String n) {
        name = n;
        when = "";
        rank = 0;
    }
    public int getRank(){
        return rank;
    }

    public String getName()
    {
        return name;
    }

    public String getWhen(){
        return when;
    }

    public void setName(String name) {
        this.name = name;
    }
}
