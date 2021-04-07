package com.dohenes.common.util

import android.util.Log

/**
 * ClassName LogUtil
 * Describe TODO<日志工具类>
 * Author jgduan
 * Date 2021/4/7 15:38
 * Version v1.0
 */
object LogUtil {
    // 默认允许打印，可以通过LogUtil()::print.set关闭打印
    var print = true

    // 默认TAG位LogUtil，可以通过LogUtil()::tag.set修改TAG名称
    var tag: String = LogUtil::javaClass.name

    fun v(msg: String) {
        if (print) {
            Log.v(tag, msg)
        }
    }

    fun d(msg: String) {
        if (print) {
            Log.d(tag, msg)
        }
    }

    fun i(msg: String) {
        if (print) {
            Log.i(tag, msg)
        }
    }

    fun w(msg: String) {
        if (print) {
            Log.w(tag, msg)
        }
    }

    fun e(msg: String) {
        if (print) {
            Log.e(tag, msg)
        }
    }
}