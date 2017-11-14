package com.pyarinc.pageradapterupdate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user2 on 11/14/2017.
 */

class Singleton {
    private static final Singleton ourInstance = new Singleton();

    static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }

    public  static List<String> mUrls = new ArrayList<>();
}
