package simplechat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;
import static simplechat.ClientConsole.DEFAULT_PORT;
/**
 *
 * @author scherr3143
 */
public class GUIClientConsole extends JFrame implements ChatIF {
    
    public Trouble tr = new Trouble();
    
    private JButton closeB = new JButton("Logout");
    private JButton openB = new JButton("Login");
    private JButton sendB = new JButton("Send Message");
    private JButton quitB = new JButton("Quit Application");
    private JButton endTurn = new JButton("End Turn");
    private JButton pop_O_Matic_Bubble = new JButton("P O P");
    private JButton playTroubleB = new JButton("Play Trouble");
    
    private JButton board0 = new JButton("-");
    private JButton board1 = new JButton("-");
    private JButton board2 = new JButton("-");
    private JButton board3 = new JButton("-");
    private JButton board4 = new JButton("-");
    private JButton board5 = new JButton("-");
    private JButton board6 = new JButton("-");
    private JButton board7 = new JButton("-");
    private JButton board8 = new JButton("-");
    private JButton board9 = new JButton("-");
    private JButton board10 = new JButton("-");
    private JButton board11 = new JButton("-");
    private JButton board12 = new JButton("-");
    private JButton board13 = new JButton("-");
    private JButton board14 = new JButton("-");
    private JButton board15 = new JButton("-");
    private JButton board16 = new JButton("-");
    private JButton board17 = new JButton("-");
    private JButton board18 = new JButton("-");
    private JButton board19 = new JButton("-");
    private JButton board20 = new JButton("-");
    private JButton board21 = new JButton("-");
    private JButton board22 = new JButton("-");
    private JButton board23 = new JButton("-");
    private JButton board24 = new JButton("-");
    private JButton board25 = new JButton("-");
    private JButton board26 = new JButton("-");
    private JButton board27 = new JButton("-");
    
    private JButton theFullMetalBoard[];
    
    private JTextField portTxF = new JTextField("5555");
    private JTextField hostTxF = new JTextField("127.0.0.1");
    private JTextField messageTxF = new JTextField("");
    private JTextField userNameTxF = new JTextField("");
	
    private JLabel portLB = new JLabel("", JLabel.RIGHT);
    private JLabel hostLB = new JLabel("", JLabel.RIGHT);
    private JLabel messageLB = new JLabel("Message: ", JLabel.RIGHT);
    private JLabel userNameLB = new JLabel("User Name: ", JLabel.RIGHT);
    private JLabel blank1LB = new JLabel("", JLabel.RIGHT);
    private JLabel blank2LB = new JLabel("", JLabel.RIGHT);
    private JLabel blank3LB = new JLabel("", JLabel.RIGHT);
    private JLabel blank4LB = new JLabel("", JLabel.RIGHT);
    private JLabel blank5LB = new JLabel("", JLabel.RIGHT);
    private JLabel blank6LB = new JLabel("", JLabel.RIGHT);
    private JLabel blank7LB = new JLabel("", JLabel.RIGHT);
    private JLabel blank8LB = new JLabel("", JLabel.RIGHT);
    private JLabel blank9LB = new JLabel("", JLabel.RIGHT);
    private JLabel blank10LB = new JLabel("", JLabel.RIGHT);
    
    private JButton startRed1 = new JButton("R");
    private JButton startRed2 = new JButton("R");
    private JButton startRed3 = new JButton("R");
    private JButton startRed4 = new JButton("R");
    private JButton homeRed1 = new JButton("H");
    private JButton homeRed2 = new JButton("O");
    private JButton homeRed3 = new JButton("M");
    private JButton homeRed4 = new JButton("E");
    
    private JButton startYellow1 = new JButton("Y");
    private JButton startYellow2 = new JButton("Y");
    private JButton startYellow3 = new JButton("Y");
    private JButton startYellow4 = new JButton("Y");
    private JButton homeYellow1 = new JButton("H");
    private JButton homeYellow2 = new JButton("O");
    private JButton homeYellow3 = new JButton("M");
    private JButton homeYellow4 = new JButton("E");
    
