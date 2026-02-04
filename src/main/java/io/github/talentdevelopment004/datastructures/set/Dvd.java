package io.github.talentdevelopment004.datastructures.set;

public class Dvd {

    public Dvd(String song) {
        this.song = song;
    }

    private String song;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((song == null) ? 0 : song.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dvd other = (Dvd) obj;
        if (song == null) {
            if (other.song != null)
                return false;
        } else if (!song.equals(other.song))
            return false;
        return true;
    }

}
