/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChallengeSofka;

import Controller.ControlPanel;
import model.Player;
import model.QueryPlayer;
import model.QueryQuestion;
import model.Question;
import view.View;

/**
 *
 * @author FELIPE RIVAS
 */
public class challenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Question qu=new Question();
        Player player=new Player();
        QueryQuestion qQuestion=new QueryQuestion();
        QueryPlayer qPlayer=new QueryPlayer();
        View frm=new View();
        
        ControlPanel controlPanel=new ControlPanel(qu,player,qQuestion,qPlayer,frm);
        controlPanel.init();
        frm.setVisible(true);
        
       
     
        
    }
    
}
