package com.example.animelistdisplay.model

data class Anime(
    val id: String,
    val title: String,
    val year: String,
    val genre: String,
    val studio: String,
    val mangaka: String,
    val va: String,
    val synopsis: String,
    val poster: String,
    val images: List<String>,
    val rating: String
)

fun getAnime(): List<Anime> {
    return listOf(
        Anime(
            id = "1535", title = "Death Note", year = "2006",
            genre = "Supernatural, Suspense, Drama", studio = "Madhouse", mangaka = "Tsugumi Ohba",
            va = "Miyano, Mamoru, Yamaguchi, Kappei,Nakamura, Shidou, Hirano, Aya",
            synopsis = "An intelligent high school student goes on a secret crusade to eliminate criminals from the world after discovering a notebook capable of killing anyone whose name is written into it.",
            poster = "https://static.wikia.nocookie.net/deathnote/images/7/76/DEATH_NOTE_anime.jpg/revision/latest?cb=20170720215429",
            images = listOf(
                "https://www.slashfilm.com/img/gallery/death-note-the-anime-ending-explained/l-intro-1637698621.jpg",
                "https://m.media-amazon.com/images/M/MV5BMjcxMDg4MDUtMmQ2NC00ZDIyLTkyMjEtMDBiY2NiOTA2NWVmXkEyXkFqcGdeQWpybA@@._V1_.jpg",
                "https://wegotthiscovered.com/wp-content/uploads/2023/03/death-note-light-yagami.jpg?w=1200",
                "https://www.themarysue.com/wp-content/uploads/2022/07/light-ryuk-death-note.jpeg?fit=1200%2C630"
            ),
            rating = "8.62"
        ),

        Anime(
            id = "40748", title = "Jujutsu Kaisen", year = "2020",
            genre = "Action, Fantasy", studio = "MAPPA", mangaka = "Gege Akutami",
            va = "Enoki, Junya, Nakamura, Yuuichi, Tsuda, Kenjirou, Suwabe, Junichi",
            synopsis = "Idly indulging in baseless paranormal activities with the Occult Club, high schooler Yuuji Itadori spends his days at either the clubroom or the hospital, where he visits his bedridden grandfather. However, this leisurely lifestyle soon takes a turn for the strange when he unknowingly encounters a cursed item. Triggering a chain of supernatural occurrences, Yuuji finds himself suddenly thrust into the world of Curses—dreadful beings formed from human malice and negativity—after swallowing the said item, revealed to be a finger belonging to the demon Sukuna Ryoumen, the King of Curses.",
            poster = "https://static.wikia.nocookie.net/jujutsu-kaisen/images/e/e0/Jujutsu_Kaisen_Cursed_Clash_Key_Visual.png/revision/latest?cb=20230702024226",
            images = listOf(
                "https://media.distractify.com/brand-img/ulL-T6whv/0x0/jujutsu-kaisen-1687988990132.jpg",
                "https://www.transcontinentaltimes.com/wp-content/uploads/2023/07/gojo-jujutsu-kaisen.jpg",
                "https://www.hindustantimes.com/ht-img/img/2023/06/21/1600x900/Jujutsu_Kaisen_season_2_1679711090740_1687356135274.jpg",
                "https://pbs.twimg.com/media/F1dmSdRWcAABaca.jpg"
            ),
            rating = "8.89"
        ),

        Anime(
            id = "16498", title = "Attack on Titan", year = "2013",
            genre = "Action, Drama, Suspense", studio = "Wit, MAPPA", mangaka = "Hajime Isayama",
            va = "Kaji, Yuuki, Ishikawa, Yui, Kamiya, Hiroshi",
            synopsis = "After his hometown is destroyed and his mother is killed, young Eren Jaeger vows to cleanse the earth of the giant humanoid Titans that have brought humanity to the brink of extinction.",
            poster = "https://resizing.flixster.com/-XZAfHZM39UwaGJIFWKAE8fS0ak=/v3/t/assets/p19149543_b_v9_aa.jpg",
            images = listOf(
                "https://2danicritic.github.io/index_files/ReviewImages/review_Attack_on_Titan_-_Season_12.jpg",
                "https://blog.sakugabooru.com/wp-content/uploads/2017/04/titans1-2-1038x576.jpg",
                "https://m.media-amazon.com/images/S/pv-target-images/ee885f7647300f5de966aa226ea8eae6213f0514b49e456f577b84b1618f1174.jpg",
                "https://www.hindustantimes.com/ht-img/img/2023/11/05/550x309/eren_1699114342189_1699186353536.jfif"
            ),
            rating = "9.1"
        ),

        Anime(
            id = "42897", title = "Horimiya", year = "2021", genre = "Romance",
            studio = "CloverWorks", mangaka = "Hiroki Adachi", va = "Uchiyama, Kouki, Tomatsu, Haruka",
            synopsis = "Two very different people - an academically successful schoolgirl and a quiet loser schoolboy - meet and develop a friendship.",
            poster = "https://m.media-amazon.com/images/M/MV5BZWNiY2IwMGUtYTk1NC00NmE5LWE4NTItYmQyNDJmMGU2MDMwXkEyXkFqcGdeQXVyMzgxODM4NjM@._V1_FMjpg_UX1000_.jpg",
            images = listOf("https://www.hindustantimes.com/ht-img/img/2023/06/21/550x309/interview_horimiya_director_thumb_kv_1682193158797_1687345930192.webp",
                "https://www.waifuworld.shop/wp-content/uploads/2023/05/EuQ0e3oWgAgBY90-1-1024x576.jpeg",
                "https://animeindia.in/wp-content/uploads/2023/09/filters_quality95formatwebp-1-1-edited-1.jpg",
                "https://animerantshome.files.wordpress.com/2021/06/horimiya-kiss.png?w=1024"),
            rating = "8.1"
        ),

        Anime(
            id = "49596", title = "Blue Lock", year = "2022", genre = "Sports, Thriller, Egoism",
            studio = "8Bit", mangaka = "Muneyuki Kaneshiro, Yusuke Nomura", va = "Ura, Kazuki, Kaito, Tasuku, Shimazaki, Nobunaga, Suwabe, Junichi",
            synopsis = "High school soccer players from across Japan gather for a controversial project designed to create the best and most egoistic striker in the world.",
            poster = "https://m.media-amazon.com/images/M/MV5BODBmM2JmY2EtMzRlZC00Njk0LTg5NGMtZjdjMjQ5ZTJhYWQ3XkEyXkFqcGdeQXVyMTMzNDExODE5._V1_FMjpg_UX1000_.jpg",
            images = listOf("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/b91d227a-e97e-418d-b1c4-3f617516b7c8/dg425vl-bea73380-a0ad-4abe-9881-f2e7f744bfeb.png/v1/fill/w_1280,h_720,q_80,strp/isagi_yoichi___blue_lock_by_exaegon_dg425vl-fullview.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9NzIwIiwicGF0aCI6IlwvZlwvYjkxZDIyN2EtZTk3ZS00MThkLWIxYzQtM2Y2MTc1MTZiN2M4XC9kZzQyNXZsLWJlYTczMzgwLWEwYWQtNGFiZS05ODgxLWYyZTdmNzQ0YmZlYi5wbmciLCJ3aWR0aCI6Ijw9MTI4MCJ9XV0sImF1ZCI6WyJ1cm46c2VydmljZTppbWFnZS5vcGVyYXRpb25zIl19.u1H3BFOE_V5KOitUPJQSANXh0xOlRwvOx2zbgUs6NGg",
                "https://moewalls.com/wp-content/uploads/2023/01/seishirou-nagi-blue-lock-thumb.jpg",
                "https://staticg.sportskeeda.com/editor/2023/02/7d9c5-16761394940439-1920.jpg",
                "https://static.animecorner.me/2022/12/Bachira_BeastMode.png"),
            rating = "8.3"
        ),

        Anime(
            id = "44511", title = "Chainsaw Man", year = "2022", genre = "Action, Fantasy", studio = "MAPPA",
            mangaka = "Tatsuki Fujimoto", va = "Toya, Kikunosuke, Kusunoki, Tomori, Fairouz Ai, Sakata, Shougo",
            synopsis = "Following a betrayal, a young man left for dead is reborn as a powerful devil-human hybrid after merging with his pet devil Pochita and is soon enlisted into an organization dedicated to hunting devils.",
            poster = "https://resizing.flixster.com/Y2EVUWoQ-QO0ixvBZY1gX5_zW_Q=/ems.cHJkLWVtcy1hc3NldHMvdHZzZXJpZXMvMjcxZDIzMDktYmMxZi00YTY1LTkwNmQtYjU5YThjNjRmZDE0LnBuZw==",
            images = listOf("https://images-na.ssl-images-amazon.com/images/S/pv-target-images/cce90a19ca8630ec2c2b4fe5f72c7dbe2fd472276b6de224852e6874ef23305e._RI_TTW_SX720_FMjpg_.jpg",
                "https://www.themarysue.com/wp-content/uploads/2023/04/denji-and-makima.jpeg?fit=1920%2C1080",
                "https://static1.cbrimages.com/wordpress/wp-content/uploads/2022/11/chainsaw-man-aki-kon-gesture.jpg",
                "https://cdn.oneesports.gg/cdn-data/2022/10/ChainsawMan_Power_Denji_Rooftop-1024x576.jpg"),
            rating = "8.54"
        ),

        Anime(
            id = "52034", title = "Oshi No Ko", year = "2023", genre = "Drama, Supernatural, Reincarnation", studio = "Doga Kobo",
            mangaka = "Aka Akasaka, Mengo Yokoyari", va = "Takahashi, Rie, Ootsuka, Takeo, Igoma, Yurie",
            synopsis = "A doctor and his recently-deceased patient are reborn as twins to a famous Japanese musical idol and navigate the highs and lows of the Japanese entertainment industry as they grow up together through their lives.",
            poster = "https://thewildcattribune.com/wp-content/uploads/2023/05/52890928681_a467a529c4_o-e1685030922246-900x860.jpg",
            images = listOf("https://api.duniagames.co.id/api/content/upload/file/16616400881688553186.jpg",
                "https://www.pinkvilla.com/english/images/2023/04/1675776815_fotojet-2023-04-20t015733-931_1280*720.jpg",
                "https://staticg.sportskeeda.com/editor/2023/05/ea5e7-16852593717666-1920.jpg",
                "https://staticg.sportskeeda.com/editor/2023/07/93c2b-16885628812606-1920.jpg?w=840"),
            rating = "8.73"
        ),

        Anime(
            id = "38000", title = "Demon Slayer", year = "2019", genre = "Action, Fantasy", studio = "UFOTABLE",
            mangaka = "Koyoharu Gotouge", va = "Hanae, Natsuki, Shimono, Hiro, Kitou, Akari, Matsuoka, Yoshitsugu",
            synopsis = "A family is attacked by demons and only two members survive - Tanjiro and his sister Nezuko, who is turning into a demon slowly. Tanjiro sets out to become a demon slayer to avenge his family and cure his sister.",
            poster = "https://resizing.flixster.com/-XZAfHZM39UwaGJIFWKAE8fS0ak=/v3/t/assets/p16749713_b_v9_ak.jpg",
            images = listOf("https://sportshub.cbsistatic.com/i/2021/11/14/45b1bc0b-04e7-4347-854e-329f7c2c0985/demon-slayer-season-2-tanjiro-hinokami-kagura.jpg",
                "https://miro.medium.com/v2/resize:fit:1200/1*K5DOK0u8oX5gF-st7WRM1Q.jpeg",
                "https://i.ytimg.com/vi/_YjplEYU_9I/maxresdefault.jpg",
                "https://www.slashfilm.com/img/gallery/demon-slayer-season-2-character-development-edition/new-demon-reveal-daki-1640703629.jpg"),
            rating = "8.6"
        )

    )
}
