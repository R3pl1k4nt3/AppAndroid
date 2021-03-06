package com.example.listview

import android.arch.lifecycle.Observer
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listaProductos = emptyList<Producto>()

        val database = AppDatabase.getDatabase(this)

        database.productos().getAll().observe(this, Observer {
            listaProductos = it

            val adapter = ProductosAdapter(this, listaProductos)

            lista.adapter = adapter
        })

        lista.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, ProductoActivity::class.java)
            intent.putExtra("id", listaProductos[position].idProducto)
            startActivity(intent)
        }


    }
}