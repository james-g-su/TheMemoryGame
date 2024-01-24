package com.example.thememorygame

import org.intellij.lang.annotations.Identifier

var identifier: Int = 0

data class MemCard(val iden: Int, var isFaceUp:Boolean, var isMatched:Boolean){

}

fun setIdentifier2(newIden:Int){
    identifier = newIden;
}