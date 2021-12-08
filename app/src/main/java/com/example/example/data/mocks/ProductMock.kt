package com.example.example.data.mocks

import com.example.example.data.models.Product

class ProductMock {
    fun loadProducts(): List<Product> {
        return listOf(
            Product("1","Harina","Harina de maiz blanco por 1Kg","https://merkaqui.com/wp-content/uploads/harina-pan-maiz-blanco-merkaqui-mercado-a-domicilio-en-cucuta-tienda-virtual.png","$4500"),
            Product("2","Arroz","Arroz Zulia por 1Kg","https://merkaqui.com/wp-content/uploads/arroz-zulia-1kg-y-500gr.jpg","$4500"),
            Product("3","Sal Refisal","Sal por 1Kg","https://merkaqui.com/wp-content/uploads/refisal-1000gr.jpg","$1500"),
            Product("4","Café Sello Rojo","Café por 500g","https://merkaqui.com/wp-content/uploads/caf%C3%A9-sello-rojo-150gr-merkaqui-mercado-a-domicilio-cucuta.png","$6500"),
            Product("5","Barra de chocolate Corona","Barra de chocolate Corona por 500g","https://merkaqui.com/wp-content/uploads/Chocolate-corona-merkaqui-mercado-a-domicilio-en-c%C3%BAcuta.png","$3800"),
            Product("6","Huevos","Cartón x 30 Huevos","https://merkaqui.com/wp-content/uploads/huevos-gallina_1339-867.jpg","$15500"),
            Product("7","Margarina","Margarina Gustosita 110 Gr","https://merkaqui.com/wp-content/uploads/margarina_gustosita_110gr.jpg","$2500"),
            Product("8","Yogurt Alpina litro bolsa","Yogurt Alpina litro bolsa por 500g","https://merkaqui.com/wp-content/uploads/Captura-1.png","$2500"),
            Product("9","Leche en polvo","Leche en polvo Induleche 200 Gr","https://merkaqui.com/wp-content/uploads/descarga.jpg","$16500"),
            Product("10","Bonyurt Alpina","Bonyurt Alpina 170 Gr","https://merkaqui.com/wp-content/uploads/alpina_bonyur_270gr.jpg","$1500"),
            Product("11","AK1 450 Gr","Detergente AK1 450 Gr","https://merkaqui.com/wp-content/uploads/4a-23.png","$12500"),
            Product("12","Colgate Extra","Colgate Extra frescura 60ml","https://merkaqui.com/wp-content/uploads/extra-frescura.jpg","$8500")

        )
    }
}