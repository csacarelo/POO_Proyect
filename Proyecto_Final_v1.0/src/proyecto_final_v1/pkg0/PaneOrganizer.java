/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_v1.pkg0;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**
 *
 * @author gabri
 */
public class PaneOrganizer {
   private Pane _root;
    private Pane _bu;
    private Pane _white;
    private Pane _black;
    private Pane _pira;
    private Pane _im;
    
    private ImageView _fond;
    private ImageView im;
    
    public PaneOrganizer(){
        
        _root = new Pane();
        _bu = new Pane();
        _white = new Pane();
        _black = new Pane();
        _pira = new Pane();
        _im = new Pane();
        
        Image image = new Image("file:oce.png");
        im = new ImageView();
        im.setImage(image);
        im.setFitWidth(1000);
        im.setFitHeight(800);
        
        
        Buceador b = new Buceador();
        sharkWhite w = new sharkWhite();
        sharkBlack k = new sharkBlack();
        piranha p = new piranha();
        
        _bu.getChildren().add(b.getBu());
        _white.getChildren().addAll(w.getIm(),w.getIm2(),w.getWord());
        _black.getChildren().addAll(k.getIm(),k.getIm2(),k.getWord());
        _pira.getChildren().addAll(p.getIm(),p.getIm2(),p.getWord());
        
        _im.getChildren().add(im);
       _root.getChildren().addAll(_im,_bu,_white,_black,_pira);
}

    public Pane getRoot() {
        return _root;
    }

    public void setRoot(Pane _root) {
        this._root = _root;
    }
    
    
}