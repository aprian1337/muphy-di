package com.aprian1337.movie_catalogue.utils

import com.aprian1337.movie_catalogue.R
import com.aprian1337.movie_catalogue.models.MovieTv

object DummyData {
    fun getMovies() : ArrayList<MovieTv>{
        return arrayListOf(
            MovieTv("mv1", "Alita: Battle Angel (2019)", "Action, Science Fiction, Adventure", "2h 2m", "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",  R.drawable.movies_poster_alita, "PG-13"),
            MovieTv("mv2", "Aquaman (2018)", "Action, Adventure, Fantasy", "2h 23m", "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.", R.drawable.movies_poster_aquaman, "PG-13"),
            MovieTv("mv3", "A Star Is Born (2018)", "Drama, Romance, Music", "2h 16m", "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.", R.drawable.movies_poster_a_start_is_born, "R"),
            MovieTv("mv4", "Bohemian Rhapsody (2018)", "Music, Drama, History", "2h 15m", "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.", R.drawable.movies_poster_bohemian, "PG-13"),
            MovieTv("mv5", "Cold Pursuit (2019)", "Action, Crime, Thriller", "1h 59m", "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.", R.drawable.movies_poster_cold_persuit, "R"),
            MovieTv("mv6", "Creed II (2018)", "Drama", "2h 10m", "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.", R.drawable.movies_poster_creed, "PG-13"),
            MovieTv("mv7", "Fantastic Beasts: The Crimes of Grindelwald (2018)", "Adventure, Fantasy, Drama", "2h 14m", "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.", R.drawable.movies_poster_crimes, "PG-13"),
            MovieTv("mv8", "Glass (2019)", "Thriller, Drama, Science Fiction", "2h 9m", "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.", R.drawable.movies_poster_glass, "PG-13"),
            MovieTv("mv9", "How to Train Your Dragon: The Hidden World (2019)", "Animation, Family, Adventure", "1h 44m", "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.", R.drawable.movies_poster_how_to_train, "PG"),
            MovieTv("mv10", "Avengers: Infinity War (2018)", "Adventure, Action, Science Fiction", "2h 29m", "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.", R.drawable.movies_poster_infinity_war, "PG-13"),
            MovieTv("mv11", "Mary Queen of Scots (2018)", "Drama, History", "2h 4m", "In 1561, Mary Stuart, widow of the King of France, returns to Scotland, reclaims her rightful throne and menaces the future of Queen Elizabeth I as ruler of England, because she has a legitimate claim to the English throne. Betrayals, rebellions, conspiracies and their own life choices imperil both Queens. They experience the bitter cost of power, until their tragic fate is finally fulfilled.", R.drawable.movies_poster_marry_queen, "R"),
            MovieTv("mv12", "Master Z: Ip Man Legacy (2018)", "Action", "2h 5m", "Following his defeat by Master Ip, Cheung Tin Chi tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to expats. But it's not long before the mix of foreigners, money, and triad leaders draw him once again to the fight.", R.drawable.movies_poster_master_z, "PG-13"),
            MovieTv("mv13", "Mortal Engines (2018)", "Adventure, Science Fiction", "2h 9m", "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.", R.drawable.movies_poster_mortal_engines, "PG-13"),
            MovieTv("mv14", "Overlord (2018)", "Horror, War, Science Fiction", "1h 50m", "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.", R.drawable.movies_poster_overlord, "R"),
            MovieTv("mv15", "Ralph Breaks the Internet (2018)", "Family, Animation, Comedy, Adventure", "2h 5m", "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, Sugar Rush. In way over their heads, Ralph and Vanellope rely on the citizens of the internet — the netizens — to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube.", R.drawable.movies_poster_ralph, "PG"),
        )
    }

    fun getTvShows() : ArrayList<MovieTv>{
        return arrayListOf(
            MovieTv("tv1", "Arrow (2012)", "Crime, Drama, Mystery, Action & Adventure", "42m", "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.", R.drawable.tvshows_poster_arrow, "TV-14"),
            MovieTv("tv2", "Doom Patrol (2019)", "Sci-Fi & Fantasy, Comedy, Drama", "49m", "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.", R.drawable.tvshows_poster_doom_patrol, "TV-MA"),
            MovieTv("tv3", "Dragon Ball (1986)", "Animation, Action & Adventure, Sci-Fi & Fantasy", "25m", "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the mystical Dragon Balls brought her to Goku's home. Together, they set off to find all seven and to grant her wish.", R.drawable.tvshows_poster_dragon_ball, "TV-PG"),
            MovieTv("tv4", "Fairy Tail (2009)", "Action & Adventure, Animation, Comedy, Sci-Fi & Fantasy", "25m", "", R.drawable.tvshows_poster_fairytail, "TV-14"),
            MovieTv("tv5", "Family Guy (1999)", "Animation, Comedy", "22m", "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.", R.drawable.tvshows_poster_family_guy, "TV-14"),
            MovieTv("tv6", "The Flash (1990)", "Action & Adventure, Crime, Drama, Sci-Fi & Fantasy", "45m", "When a bolt of lightening crashes through a police crime lab, a mix of electrically charged substances bathes chemist Barry Allen, transforming him into the fastest man alive--The Flash.", R.drawable.tvshows_poster_flash, "TV-PG"),
            MovieTv("tv7", "Game of Thrones (2011)", "Sci-Fi & Fantasy, Drama, Action & Adventure", "1h", "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.", R.drawable.tvshows_poster_god, "TV-MA"),
            MovieTv("tv8", "Gotham (2014)", "Drama, Crime, Sci-Fi & Fantasy", "43m", "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?", R.drawable.tvshows_poster_gotham, "TV-14"),
            MovieTv("tv9", "Grey's Anatomy (2005)", "Drama", "43m", "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.", R.drawable.tvshows_poster_grey_anatomy, "TV-14"),
            MovieTv("tv10", "Hanna (2019)", "Action & Adventure, Drama", "2h 5m", "", R.drawable.tvshows_poster_hanna, "TV-MA"),
            MovieTv("tv11", "Marvel's Iron Fist (2017)", "Action & Adventure, Drama, Sci-Fi & Fantasy", "555m", "Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny.", R.drawable.tvshows_poster_iron_fist, "TV-MA"),
            MovieTv("tv12", "Naruto Shippūden (2007)", "Animation, Action & Adventure, Sci-Fi & Fantasy", "2h 5m", "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.", R.drawable.tvshows_poster_naruto_shipudden, "TV-14"),
            MovieTv("tv13", "NCIS (2003)", "Crime, Action & Adventure, Drama", "2h 5m", "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.", R.drawable.tvshows_poster_ncis, "TV-14"),
            MovieTv("tv14", "Riverdale (2017)", "Mystery, Drama, Crime", "2h 5m", "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.", R.drawable.tvshows_poster_riverdale, "TV-14"),
            MovieTv("tv15", "The Simpsons (1989)", "Family, Animation, Comedy", "2h 5m", "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.", R.drawable.tvshows_poster_the_simpson, "TV-PG")
        )
    }
}