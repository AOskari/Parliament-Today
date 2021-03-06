package com.example.parliamentproject.data.data_classes

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

/** A data class which defines the single row in the settings_table of the Room Database. */
@Parcelize
@Entity(tableName = "settings_table")
data class Settings (
    var showKDP: Boolean = true,
    var showKesk: Boolean = true,
    var showKok: Boolean = true,
    var showLiik: Boolean = true,
    var showPS: Boolean = true,
    var showRKP: Boolean = true,
    var showSDP: Boolean = true,
    var showVas: Boolean = true,
    var showVihr: Boolean = true,
    var minAge : Int = 18,
    var maxAge : Int = 100
        )  : Parcelable {

    @ColumnInfo(name = "primaryKey", defaultValue = "0")
    @PrimaryKey var i: String = "0"

    /** Returns settings as a List of Strings. */
    fun chosenParties() : List<String> {
        val list = mutableListOf<String>()

        if (showKDP) list.add("kd")
        if (showKesk) list.add("kesk")
        if (showKok) list.add("kok")
        if (showLiik) list.add("liik")
        if (showPS) list.add("ps")
        if (showRKP) list.add("r")
        if (showSDP) list.add("sd")
        if (showVas) list.add("vas")
        if (showVihr) list.add("vihr")

        return list
    }

}