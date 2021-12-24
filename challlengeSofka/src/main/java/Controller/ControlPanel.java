/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Player;
import model.QueryPlayer;
import model.QueryQuestion;
import model.Question;
import view.View;

/**
 *
 * @author FELIPE RIVAS
 */
public class ControlPanel implements ActionListener {

    private final Question qu;
    private final Player player;
    private final QueryPlayer qPlayer;
    private final QueryQuestion qQuestion;
    private final View frm;

    public ControlPanel(Question qu, Player player, QueryQuestion qQuestion, QueryPlayer qPlayer, View frm) {
        this.qQuestion = qQuestion;
        this.qPlayer = qPlayer;
        this.qu = qu;
        this.player = player;
        this.frm = frm;
        this.frm.btnInit.addActionListener(this);
        this.frm.btnLeave.addActionListener(this);
        this.frm.btnShowWinners.addActionListener(this);
        this.frm.textName.addActionListener(this);
        this.frm.btnAnswer1.addActionListener(this);
        this.frm.btnAnswer2.addActionListener(this);
        this.frm.btnAnswer3.addActionListener(this);
        this.frm.btnAnswer4.addActionListener(this);
        this.frm.txtPrize.addActionListener(this);
    }

    public void init() {
        frm.setTitle("preguntas y respuestas");
        frm.setLocationRelativeTo(null);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == frm.btnInit) {
            player.setName(frm.textName.getText());
            if (qPlayer.register(player)) {
                JOptionPane.showMessageDialog(null, "Bienvenido " + player.getName());
            } else {
                JOptionPane.showMessageDialog(null, "Error al intentar registrar el jugador");
            }
            if (qQuestion.findQuestion(qu.getLevel(), qu)) {
                frm.labelQuestion.setText(qu.getQuestion());
                frm.btnAnswer1.setText(qu.getAnswer1());
                frm.btnAnswer2.setText(qu.getAnswer2());
                frm.btnAnswer3.setText(qu.getAnswer3());
                frm.btnAnswer4.setText(qu.getAnswer4());
                frm.txtLevel.setText(String.valueOf(qu.getLevel()));
            } else {
                JOptionPane.showMessageDialog(null, "Error al intentar cargar las preguntas");
            }
        }
        
        
        if (e.getSource() == frm.btnShowWinners) {
            DefaultTableModel model=new DefaultTableModel();
            frm.jtWinners.setModel(model);
             ArrayList<Player> winners=new  ArrayList<>();
             winners=qPlayer.findPlayers();
           
           model.addColumn("Id");
           model.addColumn("Nombre");
           model.addColumn("Categoria");
           model.addColumn("Premio");
           
           for(int i=0;i<winners.size();i++){
               Object[] winner=new Object[4];
               winner[0]=winners.get(i).getId();
               winner[1]=winners.get(i).getName();
               winner[2]=winners.get(i).getLevel();
               winner[3]=winners.get(i).prize();
               model.addRow(winner);
           }
        }
        
        
        if(e.getSource()==frm.btnLeave){
            if(player.getLevel()<1){
            qPlayer.delete(player);
            }
            reset();
            JOptionPane.showMessageDialog(null, "Gracias por jugar");
        }
        
        
        if (e.getSource() == frm.btnAnswer1) {
            selectAnswer(frm.btnAnswer1);

        }
        if (e.getSource() == frm.btnAnswer2) {
            selectAnswer(frm.btnAnswer2);

        }
        if (e.getSource() == frm.btnAnswer3) {
            selectAnswer(frm.btnAnswer3);

        }
        if (e.getSource() == frm.btnAnswer4) {
            selectAnswer(frm.btnAnswer4);

        }

    }
    public void reset(){ //Reset game
                qu.setAnswer1(" ");
                qu.setAnswer2(" ");
                qu.setAnswer3(" ");
                qu.setAnswer4(" ");
                qu.setLevel(1);
                qu.setQuestion(" ");
                qu.setRightAnswer(" ");
                player.setId(null);
                player.setLevel(0);
                player.setName(" ");
                
                frm.labelQuestion.setText(qu.getQuestion());
                frm.btnAnswer1.setText(qu.getAnswer1());
                frm.btnAnswer2.setText(qu.getAnswer2());
                frm.btnAnswer3.setText(qu.getAnswer3());
                frm.btnAnswer4.setText(qu.getAnswer4());
                frm.txtLevel.setText(String.valueOf(qu.getLevel()));
                frm.textName.setText(" ");
                frm.txtPrize.setText(" ");
    
    }

    public void selectAnswer(javax.swing.JButton button) {//Actions when one of the answer is selected

        if (qu.getRightAnswer().equals(button.getText())) {//Check if the answer selected was the correct one
            player.setLevel(player.getLevel()+1);
            if (!qPlayer.update(player)) {
                JOptionPane.showMessageDialog(null, "Error al intentar actualizar el nivel del jugador");
            }
            
            if (qu.getLevel()>4){
                JOptionPane.showMessageDialog(null, "Felicitaciones has alcanzado el maximo nivel");
                reset();
            }else{
            
            qu.setLevel(qu.getLevel() + 1);
            
            
                     
            if (qQuestion.findQuestion(qu.getLevel(), qu)) { //Pull the next question
                frm.labelQuestion.setText(qu.getQuestion());
                frm.btnAnswer1.setText(qu.getAnswer1());
                frm.btnAnswer2.setText(qu.getAnswer2());
                frm.btnAnswer3.setText(qu.getAnswer3());
                frm.btnAnswer4.setText(qu.getAnswer4());
                frm.txtLevel.setText(String.valueOf(qu.getLevel()));
                frm.txtPrize.setText(String.valueOf(player.prize()));
            } else {
                JOptionPane.showMessageDialog(null, "Error al intentar cargar las preguntas");
            }
            
            }

        } else {
            qPlayer.delete(player);
            reset();
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta. Lo sentimos, ha perdido");
        }

    }

}