    private JButton startBlue1 = new JButton("B");
    private JButton startBlue2 = new JButton("B");
    private JButton startBlue3 = new JButton("B");
    private JButton startBlue4 = new JButton("B");
    private JButton homeBlue1 = new JButton("H");
    private JButton homeBlue2 = new JButton("O");
    private JButton homeBlue3 = new JButton("M");
    private JButton homeBlue4 = new JButton("E");
    
    private JButton startGreen1 = new JButton("G");
    private JButton startGreen2 = new JButton("G");
    private JButton startGreen3 = new JButton("G");
    private JButton startGreen4 = new JButton("G");
    private JButton homeGreen1 = new JButton("H");
    private JButton homeGreen2 = new JButton("O");
    private JButton homeGreen3 = new JButton("M");
    private JButton homeGreen4 = new JButton("E");
    
    private JLabel outsideBoard1 = new JLabel("");
    private JLabel outsideBoard2 = new JLabel("");
    private JLabel outsideBoard3 = new JLabel("");
    private JLabel outsideBoard4 = new JLabel("");
    private JLabel outsideBoard5 = new JLabel("");
    private JLabel outsideBoard6 = new JLabel("");
    private JLabel outsideBoard7 = new JLabel("");
    private JLabel outsideBoard8 = new JLabel("");
    private JLabel outsideBoard9 = new JLabel("");
    private JLabel outsideBoard10 = new JLabel("");
    private JLabel outsideBoard11 = new JLabel("");
    private JLabel outsideBoard12 = new JLabel("");
    private JLabel outsideBoard13 = new JLabel("");
    private JLabel outsideBoard14 = new JLabel("");
    private JLabel outsideBoard15 = new JLabel("");
    private JLabel outsideBoard16 = new JLabel("");
    private JLabel outsideBoard17 = new JLabel("");
    private JLabel outsideBoard18 = new JLabel("");
    private JLabel outsideBoard19 = new JLabel("");
    private JLabel outsideBoard20 = new JLabel("");
    
    private JLabel insideBoard1 = new JLabel("");
    private JLabel insideBoard2 = new JLabel("");
    private JLabel insideBoard3 = new JLabel("");
    private JLabel insideBoard4 = new JLabel("");
    private JLabel insideBoard5 = new JLabel("");
    private JLabel insideBoard6 = new JLabel("");
    private JLabel insideBoard7 = new JLabel("");
    private JLabel insideBoard8 = new JLabel("");
    private JLabel insideBoard9 = new JLabel("");
    private JLabel insideBoard10 = new JLabel("");
    private JLabel insideBoard11 = new JLabel("");
    private JLabel insideBoard12 = new JLabel("");
    private JLabel insideBoard13 = new JLabel("");
    private JLabel insideBoard14 = new JLabel("");
    private JLabel insideBoard15 = new JLabel("");
    private JLabel insideBoard16 = new JLabel("");
    
    private JTextArea messageList = new JTextArea(10,15);
    
    private String host;
    private int port;
    private String userName;
    ChatClient client;
    
