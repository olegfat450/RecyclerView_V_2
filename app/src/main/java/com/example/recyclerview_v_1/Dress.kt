package com.example.recyclerview_v_1

import java.io.Serializable

class Dress(val name: String,val description: String,val image: Int): Serializable {

    companion object{

        val d1 = Dress("Шляпа","Шляпа белая летняя",R.drawable.g1)
        val d2 = Dress("Шляпа","Шляпа из соломы",R.drawable.g2)
        val d3 = Dress("Шляпа","Шляпа черная",R.drawable.g3)
        val d4 = Dress("Шапка","Шапка серая демосезонная",R.drawable.g4)
        val d5 = Dress("Шапка","Шапка вязаная крсасно-белая",R.drawable.g5)
        val d6 = Dress("Шапка","Шапка меховая зимняя",R.drawable.g6)
        val d7 = Dress("Ботинки","Ботинки зимние меховые",R.drawable.g7)
        val d8 = Dress("Ботинки","Ботинки желтые димисезонные",R.drawable.g8)
        val d9 = Dress("Сандали","Сандали коричневые летние",R.drawable.g9)
        val d10 = Dress("Ботинки","Ботинки летние коричневые",R.drawable.g10)
        val d11 = Dress("Брюки","Брюки черные летние",R.drawable.g11)
        val d12 = Dress("Брюки","Брюки светлые летние",R.drawable.g12)
        val d13= Dress("Брюки","Брюки синие",R.drawable.g13)
        val d14 = Dress("Джинсы","Джинсы синие",R.drawable.g14)
        val d15 = Dress("Джинсы","Джинсы черные",R.drawable.g15)
        val d16 = Dress("Куртка","Куртка черная демисизонная",R.drawable.g16)
        val d17 = Dress("Куртка","Куртка черная зимняя",R.drawable.g17)
        val d18 = Dress("Пуховик","Пуховик серый",R.drawable.g18)
        val d19 = Dress("Рубашка","Рубажка белая",R.drawable.g19)
        val d20 = Dress("Рубашка","Рубашка синяя",R.drawable.g20)


          val dress: MutableList<Dress> = mutableListOf(d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15,d16,d17,d18,d19,d20)



    }
}