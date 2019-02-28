package com.player.service;

import com.player.db.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class InitDataService {

    private @Autowired
    SimpleDateFormat dateFormat;

    private Long idGenerateCount = 1L;

    private List<Team> teams;
    private List<Nationality> nationalities;
    private List<Player> players;
    private List<License> licenses;

    @PostConstruct
    private List<Team> createTeams() {
        teams = new ArrayList<Team>() {{
            add(new Team().setName("Fenerbahçe").setColor1("Navy Blue").setColor2("Yellow"));
            add(new Team().setName("Galatasaray").setColor1("Red").setColor2("Yellow"));
            add(new Team().setName("Beşiktaş").setColor1("Black").setColor2("White"));
            add(new Team().setName("Erzurumspor").setColor1("Blue").setColor2("White"));
            add(new Team().setName("Trabzonspor").setColor1("Blue").setColor2("Claret Red"));
        }};
        teams.forEach(e -> e.setId(getIdGenerateCount()));
        return teams;
    }


    @PostConstruct
    private List<Nationality> creatNationality() {
        nationalities = new ArrayList<Nationality>() {{
            add(new Nationality().setNational("Turkey"));
            add(new Nationality().setNational("England"));
            add(new Nationality().setNational("France"));
            add(new Nationality().setNational("Brazil"));
            add(new Nationality().setNational("Argentina"));
            add(new Nationality().setNational("Portugal"));
        }};
        nationalities.forEach(e -> e.setId(getIdGenerateCount()));
        return nationalities;
    }


    @PostConstruct
    private List<Player> createPlayers() {
        try {
            licenses = new ArrayList<License>() {{
                add(new License().setTeam(teams.get(0)).setStartDate(dateFormat.parse("01.09.2015")).setEndDate(dateFormat.parse("15.04.2019")));
                add(new License().setTeam(teams.get(0)).setStartDate(dateFormat.parse("08.01.2016")).setEndDate(dateFormat.parse("15.04.2018")));
                add(new License().setTeam(teams.get(4)).setStartDate(dateFormat.parse("03.02.2014")).setEndDate(dateFormat.parse("15.04.2016")));
                add(new License().setTeam(teams.get(1)).setStartDate(dateFormat.parse("08.04.2013")).setEndDate(dateFormat.parse("15.04.2018")));
                add(new License().setTeam(teams.get(2)).setStartDate(dateFormat.parse("04.08.2012")).setEndDate(dateFormat.parse("15.04.2016")));
                add(new License().setTeam(teams.get(3)).setStartDate(dateFormat.parse("04.08.2013")).setEndDate(dateFormat.parse("15.04.2019")));
            }};
            licenses.forEach(e -> e.setId(getIdGenerateCount()));

            players = new ArrayList<Player>() {{
                add(createPlayer("Alper", "POTUK", "01.01.1991", licenses.get(0), createManager("managername1", "managerLastname1", nationalities.get(0)), nationalities.get(0)));
                add(createPlayer("David", "BACKHAM", "01.01.1992", licenses.get(1), createManager("managername2", "managerLastname2", nationalities.get(1)), nationalities.get(1)));
                add(createPlayer("Zinedir", "ZIDANE", "01.01.1993", licenses.get(2), createManager("managername3", "managerLastname3", nationalities.get(2)), nationalities.get(2)));
                add(createPlayer("Lionel", "MESSI", "01.01.1988", licenses.get(3), createManager("managername4", "managerLastname4", nationalities.get(4)), nationalities.get(4)));
                add(createPlayer("Christiano", "RONALDO", "01.01.1987", licenses.get(4), createManager("managername5", "managerLastname5", nationalities.get(5)), nationalities.get(5)));
                add(createPlayer("De Sauza", "ALEX", "01.01.1986", licenses.get(5), createManager("managername6", "managerLastname6", nationalities.get(3)), nationalities.get(3)));
            }};
            players.get(0).getOldTeams().add(teams.get(1));
            players.get(0).getOldTeams().add(teams.get(2));
            players.get(1).getOldTeams().add(teams.get(0));
            players.get(1).getOldTeams().add(teams.get(2));
            players.get(2).getOldTeams().add(teams.get(3));
            players.get(2).getOldTeams().add(teams.get(4));
            players.forEach(e -> e.setId(getIdGenerateCount()));
            return players;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    private Player createPlayer(String name, String lastname, String date, License license, Manager manager, Nationality nationality) {
        try {
            Player player = new Player().setManager(manager).setLicense(license).setNationality(nationality);
            player.setName(name);
            player.setLastname(lastname);
            player.setBirthDate(dateFormat.parse(date));
            player.setId(getIdGenerateCount());
            return player;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    private Manager createManager(String name, String lastname, Nationality nationality) {
        Manager manager = new Manager();
        manager.setName(name);
        manager.setLastname(lastname);
        manager.setBirthDate(new Date());
        manager.setNationality(nationality);
        manager.setId(getIdGenerateCount());
        return manager;
    }

    private String getIdGenerateCount() {
        return (idGenerateCount++) + "";
    }


}
