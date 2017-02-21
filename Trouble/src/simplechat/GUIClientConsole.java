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
    
    private JButton closeB = new JButton("Logout");
    private JButton openB = new JButton("Login");
    private JButton sendB = new JButton("Send Message");
    private JButton quitB = new JButton("Quit Application");
    private JButton pop_O_Matic_Bubble = new JButton("P O P");
	
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
    
    private JLabel startRed1 = new JLabel("R");
    private JLabel startRed2 = new JLabel("R");
    private JLabel startRed3 = new JLabel("R");
    private JLabel startRed4 = new JLabel("R");
    private JLabel homeRed1 = new JLabel("H");
    private JLabel homeRed2 = new JLabel("H");
    private JLabel homeRed3 = new JLabel("H");
    private JLabel homeRed4 = new JLabel("H");
    
    private JLabel startYellow1 = new JLabel("Y");
    private JLabel startYellow2 = new JLabel("Y");
    private JLabel startYellow3 = new JLabel("Y");
    private JLabel startYellow4 = new JLabel("Y");
    private JLabel homeYellow1 = new JLabel("H");
    private JLabel homeYellow2 = new JLabel("H");
    private JLabel homeYellow3 = new JLabel("H");
    private JLabel homeYellow4 = new JLabel("H");
    
    private JLabel startBlue1 = new JLabel("B");
    private JLabel startBlue2 = new JLabel("B");
    private JLabel startBlue3 = new JLabel("B");
    private JLabel startBlue4 = new JLabel("B");
    private JLabel homeBlue1 = new JLabel("H");
    private JLabel homeBlue2 = new JLabel("H");
    private JLabel homeBlue3 = new JLabel("H");
    private JLabel homeBlue4 = new JLabel("H");
    
    private JLabel startGreen1 = new JLabel("G");
    private JLabel startGreen2 = new JLabel("G");
    private JLabel startGreen3 = new JLabel("G");
    private JLabel startGreen4 = new JLabel("G");
    private JLabel homeGreen1 = new JLabel("H");
    private JLabel homeGreen2 = new JLabel("H");
    private JLabel homeGreen3 = new JLabel("H");
    private JLabel homeGreen4 = new JLabel("H");
    
    private JLabel outsideBoard1 = new JLabel("ob");
    private JLabel outsideBoard2 = new JLabel("ob");
    private JLabel outsideBoard3 = new JLabel("ob");
    private JLabel outsideBoard4 = new JLabel("ob");
    private JLabel outsideBoard5 = new JLabel("ob");
    private JLabel outsideBoard6 = new JLabel("ob");
    private JLabel outsideBoard7 = new JLabel("ob");
    private JLabel outsideBoard8 = new JLabel("ob");
    private JLabel outsideBoard9 = new JLabel("ob");
    private JLabel outsideBoard10 = new JLabel("ob");
    private JLabel outsideBoard11 = new JLabel("ob");
    private JLabel outsideBoard12 = new JLabel("ob");
    private JLabel outsideBoard13 = new JLabel("ob");
    private JLabel outsideBoard14 = new JLabel("ob");
    private JLabel outsideBoard15 = new JLabel("ob");
    private JLabel outsideBoard16 = new JLabel("ob");
    private JLabel outsideBoard17 = new JLabel("ob");
    private JLabel outsideBoard18 = new JLabel("ob");
    private JLabel outsideBoard19 = new JLabel("ob");
    private JLabel outsideBoard20 = new JLabel("ob");
    
    private JLabel insideBoard1 = new JLabel("ib");
    private JLabel insideBoard2 = new JLabel("ib");
    private JLabel insideBoard3 = new JLabel("ib");
    private JLabel insideBoard4 = new JLabel("ib");
    private JLabel insideBoard5 = new JLabel("ib");
    private JLabel insideBoard6 = new JLabel("ib");
    private JLabel insideBoard7 = new JLabel("ib");
    private JLabel insideBoard8 = new JLabel("ib");
    private JLabel insideBoard9 = new JLabel("ib");
    private JLabel insideBoard10 = new JLabel("ib");
    private JLabel insideBoard11 = new JLabel("ib");
    private JLabel insideBoard12 = new JLabel("ib");
    private JLabel insideBoard13 = new JLabel("ib");
    private JLabel insideBoard14 = new JLabel("ib");
    private JLabel insideBoard15 = new JLabel("ib");
    private JLabel insideBoard16 = new JLabel("ib");
    
    private JLabel board1 = new JLabel("-");
    private JLabel board2 = new JLabel("-");
    private JLabel board3 = new JLabel("-");
    private JLabel board4 = new JLabel("-");
    private JLabel board5 = new JLabel("-");
    private JLabel board6 = new JLabel("-");
    private JLabel board7 = new JLabel("-");
    private JLabel board8 = new JLabel("-");
    private JLabel board9 = new JLabel("-");
    private JLabel board10 = new JLabel("-");
    private JLabel board11 = new JLabel("-");
    private JLabel board12 = new JLabel("-");
    private JLabel board13 = new JLabel("-");
    private JLabel board14 = new JLabel("-");
    private JLabel board15 = new JLabel("-");
    private JLabel board16 = new JLabel("-");
    private JLabel board17 = new JLabel("-");
    private JLabel board18 = new JLabel("-");
    private JLabel board19 = new JLabel("-");
    private JLabel board20 = new JLabel("-");
    private JLabel board21 = new JLabel("-");
    private JLabel board22 = new JLabel("-");
    private JLabel board23 = new JLabel("-");
    private JLabel board24 = new JLabel("-");
    private JLabel board25 = new JLabel("-");
    private JLabel board26 = new JLabel("-");
    private JLabel board27 = new JLabel("-");
    private JLabel board28 = new JLabel("-");
    
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
        c.ipadx = 35;
        c.ipady = 35;
        
        startYellow1.setForeground(Color.yellow);
        startYellow2.setForeground(Color.yellow);
        startYellow3.setForeground(Color.yellow);
        startYellow4.setForeground(Color.yellow);
        homeYellow1.setForeground(Color.yellow);
        homeYellow2.setForeground(Color.yellow);
        homeYellow3.setForeground(Color.yellow);
        homeYellow4.setForeground(Color.yellow);
        
        startRed1.setForeground(Color.red);
        startRed2.setForeground(Color.red);
        startRed3.setForeground(Color.red);
        startRed4.setForeground(Color.red);
        homeRed1.setForeground(Color.red);
        homeRed2.setForeground(Color.red);
        homeRed3.setForeground(Color.red);
        homeRed4.setForeground(Color.red);
        
        startBlue1.setForeground(Color.blue);
        startBlue2.setForeground(Color.blue);
        startBlue3.setForeground(Color.blue);
        startBlue4.setForeground(Color.blue);
        homeBlue1.setForeground(Color.blue);
        homeBlue2.setForeground(Color.blue);
        homeBlue3.setForeground(Color.blue);
        homeBlue4.setForeground(Color.blue);
        
        startGreen1.setForeground(Color.green);
        startGreen2.setForeground(Color.green);
        startGreen3.setForeground(Color.green);
        startGreen4.setForeground(Color.green);
        homeGreen1.setForeground(Color.green);
        homeGreen2.setForeground(Color.green);
        homeGreen3.setForeground(Color.green);
        homeGreen4.setForeground(Color.green);
        
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
            c.gridx = 2;
            playArea.add(board2,c);
            c.gridx = 3;
            playArea.add(board3,c);
            c.gridx = 4;
            playArea.add(board4,c);
            c.gridx = 5;
            playArea.add(board5,c);
            c.gridx = 6;
            playArea.add(board6,c);
            c.gridx = 7;
            playArea.add(board7,c);
            c.gridx = 8;
            playArea.add(board8,c);
            c.gridx = 9;
            playArea.add(outsideBoard7,c);
                c.gridx = 0;
                c.gridy = 2;
                playArea.add(startRed2,c);
                c.gridx = 1;
                playArea.add(board28,c);
                c.gridx = 2;
                playArea.add(homeRed1,c);
                c.gridx = 3;
                playArea.add(insideBoard1,c);
                c.gridx = 4;
                playArea.add(homeYellow4,c);
                c.gridx = 5;
                playArea.add(homeYellow3,c);
                c.gridx = 6;
                playArea.add(homeYellow2,c);
                c.gridx = 7;
                playArea.add(homeYellow1,c);
                c.gridx = 8;
                playArea.add(board9,c);
                c.gridx = 9;
                playArea.add(outsideBoard8,c);
                    c.gridx = 0;
                    c.gridy = 3;
                    playArea.add(startRed3,c);
                    c.gridx = 1;
                    playArea.add(board27,c);
                    c.gridx = 2;
                    playArea.add(homeRed2,c);
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
                    c.gridx = 9;
                    playArea.add(outsideBoard9,c);
                        c.gridx = 0;
                        c.gridy = 4;
                        playArea.add(startRed4,c);
                        c.gridx = 1;
                        playArea.add(board26,c);
                        c.gridx = 2;
                        playArea.add(homeRed3,c);
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
                        c.gridx = 8;
                        playArea.add(board11,c);
                        c.gridx = 9;
                        playArea.add(outsideBoard10,c);
                            c.gridx = 0;
                            c.gridy = 5;
                            playArea.add(outsideBoard20,c);
                            c.gridx = 1;
                            playArea.add(board25,c);
                            c.gridx = 2;
                            playArea.add(homeRed4,c);
                            c.gridx = 3;
                            playArea.add(insideBoard9,c);
                            c.gridx = 6;
                            playArea.add(insideBoard10,c);
                            c.gridx = 7;
                            playArea.add(homeBlue3,c);
                            c.gridx = 8;
                            playArea.add(board12,c);
                            c.gridx = 9;
                            playArea.add(startBlue4,c);
                                c.gridx = 0;
                                c.gridy = 6;
                                playArea.add(outsideBoard19,c);
                                c.gridx = 1;
                                playArea.add(board24,c);
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
                                c.gridx = 8;
                                playArea.add(board13,c);
                                c.gridx = 9;
                                playArea.add(startBlue3,c);
                                    c.gridx = 0;
                                    c.gridy = 7;
                                    playArea.add(outsideBoard18,c);
                                    c.gridx = 1;
                                    playArea.add(board23,c);
                                    c.gridx = 2;
                                    playArea.add(homeGreen1,c);
                                    c.gridx = 3;
                                    playArea.add(homeGreen2,c);
                                    c.gridx = 4;
                                    playArea.add(homeGreen3,c);
                                    c.gridx = 5;
                                    playArea.add(homeGreen4,c);
                                    c.gridx = 6;
                                    playArea.add(insideBoard16,c);
                                    c.gridx = 7;
                                    playArea.add(homeBlue1,c);
                                    c.gridx = 8;
                                    playArea.add(board14,c);
                                    c.gridx = 9;
                                    playArea.add(startBlue2,c);
                                        c.gridx = 0;
                                        c.gridy = 8;
                                        playArea.add(outsideBoard17,c);
                                        c.gridx = 1;
                                        playArea.add(board22,c);
                                        c.gridx = 2;
                                        playArea.add(board21,c);
                                        c.gridx = 3;
                                        playArea.add(board20,c);
                                        c.gridx = 4;
                                        playArea.add(board19,c);
                                        c.gridx = 5;
                                        playArea.add(board18,c);
                                        c.gridx = 6;
                                        playArea.add(board17,c);
                                        c.gridx = 7;
                                        playArea.add(board16,c);
                                        c.gridx = 8;
                                        playArea.add(board15,c);
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
	
        bottom.add(userNameLB);
        bottom.add(userNameTxF);
        bottom.add(blank1LB);
        
        bottom.add(openB);
        bottom.add(messageLB);
        bottom.add(messageTxF);
        
        bottom.add(closeB);
        bottom.add(blank2LB);
        bottom.add(sendB);
        
        bottom.add(hostLB);
	bottom.add(portLB);
        bottom.add(blank3LB);
        
        bottom.add(blank4LB);
        bottom.add(blank5LB);
        bottom.add(blank6LB);
        
        bottom.add(blank7LB);
        bottom.add(blank8LB);
        bottom.add(blank9LB);
        
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
		send("#logOff");
		//display(messageTxF.getText()+"\n" );
            }
        });
        openB.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                open();
            }
        });
        //do setters
        this.host = host;
        this.port = port;
        this.userName = userName;
    }

    public void send(String message){
        client.handleMessageFromClientUI(message);
    }
    public void display(String message ){
        //if(messageList.getLineCount() != null){
            messageList.insert(message, messageList.getLineCount());
        //}    
    }

    public void open(){
        host = hostTxF.getText();
        userName = userNameTxF.getText();
        port = Integer.parseInt(portTxF.getText());
        try{
            client = new ChatClient(host ,port, userName, this);
        }
        catch(IOException exception){
            System.out.println("Error: Can't setup connection!" + " Terminating client.");
            System.exit(1);
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
        GUIClientConsole chat= new GUIClientConsole(host, port, userName);
        //chat.accept();  //Wait for console data
    }
}