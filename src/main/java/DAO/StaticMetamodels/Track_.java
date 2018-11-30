package DAO.StaticMetamodels;

import DAO.Track;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Track.class)
public class Track_ {
    public static volatile SingularAttribute<Track, Long> id;
    public static volatile SingularAttribute<Track, String> title;
    public static volatile SingularAttribute<Track, Long> author;
    public static volatile SingularAttribute<Track, Integer> creationDate;
    public static volatile SingularAttribute<Track, Long> album;

}