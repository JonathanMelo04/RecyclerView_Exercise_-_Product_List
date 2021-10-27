package com.example.productlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.productlist.adapter.AdapterProduto
import com.example.productlist.model.Produto

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView_produtos = findViewById<RecyclerView>(R.id.recyclerView_produtos)
        recyclerView_produtos.layoutManager = LinearLayoutManager(this)
        recyclerView_produtos.setHasFixedSize(true)

        //configuring the adapter
        val listaProdutos: MutableList<Produto> = mutableListOf()
        val adapterProduto = AdapterProduto(this,listaProdutos)
        recyclerView_produtos.adapter = adapterProduto

        val produto1 = Produto(
            R.drawable.ssd,
            "SSD SanDisk Plus 480GB",
            "Confiável, rápido e muita capacidade. A SanDisk é pioneira em tecnologias de armazenamento de estado sólido.",
            "R$ 450,00"
        )
        listaProdutos.add(produto1)

        val produto2 = Produto(
            R.drawable.processador,
            "Intel Core i5 10400F",
            "Os novos processadores da 10ª geração oferecem atualizações de desempenho incríveis para melhorar a produtividade.",
            "R$ 1050,00"
        )
        listaProdutos.add(produto2)

        val produto3 = Produto(
            R.drawable.memoria,
            "Memória Ram Corsair  8GB DDR4",
            "Memória Corsair Vengeance LPX, 8GB, 2666MHz, DDR4, C16, Preto.",
            "R$ 369,00"
        )
        listaProdutos.add(produto3)

        val produto4 = Produto(
            R.drawable.placadevideo,
            "GeForce RTX 3090 24GB",
            "Os blocos de construção para a GPU mais rápida e eficiente do mundo.",
            "R$ 18.499,00"
        )
        listaProdutos.add(produto4)

        val produto5 = Produto(
            R.drawable.teclado,
            "Teclado Mecânico Gamer T-Dagger Corvette",
            "Teclado Mecânico Gamer T-Dagger Corvette, LED Rainbow, Switch Outemu DIY Blue, ABNT2 - T-TGK302 -BL (PT-BLUE).",
            "R$ 229,00"
        )
        listaProdutos.add(produto5)

        val produto6 = Produto(
            R.drawable.gabinete,
            "Gabinete Gamer",
            "A série Carbide SPEC-DELTA RGB é uma caixa ATX de torre média de vidro temperado com estilo angular impressionante.",
            "R$ 799,00"
        )
        listaProdutos.add(produto6)
    }
}