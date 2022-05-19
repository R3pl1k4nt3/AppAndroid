package com.example.listview

import android.media.Image
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "productos")
class Producto(@PrimaryKey(autoGenerate = true) var idProducto:Int = 0,
               val nombre:String,
               val precio:Double,
               val descripcion:String,
               val imagen:Int): Serializable {

}