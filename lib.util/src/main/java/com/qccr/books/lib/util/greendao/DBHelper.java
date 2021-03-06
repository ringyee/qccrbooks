package com.qccr.books.lib.util.greendao;

import android.app.Application;

import org.greenrobot.greendao.database.Database;

/**
 * @author: zhuhuanhuan
 * @time: 16/9/9-上午10:22.
 * @email: zhuhuanhuan@qccr.com
 * @desc:
 */

public final class DBHelper {

    private static DaoSession daoSession;

    private DBHelper() {
    }

    /**
     * 初始化的时候,生成session
     *
     * @param application
     */
    public static void init(Application application) {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(application, "book");
        Database db = helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
    }

    public static DaoSession getDaoSession() {
        return daoSession;
    }
}
