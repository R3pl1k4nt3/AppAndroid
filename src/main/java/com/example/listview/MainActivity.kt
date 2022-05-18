package com.example.listview

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val producto = Producto("Camara",100.00,"Camara modelo maravilloso",R.drawable.camara)
        val producto2 = Producto("pc",200.0, "Sobremesa", R.drawable.pc)

        val listaProductos = listOf(producto,producto2)
        val adapter = ProductosAdapter(this,listaProductos)
        lista.adapter = adapter

        lista.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this,ProductoActivity::class.java)
            intent.putExtra("producto",listaProductos[position])
            startActivity(intent)
        }

    }
}