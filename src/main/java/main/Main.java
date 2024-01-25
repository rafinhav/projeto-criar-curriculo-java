package main;

import controller.CurriculoController;
import view.ConsoleCurriculoView;
import view.CurriculoView;

public class Main {
    public static void main(String[] args) {
        CurriculoView curriculoView = new ConsoleCurriculoView();
        CurriculoController curriculoController = new CurriculoController(curriculoView);

        curriculoController.criarCurriculo();
    }
}