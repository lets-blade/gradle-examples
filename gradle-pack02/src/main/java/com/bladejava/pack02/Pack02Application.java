package com.bladejava.pack02;

import com.blade.Blade;

/**
 * @author biezhi
 * @date 2018/5/31
 */
public class Pack02Application {

    public static void main(String[] args) {
        Blade.me().get("/", ((request, response) -> response.html("<h1>Hello Blade Pack02.</h1>"))).start(Pack02Application.class, args);
    }

}
