package com.juliane.listausuario

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rvUsuarios)

        val lista = mutableListOf<Usuario>(
            Usuario(nome="Juliane Monteiro", email="juliane.a.monteiro@hotmail.com", stack= Stack.FULLSTACK, senioridade= Senioridade.SENIOR, foto=resources.getDrawable(R.drawable.ju)),
            Usuario(nome="Amanda Caetano", email="eng.amanda.caetano@gmail.com", stack= Stack.BACKEND, senioridade= Senioridade.SENIOR, foto =resources.getDrawable(R.drawable.amanda)),
            Usuario(nome= "Milena Audrey", email = "milenaaudrey@gmail.com", stack = Stack.FRONTEND, senioridade = Senioridade.PLENO, foto =resources.getDrawable(R.drawable.milena))
        )

        rv.adapter = UsuarioAdapter(lista)
        rv.layoutManager = LinearLayoutManager(this)


    }
}
