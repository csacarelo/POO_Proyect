/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_v1.pkg0;

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
    
    
    public PaneOrganizer(){
        
         _root = new Pane();
        _bu = new Pane();
        _white = new Pane();
        _black = new Pane();
        _pira = new Pane();
        
        Buceador b = new Buceador();
        sharkWhite w = new sharkWhite();
        sharkBlack k = new sharkBlack();
        piranha p = new piranha();
        
        _bu.getChildren().add(b.getBu());
        _white.getChildren().add(w.getIm());
        _black.getChildren().add(k.getIm());
        _pira.getChildren().add(p.getIm());
       _root.getChildren().addAll(_bu,_white,_black,_pira);
}

    public Pane getRoot() {
        return _root;
    }

    public void setRoot(Pane _root) {
        this._root = _root;
    }
    
    
}