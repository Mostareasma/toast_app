package com.projet.autotoast.model

import android.widget.TimePicker
import java.sql.Time

class Order {
    var id:Int?=null
    var temp:Int?=null
    var time:TimePicker?=null
    var smiley:Boolean?=null
    constructor(temp:Int  ,time:TimePicker , smiley:Boolean){
        this.id=id
        this.temp=temp
        this.time=time
        this.smiley=smiley
    }
}