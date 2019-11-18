package com.sparta;

import com.sparta.mjn.services.FilmService;
import org.eclipse.persistence.internal.databaseaccess.DatabaseAccessor;
import org.eclipse.persistence.jpa.jpql.Assert;
import org.junit.Before;
import org.junit.Test;

public class FilmTest {

//    @Before
//    public void setup() {
//        DatabaseAccessor databaseAccessor = new DatabaseAccessor();
//        boolean connected = databaseAccessor.isDatasourceConnected();
//        Assert.isTrue(connected, "True");
//
//    }

    @Test
    public void testFilmList(){
        FilmService filmService = new FilmService();
        Assert.isNotNull(filmService.getFilmList(), "Fine");
    }


}
