package DAO;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Author {


    public String getAlias() {
        return Alias;
    }

    public void setAlias(String alias) {
        Alias = alias;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }

    public String getPlaceBirth() {
        return PlaceBirth;
    }

    public void setPlaceBirth(String placeBirth) {
        PlaceBirth = placeBirth;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    private String FIO;
    private Date BirthDate;
    private String PlaceBirth;
    private String Genre;
    private String Alias;
    private long id;
}