    public GUIClientConsole(String host,int port,String userName){
        
        super("You're In Trouble!!");
        setSize(900, 800);
		
	setLayout(new BorderLayout(5,5));
	Panel bottom = new Panel();
        Panel playArea = new Panel();
        
	theFullMetalBoard = new JButton[] {board0,board1,board2,board3,board4,board5,board6,board7,board8,board9,
            board10,board11,board12,board13,board14,board15,board16,board17,board18,board19,board20,board21,
            board22,board23,board24,board25,board26,board27,startRed1,startRed2,startRed3,startRed4,startBlue1,
            startBlue2,startBlue3,startBlue4,startYellow1,startYellow2,startYellow3,startYellow4,startGreen1,
            startGreen2,startGreen3,startGreen4,homeRed1,homeRed2,homeRed3,homeRed4,homeBlue1,homeBlue2,
            homeBlue3,homeBlue4,homeYellow1,homeYellow2,homeYellow3,homeYellow4,homeGreen1,homeGreen2,
            homeGreen3,homeGreen4};
        
        //playArea.setLayout(new GridLayout(10,10,5,5));
        playArea.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.ipadx = 25;
        c.ipady = 25;
        
        startYellow1.setBackground(Color.yellow);
        startYellow2.setBackground(Color.yellow);
        startYellow3.setBackground(Color.yellow);
        startYellow4.setBackground(Color.yellow);
        homeYellow1.setBackground(Color.white);
        homeYellow2.setBackground(Color.white);
        homeYellow3.setBackground(Color.white);
        homeYellow4.setBackground(Color.white);
        
        startRed1.setBackground(Color.red);
        startRed2.setBackground(Color.red);
        startRed3.setBackground(Color.red);
        startRed4.setBackground(Color.red);
        homeRed1.setBackground(Color.white);
        homeRed2.setBackground(Color.white);
        homeRed3.setBackground(Color.white);
        homeRed4.setBackground(Color.white);
        
        startBlue1.setBackground(Color.blue);
        startBlue2.setBackground(Color.blue);
        startBlue3.setBackground(Color.blue);
        startBlue4.setBackground(Color.blue);
        homeBlue1.setBackground(Color.white);
        homeBlue2.setBackground(Color.white);
        homeBlue3.setBackground(Color.white);
        homeBlue4.setBackground(Color.white);
        
        startGreen1.setBackground(Color.green);
        startGreen2.setBackground(Color.green);
        startGreen3.setBackground(Color.green);
        startGreen4.setBackground(Color.green);
        homeGreen1.setBackground(Color.white);
        homeGreen2.setBackground(Color.white);
        homeGreen3.setBackground(Color.white);
        homeGreen4.setBackground(Color.white);
        
        board0.setBackground(Color.gray);
        board1.setBackground(Color.gray);
        board2.setBackground(Color.gray);
        board3.setBackground(Color.gray);
        board4.setBackground(Color.gray);
        board5.setBackground(Color.gray);
        board6.setBackground(Color.gray);
        board7.setBackground(Color.gray);
        board8.setBackground(Color.gray);
        board9.setBackground(Color.gray);
        board10.setBackground(Color.gray);
        board11.setBackground(Color.gray);
        board12.setBackground(Color.gray);
        board13.setBackground(Color.gray);
        board14.setBackground(Color.gray);
        board15.setBackground(Color.gray);
        board16.setBackground(Color.gray);
        board17.setBackground(Color.gray);
        board18.setBackground(Color.gray);
        board19.setBackground(Color.gray);
        board20.setBackground(Color.gray);
        board21.setBackground(Color.gray);
        board22.setBackground(Color.gray);
        board23.setBackground(Color.gray);
        board24.setBackground(Color.gray);
        board25.setBackground(Color.gray);
        board26.setBackground(Color.gray);
        board27.setBackground(Color.gray);
        
        c.gridx = 0;
        c.gridy = 0;
        playArea.add(outsideBoard1,c);
        c.gridx = 1;
        playArea.add(outsideBoard2,c);
        c.gridx = 2;
        playArea.add(outsideBoard3,c);
        c.gridx = 3;
        playArea.add(outsideBoard4,c);
        c.gridx = 4;
        playArea.add(outsideBoard5,c);
        c.gridx = 5;
        playArea.add(startYellow1,c);
        startYellow1.setEnabled(false);
        c.gridx = 6;
        playArea.add(startYellow2,c);
        startYellow2.setEnabled(false);
        c.gridx = 7;
        playArea.add(startYellow3,c);
        startYellow3.setEnabled(false);
        c.gridx = 8;
        playArea.add(startYellow4,c);
        startYellow4.setEnabled(false);
        c.gridx = 9;
        playArea.add(outsideBoard6,c);
            c.gridx = 0;
            c.gridy = 1;
            playArea.add(startRed1,c);
            startRed1.setEnabled(false);
            c.gridx = 1;
            playArea.add(board0,c);
            board0.setEnabled(false);
            c.gridx = 2;
            playArea.add(board1,c);
            board1.setEnabled(false);
            c.gridx = 3;
            playArea.add(board2,c);
            board2.setEnabled(false);
            c.gridx = 4;
            playArea.add(board3,c);
            board3.setEnabled(false);
            c.gridx = 5;
            playArea.add(board4,c);
            board4.setEnabled(false);
            c.gridx = 6;
            playArea.add(board5,c);
            board5.setEnabled(false);
            c.gridx = 7;
            playArea.add(board6,c);
            board6.setEnabled(false);
            c.gridx = 8;
            playArea.add(board7,c);
            board7.setEnabled(false);
            c.gridx = 9;
            playArea.add(outsideBoard7,c);
                c.gridx = 0;
                c.gridy = 2;
                playArea.add(startRed2,c);
                startRed2.setEnabled(false);
                c.gridx = 1;
                playArea.add(board27,c);
                board27.setEnabled(false);
                c.gridx = 2;
                playArea.add(homeRed1,c);
                homeRed1.setEnabled(false);
                c.gridx = 3;
                playArea.add(insideBoard1,c);
                c.gridx = 4;
                playArea.add(homeYellow1,c);
                homeYellow1.setEnabled(false);
                c.gridx = 5;
                playArea.add(homeYellow2,c);
                homeYellow2.setEnabled(false);
                c.gridx = 6;
                playArea.add(homeYellow3,c);
                homeYellow3.setEnabled(false);
                c.gridx = 7;
                playArea.add(homeYellow4,c);
                homeYellow4.setEnabled(false);
                c.gridx = 8;
                playArea.add(board8,c);
                board8.setEnabled(false);
                c.gridx = 9;
                playArea.add(outsideBoard8,c);
                    c.gridx = 0;
                    c.gridy = 3;
                    playArea.add(startRed3,c);
                    startRed3.setEnabled(false);
                    c.gridx = 1;
                    playArea.add(board26,c);
                    board26.setEnabled(false);
                    c.gridx = 2;
                    playArea.add(homeRed2,c);
                    homeRed2.setEnabled(false);
                    c.gridx = 3;
                    playArea.add(insideBoard2,c);
                    c.gridx = 4;
                    playArea.add(insideBoard3,c);
                    c.gridx = 5;
                    playArea.add(insideBoard4,c);
                    c.gridx = 6;
                    playArea.add(insideBoard5,c);
                    c.gridx = 7;
                    playArea.add(insideBoard6,c);
                    c.gridx = 8;
                    playArea.add(board9,c);
                    board9.setEnabled(false);
                    c.gridx = 9;
                    playArea.add(outsideBoard9,c);
                        c.gridx = 0;
                        c.gridy = 4;
                        playArea.add(startRed4,c);
                        startRed4.setEnabled(false);
                        c.gridx = 1;
                        playArea.add(board25,c);
                        board25.setEnabled(false);
                        c.gridx = 2;
                        playArea.add(homeRed3,c);
                        homeRed3.setEnabled(false);
                        c.gridx = 3;
                        playArea.add(insideBoard7,c);
                        c.gridx = 4;
                        c.gridwidth = 2;
                        c.gridheight = 2;
                        playArea.add(pop_O_Matic_Bubble,c);
                        pop_O_Matic_Bubble.setEnabled(false);
                        c.gridx = 6;
                        c.gridwidth = 1;
                        c.gridheight = 1;
                        playArea.add(insideBoard8,c);
                        c.gridx = 7;
                        playArea.add(homeBlue1,c);
                        homeBlue1.setEnabled(false);
                        c.gridx = 8;
                        playArea.add(board10,c);
                        board10.setEnabled(false);
                        c.gridx = 9;
                        playArea.add(outsideBoard10,c);
                            c.gridx = 0;
                            c.gridy = 5;
                            playArea.add(outsideBoard20,c);
                            c.gridx = 1;
                            playArea.add(board24,c);
                            board24.setEnabled(false);
                            c.gridx = 2;
                            playArea.add(homeRed4,c);
                            homeRed4.setEnabled(false);
                            c.gridx = 3;
                            playArea.add(insideBoard9,c);
                            c.gridx = 6;
                            playArea.add(insideBoard10,c);
                            c.gridx = 7;
                            playArea.add(homeBlue2,c);
                            homeBlue2.setEnabled(false);
                            c.gridx = 8;
                            playArea.add(board11,c);
                            board11.setEnabled(false);
                            c.gridx = 9;
                            playArea.add(startBlue1,c);
                            startBlue1.setEnabled(false);
                                c.gridx = 0;
                                c.gridy = 6;
                                playArea.add(outsideBoard19,c);
                                c.gridx = 1;
                                playArea.add(board23,c);
                                board23.setEnabled(false);
                                c.gridx = 2;
                                playArea.add(insideBoard11,c);
                                c.gridx = 3;
                                playArea.add(insideBoard12,c);
                                c.gridx = 4;
                                playArea.add(insideBoard13,c);
                                c.gridx = 5;
                                playArea.add(insideBoard14,c);
                                c.gridx = 6;
                                playArea.add(insideBoard15,c);
                                c.gridx = 7;
                                playArea.add(homeBlue3,c);
                                homeBlue3.setEnabled(false);
                                c.gridx = 8;
                                playArea.add(board12,c);
                                board12.setEnabled(false);
                                c.gridx = 9;
                                playArea.add(startBlue2,c);
                                startBlue2.setEnabled(false);
                                    c.gridx = 0;
                                    c.gridy = 7;
                                    playArea.add(outsideBoard18,c);
                                    c.gridx = 1;
                                    playArea.add(board22,c);
                                    board22.setEnabled(false);
                                    c.gridx = 2;
                                    playArea.add(homeGreen1,c);
                                    homeGreen1.setEnabled(false);
                                    c.gridx = 3;
                                    playArea.add(homeGreen2,c);
                                    homeGreen2.setEnabled(false);
                                    c.gridx = 4;
                                    playArea.add(homeGreen3,c);
                                    homeGreen3.setEnabled(false);
                                    c.gridx = 5;
                                    playArea.add(homeGreen4,c);
                                    homeGreen4.setEnabled(false);
                                    c.gridx = 6;
                                    playArea.add(insideBoard16,c);
                                    c.gridx = 7;
                                    playArea.add(homeBlue4,c);
                                    homeBlue4.setEnabled(false);
                                    c.gridx = 8;
                                    playArea.add(board13,c);
                                    board13.setEnabled(false);
                                    c.gridx = 9;
                                    playArea.add(startBlue3,c);
                                    startBlue3.setEnabled(false);
                                        c.gridx = 0;
                                        c.gridy = 8;
                                        playArea.add(outsideBoard17,c);
                                        c.gridx = 1;
                                        playArea.add(board21,c);
                                        board21.setEnabled(false);
                                        c.gridx = 2;
                                        playArea.add(board20,c);
                                        board20.setEnabled(false);
                                        c.gridx = 3;
                                        playArea.add(board19,c);
                                        board19.setEnabled(false);
                                        c.gridx = 4;
                                        playArea.add(board18,c);
                                        board18.setEnabled(false);
                                        c.gridx = 5;
                                        playArea.add(board17,c);
                                        board17.setEnabled(false);
                                        c.gridx = 6;
                                        playArea.add(board16,c);
                                        board16.setEnabled(false);
                                        c.gridx = 7;
                                        playArea.add(board15,c);
                                        board15.setEnabled(false);
                                        c.gridx = 8;
                                        playArea.add(board14,c);
                                        board14.setEnabled(false);
                                        c.gridx = 9;
                                        playArea.add(startBlue4,c);
                                        startBlue4.setEnabled(false);
                                            c.gridx = 0;
                                            c.gridy = 9;
                                            playArea.add(outsideBoard16,c);
                                            c.gridx = 1;
                                            playArea.add(startGreen1,c);
                                            startGreen1.setEnabled(false);
                                            c.gridx = 2;
                                            playArea.add(startGreen2,c);
                                            startGreen2.setEnabled(false);
                                            c.gridx = 3;
                                            playArea.add(startGreen3,c);
                                            startGreen3.setEnabled(false);
                                            c.gridx = 4;
                                            playArea.add(startGreen4,c);
                                            startGreen4.setEnabled(false);
                                            c.gridx = 5;
                                            playArea.add(outsideBoard15,c);
                                            c.gridx = 6;
                                            playArea.add(outsideBoard14,c);
                                            c.gridx = 7;
                                            playArea.add(outsideBoard13,c);
                                            c.gridx = 8;
                                            playArea.add(outsideBoard12,c);
                                            c.gridx = 9;
                                            playArea.add(outsideBoard11,c);
        
	bottom.setLayout(new GridLayout(8,3,5,5));
	
        bottom.add(blank1LB);
        bottom.add(userNameLB);
        bottom.add(userNameTxF);
        
        bottom.add(openB);
        bottom.add(messageLB);
        bottom.add(messageTxF);
        
        bottom.add(closeB);
        closeB.setEnabled(false);
        bottom.add(blank2LB);
        bottom.add(sendB);
        sendB.setEnabled(false);
        
        bottom.add(hostLB);
	bottom.add(portLB);
        bottom.add(blank3LB);
        
        bottom.add(blank4LB);
        bottom.add(blank5LB);
        bottom.add(endTurn);
        endTurn.setEnabled(false);
        
        bottom.add(blank6LB);
        bottom.add(blank7LB);
        bottom.add(playTroubleB);
        playTroubleB.setEnabled(false);
        
        bottom.add(hostTxF);
        bottom.add(blank8LB);
        bottom.add(blank9LB);
        
        bottom.add(portTxF);
        bottom.add(blank10LB);
        bottom.add(quitB);
        
        add( "East", messageList);
	add( "South" , bottom);
        add( "Center", playArea);
		  	 	
	setVisible(true);
        
        endTurn.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                send("#endTurn");
            }
        });
        playTroubleB.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                send("#sendTrouble " + messageTxF.getText());
            }
        });
        pop_O_Matic_Bubble.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                int roll = ThreadLocalRandom.current().nextInt(1,7);
                pop_O_Matic_Bubble.setText(String.valueOf(roll));
                send("#roll " + roll);
            }
        });
        startRed1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location -1");
            }
        });
        startRed2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location -1");
            }
        });
        startRed3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location -1");
            }
        });
        startRed4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location -1");   
            }
        });
        startYellow1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location -1");
            }
        });
        startYellow2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location -1");
            }
        });
        startYellow3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location -1");
            }
        });
        startYellow4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location -1");
            }
        });
        startBlue1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location -1");
            }
        });
        startBlue2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location -1");
            }
        });
        startBlue3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location -1");
            }
        });
        startBlue4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location -1");
            }
        });
        startGreen1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location -1");
            }
        });
        startGreen2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location -1");
            }
        });
        startGreen3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location -1");
            }
        });
        startGreen4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location -1");
            }
        });
        board0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location 0");
            }
        });
        board1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location 1");
            }
        });
        board2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location 2");
            }
        });
        board3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location 3");
            }
        });
        board4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location 4");
            }
        });
        board5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location 5");
            }
        });
        board6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location 6");
            }
        });
        board7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location 7");
            }
        });
        board8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location 8");
            }
        });
        board9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location 9");
            }
        });
        board10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location 10");
            }
        });
        board11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location 11");
            }
        });
        board12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location 12");
            }
        });
        board13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location 13");
            }
        });
        board14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location 14");
            }
        });
        board15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location 15");
            }
        });
        board16.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location 16");
            }
        });
        board17.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location 17");
            }
        });
        board18.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location 18");
            }
        });
        board19.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location 19");
            }
        });
        board20.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location 20");
            }
        });
        board21.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location 21");
            }
        });
        board22.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location 22");
            }
        });
        board23.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location 23");
            }
        });
        board24.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location 24");
            }
        });
        board25.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location 25");
            }
        });
        board26.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location 26");
            }
        });
        board27.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                send("#location 27");
            }
        });
        sendB.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
		send(messageTxF.getText());
            }
        });
        closeB.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
		close();
            }
        });
        openB.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                open();
            }
        });
        quitB.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                quit();
            }
        });
        //do setters
        this.host = host;
        this.port = port;
        this.userName = userName;
    }
    public void send(String message){
        client.handleMessageFromClientUI(message);
        messageTxF.setText("");
    }
    public void display(String message ){
        //if(messageList.getLineCount() != null){
            messageList.append(message+"\n");
        //}    
    }
    public void open(){
        userName = userNameTxF.getText();
            host = hostTxF.getText();
            port = Integer.parseInt(portTxF.getText());
            try{
                client = new ChatClient(host ,port, userName, this);
                closeB.setEnabled(true);
                sendB.setEnabled(true);
                openB.setEnabled(false);
                playTroubleB.setEnabled(true);
            }
            catch(IOException exception){
                System.out.println("Error: Can't setup connection!" + " Terminating client.");
                System.exit(1);
            }
    }
    public void close(){
        openB.setEnabled(true);
        closeB.setEnabled(false);
        sendB.setEnabled(false);
        userNameTxF.setText("");
        send("#logOff");
    }
    public void quit(){
        System.exit(0);
    }
    public void displayBoard(Trouble tr){
        resetAllFullBoard();
        //array indexing
        //Board button 0=0
        //Board button 27=27
        //Board = 0-27
        //Red Start = 28-31
        //Blue Start = 32-35
        //Yellow Start = 36-39
        //Green Start = 40-43
        //Red Home = 44-47
        //Blue Home = 48-51
        //Yellow Home = 52-55
        //Green Home = 56-59
        Color buttonCol = Color.white;
        int startGrid = 0;
        int homeGrid = 0;
        int piecePosition;
        for(int i=0;i<tr.numOfPlayers;i++){
            char col = tr.players[i].getColour();
            switch (col){
                    case 'R':
                        buttonCol = Color.red;
                        startGrid = 28;
                        homeGrid = 44;
                        break;
                    case 'B':
                        buttonCol = Color.blue;
                        startGrid = 32;
                        homeGrid = 48;
                        break;
                    case 'Y':
                        buttonCol = Color.yellow;
                        startGrid = 36;
                        homeGrid = 52;
                        break;
                    case 'G':
                        buttonCol = Color.green;
                        startGrid = 40;
                        homeGrid = 56;
                        break;
                }
            for(int j=0;j<tr.players[i].piece.length;j++){
                piecePosition = tr.players[i].piece[j].getPosition();
                if(piecePosition == -1){
                    theFullMetalBoard[startGrid].setBackground(buttonCol);
                    theFullMetalBoard[startGrid].setText(String.valueOf(col));
                    theFullMetalBoard[startGrid].setEnabled(true);
                    startGrid++;
                }
                else if(piecePosition == 28){
                    theFullMetalBoard[homeGrid].setBackground(buttonCol);
                    theFullMetalBoard[homeGrid].setText(String.valueOf(col));
                    theFullMetalBoard[homeGrid].setEnabled(true);
                    homeGrid++;
                }
                else{
                    theFullMetalBoard[piecePosition].setBackground(buttonCol);
                    theFullMetalBoard[piecePosition].setText(String.valueOf(col));
                    theFullMetalBoard[piecePosition].setEnabled(true);
                }
            }
        }
        pop_O_Matic_Bubble.setEnabled(true);
        endTurn.setEnabled(true);
    }
    
    public void resetAllFullBoard(){
        for(int i=0;i<theFullMetalBoard.length;i++){
            if(i>=0 && i<=27){
                //Board
                theFullMetalBoard[i].setBackground(Color.gray);
                theFullMetalBoard[i].setText("-");
            }
            else if(i>=28 && i<=59){
                theFullMetalBoard[i].setBackground(Color.white);
                //printStart
                switch (i){
                    case 28: case 32: case 36: case 40:
                        theFullMetalBoard[i].setText("ST");
                        break;
                    case 29: case 33: case 37: case 41:
                        theFullMetalBoard[i].setText("A");
                        break;
                    case 30: case 34: case 38: case 42:
                        theFullMetalBoard[i].setText("R");
                        break;
                    case 31: case 35: case 39: case 43:
                        theFullMetalBoard[i].setText("T");
                        break;
                    case 44: case 48: case 52: case 56:
                        theFullMetalBoard[i].setText("H");
                        break;
                    case 45: case 49: case 53: case 57:
                        theFullMetalBoard[i].setText("O");
                        break;
                    case 46: case 50: case 54: case 58:
                        theFullMetalBoard[i].setText("M");
                        break;
                    case 47: case 51: case 55: case 59:
                        theFullMetalBoard[i].setText("E");
                        break;
                }
            }
            theFullMetalBoard[i].setEnabled(false);
        }
    }
    public static void main(String[] args) 
    {
        String host = "";
        String userName = "";
        int port = 0;  //The port number

        try
        {
            host = args[0];
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            host = "localhost";
        }
        try
        {
            port = Integer.parseInt(args[1]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            port = DEFAULT_PORT;
        }
        try
        {
            userName = args[2];
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            userName = "Lola";
        }
        GUIClientConsole chat = new GUIClientConsole(host, port, userName);
        //chat.accept();  //Wait for console data
    }
}