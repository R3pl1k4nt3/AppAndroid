package com.example.listview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_producto.*

class ProductoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_producto)


        val producto = intent.getSerializableExtra("producto") as Producto

        nombre_producto.text = producto.nombre
        precio_producto.text = "${producto.precio} €"
        descripcion_producto.text = producto.descripcion
        imagenProducto.setImageResource(producto.imagen)
        BackButton.setOnClickListener {
            finish()
        }

    }
}