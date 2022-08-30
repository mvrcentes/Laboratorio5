package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Album

class Datasource {

    fun loadAlbums(): List<Album> {
        return listOf<Album>(
            Album(R.string.Crybaby, "https://static.qobuz.com/images/covers/fa/76/ksvto653q76fa_600.jpg"),
            Album(R.string.Hellboy, "https://upload.wikimedia.org/wikipedia/commons/9/9e/LilPeep-Hellboy_%28cropped%29.jpg"),
            Album(R.string.CastlesII, "https://www.last.fm/es/music/Lil+Peep+&+Lil+Tracy/CASTLES+II"),
            Album(R.string.Everybody, "https://pitchfork.com/reviews/albums/lil-peep-everybodys-everything/"),
            Album(R.string.ComeOver, "https://media.pitchfork.com/photos/5982013131cc0f604d98b9e3/1:1/w_320,c_limit/come%20over%20when%20you're%20sober_lil%20peep.jpg"),
            Album(R.string.ComeOver2, "https://media.pitchfork.com/photos/5be4b8b2f2477e2038d0d9ef/1:1/w_320,c_limit/cowys2.jpg"),
            Album(R.string.Feelz, "https://lastfm.freetls.fastly.net/i/u/500x500/925a81c8fa3bb24f24c473cb4a0ed80a.jpg"),
            Album(R.string.girls, "https://m.media-amazon.com/images/I/81+7qJOjvuL._SS500_.jpg"),
            Album(R.string.GymClass,"https://m.media-amazon.com/images/I/71uyNf-GJgL._SL1400_.jpg"),
            Album(R.string.Kiss,"https://i.discogs.com/0K31ccJ9j_KpqMEE8thMAf7JkomJTOoTF59vyKrOyxY/rs:fit/g:sm/q:90/h:500/w:500/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9SLTExMzc2/MTQyLTE1MTUyMDE3/NzQtNjQ1MS5qcGVn.jpeg")
        )
    }
}