package ru.mike.core.providers

import android.content.Context
import android.content.res.Resources

interface AndroidProvider {

    fun context(): Context

    fun resources(): Resources


}