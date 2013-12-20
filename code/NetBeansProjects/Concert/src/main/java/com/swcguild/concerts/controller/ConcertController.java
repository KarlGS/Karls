/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.concerts.controller;

import com.   swcguild.concerts.dao.ConcertDao;
import com.swcguild.concerts.model.Artist;
import com.swcguild.concerts.model.Event;
import com.swcguild.concerts.model.Venue;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author apprentice
 */
@Controller
public class ConcertController {

    private ConcertDao dao;

    @Inject
    public ConcertController(ConcertDao dao) {
        this.dao = dao;
    }
    
    @RequestMapping(value="/eventSelection", method=RequestMethod.GET)
    public String displayEvents(Map<String,Object> model){
        List<Event> cArray = dao.getAllEvents();
        model.put("eventList", cArray);
        return "displayEvents";
    }
    
    @RequestMapping(value="/venueSelection", method=RequestMethod.GET)
    public String displayVenue(Map<String, Object> model){
        List<Venue> cArray = dao.getAllVenues();
        model.put("venueList", cArray);
        return "displayVenues";
    }
    
    @RequestMapping(value="/artistSelection", method=RequestMethod.GET)
    public String displayArtist(Map<String, Object>model){
        List<Artist> cArray = dao.getAllArtists();
        model.put("artistList", cArray);
        return "displayArtists";
    }
    
//    @RequestMapping(value="/addArtist", method=RequestMethod.POST)
//    public String addArtist(Map<String, Object> model, HttpServletRequest req, HttpServletResponse res){
//        String name = req.getParameter("artistName");
//        String genre = req.getParameter("artistGenre");  
//    }
    
}
    
//    @RequestMapping(value="/addNewConcertForm", metho
//}
