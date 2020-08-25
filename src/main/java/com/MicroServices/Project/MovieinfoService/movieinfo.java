package com.MicroServices.Project.MovieinfoService;



import com.MicroServices.Project.Movieinfo.MOVIES.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
 class MovieResource {

    @RequestMapping("/{movieID}")
    public Movie getMovieInfo(@PathVariable("moviesID") String movieID){
        return new Movie("movieID","tin-tin");

    }
}



