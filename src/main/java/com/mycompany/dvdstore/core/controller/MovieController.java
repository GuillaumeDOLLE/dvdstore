package com.mycompany.dvdstore.core.controller;

import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class MovieController {

    @Autowired
    private MovieServiceInterface movieService;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    public void addUsingConsole() {
        System.out.println("Type the title of the movie :");
        Scanner sc = new Scanner(System.in);
        String movieTitle = sc.nextLine();
        System.out.println("Type the genre of the movie :");
        String movieGenre = sc.nextLine();

        Movie movie = new Movie();
        movie.setTitle(movieTitle);
        movie.setGenre(movieGenre);

        movieService.registerMovie(movie);
    }

}
