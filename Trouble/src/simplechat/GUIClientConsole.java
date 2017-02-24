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
    private JButton pop_O_Matic_Bubble = new JButton("P O P");
    private JButton playTroubleB = new JButton("Play Trouble");
    
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
    private JButton board28 = new JButton("-");
	
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
    private JLabel blank11LB = new JLabel("", JLabel.RIGHT);
    private JLabel blank12LB = new JLabel("", JLabel.RIGHT);
    
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
    private JButton homeYellow1 = new JButton("E");
    private JButton homeYellow2 = new JButton("M");
    private JButton homeYellow3 = new JButton("O");
    private JButton homeYellow4 = new JButton("H");
    
    private JButton startBlue1 = new JButton("B");
    private JButton startBlue2 = new JButton("B");
    private JButton startBlue3 = new JButton("B");
    private JButton startBlue4 = new JButton("B");
    private JButton homeBlue1 = new JButton("E");
    private JButton homeBlue2 = new JButton("M");
    private JButton homeBlue3 = new JButton("O");
    private JButton homeBlue4 = new JButton("H");
    
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
        board28.setBackground(Color.gray);
        
        
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
        c.gridx = 6;
        playArea.add(startYellow2,c);
        c.gridx = 7;
        playArea.add(startYellow3,c);
        c.gridx = 8;
        playArea.add(startYellow4,c);
        c.gridx = 9;
        playArea.add(outsideBoard6,c);
            c.gridx = 0;
            c.gridy = 1;
            playArea.add(startRed1,c);
            c.gridx = 1;
            playArea.add(board1,c);
            board1.setEnabled(false);
            c.gridx = 2;
            playArea.add(board2,c);
            board2.setEnabled(false);
            c.gridx = 3;
            playArea.add(board3,c);
            board3.setEnabled(false);
            c.gridx = 4;
            playArea.add(board4,c);
            board4.setEnabled(false);
            c.gridx = 5;
            playArea.add(board5,c);
            board5.setEnabled(false);
            c.gridx = 6;
            playArea.add(board6,c);
            board6.setEnabled(false);
            c.gridx = 7;
            playArea.add(board7,c);
            board7.setEnabled(false);
            c.gridx = 8;
            playArea.add(board8,c);
            board8.setEnabled(false);
            c.gridx = 9;
            playArea.add(outsideBoard7,c);
                c.gridx = 0;
                c.gridy = 2;
                playArea.add(startRed2,c);
                c.gridx = 1;
                playArea.add(board28,c);
                board28.setEnabled(false);
                c.gridx = 2;
                playArea.add(homeRed1,c);
                homeRed1.setEnabled(false);
                c.gridx = 3;
                playArea.add(insideBoard1,c);
                c.gridx = 4;
                playArea.add(homeYellow4,c);
                homeYellow4.setEnabled(false);
                c.gridx = 5;
                playArea.add(homeYellow3,c);
                homeYellow3.setEnabled(false);
                c.gridx = 6;
                playArea.add(homeYellow2,c);
                homeYellow2.setEnabled(false);
                c.gridx = 7;
                playArea.add(homeYellow1,c);
                homeYellow1.setEnabled(false);
                c.gridx = 8;
                playArea.add(board9,c);
                board9.setEnabled(false);
                c.gridx = 9;
                playArea.add(outsideBoard8,c);
                    c.gridx = 0;
                    c.gridy = 3;
                    playArea.add(startRed3,c);
                    c.gridx = 1;
                    playArea.add(board27,c);
                    board27.setEnabled(false);
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
                    playArea.add(board10,c);
                    board10.setEnabled(false);
                    c.gridx = 9;
                    playArea.add(outsideBoard9,c);
                        c.gridx = 0;
                        c.gridy = 4;
                        playArea.add(startRed4,c);
                        c.gridx = 1;
                        playArea.add(board26,c);
                        board26.setEnabled(false);
                        c.gridx = 2;
                        playArea.add(homeRed3,c);
                        homeRed3.setEnabled(false);
                        c.gridx = 3;
                        playArea.add(insideBoard7,c);
                        c.gridx = 4;
                        c.gridwidth = 2;
                        c.gridheight = 2;
                        playArea.add(pop_O_Matic_Bubble,c);
                        c.gridx = 6;
                        c.gridwidth = 1;
                        c.gridheight = 1;
                        playArea.add(insideBoard8,c);
                        c.gridx = 7;
                        playArea.add(homeBlue4,c);
                        homeBlue4.setEnabled(false);
                        c.gridx = 8;
                        playArea.add(board11,c);
                        board11.setEnabled(false);
                        c.gridx = 9;
                        playArea.add(outsideBoard10,c);
                            c.gridx = 0;
                            c.gridy = 5;
                            playArea.add(outsideBoard20,c);
                            c.gridx = 1;
                            playArea.add(board25,c);
                            board25.setEnabled(false);
                            c.gridx = 2;
                            playArea.add(homeRed4,c);
                            homeRed4.setEnabled(false);
                            c.gridx = 3;
                            playArea.add(insideBoard9,c);
                            c.gridx = 6;
                            playArea.add(insideBoard10,c);
                            c.gridx = 7;
                            playArea.add(homeBlue3,c);
                            homeBlue3.setEnabled(false);
                            c.gridx = 8;
                            playArea.add(board12,c);
                            board12.setEnabled(false);
                            c.gridx = 9;
                            playArea.add(startBlue4,c);
                                c.gridx = 0;
                                c.gridy = 6;
                                playArea.add(outsideBoard19,c);
                                c.gridx = 1;
                                playArea.add(board24,c);
                                board24.setEnabled(false);
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
                                playArea.add(homeBlue2,c);
                                homeBlue2.setEnabled(false);
                                c.gridx = 8;
                                playArea.add(board13,c);
                                board13.setEnabled(false);
                                c.gridx = 9;
                                playArea.add(startBlue3,c);
                                    c.gridx = 0;
                                    c.gridy = 7;
                                    playArea.add(outsideBoard18,c);
                                    c.gridx = 1;
                                    playArea.add(board23,c);
                                    board23.setEnabled(false);
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
                                    playArea.add(homeBlue1,c);
                                    homeBlue1.setEnabled(false);
                                    c.gridx = 8;
                                    playArea.add(board14,c);
                                    board14.setEnabled(false);
                                    c.gridx = 9;
                                    playArea.add(startBlue2,c);
                                        c.gridx = 0;
                                        c.gridy = 8;
                                        playArea.add(outsideBoard17,c);
                                        c.gridx = 1;
                                        playArea.add(board22,c);
                                        board22.setEnabled(false);
                                        c.gridx = 2;
                                        playArea.add(board21,c);
                                        board21.setEnabled(false);
                                        c.gridx = 3;
                                        playArea.add(board20,c);
                                        board20.setEnabled(false);
                                        c.gridx = 4;
                                        playArea.add(board19,c);
                                        board19.setEnabled(false);
                                        c.gridx = 5;
                                        playArea.add(board18,c);
                                        board18.setEnabled(false);
                                        c.gridx = 6;
                                        playArea.add(board17,c);
                                        board17.setEnabled(false);
                                        c.gridx = 7;
                                        playArea.add(board16,c);
                                        board16.setEnabled(false);
                                        c.gridx = 8;
                                        playArea.add(board15,c);
                                        board15.setEnabled(false);
                                        c.gridx = 9;
                                        playArea.add(startBlue1,c);
                                            c.gridx = 0;
                                            c.gridy = 9;
                                            playArea.add(outsideBoard16,c);
                                            c.gridx = 1;
                                            playArea.add(startGreen1,c);
                                            c.gridx = 2;
                                            playArea.add(startGreen2,c);
                                            c.gridx = 3;
                                            playArea.add(startGreen3,c);
                                            c.gridx = 4;
                                            playArea.add(startGreen4,c);
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
        bottom.add(blank6LB);
        
        bottom.add(blank7LB);
        bottom.add(blank8LB);
        bottom.add(playTroubleB);
        playTroubleB.setEnabled(false);
        
        bottom.add(hostTxF);
        bottom.add(blank10LB);
        bottom.add(blank11LB);
        
        bottom.add(portTxF);
        bottom.add(blank12LB);
        bottom.add(quitB);
        
        add( "East", messageList);
	add( "South" , bottom);
        add( "Center", playArea);
		  	 	
	setVisible(true);
        
        playTroubleB.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                send("#sendTrouble " + messageTxF.getText());
                startYellow1.putClientProperty(0, tr.objCurrentPlayer.piece[0]);
            }
        });
        pop_O_Matic_Bubble.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                tr.rollDie();
                pop_O_Matic_Bubble.setText(String.valueOf(tr.currentRoll));
            }
        });
        startYellow1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                tr.onTurnStart((objPiece) startYellow1.getClientProperty(0));
                
            }
        });
        sendB.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
		send(messageTxF.getText());
		//display(messageTxF.getText()+"\n" );
            }
        });
        closeB.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
		close();
		//display(messageTxF.getText()+"\n" );
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
        GUIClientConsole chat= new GUIClientConsole(host, port, userName);
        //chat.accept();  //Wait for console data
    }
}