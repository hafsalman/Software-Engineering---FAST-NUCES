//Hafsa Salman
//22K-5161
//Question no. 05

import java.util.ArrayList;
import java.util.List;

public class Question_05
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("22K-5161");
        System.out.println("Question no. 05");
        System.out.println();

        Artist A_1 = new Artist("Taylor Swift");
        Artist A_2 = new Artist("Selena Gomez");

        Songs S_1 = new Songs("Cardigan");
        S_1.add_artists(A_1);
        S_1.add_artists(A_2);

        Songs S_2 = new Songs("Wolves");
        S_2.add_artists(A_2);

        Songs S_3 = new Songs("Willow");
        S_3.add_artists(A_1);

        Songs S_4 = new Songs("Invisible Strings");
        S_4.add_artists(A_1);

        Album Al_1 = new Album("Folklore");
        Al_1.Add_songs(S_1);
        Al_1.Add_songs(S_4);

        Album Al_2 = new Album("Rare");
        Al_2.Add_songs(S_1);
        Al_2.Add_songs(S_2);

        Album Al_3 = new Album("Evermore");
        Al_3.Add_songs(S_3);

        System.out.println("Album 01: " + Al_1.getTitle());
        System.out.println("Songs: ");
        List<Songs> sAl_1 = Al_1.getSong();
        for(int i=0; i<sAl_1.size(); i++)
        {
            Songs songs = sAl_1.get(i);
            System.out.println("Song " + (i+1) + ": " + songs.getS_title());

            List<Artist> art = songs.getArtists();
            for (int j=0; j<art.size(); j++)
            {
                Artist artist = art.get(j);
                System.out.println("Artist: " + artist.getName());
            }
        }

        System.out.println();

        System.out.println("Album 02: " + Al_2.getTitle());
        System.out.println("Songs: ");
        List<Songs> sAl_2 = Al_2.getSong();
        for(int i=0; i<sAl_2.size(); i++)
        {
            Songs songs = sAl_2.get(i);
            System.out.println("Song " + (i+1) + ": " + songs.getS_title());

            List<Artist> art = songs.getArtists();
            for (int j=0; j<art.size(); j++)
            {
                Artist artist = art.get(j);
                System.out.println("Artist: " + artist.getName());
            }
        }

        System.out.println();

        System.out.println("Album 03: " + Al_3.getTitle());
        System.out.println("Songs: ");
        List<Songs> sAl_3 = Al_3.getSong();
        for(int i=0; i<sAl_3.size(); i++)
        {
            Songs songs = sAl_3.get(i);
            System.out.println("Song " + (i+1) + ": " + songs.getS_title());

            List<Artist> art = songs.getArtists();
            for (int j=0; j<art.size(); j++)
            {
                Artist artist = art.get(j);
                System.out.println("Artist: " + artist.getName());
            }
        }
    }
}

class Artist
{
    private String name;

    public String getName()
    {
        return name;
    }

    public Artist(String name)
    {
        this.name = name;
    }
}

class Album
{
    private String title;
    private List<Songs> song;

    public String getTitle()
    {
        return title;
    }

    public List<Songs> getSong()
    {
        return song;
    }

    public Album (String title)
    {
        this.title = title;
        this.song = new ArrayList<>();
    }

    public void Add_songs(Songs songs)
    {
        song.add(songs);
    }
}

class Songs
{
    private String s_title;
    private List<Artist> artists;

    public String getS_title()
    {
        return s_title;
    }

    public List<Artist> getArtists()
    {
        return artists;
    }

    public Songs(String s_title)
    {
        this.s_title = s_title;
        this.artists = new ArrayList<>();
    }

    public void add_artists(Artist artist)
    {
        artists.add(artist);
    }
}