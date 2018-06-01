package com.bladejava.pack01;

import com.blade.Blade;

/**
 * @author biezhi
 * @date 2018/5/31
 */
public class Pack01Application {

    public static void main(String[] args) {
        Blade.me().get("/", ((request, response) -> response.html("<h1>Hello Blade Pack01.</h1>"))).start(Pack01Application.class, args);
    }

}
