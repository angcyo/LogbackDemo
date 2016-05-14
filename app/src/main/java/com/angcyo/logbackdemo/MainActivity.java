package com.angcyo.logbackdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Logger logger = LoggerFactory.getLogger(MainActivity.class);

        /*以下日志只会在控制台输出*/
        logger.trace("angcyo-->{}", "trace");
        logger.debug("angcyo-->{}", "debug");
        logger.info("angcyo-->{}", "info");
        logger.warn("angcyo-->{}", "warn");
        logger.error("angcyo-->{}", "error");

        Logger logtest = LoggerFactory.getLogger("logtest");
        /*以下日志会在BASE_ROLL_FILE声明的文件中输出,并且也会在控制台输出*/
        logtest.trace("logtest-->{}", "trace");
        logtest.debug("logtest-->{}", "debug");
        logtest.info("logtest-->{}", "info");
        logtest.warn("logtest-->{}", "warn");
        logtest.error("logtest-->{}", "error");
    }
}
