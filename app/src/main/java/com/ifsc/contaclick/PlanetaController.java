package com.ifsc.contaclick;

import java.util.ArrayList;

public class PlanetaController {
    PlanetaDAO planetaDAO;

    public PlanetaController(){
        planetaDAO = new PlanetaDAO();
    }

    public void addPlaneta(Planeta planeta){

    }

    public ArrayList<Planeta> getPlaneta(){
        return planetaDAO.getPlanetas();
    }
}
