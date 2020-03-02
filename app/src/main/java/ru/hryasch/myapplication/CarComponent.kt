package ru.hryasch.myapplication

import dagger.Component

@Component
interface CarComponent
{
    fun getCar(): Car
    fun inject(activity: MainActivity)
}