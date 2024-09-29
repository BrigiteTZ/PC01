package dev.brigitetarazona.pc01_btarazona

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.brigitetarazona.pc01_btarazona.adapter.SongAdapter
import dev.brigitetarazona.pc01_btarazona.model.SongModel


class MusicaFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View =  inflater.inflate(R.layout.fragment_musica, container, false)

        val rvMusica: RecyclerView = view.findViewById(R.id.rvMusica)
        rvMusica.layoutManager = LinearLayoutManager(requireContext())
        rvMusica.adapter = SongAdapter(ListSong())

        return view
    }

    private fun ListSong(): List<SongModel>{
        var lstSong: ArrayList<SongModel> = ArrayList()

        lstSong.add(
            SongModel(1,R.drawable.foto1
                ,"Paolo Guerrero"
                ,"Peruano"
                ,"100,000"
                , "36"))
        lstSong.add(
            SongModel(2,R.drawable.foto2
                ,"GianLuca Lapadula"
                ,"Italia-Peru"
                ,"220,000"
                , "28"))
        lstSong.add(
            SongModel(3,R.drawable.foto3
                ,"Jefferson Farfan"
                ,"Peruano"
                ,"38"
                , "5:10"))
        return lstSong
    }
}