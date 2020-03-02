package ru.hryasch.myapplication

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor()
{
    init
    {
        Log.d("<<< Engine >>>", "initializing...")
    }
}
class Wheels @Inject constructor()
{
    init
    {
        Log.d("<<< Wheels >>>", "initializing...")
    }
}

class Remote @Inject constructor()
{
    init
    {
        Log.d("<<< Remote >>>", "initializing...")
    }

    fun setListener(car: Car)
    {
        Log.i("<<< Remote >>>", "Listener SET")
    }
}

class Car @Inject constructor(val engine: Engine, val wheels: Wheels)
{
    init
    {
        Log.d("<<< Car >>>", "initializing...")
    }

    @Inject
    fun enableRemote(remote: Remote)
    {
        Log.d("<<< Car >>>", "setting remote...")
        remote.setListener(this)
    }

    fun drive()
    {
        Log.i("<<< Car >>>", "driving...")
    }
}